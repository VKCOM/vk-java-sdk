##Java SDK for VK API

Java library for VK API interaction, includes OAuth 2.0 authorization and API methods. Full VK API features documentation can be found [here](http://vk.com/dev).

This library has been created using the VK API JSON Schema. It can be found [here](https://github.com/VKCOM/vk-api-schema). It uses VK API [version](https://vk.com/dev/versions) 5.62.

##1. Prerequisites

* [Java JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html) 1.8 or later
* [Gradle](https://gradle.org/) 2.13 or later

##2. Dependencies

VK Java SDK uses:
* [Apache Http Client](https://hc.apache.org) version 4.5.2
* [SLF4J](http://www.slf4j.org/) version 1.7.22
* [Apache Commons Lang](https://commons.apache.org/proper/commons-lang/) version 3.5
* [Apache Commons Collections](https://commons.apache.org/proper/commons-collections/) version 4.1
* [Apache Commons IO](https://commons.apache.org/proper/commons-io/) version 2.5
* [Google Gson](https://github.com/google/gson) version  2.8.9

##3. Latest release

The most recent release is 0.4.3, released February 1, 2017.

To add a dependency on VK Java SDK using Maven, use the following:

```xml
<dependency>
  <groupId>com.vk.api</groupId>
  <artifactId>sdk</artifactId>
  <version>0.4.3</version>
</dependency>
```

To add a dependency using Gradle:

```
dependencies {
  compile 'com.vk.api:sdk:0.4.3'
}
```

##4. Prepare for using

Create a new VK application [here](https://vk.com/editapp?act=create) to use VK Java SDK. Please choose an application type depending on which authorization pattern you need. It should be "Standalone" for Direct Authorization, "Web site" for Authorization Code Flow for  server side  requests and any of them for Client Credentials Flow. 

Fill in the title, confirm the action via SMS and you will be redirected to the application settings page. 

You will need your application ID (referenced as API_ID in the documentation), secure key (CLIENT_SECRET) and authorized redirect URI (REDIRECT_URI).

##5. Logging

VK Java SDK uses SLF4J for logging. If you want to turn on logging, you must include a plugin that bridges SLF4J with a concrete logging framework. See [SLF4J documentation](http://www.slf4j.org/manual.html#swapping).

###JDK Logger

Maven:
```xml
<dependencies>
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-jdk14</artifactId>
        <version>1.7.22</version>
    </dependency>
</dependencies>
```

Gradle:
```
dependencies {
    compile group: 'org.slf4j', name: 'slf4j-jdk14', version: '1.7.22'
}
```

Add logging.properties file with configuration (located at your src/main/resources path):
```
.level=INFO
handlers=java.util.logging.ConsoleHandler
java.util.logging.ConsoleHandler.level=FINEST
deng.level=FINEST
```

Set java.util.logging.config.file system property:
```
-Djava.util.logging.config.file=logging.properties
```

###log4j2

Maven:
```xml
<dependencies>
    <!-- Binding for Log4J -->
    <dependency>
      <groupId>org.apache.logging.log4j</groupId>
      <artifactId>log4j-slf4j-impl</artifactId>
      <version>2.7</version>
    </dependency>
    
    <!-- Log4j API and Core implementation required for binding -->
    <dependency>
      <groupId>org.apache.logging.log4j</groupId>
      <artifactId>log4j-api</artifactId>
      <version>2.7</version>
    </dependency>
    <dependency>
      <groupId>org.apache.logging.log4j</groupId>
      <artifactId>log4j-core</artifactId>
      <version>2.7</version>
    </dependency>
</dependencies>
```

Gradle:
```
dependencies {
    //Binding for Log4J -->
    compile group: 'org.apache.logging.log4j', name: 'log4j-slf4j-impl', version: '2.7'
    
    //Log4j API and Core implementation required for binding
    compile group: 'org.apache.logging.log4j', name: 'log4j-api', version: '2.7'
    compile group: 'org.apache.logging.log4j', name: 'log4j-core', version: '2.7'
}
```

Add log4j2.xml file with configuration (located at your src/main/resources path):
```xml
<?xml version="1.0" encoding="UTF-8" ?>
<Configuration status="info">
    <Appenders>
        <Console name="Console" target="SYSTEM_OUT">
            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n"/>
        </Console>
    </Appenders>

    <Loggers>
        <Root level="info">
            <AppenderRef ref="Console"/>
        </Root>
    </Loggers>
</Configuration>
```

##6. Initialization

Create VkApiClient object using the following code:

```java
TransportClient transportClient = new HttpTransportClient();
VkApiClient vk = new VkApiClient(transportClient);
```

Note that you can use your own  transport client. We use [Apache Http Client](https://hc.apache.org/).

##7. Authorization

The library provides several authorization flows based on OAuth 2.0 protocol implementation in vk.com API. Please read the full [documentation](https://vk.com/dev/access_token) before you start.

###7.1. Authorization Code Flow for User

OAuth 2.0 Authorization Code Flow allows calling methods from the server side.

This flow includes two steps — obtaining an authorization code and exchanging the code for an access token. Primarily you should obtain the "code" ([manual](https://vk.com/dev/authcode_flow_user)) and then use this method to complete the flow:

```java
UserAuthResponse authResponse = vk.oauth()
    .userAuthorizationCodeFlow(APP_ID, CLIENT_SECRET, REDIRECT_URI, code)
    .execute();

UserActor actor = new UserActor(authResponse.getUserId(), authResponse.getAccessToken());
```

This takes your application ID, secure key, redirect URI, enumerated [scopes](https://vk.com/dev/permissions) and code obtained on the previous step of the flow.

When succeed, a UserActor object is created. You can call VK API methods on behalf of a user.

See [example](https://github.com/VKCOM/vk-java-sdk/tree/master/examples/user-oauth).

###7.2. Authorization Code Flow for Community

The difference from the previous flow is that you send the groupId parameter to obtain the community's access token. Please read [the full manual](https://vk.com/dev/authcode_flow_group).

```java
GroupAuthGroupResponse authResponse = vk.oauth()
    .groupAuthorizationCodeFlow(APP_ID, CLIENT_SECRET, REDIRECT_URI, code)
    .execute();

GroupActor actor = new GroupActor(groupId, authResponse.getAccessTokens().get(groupId);
```

When succeed, a GroupActor object is created. You can call VK API methods on behalf of a community.

See [example](https://github.com/VKCOM/vk-java-sdk/tree/master/examples/group-oauth).

###7.3. Handling need_validation error

Proceeding each of previous authorization flows you can receive a "need_validation" error. Use the following code to handle the error:

```java
try {
    UserAuthResponse authResponse = vk.oauth()
        .userAuthorizationCodeFlow(APP_ID, CLIENT_SECRET, REDIRECT_URI, code)
        .execute();
} catch (OAuthException e) {
    e.getRedirectUri();
}

UserActor actor = new UserActor(authResponse.getUserId(), authResponse.getAccessToken());
```

###7.4. Client Credentials Flow

This flow allows to interact with API service methods with "secure" prefix. Use this method:

```java
ServiceClientCredentialsFlowResponse authResponse = vk.oauth()
    .serviceClientCredentialsFlow(APP_ID, CLIENT_SECRET)
    .execute();
    
ServiceActor actor = new ServiceActor(APP_ID, authResponse.getAccessToken());
```

When succeed, a ServiceActor object is created. You can call VK API methods on behalf of an app.

##8. API Requests
You can find the full list of VK API methods [here](https://vk.com/dev/methods).

###Request sample with user actor:

```java
GetResponse getResponse = vk.wall().get(actor)
    .ownerId(1)
    .count(100)
    .offset(5)
    .filter("owner")
    .execute();
```

###Request sample without actor:

```java
GetResponse getResponse = vk.wall().get()
    .ownerId(1)
    .count(100)
    .offset(5)
    .filter("owner")
    .execute();
```

###Request sample with common method parameters:

```java
List<UserXtrCounters> users = vk.users().get()
    .userIds("1")
    .fields(UserField.VERIFIED, UserField.SEX)
    .lang(Lang.EN)
    .execute();
```

The full list of common parameters is available on [this page](https://vk.com/dev/api_requests).

###Request sample for uploading and posting photos on user wall.

```java
PhotoUpload serverResponse = vk.photos().getWallUploadServer(actor).execute();
WallUploadResponse uploadResponse = vk.upload().photoWall(serverResponse.getUploadUrl(), file).execute();
List<Photo> photoList = vk.photos().saveWallPhoto(actor, uploadResponse.getPhoto())
     .server(uploadResponse.getServer())
     .hash(uploadResponse.getHash())
     .execute();

Photo photo = photoList.get(0); 
String attachId = "photo" + photo.getOwnerId() + "_" + photo.getId();
GetResponse getResponse = vk.wall().post(actor)
    .attachments(attachId)
    .execute();
```

##9. Execute requests
You can find more information about execute method [here](https://vk.com/dev/execute).

###Code

```java
JsonElement response = vk.execute().code(actor, "return API.wall.get({"count": 1})")
    .execute();
```

###Storage function

```java
JsonElement response = vk.execute().storageFunction(actor, "foo")
    .funcV(2) // set storage function version
    .unsafeParam("user_id", 1) // set storage function argument
    .execute();
```

###Batch requests

```java
JsonElement response = vk.execute().batch(actor,
        vk.database().getChairs(1).count(10),
        vk.database().getCities(1),
        vk.groups().getMembers(actor).groupId(groupId)
).execute();
```

##10. Error Handling

###Common Example
```java
try {
    vk.wall().post(actor)
        .message("Hello world")
        .execute();
} catch (ApiWallLinksForbiddenException e) {
    // Links posting is prohibited
} catch (ApiException e) {
    // Business logic error
} catch (ClientException e) {
    // Transport layer error
}
```

###Captcha error handling
```java
String captchaSid = null;
String captchaImg = null;

try {
    vk.wall().post(actor).message("Hello world").execute();
} catch (ApiCaptchaException e) {
    captchaSid = e.getCaptchaSid();
    captchaImg = e.getCaptchaImg();
}

//Showing captcha image...

if (captchaImg != null) {
    vk.wall().post(actor)
        .message("Hello world")
        .captchaSid(captchaSid)
        .captchaKey(captchaKey)
        .execute();
}
```

##11. Callback API handler
Override methods from CallbackApi class for handling events

```java
public class CallbackApiHandler extends CallbackApi {
  @Override
  public void messageNew(Integer groupId, Message message) {
    System.out.println(message.getBody());
  }
}

...
CallbackApiHandler callbackApiHandler = new CallbackApiHandler();

String body = httpRequest.getBody();
callbackApiHandler.parse(body);
```
##12. Usage Example
As an SDK usage example we have releazed the YouTrack bot. The documentation can be found [here](https://github.com/VKCOM/vk-java-sdk/wiki/YouTrack-bot).

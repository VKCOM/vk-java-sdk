## Java SDK for VK API

[![Build Status](https://travis-ci.org/VKCOM/vk-java-sdk.svg?branch=master)](https://travis-ci.org/VKCOM/vk-java-sdk)

Java library for VK API interaction, includes OAuth 2.0 authorization and API methods. Full VK API features documentation can be found [here](http://vk.com/dev).

This library has been created using the VK API JSON Schema. It can be found [here](https://github.com/VKCOM/vk-api-schema). It uses VK API [version](https://vk.com/dev/versions) 5.131.

## 1. Prerequisites

* [Java JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html) 1.8 or later
* [Gradle](https://gradle.org/) 2.13 or later

## 2. Dependencies

VK Java SDK uses:
* [Apache Http Client](https://hc.apache.org) version 4.5.8
* [SLF4J](http://www.slf4j.org/) version 1.7.26
* [Apache Commons Lang](https://commons.apache.org/proper/commons-lang/) version 3.6
* [Apache Commons Collections](https://commons.apache.org/proper/commons-collections/) version 4.3
* [Apache Commons IO](https://commons.apache.org/proper/commons-io/) version 2.6
* [Google Gson](https://github.com/google/gson) version  2.8.5

## 3. Latest release

Latest version: [![Maven](https://img.shields.io/maven-central/v/com.vk.api/sdk.svg)](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22com.vk.api%22%20AND%20a%3A%22sdk%22)

To add a dependency on VK Java SDK using Maven, use the following:

```xml
<dependency>
  <groupId>com.vk.api</groupId>
  <artifactId>sdk</artifactId>
  <version>LATEST_VERSION</version>
</dependency>
```

To add a dependency using Gradle:

```
dependencies {
  compile 'com.vk.api:sdk:LATEST_VERSION'
}
```

## 4. Prepare for using

Create a new VK application [here](https://vk.com/editapp?act=create) to use VK Java SDK. Please choose an application type depending on which authorization pattern you need. It should be "Standalone" for Direct Authorization, "Web site" for Authorization Code Flow for  server side  requests and any of them for Client Credentials Flow. 

Fill in the title, confirm the action via SMS and you will be redirected to the application settings page. 

You will need your application ID (referenced as API_ID in the documentation), secure key (CLIENT_SECRET) and authorized redirect URI (REDIRECT_URI).

## 5. Logging

VK Java SDK uses SLF4J for logging. If you want to turn on logging, you must include a plugin that bridges SLF4J with a concrete logging framework. See [SLF4J documentation](http://www.slf4j.org/manual.html#swapping).

### JDK Logger

Maven:
```xml
<dependencies>
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-jdk14</artifactId>
        <version>1.7.26</version>
    </dependency>
</dependencies>
```

Gradle:
```
dependencies {
    compile group: 'org.slf4j', name: 'slf4j-jdk14', version: '1.7.26'
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

### log4j2

Maven:
```xml
<dependencies>
    <!-- Binding for Log4J -->
    <dependency>
      <groupId>org.apache.logging.log4j</groupId>
      <artifactId>log4j-slf4j-impl</artifactId>
      <version>2.11.2</version>
    </dependency>
    
    <!-- Log4j API and Core implementation required for binding -->
    <dependency>
      <groupId>org.apache.logging.log4j</groupId>
      <artifactId>log4j-api</artifactId>
      <version>2.11.2</version>
    </dependency>
    <dependency>
      <groupId>org.apache.logging.log4j</groupId>
      <artifactId>log4j-core</artifactId>
      <version>2.11.2</version>
    </dependency>
</dependencies>
```

Gradle:
```
dependencies {
    //Binding for Log4J -->
    compile group: 'org.apache.logging.log4j', name: 'log4j-slf4j-impl', version: '2.11.2'
    
    //Log4j API and Core implementation required for binding
    compile group: 'org.apache.logging.log4j', name: 'log4j-api', version: '2.11.2'
    compile group: 'org.apache.logging.log4j', name: 'log4j-core', version: '2.11.2'
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

## 6. Initialization

Create VkApiClient object using the following code:

```java
TransportClient transportClient = new HttpTransportClient();
VkApiClient vk = new VkApiClient(transportClient);
```

Note that you can use your own  transport client. We use [Apache Http Client](https://hc.apache.org/).

## 7. Authorization

The library provides several authorization flows based on OAuth 2.0 protocol implementation in vk.com API. Please read the full [documentation](https://vk.com/dev/access_token) before you start.

### 7.1. Authorization Code Flow for User

OAuth 2.0 Authorization Code Flow allows calling methods from the server side.

This flow includes two steps — obtaining an authorization code and exchanging the code for an access token. Primarily you should obtain the "code" ([manual](https://vk.com/dev/authcode_flow_user)) and then use this method to complete the flow:

```java
UserAuthResponse authResponse = vk.oAuth()
    .userAuthorizationCodeFlow(APP_ID, CLIENT_SECRET, REDIRECT_URI, code)
    .execute();

UserActor actor = new UserActor(authResponse.getUserId(), authResponse.getAccessToken());
```

This takes your application ID, secure key, redirect URI, enumerated [scopes](https://vk.com/dev/permissions) and code obtained on the previous step of the flow.

When succeed, a UserActor object is created. You can call VK API methods on behalf of a user.

### 7.2. Authorization Code Flow for Community

The difference from the previous flow is that you send the groupId parameter to obtain the community's access token. Please read [the full manual](https://vk.com/dev/authcode_flow_group).

```java
GroupAuthResponse authResponse = vk.oAuth()
    .groupAuthorizationCodeFlow(APP_ID, CLIENT_SECRET, REDIRECT_URI, code)
    .execute();

GroupActor actor = new GroupActor(groupId, authResponse.getAccessTokens().get(groupId));
```

When succeed, a GroupActor object is created. You can call VK API methods on behalf of a community.

### 7.3. Handling need_validation error

Proceeding each of previous authorization flows you can receive a "need_validation" error. Use the following code to handle the error:

```java
UserAuthResponse authResponse;
try {
    authResponse = vk.oAuth()
        .userAuthorizationCodeFlow(APP_ID, CLIENT_SECRET, REDIRECT_URI, code)
        .execute();
} catch (OAuthException e) {
    e.getRedirectUri();
}

UserActor actor = new UserActor(authResponse.getUserId(), authResponse.getAccessToken());
```

### 7.4. Client Credentials Flow

This flow allows to interact with API service methods with "secure" prefix. Use this method:

```java
ServiceClientCredentialsFlowResponse authResponse = vk.oAuth()
    .serviceClientCredentialsFlow(APP_ID, CLIENT_SECRET)
    .execute();
    
ServiceActor actor = new ServiceActor(APP_ID, authResponse.getAccessToken());
```

When succeed, a ServiceActor object is created. You can call VK API methods on behalf of an app.

## 8. API Requests
You can find the full list of VK API methods [here](https://vk.com/dev/methods).

### Request sample

```java
GetResponse getResponse = vk.wall().get(actor)
    .ownerId(1)
    .count(100)
    .offset(5)
    .filter("owner")
    .execute();
```

### Request sample with common method parameters:

```java
List<UserXtrCounters> users = vk.users().get(actor)
    .userIds("1")
    .fields(UserField.VERIFIED, UserField.SEX)
    .lang(Lang.EN)
    .execute();
```

The full list of common parameters is available on [this page](https://vk.com/dev/api_requests).

### Request sample for uploading and posting photos on user wall.

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

## 9. Execute requests
You can find more information about execute method [here](https://vk.com/dev/execute).

### Code

```java
JsonElement response = vk.execute().code(actor, "return API.wall.get({\"count\": 1})")
    .execute();
```

### Storage function

```java
JsonElement response = vk.execute().storageFunction(actor, "foo")
    .funcV(2) // set storage function version
    .unsafeParam("user_id", 1) // set storage function argument
    .execute();
```

### Batch requests

```java
JsonElement response = vk.execute().batch(actor,
        vk.database().getChairs(1).count(10),
        vk.database().getCities(1),
        vk.groups().getMembers(actor).groupId(groupId)
).execute();
```

## 10. Error Handling

### Common Example
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

### Captcha error handling
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

## 11. Callback API handler
Override methods from CallbackApi class for handling events

```java
public class CallbackApiHandler extends CallbackApi {
  @Override
  public void messageNew(Integer groupId, Message message) {
    System.out.println(message.getText());
  }
}
```

## 12. Callback API Long Poll handler
Enable Callback API Long Poll for needed group and specify
which events should be tracked

```java
HttpTransportClient httpClient = HttpTransportClient.getInstance();
VkApiClient vk = new VkApiClient(httpClient);
vk.groups().setLongPollSettings(groupActor).enabled(true)
                                           .wallPostNew(true)
                                           .messageNew(true)
                                           .execute();
```

(WIP)
Override methods from CallbackApiLongPoll class for handling events and create needed constructors

```java
public class CallbackApiLongPollHandler extends CallbackApiLongPoll {
    public CallbackApiLongPollHandler(VkApiClient client, UserActor actor, Integer groupId) {
      super(client, actor, groupId);
    }

    public CallbackApiLongPollHandler(VkApiClient client, GroupActor actor) {
      super(client, actor);
    }

    @Override
    public void messageNew(Integer groupId, Message message) {
      System.out.println("messageNew: " + message.toString());
    }

    @Override
    public void wallPostNew(Integer groupId, WallPost wallPost) {
      System.out.println("wallPostNew: " + wallPost.toString());
    }
}
```

In order to use the created ```CallbackApiLongPollHandler``` which overrides methods from CallBackApiLongPoll,
the instance of it needs to be created and method ```run``` called

```java
CallbackApiLongPollHandler handler = new CallbackApiLongPollHandler(vk, groupActor);
handler.run();
```

## 13. Streaming API

### Initialization
```java
//Init clients
TransportClient transportClient = new HttpTransportClient();

VkApiClient vkClient = new VkApiClient(transportClient);
VkStreamingApiClient streamingClient = new VkStreamingApiClient(transportClient);

//Create service actor
Integer appId = 4123123;
String accessToken = "sadf0asdf0asdfsadfassadf0asdf0asdfsadfassadf0asdf0asdfsadfas";
ServiceActor actor = new ServiceActor(appId, accessToken);

//Get streaming actor
GetServerUrlResponse getServerUrlResponse = vkClient.streaming().getServerUrl(actor).execute();
StreamingActor actor = new StreamingActor(getServerUrlResponse.getEndpoint(), getServerUrlResponse.getKey());
```

### Add rule
```java
//Create rule
String tag = "1";
String value = "ok";

StreamingResponse response = streamingClient.rules().add(actor, tag, value).execute();
```

### Get rules
```java
//Get rules
StreamingGetRulesResponse response = streamingClient.rules().get(actor).execute();
```

### Delete rule
```java
//Delete rule
String tag = "1";
streamingClient.rules().delete(actor, tag).execute();
```

### Stream handler
Implement handle method from StreamingEventHandler class for handling stream events

```java
streamingClient.stream().get(actor, new StreamingEventHandler() {
    @Override
    public void handle(StreamingCallbackMessage message) {
        System.out.println(message);
    }
}).execute();
```

## 14. Usage Example
As an SDK usage example we have released the YouTrack bot. The documentation can be found [here](https://github.com/VKCOM/vk-java-sdk/wiki/YouTrack-bot).

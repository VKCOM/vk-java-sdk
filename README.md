##Java SDK for VK API

Java library for VK API interaction, includes OAuth 2.0 authorization and API methods. Full VK API features documentation can be found [here](http://vk.com/dev).

This library has been created using the VK API JSON Schema. It can be found [here](https://github.com/VKCOM/vk-api-schema). It uses VK API [version](https://vk.com/dev/versions) 5.53.

##1. Prerequisites

* [Java  JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html) 1.8 or later
* [Gradle](https://gradle.org/) 2.13 or later

##2. Dependencies

VK Java SDK uses:
* [Apache Http Client](https://hc.apache.org) version 4.5.2
* [Apache Log4j](http://logging.apache.org/log4j/2.x/) version 2.5
* [Apache Commons Lang](https://commons.apache.org/proper/commons-lang/) version 3.4
* [Apache Commons Collections](https://commons.apache.org/proper/commons-collections/) version 4.1
* [Apache Commons IO](https://commons.apache.org/proper/commons-io/) version 2.4
* [Google Gson](https://github.com/google/gson) version  2.6.2

##3. Prepare for using

Create a new VK application [here](https://vk.com/editapp?act=create) to use VK Java SDK. Please choose an application type depending on which authorization pattern you need. It should be "Standalone" for Direct Authorization, "Web site" for Authorization Code Flow for  server side  requests and any of them for Client Credentials Flow. 

Fill in the title, confirm the action via SMS and you will be redirected to the application settings page. 

You will need your application ID (referenced as API_ID in the documentation), secure key (CLIENT_SECRET) and authorized redirect URI (REDIRECT_URI).


##4. Initialization

Create VkApiClient object using the following code:

```java
TransportClient transportClient = new HttpTransportClient();
VkApiClient vk = new VkApiClient(transportClient);
```

Note that you can use your own  transport client. We use [Apache Http Client](https://hc.apache.org/).

##5. Authorization

The library provides several authorization flows based on OAuth 2.0 protocol implementation in vk.com API. Please read the full [documentation](https://vk.com/dev/access_token) before you start.

###5.1. Authorization Code Flow for User

OAuth 2.0 Authorization Code Flow allows calling methods from the server side.

This flow includes two steps — obtaining an authorization code and exchanging the code for an access token. Primarly you should obtain the "code" ([manual](https://vk.com/dev/authcode_flow_user)) and then use this method to complete the flow:

```java
AuthResponse authResponse = vk.oauth()
    .userAuthorizationCodeFlow(APP_ID, CLIENT_SECRET, REDIRECT_URI, code)
    .execute();

UserActor actor = new UserActor(authResponse.getUserId(), authResponse.getAccessToken());
```

This takes your application ID, secure key, redirect URI, enumerated [scopes](https://vk.com/dev/permissions) and code obtained on the previous step of the flow.

When succeed, a UserActor object is created. You can call VK API methods on behalf of a user.


###5.2. Authorization Code Flow for Community

The difference from the previous flow is that you send the groupId parameter to obtain the community's access token. Please read [the full manual](https://vk.com/dev/authcode_flow_group).

```java
AuthGroupResponse authResponse = vk.oauth()
    .groupAuthorizationCodeFlow(APP_ID, CLIENT_SECRET, REDIRECT_URI, code, groupId)
    .execute();

GroupActor actor = new GroupActor(authResponse.get(), authResponse.getAccessToken());
```

When succeed, a GroupActor object is created. You can call VK API methods on behalf of a community.

###5.3. Handling need_validation error

Proceeding each of previous authorization flows you can receive a "need_validation" error. Use the following code to handle the error:

```java
try {
    AuthResponse authResponse = vk.oauth()
        .userAuthorizationCodeFlow(APP_ID, CLIENT_SECRET, REDIRECT_URI, code)
        .execute();
} catch (OAuthException e) {
    e.getRedirectUri();
}

UserActor actor = new UserActor(authResponse.getUserId(), authResponse.getAccessToken());
```

###5.4. Client Credentials Flow

This flow allows to interact with API service methods with "secure" prefix. Use this method:

```java
AuthResponse authResponse = vk.oauth()
    .serverClientCredentionalsFlow(APP_ID, CLIENT_SECRET)
    .execute();
    
ServerActor actor = new ServerActor(APP_ID, authResponse.getAccessToken());
```

When succeed, a ServerActor object is created. You can call VK API methods on behalf of an app. 

##6. API Requests
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

##7. Error Handling

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

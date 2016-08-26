package com.vk.api.sdk.client.actors;

/**
 * Created by Anton Tsivarev on 29.03.16.
 */
public class ServerActor implements Actor {

    private Integer appId;

    private String accessToken;

    public ServerActor(Integer appId, String accessToken) {
        this.accessToken = accessToken;
        this.appId = appId;
    }

    @Override
    public String getAccessToken() {
        return accessToken;
    }

    @Override
    public Integer getId() {
        return appId;
    }
}

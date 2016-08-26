package com.vk.api.sdk.client.actors;

/**
 * Created by Anton Tsivarev on 29.03.16.
 */
public class UserActor implements Actor {

    private Integer userId;
    private String accessToken;

    public UserActor(Integer userId, String accessToken) {
        this.accessToken = accessToken;
        this.userId = userId;
    }

    @Override
    public String getAccessToken() {
        return accessToken;
    }

    @Override
    public Integer getId() {
        return userId;
    }
}

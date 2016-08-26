package com.vk.api.sdk.client.actors;

/**
 * Created by Anton Tsivarev on 29.03.16.
 */
public class GroupActor implements Actor {

    private Integer groupId;

    private String accessToken;

    public GroupActor(Integer groupId, String accessToken) {
        this.accessToken = accessToken;
        this.groupId = groupId;
    }

    @Override
    public String getAccessToken() {
        return accessToken;
    }

    @Override
    public Integer getId() {
        return -groupId;
    }

    public Integer getGroupId() {
        return groupId;
    }
}

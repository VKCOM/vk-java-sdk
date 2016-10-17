package com.vk.api.sdk.client.actors;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupActor that = (GroupActor) o;
        return Objects.equals(groupId, that.groupId) &&
                Objects.equals(accessToken, that.accessToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, accessToken);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GroupActor{");
        sb.append("groupId=").append(groupId);
        sb.append(", accessToken='").append(accessToken).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

package com.vk.api.sdk.client.actors;

import com.vk.api.sdk.client.Utils;

import java.util.Objects;

public class GroupActor implements Actor<Long> {

    private Long groupId;

    private String accessToken;

    private String coveredAccessToken;

    public GroupActor(Long groupId, String accessToken) {
        this.accessToken = accessToken;
        this.groupId = groupId;
        this.coveredAccessToken = Utils.coverAccessToken(accessToken);
    }

    @Override
    public String getAccessToken() {
        return accessToken;
    }

    @Override
    public Long getId() {
        return -groupId;
    }

    public Long getGroupId() {
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
        sb.append(", accessToken='").append(coveredAccessToken).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

package com.vk.api.sdk.client.actors;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServerActor that = (ServerActor) o;
        return Objects.equals(appId, that.appId) &&
                Objects.equals(accessToken, that.accessToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, accessToken);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ServerActor{");
        sb.append("appId=").append(appId);
        sb.append(", accessToken='").append(accessToken).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

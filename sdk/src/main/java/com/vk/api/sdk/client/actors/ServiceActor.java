package com.vk.api.sdk.client.actors;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 29.03.16.
 */
public class ServiceActor implements Actor {

    private Integer appId;

    private String clientSecret;

    private String accessToken;

    public ServiceActor(Integer appId, String accessToken) {
        this.accessToken = accessToken;
        this.appId = appId;
    }

    public ServiceActor(Integer appId, String clientSecret, String accessToken) {
        this.accessToken = accessToken;
        this.appId = appId;
        this.clientSecret = clientSecret;
    }

    public String getClientSecret() {
        return clientSecret;
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
        ServiceActor that = (ServiceActor) o;
        return Objects.equals(appId, that.appId) &&
                Objects.equals(clientSecret, that.clientSecret) &&
                Objects.equals(accessToken, that.accessToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, clientSecret, accessToken);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ServiceActor{");
        sb.append("appId=").append(appId);
        sb.append(", clientSecret='").append(clientSecret).append('\'');
        sb.append(", accessToken='").append(accessToken).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

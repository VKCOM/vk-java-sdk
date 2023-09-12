package com.vk.api.sdk.client.actors;

import com.vk.api.sdk.client.Utils;

import java.util.Objects;

public class ServiceActor implements Actor<Integer> {

    private Integer appId;
    private String clientSecret;
    private String coveredClientSecret;
    private String accessToken;
    private String coveredAccessToken;

    public ServiceActor(Integer appId, String accessToken) {
        this.accessToken = accessToken;
        this.coveredAccessToken = Utils.coverAccessToken(accessToken);
        this.appId = appId;
    }

    public ServiceActor(Integer appId, String clientSecret, String accessToken) {
        this.accessToken = accessToken;
        this.coveredAccessToken = Utils.coverAccessToken(accessToken);
        this.appId = appId;
        this.clientSecret = clientSecret;
        this.coveredClientSecret = Utils.coverAccessToken(clientSecret);
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
        sb.append(", clientSecret='").append(coveredClientSecret).append('\'');
        sb.append(", accessToken='").append(coveredAccessToken).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

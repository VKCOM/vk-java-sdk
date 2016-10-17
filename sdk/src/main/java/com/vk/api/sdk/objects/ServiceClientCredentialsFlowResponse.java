package com.vk.api.sdk.objects;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Created by tsivarev on 26.07.16.
 */
public class ServiceClientCredentialsFlowResponse {

    @SerializedName("access_token")
    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceClientCredentialsFlowResponse that = (ServiceClientCredentialsFlowResponse) o;
        return Objects.equals(accessToken, that.accessToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessToken);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ServiceClientCredentialsFlowResponse{");
        sb.append("accessToken='").append(accessToken).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

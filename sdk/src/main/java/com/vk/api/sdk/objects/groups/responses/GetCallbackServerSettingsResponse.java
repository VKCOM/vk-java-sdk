package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * GetCallbackServerSettingsResponse object
 */
public class GetCallbackServerSettingsResponse {
    /**
     * Server URL
     */
    @SerializedName("server_url")
    private String serverUrl;

    /**
     * Callback API secret key
     */
    @SerializedName("secret_key")
    private String secretKey;

    public String getServerUrl() {
        return serverUrl;
    }

    public String getSecretKey() {
        return secretKey;
    }

    @Override
    public int hashCode() {
        return Objects.hash(secretKey, serverUrl);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCallbackServerSettingsResponse getCallbackServerSettingsResponse = (GetCallbackServerSettingsResponse) o;
        return Objects.equals(serverUrl, getCallbackServerSettingsResponse.serverUrl) &&
                Objects.equals(secretKey, getCallbackServerSettingsResponse.secretKey);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCallbackServerSettingsResponse{");
        sb.append("serverUrl='").append(serverUrl).append("'");
        sb.append(", secretKey='").append(secretKey).append("'");
        sb.append('}');
        return sb.toString();
    }
}

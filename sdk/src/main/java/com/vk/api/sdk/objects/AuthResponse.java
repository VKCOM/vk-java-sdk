package com.vk.api.sdk.objects;

import com.google.gson.annotations.SerializedName;

public class AuthResponse {

    @SerializedName("access_token")
    private String accessToken;

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("expires_in")
    private Integer expiresIn;

    @SerializedName("error")
    private String error;

    public String getAccessToken() {
        return accessToken;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public String getError() {
        return error;
    }
}

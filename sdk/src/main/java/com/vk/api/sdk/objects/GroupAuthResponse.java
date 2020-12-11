package com.vk.api.sdk.objects;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.deserializers.GroupAuthResponseDeserializer;

import java.util.Map;

@JsonAdapter(GroupAuthResponseDeserializer.class)
public class GroupAuthResponse {

    private Map<Integer, String> accessTokens;

    @SerializedName("expires_in")
    private Integer expiresIn;

    @SerializedName("error")
    private String error;

    public GroupAuthResponse(Map<Integer, String> accessTokens, Integer expiresIn, String error) {
        this.accessTokens = accessTokens;
        this.expiresIn = expiresIn;
        this.error = error;
    }

    public Map<Integer, String> getAccessTokens() {
        return accessTokens;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public String getError() {
        return error;
    }
}

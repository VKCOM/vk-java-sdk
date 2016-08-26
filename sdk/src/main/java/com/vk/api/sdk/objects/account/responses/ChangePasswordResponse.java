package com.vk.api.sdk.objects.account.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * ChangePasswordResponse object
 */
public class ChangePasswordResponse {
    /**
     * New token
     */
    @SerializedName("token")
    private String token;

    /**
     * New secret
     */
    @SerializedName("secret")
    private String secret;

    public String getToken() {
        return token;
    }

    public String getSecret() {
        return secret;
    }

    @Override
    public int hashCode() {
        return Objects.hash(secret, token);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChangePasswordResponse changePasswordResponse = (ChangePasswordResponse) o;
        return Objects.equals(token, changePasswordResponse.token) &&
                Objects.equals(secret, changePasswordResponse.secret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ChangePasswordResponse{");
        sb.append("token='").append(token).append("'");
        sb.append(", secret='").append(secret).append("'");
        sb.append('}');
        return sb.toString();
    }
}

package com.vk.api.sdk.client.actors;

import com.vk.api.sdk.client.Utils;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 29.03.16.
 */
public class UserActor implements Actor {

    private Integer userId;
    private String accessToken;
    private String coveredAccessToken;
    private String phone;

    public UserActor(Integer userId, String accessToken) {
        this.accessToken = accessToken;
        this.coveredAccessToken = Utils.coverAccessToken(accessToken);
        this.userId = userId;
    }

    @Override
    public String getAccessToken() {
        return accessToken;
    }

    @Override
    public Integer getId() {
        return userId;
    }

    public String getPhone() {
        return phone;
    }

    public UserActor setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserActor userActor = (UserActor) o;
        return Objects.equals(userId, userActor.userId) &&
                Objects.equals(accessToken, userActor.accessToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, accessToken);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserActor{");
        sb.append("userId=").append(userId);
        sb.append(", accessToken='").append(coveredAccessToken).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

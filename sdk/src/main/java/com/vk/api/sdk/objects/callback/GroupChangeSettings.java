package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * GroupChangeSettings object
 */
public class GroupChangeSettings implements Validable {
    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("self")
    @Required
    private BoolInt self;

    public Integer getUserId() {
        return userId;
    }

    public GroupChangeSettings setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public boolean isSelf() {
        return self == BoolInt.YESBOOL;
    }

    public BoolInt getSelf() {
        return self;
    }

    @Override
    public int hashCode() {
        return Objects.hash(self, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupChangeSettings groupChangeSettings = (GroupChangeSettings) o;
        return Objects.equals(userId, groupChangeSettings.userId) &&
                Objects.equals(self, groupChangeSettings.self);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GroupChangeSettings{");
        sb.append("userId=").append(userId);
        sb.append(", self=").append(self);
        sb.append('}');
        return sb.toString();
    }
}

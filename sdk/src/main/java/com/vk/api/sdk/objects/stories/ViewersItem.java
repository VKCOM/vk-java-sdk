package com.vk.api.sdk.objects.stories;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.users.UserFull;
import java.util.Objects;

/**
 * ViewersItem object
 */
public class ViewersItem implements Validable {
    /**
     * user has like for this object
     */
    @SerializedName("is_liked")
    private Boolean isLiked;

    /**
     * user id
     */
    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("user")
    private UserFull user;

    public Boolean getIsLiked() {
        return isLiked;
    }

    public ViewersItem setIsLiked(Boolean isLiked) {
        this.isLiked = isLiked;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public ViewersItem setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public UserFull getUser() {
        return user;
    }

    public ViewersItem setUser(UserFull user) {
        this.user = user;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isLiked, userId, user);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViewersItem viewersItem = (ViewersItem) o;
        return Objects.equals(userId, viewersItem.userId) &&
                Objects.equals(user, viewersItem.user) &&
                Objects.equals(isLiked, viewersItem.isLiked);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ViewersItem{");
        sb.append("userId=").append(userId);
        sb.append(", user=").append(user);
        sb.append(", isLiked=").append(isLiked);
        sb.append('}');
        return sb.toString();
    }
}

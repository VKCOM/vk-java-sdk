package com.vk.api.sdk.callback.objects.market;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 12.09.16.
 */
public class CallbackMarketCommentDelete {

    @SerializedName("owner_id")
    private Integer ownerId;

    @SerializedName("id")
    private Integer id;

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("item_id")
    private Integer itemId;

    public Integer getOwnerId() {
        return ownerId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallbackMarketCommentDelete that = (CallbackMarketCommentDelete) o;
        return Objects.equals(ownerId, that.ownerId) &&
                Objects.equals(id, that.id) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(itemId, that.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerId, id, userId, itemId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackMarketCommentDelete{");
        sb.append("ownerId=").append(ownerId);
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", itemId=").append(itemId);
        sb.append('}');
        return sb.toString();
    }
}

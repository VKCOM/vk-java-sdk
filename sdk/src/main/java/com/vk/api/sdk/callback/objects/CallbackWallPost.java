package com.vk.api.sdk.callback.objects;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.wall.Wallpost;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 10.09.16.
 */
public class CallbackWallPost extends Wallpost {

    @SerializedName("from_id")
    private Integer fromId;

    @Override
    public Integer getFromId() {
        return fromId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CallbackWallPost that = (CallbackWallPost) o;
        return Objects.equals(fromId, that.fromId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fromId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackWallPost{");
        sb.append("fromId=").append(fromId);
        sb.append('}');
        return sb.toString();
    }
}

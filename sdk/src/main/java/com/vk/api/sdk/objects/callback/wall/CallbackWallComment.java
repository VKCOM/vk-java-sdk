package com.vk.api.sdk.objects.callback.wall;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.wall.WallComment;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 10.09.16.
 */
public class CallbackWallComment extends WallComment {

    @SerializedName("post_id")
    private Integer postId;

    public Integer getPostId() {
        return postId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CallbackWallComment that = (CallbackWallComment) o;
        return Objects.equals(postId, that.postId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), super.hashCode(), postId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackWallComment{");
        sb.append("postId=").append(postId);
        sb.append('}');
        return sb.toString();
    }
}

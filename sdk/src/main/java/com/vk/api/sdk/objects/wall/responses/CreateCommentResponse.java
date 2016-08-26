package com.vk.api.sdk.objects.wall.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * CreateCommentResponse object
 */
public class CreateCommentResponse {
    /**
     * Created comment ID
     */
    @SerializedName("comment_id")
    private Integer commentId;

    public Integer getCommentId() {
        return commentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(commentId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateCommentResponse createCommentResponse = (CreateCommentResponse) o;
        return Objects.equals(commentId, createCommentResponse.commentId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CreateCommentResponse{");
        sb.append("commentId=").append(commentId);
        sb.append('}');
        return sb.toString();
    }
}

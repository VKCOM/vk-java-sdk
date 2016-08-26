package com.vk.api.sdk.objects.friends.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Objects;

/**
 * DeleteResponse object
 */
public class DeleteResponse {
    @SerializedName("success")
    private OkResponse success;

    /**
     * Returns 1 if friend has been deleted
     */
    @SerializedName("friend_deleted")
    private DeleteResponseFriendDeleted friendDeleted;

    /**
     * Returns 1 if out request has been canceled
     */
    @SerializedName("out_request_deleted")
    private DeleteResponseOutRequestDeleted outRequestDeleted;

    /**
     * Returns 1 if incoming request has been declined
     */
    @SerializedName("in_request_deleted")
    private DeleteResponseInRequestDeleted inRequestDeleted;

    /**
     * Returns 1 if suggestion has been declined
     */
    @SerializedName("suggestion_deleted")
    private DeleteResponseSuggestionDeleted suggestionDeleted;

    public OkResponse getSuccess() {
        return success;
    }

    public DeleteResponseFriendDeleted getFriendDeleted() {
        return friendDeleted;
    }

    public DeleteResponseOutRequestDeleted getOutRequestDeleted() {
        return outRequestDeleted;
    }

    public DeleteResponseInRequestDeleted getInRequestDeleted() {
        return inRequestDeleted;
    }

    public DeleteResponseSuggestionDeleted getSuggestionDeleted() {
        return suggestionDeleted;
    }

    @Override
    public int hashCode() {
        return Objects.hash(outRequestDeleted, inRequestDeleted, success, suggestionDeleted, friendDeleted);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeleteResponse deleteResponse = (DeleteResponse) o;
        return Objects.equals(success, deleteResponse.success) &&
                Objects.equals(friendDeleted, deleteResponse.friendDeleted) &&
                Objects.equals(outRequestDeleted, deleteResponse.outRequestDeleted) &&
                Objects.equals(inRequestDeleted, deleteResponse.inRequestDeleted) &&
                Objects.equals(suggestionDeleted, deleteResponse.suggestionDeleted);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DeleteResponse{");
        sb.append("success=").append(success);
        sb.append(", friendDeleted=").append(friendDeleted);
        sb.append(", outRequestDeleted=").append(outRequestDeleted);
        sb.append(", inRequestDeleted=").append(inRequestDeleted);
        sb.append(", suggestionDeleted=").append(suggestionDeleted);
        sb.append('}');
        return sb.toString();
    }
}

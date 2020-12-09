package com.vk.api.sdk.objects.friends.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * DeleteResponse object
 */
public class DeleteResponse implements Validable {
    @SerializedName("success")
    @Required
    private Integer success;

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

    public Integer getSuccess() {
        return success;
    }

    public DeleteResponse setSuccess(Integer success) {
        this.success = success;
        return this;
    }

    public DeleteResponseFriendDeleted getFriendDeleted() {
        return friendDeleted;
    }

    public DeleteResponse setFriendDeleted(DeleteResponseFriendDeleted friendDeleted) {
        this.friendDeleted = friendDeleted;
        return this;
    }

    public DeleteResponseOutRequestDeleted getOutRequestDeleted() {
        return outRequestDeleted;
    }

    public DeleteResponse setOutRequestDeleted(DeleteResponseOutRequestDeleted outRequestDeleted) {
        this.outRequestDeleted = outRequestDeleted;
        return this;
    }

    public DeleteResponseInRequestDeleted getInRequestDeleted() {
        return inRequestDeleted;
    }

    public DeleteResponse setInRequestDeleted(DeleteResponseInRequestDeleted inRequestDeleted) {
        this.inRequestDeleted = inRequestDeleted;
        return this;
    }

    public DeleteResponseSuggestionDeleted getSuggestionDeleted() {
        return suggestionDeleted;
    }

    public DeleteResponse setSuggestionDeleted(DeleteResponseSuggestionDeleted suggestionDeleted) {
        this.suggestionDeleted = suggestionDeleted;
        return this;
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
                Objects.equals(inRequestDeleted, deleteResponse.inRequestDeleted) &&
                Objects.equals(suggestionDeleted, deleteResponse.suggestionDeleted) &&
                Objects.equals(outRequestDeleted, deleteResponse.outRequestDeleted);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("DeleteResponse{");
        sb.append("success=").append(success);
        sb.append(", friendDeleted=").append(friendDeleted);
        sb.append(", inRequestDeleted=").append(inRequestDeleted);
        sb.append(", suggestionDeleted=").append(suggestionDeleted);
        sb.append(", outRequestDeleted=").append(outRequestDeleted);
        sb.append('}');
        return sb.toString();
    }
}

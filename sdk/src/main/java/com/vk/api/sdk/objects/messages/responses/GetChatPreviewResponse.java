package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.messages.ChatPreview;
import com.vk.api.sdk.objects.users.UserFull;
import java.util.List;
import java.util.Objects;

/**
 * GetChatPreviewResponse object
 */
public class GetChatPreviewResponse implements Validable {
    @SerializedName("preview")
    private ChatPreview preview;

    @SerializedName("profiles")
    private List<UserFull> profiles;

    public ChatPreview getPreview() {
        return preview;
    }

    public GetChatPreviewResponse setPreview(ChatPreview preview) {
        this.preview = preview;
        return this;
    }

    public List<UserFull> getProfiles() {
        return profiles;
    }

    public GetChatPreviewResponse setProfiles(List<UserFull> profiles) {
        this.profiles = profiles;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(preview, profiles);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetChatPreviewResponse getChatPreviewResponse = (GetChatPreviewResponse) o;
        return Objects.equals(preview, getChatPreviewResponse.preview) &&
                Objects.equals(profiles, getChatPreviewResponse.profiles);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetChatPreviewResponse{");
        sb.append("preview=").append(preview);
        sb.append(", profiles=").append(profiles);
        sb.append('}');
        return sb.toString();
    }
}

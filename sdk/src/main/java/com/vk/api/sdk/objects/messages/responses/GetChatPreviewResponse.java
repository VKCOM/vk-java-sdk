package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.messages.ChatPreview;
import com.vk.api.sdk.objects.users.UserXtrCounters;

import java.util.List;
import java.util.Objects;

public class GetChatPreviewResponse {

    @SerializedName("preview")
    private ChatPreview preview;

    @SerializedName("profiles")
    private List<UserXtrCounters> profiles;

    public ChatPreview getPreview() {
        return preview;
    }

    public List<UserXtrCounters> getProfiles() {
        return profiles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetChatPreviewResponse that = (GetChatPreviewResponse) o;
        return Objects.equals(preview, that.preview) &&
                Objects.equals(profiles, that.profiles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preview, profiles);
    }

    @Override
    public String toString() {
        return "GetChatPreviewResponse{" +
                "preview=" + preview +
                ", profiles=" + profiles +
                '}';
    }
}

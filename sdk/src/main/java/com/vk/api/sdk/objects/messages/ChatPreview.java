package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class ChatPreview {

    @SerializedName("admin_id")
    private Integer adminId;

    @SerializedName("members")
    private List<Integer> members;

    @SerializedName("title")
    private String title;

    @SerializedName("photo")
    private ChatPhoto photo;

    @SerializedName("local_id")
    private Integer localId;

    public Integer getAdminId() {
        return adminId;
    }

    public List<Integer> getMembers() {
        return members;
    }

    public String getTitle() {
        return title;
    }

    public ChatPhoto getPhoto() {
        return photo;
    }

    public Integer getLocalId() {
        return localId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatPreview that = (ChatPreview) o;
        return Objects.equals(adminId, that.adminId) &&
                Objects.equals(members, that.members) &&
                Objects.equals(title, that.title) &&
                Objects.equals(photo, that.photo) &&
                Objects.equals(localId, that.localId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminId, members, title, photo, localId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ChatPreview{");
        sb.append("adminId=").append(adminId);
        sb.append(", members=").append(members);
        sb.append(", title='").append(title).append('\'');
        sb.append(", photo=").append(photo);
        sb.append(", localId=").append(localId);
        sb.append('}');
        return sb.toString();
    }
}

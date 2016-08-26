package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * Chat object
 */
public class Chat {
    /**
     * Chat ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Chat type
     */
    @SerializedName("type")
    private String type;

    /**
     * Chat creator ID
     */
    @SerializedName("admin_id")
    private Integer adminId;

    @SerializedName("users")
    private List<Integer> users;

    @SerializedName("push_settings")
    private ChatPushSettings pushSettings;

    /**
     * URL of the preview image with 50 px in width
     */
    @SerializedName("photo_50")
    private String photo50;

    /**
     * URL of the preview image with 100 px in width
     */
    @SerializedName("photo_100")
    private String photo100;

    /**
     * URL of the preview image with 200 px in width
     */
    @SerializedName("photo_200")
    private String photo200;

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public List<Integer> getUsers() {
        return users;
    }

    public ChatPushSettings getPushSettings() {
        return pushSettings;
    }

    public String getPhoto50() {
        return photo50;
    }

    public String getPhoto100() {
        return photo100;
    }

    public String getPhoto200() {
        return photo200;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo100, adminId, photo50, id, pushSettings, photo200, type, users);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chat chat = (Chat) o;
        return Objects.equals(id, chat.id) &&
                Objects.equals(type, chat.type) &&
                Objects.equals(adminId, chat.adminId) &&
                Objects.equals(users, chat.users) &&
                Objects.equals(pushSettings, chat.pushSettings) &&
                Objects.equals(photo50, chat.photo50) &&
                Objects.equals(photo100, chat.photo100) &&
                Objects.equals(photo200, chat.photo200);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Chat{");
        sb.append("id=").append(id);
        sb.append(", type='").append(type).append("'");
        sb.append(", adminId=").append(adminId);
        sb.append(", users=").append(users);
        sb.append(", pushSettings=").append(pushSettings);
        sb.append(", photo50='").append(photo50).append("'");
        sb.append(", photo100='").append(photo100).append("'");
        sb.append(", photo200='").append(photo200).append("'");
        sb.append('}');
        return sb.toString();
    }
}

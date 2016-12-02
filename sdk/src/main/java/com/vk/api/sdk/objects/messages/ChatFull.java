package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.List;
import java.util.Objects;

/**
 * ChatFull object
 */
public class ChatFull {

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
     * Chat title
     */
    @SerializedName("title")
    private String title;

    /**
     * Chat creator ID
     */
    @SerializedName("admin_id")
    private Integer adminId;

    @SerializedName("users")
    private List<UserXtrInvitedBy> users;

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

    /**
     * Shows that user has been left the chat
     */
    @SerializedName("left")
    private BoolInt left;

    /**
     * Shows that user has been kicked from the chat
     */
    @SerializedName("kicked")
    private BoolInt kicked;

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public List<UserXtrInvitedBy> getUsers() {
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

    public boolean left() {
        return left == BoolInt.YES;
    }

    public boolean kicked() {
        return kicked == BoolInt.YES;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatFull chatFull = (ChatFull) o;
        return Objects.equals(id, chatFull.id) &&
                Objects.equals(type, chatFull.type) &&
                Objects.equals(title, chatFull.title) &&
                Objects.equals(adminId, chatFull.adminId) &&
                Objects.equals(users, chatFull.users) &&
                Objects.equals(pushSettings, chatFull.pushSettings) &&
                Objects.equals(photo50, chatFull.photo50) &&
                Objects.equals(photo100, chatFull.photo100) &&
                Objects.equals(photo200, chatFull.photo200) &&
                left == chatFull.left &&
                kicked == chatFull.kicked;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, title, adminId, users, pushSettings, photo50, photo100, photo200, left, kicked);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ChatFull{");
        sb.append("id=").append(id);
        sb.append(", type='").append(type).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", adminId=").append(adminId);
        sb.append(", users=").append(users);
        sb.append(", pushSettings=").append(pushSettings);
        sb.append(", photo50='").append(photo50).append('\'');
        sb.append(", photo100='").append(photo100).append('\'');
        sb.append(", photo200='").append(photo200).append('\'');
        sb.append(", left=").append(left);
        sb.append(", kicked=").append(kicked);
        sb.append('}');
        return sb.toString();
    }
}

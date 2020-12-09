package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import java.net.URI;
import java.util.List;
import java.util.Objects;

/**
 * ChatFull object
 */
public class ChatFull implements Validable {
    /**
     * Chat creator ID
     */
    @SerializedName("admin_id")
    private Integer adminId;

    /**
     * Chat ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Shows that user has been kicked from the chat
     */
    @SerializedName("kicked")
    private BoolInt kicked;

    /**
     * Shows that user has been left the chat
     */
    @SerializedName("left")
    private BoolInt left;

    /**
     * URL of the preview image with 100 px in width
     */
    @SerializedName("photo_100")
    private URI photo100;

    /**
     * URL of the preview image with 200 px in width
     */
    @SerializedName("photo_200")
    private URI photo200;

    /**
     * URL of the preview image with 50 px in width
     */
    @SerializedName("photo_50")
    private URI photo50;

    @SerializedName("push_settings")
    private ChatPushSettings pushSettings;

    /**
     * Chat title
     */
    @SerializedName("title")
    private String title;

    /**
     * Chat type
     */
    @SerializedName("type")
    @Required
    private String type;

    @SerializedName("users")
    @Required
    private List<UserXtrInvitedBy> users;

    public Integer getAdminId() {
        return adminId;
    }

    public ChatFull setAdminId(Integer adminId) {
        this.adminId = adminId;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public ChatFull setId(Integer id) {
        this.id = id;
        return this;
    }

    public boolean isKicked() {
        return kicked == BoolInt.YES;
    }

    public BoolInt getKicked() {
        return kicked;
    }

    public boolean isLeft() {
        return left == BoolInt.YES;
    }

    public BoolInt getLeft() {
        return left;
    }

    public URI getPhoto100() {
        return photo100;
    }

    public ChatFull setPhoto100(URI photo100) {
        this.photo100 = photo100;
        return this;
    }

    public URI getPhoto200() {
        return photo200;
    }

    public ChatFull setPhoto200(URI photo200) {
        this.photo200 = photo200;
        return this;
    }

    public URI getPhoto50() {
        return photo50;
    }

    public ChatFull setPhoto50(URI photo50) {
        this.photo50 = photo50;
        return this;
    }

    public ChatPushSettings getPushSettings() {
        return pushSettings;
    }

    public ChatFull setPushSettings(ChatPushSettings pushSettings) {
        this.pushSettings = pushSettings;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ChatFull setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getType() {
        return type;
    }

    public ChatFull setType(String type) {
        this.type = type;
        return this;
    }

    public List<UserXtrInvitedBy> getUsers() {
        return users;
    }

    public ChatFull setUsers(List<UserXtrInvitedBy> users) {
        this.users = users;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo100, left, adminId, photo50, kicked, pushSettings, id, photo200, title, type, users);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatFull chatFull = (ChatFull) o;
        return Objects.equals(photo50, chatFull.photo50) &&
                Objects.equals(left, chatFull.left) &&
                Objects.equals(pushSettings, chatFull.pushSettings) &&
                Objects.equals(adminId, chatFull.adminId) &&
                Objects.equals(kicked, chatFull.kicked) &&
                Objects.equals(id, chatFull.id) &&
                Objects.equals(photo100, chatFull.photo100) &&
                Objects.equals(title, chatFull.title) &&
                Objects.equals(type, chatFull.type) &&
                Objects.equals(photo200, chatFull.photo200) &&
                Objects.equals(users, chatFull.users);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ChatFull{");
        sb.append("photo50=").append(photo50);
        sb.append(", left=").append(left);
        sb.append(", pushSettings=").append(pushSettings);
        sb.append(", adminId=").append(adminId);
        sb.append(", kicked=").append(kicked);
        sb.append(", id=").append(id);
        sb.append(", photo100=").append(photo100);
        sb.append(", title='").append(title).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append(", photo200=").append(photo200);
        sb.append(", users=").append(users);
        sb.append('}');
        return sb.toString();
    }
}

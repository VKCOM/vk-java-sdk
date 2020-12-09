package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.messages.ChatPushSettings;
import java.net.URI;
import java.util.List;
import java.util.Objects;

/**
 * GetChatResponse object
 */
public class GetChatResponse implements Validable {
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
    private List<Integer> users;

    /**
     * If provided photo is default
     */
    @SerializedName("is_default_photo")
    private Boolean isDefaultPhoto;

    public Integer getAdminId() {
        return adminId;
    }

    public GetChatResponse setAdminId(Integer adminId) {
        this.adminId = adminId;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GetChatResponse setId(Integer id) {
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

    public GetChatResponse setPhoto100(URI photo100) {
        this.photo100 = photo100;
        return this;
    }

    public URI getPhoto200() {
        return photo200;
    }

    public GetChatResponse setPhoto200(URI photo200) {
        this.photo200 = photo200;
        return this;
    }

    public URI getPhoto50() {
        return photo50;
    }

    public GetChatResponse setPhoto50(URI photo50) {
        this.photo50 = photo50;
        return this;
    }

    public ChatPushSettings getPushSettings() {
        return pushSettings;
    }

    public GetChatResponse setPushSettings(ChatPushSettings pushSettings) {
        this.pushSettings = pushSettings;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public GetChatResponse setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getType() {
        return type;
    }

    public GetChatResponse setType(String type) {
        this.type = type;
        return this;
    }

    public List<Integer> getUsers() {
        return users;
    }

    public GetChatResponse setUsers(List<Integer> users) {
        this.users = users;
        return this;
    }

    public Boolean getIsDefaultPhoto() {
        return isDefaultPhoto;
    }

    public GetChatResponse setIsDefaultPhoto(Boolean isDefaultPhoto) {
        this.isDefaultPhoto = isDefaultPhoto;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo100, left, adminId, photo50, kicked, pushSettings, id, photo200, title, type, users, isDefaultPhoto);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetChatResponse getChatResponse = (GetChatResponse) o;
        return Objects.equals(photo50, getChatResponse.photo50) &&
                Objects.equals(left, getChatResponse.left) &&
                Objects.equals(pushSettings, getChatResponse.pushSettings) &&
                Objects.equals(isDefaultPhoto, getChatResponse.isDefaultPhoto) &&
                Objects.equals(adminId, getChatResponse.adminId) &&
                Objects.equals(kicked, getChatResponse.kicked) &&
                Objects.equals(id, getChatResponse.id) &&
                Objects.equals(photo100, getChatResponse.photo100) &&
                Objects.equals(title, getChatResponse.title) &&
                Objects.equals(type, getChatResponse.type) &&
                Objects.equals(photo200, getChatResponse.photo200) &&
                Objects.equals(users, getChatResponse.users);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetChatResponse{");
        sb.append("photo50=").append(photo50);
        sb.append(", left=").append(left);
        sb.append(", pushSettings=").append(pushSettings);
        sb.append(", isDefaultPhoto=").append(isDefaultPhoto);
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

package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.List;
import java.util.Objects;

/**
 * ChatSettings object
 */
public class ChatSettings implements Validable {
    @SerializedName("members_count")
    private Integer membersCount;

    @SerializedName("friends_count")
    private Integer friendsCount;

    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Chat title
     */
    @SerializedName("title")
    @Required
    private String title;

    @SerializedName("pinned_message")
    private PinnedMessage pinnedMessage;

    @SerializedName("state")
    @Required
    private ChatSettingsState state;

    @SerializedName("photo")
    private ChatSettingsPhoto photo;

    /**
     * Ids of chat admins
     */
    @SerializedName("admin_ids")
    private List<Integer> adminIds;

    @SerializedName("active_ids")
    private List<Integer> activeIds;

    @SerializedName("is_group_channel")
    private Boolean isGroupChannel;

    @SerializedName("acl")
    @Required
    private ChatSettingsAcl acl;

    @SerializedName("permissions")
    private ChatSettingsPermissions permissions;

    @SerializedName("is_disappearing")
    private Boolean isDisappearing;

    @SerializedName("theme")
    private String theme;

    @SerializedName("disappearing_chat_link")
    private String disappearingChatLink;

    @SerializedName("is_service")
    private Boolean isService;

    public Integer getMembersCount() {
        return membersCount;
    }

    public ChatSettings setMembersCount(Integer membersCount) {
        this.membersCount = membersCount;
        return this;
    }

    public Integer getFriendsCount() {
        return friendsCount;
    }

    public ChatSettings setFriendsCount(Integer friendsCount) {
        this.friendsCount = friendsCount;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public ChatSettings setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ChatSettings setTitle(String title) {
        this.title = title;
        return this;
    }

    public PinnedMessage getPinnedMessage() {
        return pinnedMessage;
    }

    public ChatSettings setPinnedMessage(PinnedMessage pinnedMessage) {
        this.pinnedMessage = pinnedMessage;
        return this;
    }

    public ChatSettingsState getState() {
        return state;
    }

    public ChatSettings setState(ChatSettingsState state) {
        this.state = state;
        return this;
    }

    public ChatSettingsPhoto getPhoto() {
        return photo;
    }

    public ChatSettings setPhoto(ChatSettingsPhoto photo) {
        this.photo = photo;
        return this;
    }

    public List<Integer> getAdminIds() {
        return adminIds;
    }

    public ChatSettings setAdminIds(List<Integer> adminIds) {
        this.adminIds = adminIds;
        return this;
    }

    public List<Integer> getActiveIds() {
        return activeIds;
    }

    public ChatSettings setActiveIds(List<Integer> activeIds) {
        this.activeIds = activeIds;
        return this;
    }

    public Boolean getIsGroupChannel() {
        return isGroupChannel;
    }

    public ChatSettings setIsGroupChannel(Boolean isGroupChannel) {
        this.isGroupChannel = isGroupChannel;
        return this;
    }

    public ChatSettingsAcl getAcl() {
        return acl;
    }

    public ChatSettings setAcl(ChatSettingsAcl acl) {
        this.acl = acl;
        return this;
    }

    public ChatSettingsPermissions getPermissions() {
        return permissions;
    }

    public ChatSettings setPermissions(ChatSettingsPermissions permissions) {
        this.permissions = permissions;
        return this;
    }

    public Boolean getIsDisappearing() {
        return isDisappearing;
    }

    public ChatSettings setIsDisappearing(Boolean isDisappearing) {
        this.isDisappearing = isDisappearing;
        return this;
    }

    public String getTheme() {
        return theme;
    }

    public ChatSettings setTheme(String theme) {
        this.theme = theme;
        return this;
    }

    public String getDisappearingChatLink() {
        return disappearingChatLink;
    }

    public ChatSettings setDisappearingChatLink(String disappearingChatLink) {
        this.disappearingChatLink = disappearingChatLink;
        return this;
    }

    public Boolean getIsService() {
        return isService;
    }

    public ChatSettings setIsService(Boolean isService) {
        this.isService = isService;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(membersCount, disappearingChatLink, photo, isDisappearing, friendsCount, acl, ownerId, title, pinnedMessage, adminIds, permissions, isGroupChannel, theme, state, activeIds, isService);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatSettings chatSettings = (ChatSettings) o;
        return Objects.equals(friendsCount, chatSettings.friendsCount) &&
                Objects.equals(isGroupChannel, chatSettings.isGroupChannel) &&
                Objects.equals(ownerId, chatSettings.ownerId) &&
                Objects.equals(activeIds, chatSettings.activeIds) &&
                Objects.equals(photo, chatSettings.photo) &&
                Objects.equals(acl, chatSettings.acl) &&
                Objects.equals(title, chatSettings.title) &&
                Objects.equals(pinnedMessage, chatSettings.pinnedMessage) &&
                Objects.equals(isService, chatSettings.isService) &&
                Objects.equals(isDisappearing, chatSettings.isDisappearing) &&
                Objects.equals(permissions, chatSettings.permissions) &&
                Objects.equals(disappearingChatLink, chatSettings.disappearingChatLink) &&
                Objects.equals(membersCount, chatSettings.membersCount) &&
                Objects.equals(adminIds, chatSettings.adminIds) &&
                Objects.equals(theme, chatSettings.theme) &&
                Objects.equals(state, chatSettings.state);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ChatSettings{");
        sb.append("friendsCount=").append(friendsCount);
        sb.append(", isGroupChannel=").append(isGroupChannel);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", activeIds=").append(activeIds);
        sb.append(", photo=").append(photo);
        sb.append(", acl=").append(acl);
        sb.append(", title='").append(title).append("'");
        sb.append(", pinnedMessage=").append(pinnedMessage);
        sb.append(", isService=").append(isService);
        sb.append(", isDisappearing=").append(isDisappearing);
        sb.append(", permissions=").append(permissions);
        sb.append(", disappearingChatLink='").append(disappearingChatLink).append("'");
        sb.append(", membersCount=").append(membersCount);
        sb.append(", adminIds=").append(adminIds);
        sb.append(", theme='").append(theme).append("'");
        sb.append(", state=").append(state);
        sb.append('}');
        return sb.toString();
    }
}

package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * ChatSettingsAcl object
 */
public class ChatSettingsAcl implements Validable {
    /**
     * Can you change photo, description and name
     */
    @SerializedName("can_change_info")
    private Boolean canChangeInfo;

    /**
     * Can you change invite link for this chat
     */
    @SerializedName("can_change_invite_link")
    private Boolean canChangeInviteLink;

    /**
     * Can you pin/unpin message for this chat
     */
    @SerializedName("can_change_pin")
    private Boolean canChangePin;

    /**
     * Can you invite other peers in chat
     */
    @SerializedName("can_invite")
    private Boolean canInvite;

    /**
     * Can you promote simple users to chat admins
     */
    @SerializedName("can_promote_users")
    private Boolean canPromoteUsers;

    /**
     * Can you see invite link for this chat
     */
    @SerializedName("can_see_invite_link")
    private Boolean canSeeInviteLink;

    /**
     * Can you moderate (delete) other users' messages
     */
    @SerializedName("can_moderate")
    private Boolean canModerate;

    /**
     * Can you copy chat
     */
    @SerializedName("can_copy_chat")
    private Boolean canCopyChat;

    /**
     * Can you init group call in the chat
     */
    @SerializedName("can_call")
    private Boolean canCall;

    /**
     * Can you use mass mentions
     */
    @SerializedName("can_use_mass_mentions")
    private Boolean canUseMassMentions;

    /**
     * Can you change chat service type
     */
    @SerializedName("can_change_service_type")
    private Boolean canChangeServiceType;

    public Boolean getCanChangeInfo() {
        return canChangeInfo;
    }

    public ChatSettingsAcl setCanChangeInfo(Boolean canChangeInfo) {
        this.canChangeInfo = canChangeInfo;
        return this;
    }

    public Boolean getCanChangeInviteLink() {
        return canChangeInviteLink;
    }

    public ChatSettingsAcl setCanChangeInviteLink(Boolean canChangeInviteLink) {
        this.canChangeInviteLink = canChangeInviteLink;
        return this;
    }

    public Boolean getCanChangePin() {
        return canChangePin;
    }

    public ChatSettingsAcl setCanChangePin(Boolean canChangePin) {
        this.canChangePin = canChangePin;
        return this;
    }

    public Boolean getCanInvite() {
        return canInvite;
    }

    public ChatSettingsAcl setCanInvite(Boolean canInvite) {
        this.canInvite = canInvite;
        return this;
    }

    public Boolean getCanPromoteUsers() {
        return canPromoteUsers;
    }

    public ChatSettingsAcl setCanPromoteUsers(Boolean canPromoteUsers) {
        this.canPromoteUsers = canPromoteUsers;
        return this;
    }

    public Boolean getCanSeeInviteLink() {
        return canSeeInviteLink;
    }

    public ChatSettingsAcl setCanSeeInviteLink(Boolean canSeeInviteLink) {
        this.canSeeInviteLink = canSeeInviteLink;
        return this;
    }

    public Boolean getCanModerate() {
        return canModerate;
    }

    public ChatSettingsAcl setCanModerate(Boolean canModerate) {
        this.canModerate = canModerate;
        return this;
    }

    public Boolean getCanCopyChat() {
        return canCopyChat;
    }

    public ChatSettingsAcl setCanCopyChat(Boolean canCopyChat) {
        this.canCopyChat = canCopyChat;
        return this;
    }

    public Boolean getCanCall() {
        return canCall;
    }

    public ChatSettingsAcl setCanCall(Boolean canCall) {
        this.canCall = canCall;
        return this;
    }

    public Boolean getCanUseMassMentions() {
        return canUseMassMentions;
    }

    public ChatSettingsAcl setCanUseMassMentions(Boolean canUseMassMentions) {
        this.canUseMassMentions = canUseMassMentions;
        return this;
    }

    public Boolean getCanChangeServiceType() {
        return canChangeServiceType;
    }

    public ChatSettingsAcl setCanChangeServiceType(Boolean canChangeServiceType) {
        this.canChangeServiceType = canChangeServiceType;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canPromoteUsers, canCall, canInvite, canChangeInfo, canModerate, canUseMassMentions, canChangeInviteLink, canSeeInviteLink, canCopyChat, canChangePin, canChangeServiceType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatSettingsAcl chatSettingsAcl = (ChatSettingsAcl) o;
        return Objects.equals(canChangeInviteLink, chatSettingsAcl.canChangeInviteLink) &&
                Objects.equals(canInvite, chatSettingsAcl.canInvite) &&
                Objects.equals(canSeeInviteLink, chatSettingsAcl.canSeeInviteLink) &&
                Objects.equals(canCall, chatSettingsAcl.canCall) &&
                Objects.equals(canChangeInfo, chatSettingsAcl.canChangeInfo) &&
                Objects.equals(canCopyChat, chatSettingsAcl.canCopyChat) &&
                Objects.equals(canChangePin, chatSettingsAcl.canChangePin) &&
                Objects.equals(canChangeServiceType, chatSettingsAcl.canChangeServiceType) &&
                Objects.equals(canModerate, chatSettingsAcl.canModerate) &&
                Objects.equals(canUseMassMentions, chatSettingsAcl.canUseMassMentions) &&
                Objects.equals(canPromoteUsers, chatSettingsAcl.canPromoteUsers);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ChatSettingsAcl{");
        sb.append("canChangeInviteLink=").append(canChangeInviteLink);
        sb.append(", canInvite=").append(canInvite);
        sb.append(", canSeeInviteLink=").append(canSeeInviteLink);
        sb.append(", canCall=").append(canCall);
        sb.append(", canChangeInfo=").append(canChangeInfo);
        sb.append(", canCopyChat=").append(canCopyChat);
        sb.append(", canChangePin=").append(canChangePin);
        sb.append(", canChangeServiceType=").append(canChangeServiceType);
        sb.append(", canModerate=").append(canModerate);
        sb.append(", canUseMassMentions=").append(canUseMassMentions);
        sb.append(", canPromoteUsers=").append(canPromoteUsers);
        sb.append('}');
        return sb.toString();
    }
}

package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * ChatSettingsPermissions object
 */
public class ChatSettingsPermissions implements Validable {
    /**
     * Who can invite users to chat
     */
    @SerializedName("invite")
    private ChatSettingsPermissionsInvite invite;

    /**
     * Who can change chat info
     */
    @SerializedName("change_info")
    private ChatSettingsPermissionsChangeInfo changeInfo;

    /**
     * Who can change pinned message
     */
    @SerializedName("change_pin")
    private ChatSettingsPermissionsChangePin changePin;

    /**
     * Who can use mass mentions
     */
    @SerializedName("use_mass_mentions")
    private ChatSettingsPermissionsUseMassMentions useMassMentions;

    /**
     * Who can see invite link
     */
    @SerializedName("see_invite_link")
    private ChatSettingsPermissionsSeeInviteLink seeInviteLink;

    /**
     * Who can make calls
     */
    @SerializedName("call")
    private ChatSettingsPermissionsCall call;

    /**
     * Who can change admins
     */
    @SerializedName("change_admins")
    private ChatSettingsPermissionsChangeAdmins changeAdmins;

    public ChatSettingsPermissionsInvite getInvite() {
        return invite;
    }

    public ChatSettingsPermissions setInvite(ChatSettingsPermissionsInvite invite) {
        this.invite = invite;
        return this;
    }

    public ChatSettingsPermissionsChangeInfo getChangeInfo() {
        return changeInfo;
    }

    public ChatSettingsPermissions setChangeInfo(ChatSettingsPermissionsChangeInfo changeInfo) {
        this.changeInfo = changeInfo;
        return this;
    }

    public ChatSettingsPermissionsChangePin getChangePin() {
        return changePin;
    }

    public ChatSettingsPermissions setChangePin(ChatSettingsPermissionsChangePin changePin) {
        this.changePin = changePin;
        return this;
    }

    public ChatSettingsPermissionsUseMassMentions getUseMassMentions() {
        return useMassMentions;
    }

    public ChatSettingsPermissions setUseMassMentions(
            ChatSettingsPermissionsUseMassMentions useMassMentions) {
        this.useMassMentions = useMassMentions;
        return this;
    }

    public ChatSettingsPermissionsSeeInviteLink getSeeInviteLink() {
        return seeInviteLink;
    }

    public ChatSettingsPermissions setSeeInviteLink(
            ChatSettingsPermissionsSeeInviteLink seeInviteLink) {
        this.seeInviteLink = seeInviteLink;
        return this;
    }

    public ChatSettingsPermissionsCall getCall() {
        return call;
    }

    public ChatSettingsPermissions setCall(ChatSettingsPermissionsCall call) {
        this.call = call;
        return this;
    }

    public ChatSettingsPermissionsChangeAdmins getChangeAdmins() {
        return changeAdmins;
    }

    public ChatSettingsPermissions setChangeAdmins(
            ChatSettingsPermissionsChangeAdmins changeAdmins) {
        this.changeAdmins = changeAdmins;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(call, changeAdmins, useMassMentions, seeInviteLink, changeInfo, changePin, invite);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatSettingsPermissions chatSettingsPermissions = (ChatSettingsPermissions) o;
        return Objects.equals(changeInfo, chatSettingsPermissions.changeInfo) &&
                Objects.equals(call, chatSettingsPermissions.call) &&
                Objects.equals(useMassMentions, chatSettingsPermissions.useMassMentions) &&
                Objects.equals(changePin, chatSettingsPermissions.changePin) &&
                Objects.equals(changeAdmins, chatSettingsPermissions.changeAdmins) &&
                Objects.equals(invite, chatSettingsPermissions.invite) &&
                Objects.equals(seeInviteLink, chatSettingsPermissions.seeInviteLink);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ChatSettingsPermissions{");
        sb.append("changeInfo='").append(changeInfo).append("'");
        sb.append(", call='").append(call).append("'");
        sb.append(", useMassMentions='").append(useMassMentions).append("'");
        sb.append(", changePin='").append(changePin).append("'");
        sb.append(", changeAdmins='").append(changeAdmins).append("'");
        sb.append(", invite='").append(invite).append("'");
        sb.append(", seeInviteLink='").append(seeInviteLink).append("'");
        sb.append('}');
        return sb.toString();
    }
}

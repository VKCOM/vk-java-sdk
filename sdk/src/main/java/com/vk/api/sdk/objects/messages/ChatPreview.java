package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.List;
import java.util.Objects;

/**
 * ChatPreview object
 */
public class ChatPreview implements Validable {
    @SerializedName("admin_id")
    private Integer adminId;

    @SerializedName("joined")
    private Boolean joined;

    @SerializedName("local_id")
    private Integer localId;

    @SerializedName("members")
    private List<Integer> members;

    @SerializedName("members_count")
    private Integer membersCount;

    @SerializedName("title")
    private String title;

    @SerializedName("is_member")
    private Boolean isMember;

    public Integer getAdminId() {
        return adminId;
    }

    public ChatPreview setAdminId(Integer adminId) {
        this.adminId = adminId;
        return this;
    }

    public Boolean getJoined() {
        return joined;
    }

    public ChatPreview setJoined(Boolean joined) {
        this.joined = joined;
        return this;
    }

    public Integer getLocalId() {
        return localId;
    }

    public ChatPreview setLocalId(Integer localId) {
        this.localId = localId;
        return this;
    }

    public List<Integer> getMembers() {
        return members;
    }

    public ChatPreview setMembers(List<Integer> members) {
        this.members = members;
        return this;
    }

    public Integer getMembersCount() {
        return membersCount;
    }

    public ChatPreview setMembersCount(Integer membersCount) {
        this.membersCount = membersCount;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ChatPreview setTitle(String title) {
        this.title = title;
        return this;
    }

    public Boolean getIsMember() {
        return isMember;
    }

    public ChatPreview setIsMember(Boolean isMember) {
        this.isMember = isMember;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(membersCount, joined, members, adminId, isMember, title, localId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatPreview chatPreview = (ChatPreview) o;
        return Objects.equals(localId, chatPreview.localId) &&
                Objects.equals(isMember, chatPreview.isMember) &&
                Objects.equals(joined, chatPreview.joined) &&
                Objects.equals(adminId, chatPreview.adminId) &&
                Objects.equals(members, chatPreview.members) &&
                Objects.equals(membersCount, chatPreview.membersCount) &&
                Objects.equals(title, chatPreview.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ChatPreview{");
        sb.append("localId=").append(localId);
        sb.append(", isMember=").append(isMember);
        sb.append(", joined=").append(joined);
        sb.append(", adminId=").append(adminId);
        sb.append(", members=").append(members);
        sb.append(", membersCount=").append(membersCount);
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}

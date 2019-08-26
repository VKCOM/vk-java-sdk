package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * IsMemberExtendedResponse object
 */
public class IsMemberExtendedResponse implements Validable {
    /**
     * Information whether user is a member of the group
     */
    @SerializedName("member")
    @Required
    private BoolInt member;

    /**
     * Information whether user has been invited to the group
     */
    @SerializedName("invitation")
    private BoolInt invitation;

    /**
     * Information whether user can be invited
     */
    @SerializedName("can_invite")
    private BoolInt canInvite;

    /**
     * Information whether user's invite to the group can be recalled
     */
    @SerializedName("can_recall")
    private BoolInt canRecall;

    /**
     * Information whether user has sent request to the group
     */
    @SerializedName("request")
    private BoolInt request;

    public boolean isMember() {
        return member == BoolInt.YES;
    }

    public BoolInt getMember() {
        return member;
    }

    public boolean isInvitation() {
        return invitation == BoolInt.YES;
    }

    public BoolInt getInvitation() {
        return invitation;
    }

    public boolean canInvite() {
        return canInvite == BoolInt.YES;
    }

    public BoolInt getCanInvite() {
        return canInvite;
    }

    public boolean canRecall() {
        return canRecall == BoolInt.YES;
    }

    public BoolInt getCanRecall() {
        return canRecall;
    }

    public boolean isRequest() {
        return request == BoolInt.YES;
    }

    public BoolInt getRequest() {
        return request;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canRecall, request, canInvite, invitation, member);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IsMemberExtendedResponse isMemberExtendedResponse = (IsMemberExtendedResponse) o;
        return Objects.equals(canInvite, isMemberExtendedResponse.canInvite) &&
                Objects.equals(request, isMemberExtendedResponse.request) &&
                Objects.equals(invitation, isMemberExtendedResponse.invitation) &&
                Objects.equals(member, isMemberExtendedResponse.member) &&
                Objects.equals(canRecall, isMemberExtendedResponse.canRecall);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("IsMemberExtendedResponse{");
        sb.append("canInvite=").append(canInvite);
        sb.append(", request=").append(request);
        sb.append(", invitation=").append(invitation);
        sb.append(", member=").append(member);
        sb.append(", canRecall=").append(canRecall);
        sb.append('}');
        return sb.toString();
    }
}

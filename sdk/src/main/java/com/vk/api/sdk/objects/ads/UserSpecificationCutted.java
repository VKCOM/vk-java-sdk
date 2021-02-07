package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * UserSpecificationCutted object
 */
public class UserSpecificationCutted implements Validable {
    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("role")
    @Required
    private AccessRolePublic role;

    @SerializedName("client_id")
    private Integer clientId;

    @SerializedName("view_budget")
    private Boolean viewBudget;

    public Integer getUserId() {
        return userId;
    }

    public UserSpecificationCutted setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public AccessRolePublic getRole() {
        return role;
    }

    public UserSpecificationCutted setRole(AccessRolePublic role) {
        this.role = role;
        return this;
    }

    public Integer getClientId() {
        return clientId;
    }

    public UserSpecificationCutted setClientId(Integer clientId) {
        this.clientId = clientId;
        return this;
    }

    public Boolean getViewBudget() {
        return viewBudget;
    }

    public UserSpecificationCutted setViewBudget(Boolean viewBudget) {
        this.viewBudget = viewBudget;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(role, clientId, userId, viewBudget);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserSpecificationCutted userSpecificationCutted = (UserSpecificationCutted) o;
        return Objects.equals(role, userSpecificationCutted.role) &&
                Objects.equals(userId, userSpecificationCutted.userId) &&
                Objects.equals(clientId, userSpecificationCutted.clientId) &&
                Objects.equals(viewBudget, userSpecificationCutted.viewBudget);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UserSpecificationCutted{");
        sb.append("role=").append(role);
        sb.append(", userId=").append(userId);
        sb.append(", clientId=").append(clientId);
        sb.append(", viewBudget=").append(viewBudget);
        sb.append('}');
        return sb.toString();
    }
}

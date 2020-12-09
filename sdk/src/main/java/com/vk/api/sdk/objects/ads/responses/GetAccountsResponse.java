package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.ads.AccessRole;
import com.vk.api.sdk.objects.ads.AccountType;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * GetAccountsResponse object
 */
public class GetAccountsResponse implements Validable {
    @SerializedName("access_role")
    private AccessRole accessRole;

    /**
     * Account ID
     */
    @SerializedName("account_id")
    private Integer accountId;

    /**
     * Information whether account is active
     */
    @SerializedName("account_status")
    private BoolInt accountStatus;

    @SerializedName("account_type")
    private AccountType accountType;

    /**
     * Account name
     */
    @SerializedName("account_name")
    private String accountName;

    /**
     * Can user view account budget
     */
    @SerializedName("can_view_budget")
    private Boolean canViewBudget;

    public AccessRole getAccessRole() {
        return accessRole;
    }

    public GetAccountsResponse setAccessRole(AccessRole accessRole) {
        this.accessRole = accessRole;
        return this;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public GetAccountsResponse setAccountId(Integer accountId) {
        this.accountId = accountId;
        return this;
    }

    public boolean isAccountStatus() {
        return accountStatus == BoolInt.YES;
    }

    public BoolInt getAccountStatus() {
        return accountStatus;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public GetAccountsResponse setAccountType(AccountType accountType) {
        this.accountType = accountType;
        return this;
    }

    public String getAccountName() {
        return accountName;
    }

    public GetAccountsResponse setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    public Boolean getCanViewBudget() {
        return canViewBudget;
    }

    public GetAccountsResponse setCanViewBudget(Boolean canViewBudget) {
        this.canViewBudget = canViewBudget;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountStatus, accountId, canViewBudget, accountName, accountType, accessRole);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAccountsResponse getAccountsResponse = (GetAccountsResponse) o;
        return Objects.equals(accountType, getAccountsResponse.accountType) &&
                Objects.equals(accountId, getAccountsResponse.accountId) &&
                Objects.equals(accessRole, getAccountsResponse.accessRole) &&
                Objects.equals(accountName, getAccountsResponse.accountName) &&
                Objects.equals(accountStatus, getAccountsResponse.accountStatus) &&
                Objects.equals(canViewBudget, getAccountsResponse.canViewBudget);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetAccountsResponse{");
        sb.append("accountType=").append(accountType);
        sb.append(", accountId=").append(accountId);
        sb.append(", accessRole=").append(accessRole);
        sb.append(", accountName='").append(accountName).append("'");
        sb.append(", accountStatus=").append(accountStatus);
        sb.append(", canViewBudget=").append(canViewBudget);
        sb.append('}');
        return sb.toString();
    }
}

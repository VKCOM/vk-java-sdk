package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * Account object
 */
public class Account implements Validable {
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

    public AccessRole getAccessRole() {
        return accessRole;
    }

    public Account setAccessRole(AccessRole accessRole) {
        this.accessRole = accessRole;
        return this;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public Account setAccountId(Integer accountId) {
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

    public Account setAccountType(AccountType accountType) {
        this.accountType = accountType;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountStatus, accountId, accountType, accessRole);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountType, account.accountType) &&
                Objects.equals(accountId, account.accountId) &&
                Objects.equals(accessRole, account.accessRole) &&
                Objects.equals(accountStatus, account.accountStatus);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("accountType=").append(accountType);
        sb.append(", accountId=").append(accountId);
        sb.append(", accessRole=").append(accessRole);
        sb.append(", accountStatus=").append(accountStatus);
        sb.append('}');
        return sb.toString();
    }
}

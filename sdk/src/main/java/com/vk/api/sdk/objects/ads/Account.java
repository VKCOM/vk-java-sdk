package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * Account object
 */
public class Account {
    /**
     * Account ID
     */
    @SerializedName("account_id")
    private Integer accountId;

    /**
     * Account type
     */
    @SerializedName("account_type")
    private AccountAccountType accountType;

    /**
     * Information whether account is active
     */
    @SerializedName("account_status")
    private BoolInt accountStatus;

    @SerializedName("access_role")
    private AccessRole accessRole;

    public Integer getAccountId() {
        return accountId;
    }

    public AccountAccountType getAccountType() {
        return accountType;
    }

    public boolean isAccountStatus() {
        return accountStatus == BoolInt.YES;
    }

    public AccessRole getAccessRole() {
        return accessRole;
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
        return Objects.equals(accountId, account.accountId) &&
                Objects.equals(accountType, account.accountType) &&
                Objects.equals(accountStatus, account.accountStatus) &&
                Objects.equals(accessRole, account.accessRole);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("accountId=").append(accountId);
        sb.append(", accountType='").append(accountType).append("'");
        sb.append(", accountStatus=").append(accountStatus);
        sb.append(", accessRole=").append(accessRole);
        sb.append('}');
        return sb.toString();
    }
}

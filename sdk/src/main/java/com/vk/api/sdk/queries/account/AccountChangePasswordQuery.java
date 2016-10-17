package com.vk.api.sdk.queries.account;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.account.responses.ChangePasswordResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Account.changePassword method
 */
public class AccountChangePasswordQuery extends AbstractQueryBuilder<AccountChangePasswordQuery, ChangePasswordResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client      VK API client
     * @param actor       actor with access token
     * @param newPassword value of "new password" parameter.
     */
    public AccountChangePasswordQuery(VkApiClient client, UserActor actor, String newPassword) {
        super(client, "account.changePassword", ChangePasswordResponse.class);
        accessToken(actor.getAccessToken());
        newPassword(newPassword);
    }

    /**
     * Session id received after the auth.restore method is executed.
     * (If the password is changed right after the access was restored)
     *
     * @param value value of "restore sid" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountChangePasswordQuery restoreSid(String value) {
        return unsafeParam("restore_sid", value);
    }

    /**
     * Hash received after a successful OAuth authorization with a code got by SMS.
     * (If the password is changed right after the access was restored)
     *
     * @param value value of "change password hash" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountChangePasswordQuery changePasswordHash(String value) {
        return unsafeParam("change_password_hash", value);
    }

    /**
     * Current user password.
     *
     * @param value value of "old password" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountChangePasswordQuery oldPassword(String value) {
        return unsafeParam("old_password", value);
    }

    /**
     * New password that  will be set as a current
     *
     * @param value value of "new password" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AccountChangePasswordQuery newPassword(String value) {
        return unsafeParam("new_password", value);
    }

    @Override
    protected AccountChangePasswordQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("new_password", "access_token");
    }
}

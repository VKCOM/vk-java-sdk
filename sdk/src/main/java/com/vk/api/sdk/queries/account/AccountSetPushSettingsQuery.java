package com.vk.api.sdk.queries.account;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Account.setPushSettings method
 */
public class AccountSetPushSettingsQuery extends AbstractQueryBuilder<AccountSetPushSettingsQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   VK API client
     * @param actor    actor with access token
     * @param deviceId value of "device id" parameter.
     */
    public AccountSetPushSettingsQuery(VkApiClient client, UserActor actor, String deviceId) {
        super(client, "account.setPushSettings", OkResponse.class);
        accessToken(actor.getAccessToken());
        deviceId(deviceId);
    }

    /**
     * Set device id
     *
     * @param value value of "device id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AccountSetPushSettingsQuery deviceId(String value) {
        return unsafeParam("device_id", value);
    }

    /**
     * Set settings
     *
     * @param value value of "settings" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountSetPushSettingsQuery settings(String value) {
        return unsafeParam("settings", value);
    }

    /**
     * Set key
     *
     * @param value value of "key" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountSetPushSettingsQuery key(String value) {
        return unsafeParam("key", value);
    }

    /**
     * Set value
     *
     * @param value value of "value" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountSetPushSettingsQuery value(List<String> value) {
        return unsafeParam("value", value);
    }

    @Override
    protected AccountSetPushSettingsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("device_id", "access_token");
    }
}

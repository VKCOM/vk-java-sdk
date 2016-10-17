package com.vk.api.sdk.queries.account;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Account.unregisterDevice method
 */
public class AccountUnregisterDeviceQuery extends AbstractQueryBuilder<AccountUnregisterDeviceQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public AccountUnregisterDeviceQuery(VkApiClient client, UserActor actor) {
        super(client, "account.unregisterDevice", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set device id
     *
     * @param value value of "device id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountUnregisterDeviceQuery deviceId(String value) {
        return unsafeParam("device_id", value);
    }

    @Override
    protected AccountUnregisterDeviceQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

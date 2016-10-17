package com.vk.api.sdk.queries.account;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Account.registerDevice method
 */
public class AccountRegisterDeviceQuery extends AbstractQueryBuilder<AccountRegisterDeviceQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   VK API client
     * @param actor    actor with access token
     * @param token    value of "token" parameter.
     * @param deviceId value of "device id" parameter.
     */
    public AccountRegisterDeviceQuery(VkApiClient client, UserActor actor, String token, String deviceId) {
        super(client, "account.registerDevice", OkResponse.class);
        accessToken(actor.getAccessToken());
        token(token);
        deviceId(deviceId);
    }

    /**
     * Device token used to send notifications. (for mpns, the token shall be URL for sending of notifications)
     *
     * @param value value of "token" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AccountRegisterDeviceQuery token(String value) {
        return unsafeParam("token", value);
    }

    /**
     * String name of device model.
     *
     * @param value value of "device model" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountRegisterDeviceQuery deviceModel(String value) {
        return unsafeParam("device_model", value);
    }

    /**
     * Set device year
     *
     * @param value value of "device year" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountRegisterDeviceQuery deviceYear(Integer value) {
        return unsafeParam("device_year", value);
    }

    /**
     * Set device id
     *
     * @param value value of "device id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AccountRegisterDeviceQuery deviceId(String value) {
        return unsafeParam("device_id", value);
    }

    /**
     * String version of device operating system.
     *
     * @param value value of "system version" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountRegisterDeviceQuery systemVersion(String value) {
        return unsafeParam("system_version", value);
    }

    /**
     * Set settings
     *
     * @param value value of "settings" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountRegisterDeviceQuery settings(String value) {
        return unsafeParam("settings", value);
    }

    @Override
    protected AccountRegisterDeviceQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("device_id", "access_token", "token");
    }
}

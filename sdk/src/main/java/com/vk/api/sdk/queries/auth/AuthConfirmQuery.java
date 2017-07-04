package com.vk.api.sdk.queries.auth;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.auth.responses.ConfirmResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Auth.confirm method
 */
public class AuthConfirmQuery extends AbstractQueryBuilder<AuthConfirmQuery, ConfirmResponse> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client       VK API client
     * @param clientId     value of "client id" parameter.
     * @param clientSecret value of "client secret" parameter.
     * @param phone        value of "phone" parameter.
     * @param code         value of "code" parameter.
     */
    public AuthConfirmQuery(VkApiClient client, int clientId, String clientSecret, String phone, String code) {
        super(client, "auth.confirm", ConfirmResponse.class);
        clientId(clientId);
        clientSecret(clientSecret);
        phone(phone);
        code(code);
    }

    /**
     * Set client id
     *
     * @param value value of "client id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AuthConfirmQuery clientId(int value) {
        return unsafeParam("client_id", value);
    }

    /**
     * Set client secret
     *
     * @param value value of "client secret" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AuthConfirmQuery clientSecret(String value) {
        return unsafeParam("client_secret", value);
    }

    /**
     * Set phone
     *
     * @param value value of "phone" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AuthConfirmQuery phone(String value) {
        return unsafeParam("phone", value);
    }

    /**
     * Set code
     *
     * @param value value of "code" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AuthConfirmQuery code(String value) {
        return unsafeParam("code", value);
    }

    /**
     * Set password
     *
     * @param value value of "password" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AuthConfirmQuery password(String value) {
        return unsafeParam("password", value);
    }

    /**
     * Set test mode
     *
     * @param value value of "test mode" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AuthConfirmQuery testMode(Boolean value) {
        return unsafeParam("test_mode", value);
    }

    /**
     * Set intro
     *
     * @param value value of "intro" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AuthConfirmQuery intro(Integer value) {
        return unsafeParam("intro", value);
    }

    @Override
    protected AuthConfirmQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("phone", "client_secret", "code", "client_id");
    }
}

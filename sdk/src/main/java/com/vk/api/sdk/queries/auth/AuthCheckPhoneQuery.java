package com.vk.api.sdk.queries.auth;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Auth.checkPhone method
 */
public class AuthCheckPhoneQuery extends AbstractQueryBuilder<AuthCheckPhoneQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client       VK API client
     * @param phone        value of "phone" parameter.
     * @param clientSecret value of "client secret" parameter.
     */
    public AuthCheckPhoneQuery(VkApiClient client, String phone, String clientSecret) {
        super(client, "auth.checkPhone", OkResponse.class);
        phone(phone);
        clientSecret(clientSecret);
    }

    /**
     * Phone number.
     *
     * @param value value of "phone" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AuthCheckPhoneQuery phone(String value) {
        return unsafeParam("phone", value);
    }

    /**
     * User ID.
     *
     * @param value value of "client id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AuthCheckPhoneQuery clientId(Integer value) {
        return unsafeParam("client_id", value);
    }

    /**
     * Set client secret
     *
     * @param value value of "client secret" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AuthCheckPhoneQuery clientSecret(String value) {
        return unsafeParam("client_secret", value);
    }

    /**
     * Set auth by phone
     *
     * @param value value of "auth by phone" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AuthCheckPhoneQuery authByPhone(Boolean value) {
        return unsafeParam("auth_by_phone", value);
    }

    @Override
    protected AuthCheckPhoneQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("phone", "client_secret");
    }
}

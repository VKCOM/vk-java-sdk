package com.vk.api.sdk.queries.auth;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.auth.responses.RestoreResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Auth.restore method
 */
public class AuthRestoreQuery extends AbstractQueryBuilder<AuthRestoreQuery, RestoreResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param phone  value of "phone" parameter.
     */
    public AuthRestoreQuery(VkApiClient client, String lastName, String phone) {
        super(client, "auth.restore", RestoreResponse.class);
        lastName(lastName);
        phone(phone);
    }

    /**
     * User last name.
     *
     * @param value value of "phone" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AuthRestoreQuery lastName(String value) {
        return unsafeParam("last_name", value);
    }

    /**
     * User phone number.
     *
     * @param value value of "phone" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AuthRestoreQuery phone(String value) {
        return unsafeParam("phone", value);
    }

    @Override
    protected AuthRestoreQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("last_name", "phone");
    }
}

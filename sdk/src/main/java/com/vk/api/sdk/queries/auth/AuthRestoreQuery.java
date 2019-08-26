package com.vk.api.sdk.queries.auth;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
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
     * @param actor actor with access token
     * @param phone value of "phone" parameter.
     * @param lastName value of "last name" parameter.
     */
    public AuthRestoreQuery(VkApiClient client, UserActor actor, String phone, String lastName) {
        super(client, "auth.restore", RestoreResponse.class);
        accessToken(actor.getAccessToken());
        phone(phone);
        lastName(lastName);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param phone value of "phone" parameter.
     * @param lastName value of "last name" parameter.
     */
    public AuthRestoreQuery(VkApiClient client, String phone, String lastName) {
        super(client, "auth.restore", RestoreResponse.class);
        phone(phone);
        lastName(lastName);
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

    /**
     * User last name.
     *
     * @param value value of "last name" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AuthRestoreQuery lastName(String value) {
        return unsafeParam("last_name", value);
    }

    @Override
    protected AuthRestoreQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("phone", "last_name");
    }
}

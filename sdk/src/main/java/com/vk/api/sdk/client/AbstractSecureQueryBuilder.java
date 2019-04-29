package com.vk.api.sdk.client;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;

import java.lang.reflect.Type;

/**
 * Abstract query builder for Secure methods
 */
public abstract class AbstractSecureQueryBuilder<T, R> extends AbstractQueryBuilder<T, R> {

    public AbstractSecureQueryBuilder(VkApiClient client, String endpoint, String method, Type type) {
        super(client, endpoint, method, type);
    }

    public AbstractSecureQueryBuilder(VkApiClient client, String method, Type type) {
        super(client, method, type);
    }

    /**
     * Set "client secret"
     *
     * @param value client secret
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected T clientSecret(String value) {
        return unsafeParam("client_secret", value);
    }
}

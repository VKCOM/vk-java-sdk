package com.vk.api.sdk.queries.storage;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Storage.set method
 */
public class StorageSetQuery extends AbstractQueryBuilder<StorageSetQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param key    value of "key" parameter.
     */
    public StorageSetQuery(VkApiClient client, UserActor actor, String key) {
        super(client, "storage.set", OkResponse.class);
        accessToken(actor.getAccessToken());
        key(key);
    }

    /**
     * Set key
     *
     * @param value value of "key" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected StorageSetQuery key(String value) {
        return unsafeParam("key", value);
    }

    /**
     * Set value
     *
     * @param value value of "value" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StorageSetQuery value(String value) {
        return unsafeParam("value", value);
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StorageSetQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    @Override
    protected StorageSetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("key", "access_token");
    }
}

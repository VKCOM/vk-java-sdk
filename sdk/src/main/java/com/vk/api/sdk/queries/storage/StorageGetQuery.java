package com.vk.api.sdk.queries.storage;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Storage.get method
 */
public class StorageGetQuery extends AbstractQueryBuilder<StorageGetQuery, String> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public StorageGetQuery(VkApiClient client, UserActor actor) {
        super(client, "storage.get", String.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set key
     *
     * @param value value of "key" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StorageGetQuery key(String value) {
        return unsafeParam("key", value);
    }

    /**
     * Set keys
     *
     * @param value value of "keys" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StorageGetQuery keys(String... value) {
        return unsafeParam("keys", value);
    }

    /**
     * Set keys
     *
     * @param value value of "keys" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StorageGetQuery keys(List<String> value) {
        return unsafeParam("keys", value);
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StorageGetQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    @Override
    protected StorageGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

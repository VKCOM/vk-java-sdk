package com.vk.api.sdk.queries.storage;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.storage.Value;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Storage.get method
 */
public class StorageGetQueryWithKeys extends AbstractQueryBuilder<StorageGetQueryWithKeys, List<Value>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StorageGetQueryWithKeys(VkApiClient client, UserActor actor, String... keys) {
        super(client, "storage.get", Utils.buildParametrizedType(List.class, Value.class));
        accessToken(actor.getAccessToken());
        keys(keys);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StorageGetQueryWithKeys(VkApiClient client, UserActor actor, List<String> keys) {
        super(client, "storage.get", Utils.buildParametrizedType(List.class, Value.class));
        accessToken(actor.getAccessToken());
        keys(keys);
    }

    /**
     * Set key
     *
     * @param value value of "key" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StorageGetQueryWithKeys key(String value) {
        return unsafeParam("key", value);
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StorageGetQueryWithKeys userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Set global
     *
     * @param value value of "global" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StorageGetQueryWithKeys global(Boolean value) {
        return unsafeParam("global", value);
    }

    /**
     * keys
     * Set keys
     *
     * @param value value of "keys" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected StorageGetQueryWithKeys keys(String... value) {
        return unsafeParam("keys", value);
    }

    /**
     * Set keys
     *
     * @param value value of "keys" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected StorageGetQueryWithKeys keys(List<String> value) {
        return unsafeParam("keys", value);
    }

    @Override
    protected StorageGetQueryWithKeys getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

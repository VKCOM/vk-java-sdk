package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.storage.StorageGetKeysQuery;
import com.vk.api.sdk.queries.storage.StorageGetQuery;
import com.vk.api.sdk.queries.storage.StorageGetQueryWithKeys;
import com.vk.api.sdk.queries.storage.StorageSetQuery;

/**
 * List of Storage methods
 */
public class Storage extends AbstractAction {
    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Storage(VkApiClient client) {
        super(client);
    }

    /**
     * Returns a value of variable with the name set by key parameter.
     *
     * @param actor vk actor
     * @param keys
     * @return query
     */
    public StorageGetQueryWithKeys getWithKeys(UserActor actor, String... keys) {
        return new StorageGetQueryWithKeys(getClient(), actor, keys);
    }

    /**
     * Returns a value of variable with the name set by key parameter.
     *
     * @param actor vk actor
     * @return query
     */
    public StorageGetQuery get(UserActor actor) {
        return new StorageGetQuery(getClient(), actor);
    }

    /**
     * Returns the names of all variables.
     *
     * @param actor vk actor
     * @return query
     */
    public StorageGetKeysQuery getKeys(UserActor actor) {
        return new StorageGetKeysQuery(getClient(), actor);
    }

    /**
     * Saves a value of variable with the name set by 'key' parameter.
     *
     * @param actor vk actor
     * @param key
     * @return query
     */
    public StorageSetQuery set(UserActor actor, String key) {
        return new StorageSetQuery(getClient(), actor, key);
    }
}

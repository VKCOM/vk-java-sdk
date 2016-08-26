package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.queries.storage.StorageGetKeysQuery;
import com.vk.api.sdk.queries.storage.StorageGetQuery;
import com.vk.api.sdk.queries.storage.StorageSetQuery;

/**
 * List of Storage methods
 */
public class Storage extends AbstractAction {
    public Storage(VkApiClient client) {
        super(client);
    }

    /**
     * Returns a value of variable with the name set by key parameter.
     */
    public StorageGetQuery get(Actor actor) {
        return new StorageGetQuery(getClient(), actor);
    }

    /**
     * Saves a value of variable with the name set by "key" parameter.
     */
    public StorageSetQuery set(Actor actor, String key) {
        return new StorageSetQuery(getClient(), actor, key);
    }

    /**
     * Returns the names of all variables.
     */
    public StorageGetKeysQuery getKeys(Actor actor) {
        return new StorageGetKeysQuery(getClient(), actor);
    }
}

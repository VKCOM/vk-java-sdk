package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.queries.execute.ExecuteQuery;
import com.vk.api.sdk.queries.execute.ExecuteStorageFunctionQuery;

/**
 * List of Videos methods
 */
public class Execute extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Execute(VkApiClient client) {
        super(client);
    }

    /**
     * Execute by code
     */
    public ExecuteQuery code(Actor actor, String code) {
        return new ExecuteQuery(getClient(), actor, code);
    }

    /**
     * Execute storage function
     */
    public ExecuteStorageFunctionQuery storageFunction(Actor actor, String storageFunctionName) {
        return new ExecuteStorageFunctionQuery(getClient(), actor, storageFunctionName);
    }
}

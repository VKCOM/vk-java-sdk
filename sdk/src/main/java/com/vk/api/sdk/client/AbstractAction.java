package com.vk.api.sdk.client;

/**
 * Created by tsivarev on 21.07.16.
 */
public abstract class AbstractAction {

    private VkApiClient vkApiClient;

    public AbstractAction(VkApiClient vkApiClient) {
        this.vkApiClient = vkApiClient;
    }

    protected VkApiClient getClient() {
        return vkApiClient;
    }
}

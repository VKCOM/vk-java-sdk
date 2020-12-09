package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.downloadedgames.DownloadedGamesGetPaidStatusQueryWithStatus;

/**
 * List of DownloadedGames methods
 */
public class DownloadedGames extends AbstractAction {
    /**
     * Constructor
     *
     * @param client vk api client
     */
    public DownloadedGames(VkApiClient client) {
        super(client);
    }

    /**
     * @param actor vk actor
     * @return query
     */
    public DownloadedGamesGetPaidStatusQueryWithStatus getPaidStatusStatus(UserActor actor) {
        return new DownloadedGamesGetPaidStatusQueryWithStatus(getClient(), actor);
    }
}

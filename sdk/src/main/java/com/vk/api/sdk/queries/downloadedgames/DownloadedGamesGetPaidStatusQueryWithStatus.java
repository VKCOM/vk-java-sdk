package com.vk.api.sdk.queries.downloadedgames;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.downloadedgames.responses.PaidStatusResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for DownloadedGames.getPaidStatus method
 */
public class DownloadedGamesGetPaidStatusQueryWithStatus extends AbstractQueryBuilder<DownloadedGamesGetPaidStatusQueryWithStatus, PaidStatusResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public DownloadedGamesGetPaidStatusQueryWithStatus(VkApiClient client, UserActor actor) {
        super(client, "downloadedGames.getPaidStatus", PaidStatusResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DownloadedGamesGetPaidStatusQueryWithStatus userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    @Override
    protected DownloadedGamesGetPaidStatusQueryWithStatus getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

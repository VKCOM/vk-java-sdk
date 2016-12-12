package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.apps.responses.GetLeaderboardExtendedResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Apps.getLeaderboard method
 */
public class AppsGetLeaderboardQueryWithExtended extends AbstractQueryBuilder<AppsGetLeaderboardQueryWithExtended, GetLeaderboardExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param type   value of "type" parameter.
     */
    public AppsGetLeaderboardQueryWithExtended(VkApiClient client, UserActor actor, AppsGetLeaderboardType type) {
        super(client, "apps.getLeaderboard", GetLeaderboardExtendedResponse.class);
        accessToken(actor.getAccessToken());
        type(type);
        extended(true);
    }

    /**
     * Leaderboard type.
     *
     * @param value value of "type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AppsGetLeaderboardQueryWithExtended type(AppsGetLeaderboardType value) {
        return unsafeParam("type", value);
    }

    /**
     * Rating type.  Possible values:
     * true - global rating among all players;
     * false - rating among user friends.
     *
     * @param value value of "global" parameter. By default 1.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetLeaderboardQueryWithExtended global(Boolean value) {
        return unsafeParam("global", value);
    }

    /**
     * Set extended
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AppsGetLeaderboardQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }


    @Override
    protected AppsGetLeaderboardQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("type", "access_token");
    }
}

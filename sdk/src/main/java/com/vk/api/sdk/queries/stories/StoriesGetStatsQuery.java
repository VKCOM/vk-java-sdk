package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.stories.responses.GetStatsResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Stories.getStats method
 */
public class StoriesGetStatsQuery extends AbstractQueryBuilder<StoriesGetStatsQuery, GetStatsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param storyId value of "story id" parameter. Minimum is 0.
     */
    public StoriesGetStatsQuery(VkApiClient client, UserActor actor, int ownerId, int storyId) {
        super(client, "stories.getStats", GetStatsResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        storyId(storyId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param storyId value of "story id" parameter. Minimum is 0.
     */
    public StoriesGetStatsQuery(VkApiClient client, GroupActor actor, int ownerId, int storyId) {
        super(client, "stories.getStats", GetStatsResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        storyId(storyId);
    }

    /**
     * Story owner ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected StoriesGetStatsQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Story ID.
     *
     * @param value value of "story id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected StoriesGetStatsQuery storyId(int value) {
        return unsafeParam("story_id", value);
    }

    @Override
    protected StoriesGetStatsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("story_id", "owner_id", "access_token");
    }
}

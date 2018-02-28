package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.stories.responses.GetStatsResponse;

import java.util.Arrays;
import java.util.List;

public class StoriesGetStatsQuery extends AbstractQueryBuilder<StoriesGetStatsQuery, GetStatsResponse> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   user actor with access token
     * @param ownerId owner id
     * @param storyId story id
     */
    public StoriesGetStatsQuery(VkApiClient client, UserActor actor, Integer ownerId, Integer storyId) {
        super(client, "stories.getStats", GetStatsResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        storyId(storyId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   group actor with access token
     * @param ownerId owner id
     * @param storyId story id
     */
    public StoriesGetStatsQuery(VkApiClient client, GroupActor actor, Integer ownerId, Integer storyId) {
        super(client, "stories.getStats", GetStatsResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        storyId(storyId);
    }

    protected StoriesGetStatsQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    protected StoriesGetStatsQuery storyId(Integer value) {
        return unsafeParam("story_id", value);
    }

    @Override
    protected StoriesGetStatsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token", "owner_id", "story_id");
    }
}

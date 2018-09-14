package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.stories.responses.GetViewersResponse;

import java.util.Arrays;
import java.util.List;

public class StoriesGetViewersQuery extends AbstractQueryBuilder<StoriesGetViewersQuery, GetViewersResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   user actor with access token
     * @param ownerId owner id
     * @param storyId story id
     */
    public StoriesGetViewersQuery(VkApiClient client, UserActor actor, Integer ownerId, Integer storyId) {
        super(client, "stories.getViewers", GetViewersResponse.class);
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
    public StoriesGetViewersQuery(VkApiClient client, GroupActor actor, Integer ownerId, Integer storyId) {
        super(client, "stories.getViewers", GetViewersResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        storyId(storyId);
    }

    protected StoriesGetViewersQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    protected StoriesGetViewersQuery storyId(Integer value) {
        return unsafeParam("story_id", value);
    }

    public StoriesGetViewersQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    public StoriesGetViewersQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    @Override
    protected StoriesGetViewersQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token", "owner_id", "story_id");
    }
}

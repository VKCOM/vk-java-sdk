package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.stories.responses.GetByIdResponse;

import java.util.Arrays;
import java.util.List;

public class StoriesGetByIdQuery extends AbstractQueryBuilder<StoriesGetByIdQuery, GetByIdResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   user actor with access token
     * @param stories list of stories ids
     */
    public StoriesGetByIdQuery(VkApiClient client, UserActor actor, List<String> stories) {
        super(client, "stories.getById", GetByIdResponse.class);
        accessToken(actor.getAccessToken());
        stories(stories);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   group actor with access token
     * @param stories list of stories ids
     */
    public StoriesGetByIdQuery(VkApiClient client, GroupActor actor, List<String> stories) {
        super(client, "stories.getById", GetByIdResponse.class);
        accessToken(actor.getAccessToken());
        stories(stories);
    }

    protected StoriesGetByIdQuery stories(List<String> value) {
        return unsafeParam("stories", value);
    }

    public StoriesGetByIdQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    @Override
    protected StoriesGetByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token", "stories");
    }
}

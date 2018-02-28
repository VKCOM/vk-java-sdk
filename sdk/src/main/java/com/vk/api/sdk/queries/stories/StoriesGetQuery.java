package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.stories.responses.GetResponse;

import java.util.Arrays;
import java.util.List;

public class StoriesGetQuery extends AbstractQueryBuilder<StoriesGetQuery, GetResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   user actor with access token
     */
    public StoriesGetQuery(VkApiClient client, UserActor actor) {
        super(client, "stories.get", GetResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   group actor with access token
     */
    public StoriesGetQuery(VkApiClient client, GroupActor actor) {
        super(client, "stories.get", GetResponse.class);
        accessToken(actor.getAccessToken());
    }

    public StoriesGetQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    public StoriesGetQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    @Override
    protected StoriesGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

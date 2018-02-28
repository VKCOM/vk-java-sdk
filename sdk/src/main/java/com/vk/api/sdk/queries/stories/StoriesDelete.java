package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

public class StoriesDelete extends AbstractQueryBuilder<StoriesDelete, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   user actor with access token
     * @param ownerId owner id
     * @param storyId story id
     */
    public StoriesDelete(VkApiClient client, UserActor actor, Integer ownerId, Integer storyId) {
        super(client, "stories.delete", OkResponse.class);
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
    public StoriesDelete(VkApiClient client, GroupActor actor, Integer ownerId, Integer storyId) {
        super(client, "stories.delete", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        storyId(storyId);
    }

    protected StoriesDelete ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    protected StoriesDelete storyId(Integer value) {
        return unsafeParam("story_id", value);
    }

    @Override
    protected StoriesDelete getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token", "owner_id", "story_id");
    }
}

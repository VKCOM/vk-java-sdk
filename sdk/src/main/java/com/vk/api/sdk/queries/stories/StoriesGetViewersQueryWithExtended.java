package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.stories.responses.GetViewersExtendedResponse;

import java.util.Arrays;
import java.util.List;

public class StoriesGetViewersQueryWithExtended extends AbstractQueryBuilder<StoriesGetViewersQueryWithExtended, GetViewersExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   user actor with access token
     * @param ownerId owner id
     * @param storyId story id
     */
    public StoriesGetViewersQueryWithExtended(VkApiClient client, UserActor actor, Integer ownerId, Integer storyId) {
        super(client, "stories.getViewers", GetViewersExtendedResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        storyId(storyId);
        extended(true);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   group actor with access token
     * @param ownerId owner id
     * @param storyId story id
     */
    public StoriesGetViewersQueryWithExtended(VkApiClient client, GroupActor actor, Integer ownerId, Integer storyId) {
        super(client, "stories.getViewers", GetViewersExtendedResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        storyId(storyId);
        extended(true);
    }

    protected StoriesGetViewersQueryWithExtended ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    protected StoriesGetViewersQueryWithExtended storyId(Integer value) {
        return unsafeParam("story_id", value);
    }

    protected StoriesGetViewersQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    public StoriesGetViewersQueryWithExtended count(Integer value) {
        return unsafeParam("count", value);
    }

    public StoriesGetViewersQueryWithExtended offset(Integer value) {
        return unsafeParam("offset", value);
    }

    @Override
    protected StoriesGetViewersQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token", "owner_id", "story_id");
    }
}

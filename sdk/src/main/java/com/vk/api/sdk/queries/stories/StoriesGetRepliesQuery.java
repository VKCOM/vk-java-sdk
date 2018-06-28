package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.stories.responses.GetRepliesResponse;

import java.util.Arrays;
import java.util.List;

public class StoriesGetRepliesQuery extends AbstractQueryBuilder<StoriesGetRepliesQuery, GetRepliesResponse> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   user actor with access token
     * @param ownerId owner id
     * @param storyId story id
     */
    public StoriesGetRepliesQuery(VkApiClient client, UserActor actor, Integer ownerId, Integer storyId) {
        super(client, "stories.getReplies", GetRepliesResponse.class);
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
    public StoriesGetRepliesQuery(VkApiClient client, GroupActor actor, Integer ownerId, Integer storyId) {
        super(client, "stories.getReplies", GetRepliesResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        storyId(storyId);
    }

    protected StoriesGetRepliesQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    protected StoriesGetRepliesQuery storyId(Integer value) {
        return unsafeParam("story_id", value);
    }

    public StoriesGetRepliesQuery accessKey(String value) {
        return unsafeParam("access_key", value);
    }

    public StoriesGetRepliesQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    public StoriesGetRepliesQuery fields(List<String> value) {
        return unsafeParam("fields", value);
    }

    public StoriesGetRepliesQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    public StoriesGetRepliesQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    @Override
    protected StoriesGetRepliesQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token", "owner_id", "story_id");
    }
}

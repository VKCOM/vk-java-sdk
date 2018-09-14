package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

public class StoriesHideAllRepliesQuery extends AbstractQueryBuilder<StoriesHideAllRepliesQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   user actor with access token
     * @param ownerId owner id
     */
    public StoriesHideAllRepliesQuery(VkApiClient client, UserActor actor, Integer ownerId) {
        super(client, "stories.hideAllReplies", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   group actor with access token
     * @param ownerId owner id
     */
    public StoriesHideAllRepliesQuery(VkApiClient client, GroupActor actor, Integer ownerId) {
        super(client, "stories.hideAllReplies", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
    }

    protected StoriesHideAllRepliesQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    @Override
    protected StoriesHideAllRepliesQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token", "owner_id");
    }
}

package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

public class StoriesUnbanOwnerQuery extends AbstractQueryBuilder<StoriesUnbanOwnerQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  User actor with access token
     * @param ids    List of ids
     */
    public StoriesUnbanOwnerQuery(VkApiClient client, UserActor actor, List<Integer> ids) {
        super(client, "stories.unbanOwner", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownersIds(ids);
    }

    protected StoriesUnbanOwnerQuery ownersIds(List<Integer> value) {
        return unsafeParam("owners_ids", value);
    }

    @Override
    protected StoriesUnbanOwnerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token", "owners_ids");
    }
}

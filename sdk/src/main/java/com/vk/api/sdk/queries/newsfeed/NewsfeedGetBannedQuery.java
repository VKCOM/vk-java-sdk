package com.vk.api.sdk.queries.newsfeed;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.newsfeed.responses.GetBannedResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Newsfeed.getBanned method
 */
public class NewsfeedGetBannedQuery extends AbstractQueryBuilder<NewsfeedGetBannedQuery, GetBannedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public NewsfeedGetBannedQuery(VkApiClient client, UserActor actor) {
        super(client, "newsfeed.getBanned", GetBannedResponse.class);
        accessToken(actor.getAccessToken());
    }

    @Override
    protected NewsfeedGetBannedQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.stories.responses.GetBannedResponse;

import java.util.Arrays;
import java.util.List;

public class StoriesGetBannedQuery extends AbstractQueryBuilder<StoriesGetBannedQuery, GetBannedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  User actor with access token
     */
    public StoriesGetBannedQuery(VkApiClient client, UserActor actor) {
        super(client, "stories.getBanned", GetBannedResponse.class);
        accessToken(actor.getAccessToken());
    }

    public StoriesGetBannedQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    public StoriesGetBannedQuery fields(List<String> value) {
        return unsafeParam("fields", value);
    }

    public StoriesGetBannedQuery fields(String... value) {
        return unsafeParam("fields", Arrays.asList(value));
    }

    @Override
    protected StoriesGetBannedQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

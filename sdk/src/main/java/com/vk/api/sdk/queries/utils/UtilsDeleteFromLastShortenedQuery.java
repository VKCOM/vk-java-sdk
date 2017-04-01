package com.vk.api.sdk.queries.utils;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Utils.deleteFromLastShortened method
 */
public class UtilsDeleteFromLastShortenedQuery extends AbstractQueryBuilder<UtilsDeleteFromLastShortenedQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param key    value of "key" parameter.
     */
    public UtilsDeleteFromLastShortenedQuery(VkApiClient client, UserActor actor, String key) {
        super(client, "utils.deleteFromLastShortened", OkResponse.class);
        accessToken(actor.getAccessToken());
        key(key);
    }

    /**
     * Link key (characters after "vk.cc").
     *
     * @param value value of "key" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected UtilsDeleteFromLastShortenedQuery key(String value) {
        return unsafeParam("key", value);
    }

    @Override
    protected UtilsDeleteFromLastShortenedQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("key", "access_token");
    }
}

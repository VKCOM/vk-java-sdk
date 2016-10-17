package com.vk.api.sdk.queries.fave;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.fave.responses.GetMarketItemsResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Fave.getMarketItems method
 */
public class FaveGetMarketItemsQuery extends AbstractQueryBuilder<FaveGetMarketItemsQuery, GetMarketItemsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public FaveGetMarketItemsQuery(VkApiClient client, UserActor actor) {
        super(client, "fave.getMarketItems", GetMarketItemsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Number of items to return info
     *
     * @param value value of "count" parameter. Minimum is 0. By default 50.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetMarketItemsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * true - additional fields  "likes, can_comment, can_repost, photos" will be returned.
     * These fields are disabled by default.
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetMarketItemsQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    @Override
    protected FaveGetMarketItemsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.editOrder method
 */
public class MarketEditOrderQuery extends AbstractQueryBuilder<MarketEditOrderQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param userId value of "user id" parameter. Minimum is 0.
     * @param orderId value of "order id" parameter. Minimum is 0.
     */
    public MarketEditOrderQuery(VkApiClient client, UserActor actor, int userId, int orderId) {
        super(client, "market.editOrder", OkResponse.class);
        accessToken(actor.getAccessToken());
        userId(userId);
        orderId(orderId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param userId value of "user id" parameter. Minimum is 0.
     * @param orderId value of "order id" parameter. Minimum is 0.
     */
    public MarketEditOrderQuery(VkApiClient client, GroupActor actor, int userId, int orderId) {
        super(client, "market.editOrder", OkResponse.class);
        accessToken(actor.getAccessToken());
        userId(userId);
        orderId(orderId);
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketEditOrderQuery userId(int value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Set order id
     *
     * @param value value of "order id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketEditOrderQuery orderId(int value) {
        return unsafeParam("order_id", value);
    }

    /**
     * Set merchant comment
     *
     * @param value value of "merchant comment" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketEditOrderQuery merchantComment(String value) {
        return unsafeParam("merchant_comment", value);
    }

    /**
     * Set status
     *
     * @param value value of "status" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketEditOrderQuery status(Integer value) {
        return unsafeParam("status", value);
    }

    @Override
    protected MarketEditOrderQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("order_id", "user_id", "access_token");
    }
}

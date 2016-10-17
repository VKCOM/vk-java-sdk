package com.vk.api.sdk.queries.orders;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.orders.Order;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Orders.get method
 */
public class OrdersGetQuery extends AbstractQueryBuilder<OrdersGetQuery, List<Order>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public OrdersGetQuery(VkApiClient client, UserActor actor) {
        super(client, "orders.get", Utils.buildParametrizedType(List.class, Order.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Number of returned orders.
     *
     * @param value value of "count" parameter. Maximum is 1000. Minimum is 0. By default 100.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public OrdersGetQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * If this parameter is set to '1', this method returns a list of test mode orders. By default - '0'.
     *
     * @param value value of "test mode" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public OrdersGetQuery testMode(Boolean value) {
        return unsafeParam("test_mode", value);
    }

    @Override
    protected OrdersGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

package com.vk.api.sdk.queries.orders;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.orders.responses.GetByIdResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Orders.getById method
 */
public class OrdersGetByIdQuery extends AbstractQueryBuilder<OrdersGetByIdQuery, List<GetByIdResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public OrdersGetByIdQuery(VkApiClient client, ServiceActor actor) {
        super(client, "orders.getById", Utils.buildParametrizedType(List.class, GetByIdResponse.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Order ID.
     *
     * @param value value of "order id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public OrdersGetByIdQuery orderId(Integer value) {
        return unsafeParam("order_id", value);
    }

    /**
     * If this parameter is set to 1, this method returns a list of test mode orders. By default — 0.
     *
     * @param value value of "test mode" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public OrdersGetByIdQuery testMode(Boolean value) {
        return unsafeParam("test_mode", value);
    }

    /**
     * order_ids
     * Order IDs (when information about several orders is requested).
     *
     * @param value value of "order ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public OrdersGetByIdQuery orderIds(Integer... value) {
        return unsafeParam("order_ids", value);
    }

    /**
     * Order IDs (when information about several orders is requested).
     *
     * @param value value of "order ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public OrdersGetByIdQuery orderIds(List<Integer> value) {
        return unsafeParam("order_ids", value);
    }

    @Override
    protected OrdersGetByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

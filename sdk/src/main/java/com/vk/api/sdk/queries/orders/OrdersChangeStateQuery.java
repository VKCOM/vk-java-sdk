package com.vk.api.sdk.queries.orders;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.enums.OrdersAction;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Orders.changeState method
 */
public class OrdersChangeStateQuery extends AbstractQueryBuilder<OrdersChangeStateQuery, String> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param orderId value of "order id" parameter. Minimum is 0.
     * @param action value of "action" parameter.
     */
    public OrdersChangeStateQuery(VkApiClient client, ServiceActor actor, int orderId,
            OrdersAction action) {
        super(client, "orders.changeState", String.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        orderId(orderId);
        action(action);
    }

    /**
     * Order ID.
     *
     * @param value value of "order id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected OrdersChangeStateQuery orderId(int value) {
        return unsafeParam("order_id", value);
    }

    /**
     * Action to be done with the order. Available actions: *cancel — to cancel unconfirmed order. *charge — to confirm unconfirmed order. Applies only if processing of [vk.com/dev/payments_status|order_change_state] notification failed. *refund — to cancel confirmed order.
     *
     * @param value value of "action" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected OrdersChangeStateQuery action(OrdersAction value) {
        return unsafeParam("action", value);
    }

    /**
     * Internal ID of the order in the application.
     *
     * @param value value of "app order id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public OrdersChangeStateQuery appOrderId(Integer value) {
        return unsafeParam("app_order_id", value);
    }

    /**
     * If this parameter is set to 1, this method returns a list of test mode orders. By default — 0.
     *
     * @param value value of "test mode" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public OrdersChangeStateQuery testMode(Boolean value) {
        return unsafeParam("test_mode", value);
    }

    @Override
    protected OrdersChangeStateQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("action", "order_id", "access_token");
    }
}

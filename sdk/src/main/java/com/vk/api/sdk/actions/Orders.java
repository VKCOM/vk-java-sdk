package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.queries.orders.OrdersChangeStateAction;
import com.vk.api.sdk.queries.orders.OrdersChangeStateQuery;
import com.vk.api.sdk.queries.orders.OrdersGetAmountQuery;
import com.vk.api.sdk.queries.orders.OrdersGetByIdQuery;
import com.vk.api.sdk.queries.orders.OrdersGetQuery;

import java.util.List;

/**
 * List of Orders methods
 */
public class Orders extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Orders(VkApiClient client) {
        super(client);
    }

    /**
     * Returns a list of orders.
     */
    public OrdersGetQuery get(Actor actor) {
        return new OrdersGetQuery(getClient(), actor);
    }

    /**
     * Returns information about orders by their IDs.
     */
    public OrdersGetByIdQuery getById(Actor actor) {
        return new OrdersGetByIdQuery(getClient(), actor);
    }

    /**
     * Changes order status.
     */
    public OrdersChangeStateQuery changeState(Actor actor, int orderId, OrdersChangeStateAction action) {
        return new OrdersChangeStateQuery(getClient(), actor, orderId, action);
    }

    public OrdersGetAmountQuery getAmount(Actor actor, int userId, String... votes) {
        return new OrdersGetAmountQuery(getClient(), actor, userId, votes);
    }

    public OrdersGetAmountQuery getAmount(Actor actor, int userId, List<String> votes) {
        return new OrdersGetAmountQuery(getClient(), actor, userId, votes);
    }
}

package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.enums.OrdersAction;
import com.vk.api.sdk.queries.orders.OrdersCancelSubscriptionQuery;
import com.vk.api.sdk.queries.orders.OrdersChangeStateQuery;
import com.vk.api.sdk.queries.orders.OrdersGetAmountQuery;
import com.vk.api.sdk.queries.orders.OrdersGetByIdQuery;
import com.vk.api.sdk.queries.orders.OrdersGetQuery;
import com.vk.api.sdk.queries.orders.OrdersGetUserSubscriptionByIdQuery;
import com.vk.api.sdk.queries.orders.OrdersGetUserSubscriptionsQuery;
import com.vk.api.sdk.queries.orders.OrdersUpdateSubscriptionQuery;
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
     * @param actor vk actor
     * @param userId
     * @param subscriptionId
     * @return query
     */
    public OrdersCancelSubscriptionQuery cancelSubscription(ServiceActor actor, int userId,
            int subscriptionId) {
        return new OrdersCancelSubscriptionQuery(getClient(), actor, userId, subscriptionId);
    }

    /**
     * Changes order status.
     *
     * @param actor vk actor
     * @param orderId order ID.
     * @param action action to be done with the order. Available actions: *cancel — to cancel unconfirmed order. *charge — to confirm unconfirmed order. Applies only if processing of [vk.com/dev/payments_status|order_change_state] notification failed. *refund — to cancel confirmed order.
     * @return query
     */
    public OrdersChangeStateQuery changeState(ServiceActor actor, int orderId,
            OrdersAction action) {
        return new OrdersChangeStateQuery(getClient(), actor, orderId, action);
    }

    /**
     * Returns a list of orders.
     *
     * @param actor vk actor
     * @return query
     */
    public OrdersGetQuery get(ServiceActor actor) {
        return new OrdersGetQuery(getClient(), actor);
    }

    /**
     * @param actor vk actor
     * @param userId
     * @param votes
     * @return query
     */
    public OrdersGetAmountQuery getAmount(UserActor actor, int userId, String... votes) {
        return new OrdersGetAmountQuery(getClient(), actor, userId, votes);
    }

    /**
     * @param actor vk actor
     * @param userId
     * @param votes
     * @return query
     */
    public OrdersGetAmountQuery getAmount(UserActor actor, int userId, List<String> votes) {
        return new OrdersGetAmountQuery(getClient(), actor, userId, votes);
    }

    /**
     * Returns information about orders by their IDs.
     *
     * @param actor vk actor
     * @return query
     */
    public OrdersGetByIdQuery getById(ServiceActor actor) {
        return new OrdersGetByIdQuery(getClient(), actor);
    }

    /**
     * @param actor vk actor
     * @param userId
     * @param subscriptionId
     * @return query
     */
    public OrdersGetUserSubscriptionByIdQuery getUserSubscriptionById(ServiceActor actor,
            int userId, int subscriptionId) {
        return new OrdersGetUserSubscriptionByIdQuery(getClient(), actor, userId, subscriptionId);
    }

    /**
     * @param actor vk actor
     * @param userId
     * @return query
     */
    public OrdersGetUserSubscriptionsQuery getUserSubscriptions(ServiceActor actor, int userId) {
        return new OrdersGetUserSubscriptionsQuery(getClient(), actor, userId);
    }

    /**
     * @param actor vk actor
     * @param userId
     * @param subscriptionId
     * @param price
     * @return query
     */
    public OrdersUpdateSubscriptionQuery updateSubscription(ServiceActor actor, int userId,
            int subscriptionId, int price) {
        return new OrdersUpdateSubscriptionQuery(getClient(), actor, userId, subscriptionId, price);
    }
}

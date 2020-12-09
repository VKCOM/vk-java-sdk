package com.vk.api.sdk.queries.donut;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.donut.responses.GetSubscriptionResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Donut.getSubscription method
 */
public class DonutGetSubscriptionQuery extends AbstractQueryBuilder<DonutGetSubscriptionQuery, GetSubscriptionResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter.
     */
    public DonutGetSubscriptionQuery(VkApiClient client, UserActor actor, int ownerId) {
        super(client, "donut.getSubscription", GetSubscriptionResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
    }

    /**
     * Set owner id
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected DonutGetSubscriptionQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    @Override
    protected DonutGetSubscriptionQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("owner_id", "access_token");
    }
}

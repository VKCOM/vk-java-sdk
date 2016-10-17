package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import com.vk.api.sdk.queries.ReportReason;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.report method
 */
public class MarketReportQuery extends AbstractQueryBuilder<MarketReportQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param itemId  value of "item id" parameter. Minimum is 0.
     * @param reason  value of "reason" parameter. Minimum is 0.
     */
    public MarketReportQuery(VkApiClient client, UserActor actor, int ownerId, int itemId, ReportReason reason) {
        super(client, "market.report", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        itemId(itemId);
        reason(reason);
    }

    /**
     * Identifier of an item owner community
     * Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketReportQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Item id
     *
     * @param value value of "item id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketReportQuery itemId(int value) {
        return unsafeParam("item_id", value);
    }

    /**
     * Complaint reason
     *
     * @param value value of "reason" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketReportQuery reason(ReportReason value) {
        return unsafeParam("reason", value);
    }

    @Override
    protected MarketReportQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("item_id", "reason", "owner_id", "access_token");
    }
}

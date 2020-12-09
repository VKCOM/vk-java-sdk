package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.responses.GetFloodStatsResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.getFloodStats method
 */
public class AdsGetFloodStatsQuery extends AbstractQueryBuilder<AdsGetFloodStatsQuery, GetFloodStatsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param accountId value of "account id" parameter.
     */
    public AdsGetFloodStatsQuery(VkApiClient client, UserActor actor, int accountId) {
        super(client, "ads.getFloodStats", GetFloodStatsResponse.class);
        accessToken(actor.getAccessToken());
        accountId(accountId);
    }

    /**
     * Advertising account ID.
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetFloodStatsQuery accountId(int value) {
        return unsafeParam("account_id", value);
    }

    @Override
    protected AdsGetFloodStatsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("account_id", "access_token");
    }
}

package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.RejectReason;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.getRejectionReason method
 */
public class AdsGetRejectionReasonQuery extends AbstractQueryBuilder<AdsGetRejectionReasonQuery, RejectReason> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param accountId value of "account id" parameter.
     * @param adId      value of "ad id" parameter.
     */
    public AdsGetRejectionReasonQuery(VkApiClient client, UserActor actor, int accountId, int adId) {
        super(client, "ads.getRejectionReason", RejectReason.class);
        accessToken(actor.getAccessToken());
        accountId(accountId);
        adId(adId);
    }

    /**
     * Advertising account ID.
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetRejectionReasonQuery accountId(int value) {
        return unsafeParam("account_id", value);
    }

    /**
     * Ad ID.
     *
     * @param value value of "ad id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetRejectionReasonQuery adId(int value) {
        return unsafeParam("ad_id", value);
    }

    @Override
    protected AdsGetRejectionReasonQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("ad_id", "account_id", "access_token");
    }
}

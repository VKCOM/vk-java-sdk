package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.responses.CheckLinkResponse;
import com.vk.api.sdk.objects.enums.AdsLinkType;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.checkLink method
 */
public class AdsCheckLinkQuery extends AbstractQueryBuilder<AdsCheckLinkQuery, CheckLinkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param accountId value of "account id" parameter.
     * @param linkType value of "link type" parameter.
     * @param linkUrl value of "link url" parameter.
     */
    public AdsCheckLinkQuery(VkApiClient client, UserActor actor, int accountId,
            AdsLinkType linkType, String linkUrl) {
        super(client, "ads.checkLink", CheckLinkResponse.class);
        accessToken(actor.getAccessToken());
        accountId(accountId);
        linkType(linkType);
        linkUrl(linkUrl);
    }

    /**
     * Advertising account ID.
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsCheckLinkQuery accountId(int value) {
        return unsafeParam("account_id", value);
    }

    /**
     * Object type: *'community' — community,, *'post' — community post,, *'application' — VK application,, *'video' — video,, *'site' — external site.
     *
     * @param value value of "link type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsCheckLinkQuery linkType(AdsLinkType value) {
        return unsafeParam("link_type", value);
    }

    /**
     * Object URL.
     *
     * @param value value of "link url" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsCheckLinkQuery linkUrl(String value) {
        return unsafeParam("link_url", value);
    }

    /**
     * Campaign ID
     *
     * @param value value of "campaign id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsCheckLinkQuery campaignId(Integer value) {
        return unsafeParam("campaign_id", value);
    }

    @Override
    protected AdsCheckLinkQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("link_type", "link_url", "account_id", "access_token");
    }
}

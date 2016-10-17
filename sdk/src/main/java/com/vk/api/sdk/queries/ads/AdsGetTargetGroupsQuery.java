package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.TargetGroup;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.getTargetGroups method
 */
public class AdsGetTargetGroupsQuery extends AbstractQueryBuilder<AdsGetTargetGroupsQuery, List<TargetGroup>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param accountId value of "account id" parameter.
     */
    public AdsGetTargetGroupsQuery(VkApiClient client, UserActor actor, int accountId) {
        super(client, "ads.getTargetGroups", Utils.buildParametrizedType(List.class, TargetGroup.class));
        accessToken(actor.getAccessToken());
        accountId(accountId);
    }

    /**
     * Advertising account ID.
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetTargetGroupsQuery accountId(int value) {
        return unsafeParam("account_id", value);
    }

    /**
     * "Only for advertising agencies."
     * ID of the client with the advertising account where the group will be created.
     *
     * @param value value of "client id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetTargetGroupsQuery clientId(Integer value) {
        return unsafeParam("client_id", value);
    }

    /**
     * Set extended
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetTargetGroupsQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    @Override
    protected AdsGetTargetGroupsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("account_id", "access_token");
    }
}

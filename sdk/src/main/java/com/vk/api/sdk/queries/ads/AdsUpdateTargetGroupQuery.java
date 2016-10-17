package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.updateTargetGroup method
 */
public class AdsUpdateTargetGroupQuery extends AbstractQueryBuilder<AdsUpdateTargetGroupQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client        VK API client
     * @param actor         actor with access token
     * @param accountId     value of "account id" parameter.
     * @param targetGroupId value of "target group id" parameter.
     * @param name          value of "name" parameter.
     */
    public AdsUpdateTargetGroupQuery(VkApiClient client, UserActor actor, int accountId, int targetGroupId, String name) {
        super(client, "ads.updateTargetGroup", OkResponse.class);
        accessToken(actor.getAccessToken());
        accountId(accountId);
        targetGroupId(targetGroupId);
        name(name);
    }

    /**
     * Advertising account ID.
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsUpdateTargetGroupQuery accountId(int value) {
        return unsafeParam("account_id", value);
    }

    /**
     * "Only for advertising agencies."
     * ID of the client with the advertising account where the group will be created.
     *
     * @param value value of "client id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsUpdateTargetGroupQuery clientId(Integer value) {
        return unsafeParam("client_id", value);
    }

    /**
     * Group ID.
     *
     * @param value value of "target group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsUpdateTargetGroupQuery targetGroupId(int value) {
        return unsafeParam("target_group_id", value);
    }

    /**
     * New name of the target group - a string up to 64 characters long.
     *
     * @param value value of "name" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsUpdateTargetGroupQuery name(String value) {
        return unsafeParam("name", value);
    }

    /**
     * Domain of the site where user accounting code will be placed.
     *
     * @param value value of "domain" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsUpdateTargetGroupQuery domain(String value) {
        return unsafeParam("domain", value);
    }

    /**
     * Only for the groups that get audience from sites with user accounting code.
     * Time in days when users added to a retarget group will be automatically excluded from it.
     * "0" - automatic exclusion is off.
     *
     * @param value value of "lifetime" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsUpdateTargetGroupQuery lifetime(Integer value) {
        return unsafeParam("lifetime", value);
    }

    @Override
    protected AdsUpdateTargetGroupQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("target_group_id", "name", "account_id", "access_token");
    }
}

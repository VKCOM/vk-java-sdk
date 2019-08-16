package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.responses.CreateTargetGroupResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.createTargetGroup method
 */
public class AdsCreateTargetGroupQuery extends AbstractQueryBuilder<AdsCreateTargetGroupQuery, CreateTargetGroupResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param accountId value of "account id" parameter.
     * @param name value of "name" parameter.
     */
    public AdsCreateTargetGroupQuery(VkApiClient client, UserActor actor, int accountId,
            String name) {
        super(client, "ads.createTargetGroup", CreateTargetGroupResponse.class);
        accessToken(actor.getAccessToken());
        accountId(accountId);
        name(name);
    }

    /**
     * Advertising account ID.
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsCreateTargetGroupQuery accountId(int value) {
        return unsafeParam("account_id", value);
    }

    /**
     * 'Only for advertising agencies.', ID of the client with the advertising account where the group will be created.
     *
     * @param value value of "client id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsCreateTargetGroupQuery clientId(Integer value) {
        return unsafeParam("client_id", value);
    }

    /**
     * Name of the target group — a string up to 64 characters long.
     *
     * @param value value of "name" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsCreateTargetGroupQuery name(String value) {
        return unsafeParam("name", value);
    }

    /**
     * 'For groups with auditory created with pixel code only.', , Number of days after that users will be automatically removed from the group.
     *
     * @param value value of "lifetime" parameter. Maximum is 720. Minimum is 0. By default 720.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsCreateTargetGroupQuery lifetime(Integer value) {
        return unsafeParam("lifetime", value);
    }

    /**
     * Set target pixel id
     *
     * @param value value of "target pixel id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsCreateTargetGroupQuery targetPixelId(Integer value) {
        return unsafeParam("target_pixel_id", value);
    }

    /**
     * Set target pixel rules
     *
     * @param value value of "target pixel rules" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsCreateTargetGroupQuery targetPixelRules(String value) {
        return unsafeParam("target_pixel_rules", value);
    }

    @Override
    protected AdsCreateTargetGroupQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("name", "account_id", "access_token");
    }
}

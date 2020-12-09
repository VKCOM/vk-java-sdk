package com.vk.api.sdk.queries.ads;

import com.google.gson.Gson;
import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.UserSpecificationCutted;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.addOfficeUsers method
 */
public class AdsAddOfficeUsersQuery extends AbstractQueryBuilder<AdsAddOfficeUsersQuery, Boolean> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param accountId value of "account id" parameter.
     * @param data value of "data" parameter.
     */
    public AdsAddOfficeUsersQuery(VkApiClient client, UserActor actor, int accountId,
            UserSpecificationCutted... data) {
        super(client, "ads.addOfficeUsers", Boolean.class);
        accessToken(actor.getAccessToken());
        accountId(accountId);
        data(data);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param accountId value of "account id" parameter.
     * @param data value of "data" parameter.
     */
    public AdsAddOfficeUsersQuery(VkApiClient client, UserActor actor, int accountId,
            List<UserSpecificationCutted> data) {
        super(client, "ads.addOfficeUsers", Boolean.class);
        accessToken(actor.getAccessToken());
        accountId(accountId);
        data(data);
    }

    /**
     * Advertising account ID.
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsAddOfficeUsersQuery accountId(int value) {
        return unsafeParam("account_id", value);
    }

    /**
     * data
     * Serialized JSON array of objects that describe added managers. Description of 'user_specification' objects see below.
     *
     * @param value value of "data" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsAddOfficeUsersQuery data(UserSpecificationCutted... value) {
        return unsafeParam("data", new Gson().toJson(value));
    }

    /**
     * Serialized JSON array of objects that describe added managers. Description of 'user_specification' objects see below.
     *
     * @param value value of "data" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsAddOfficeUsersQuery data(List<UserSpecificationCutted> value) {
        return unsafeParam("data", new Gson().toJson(value));
    }

    @Override
    protected AdsAddOfficeUsersQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("data", "account_id", "access_token");
    }
}

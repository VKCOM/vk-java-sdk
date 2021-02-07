package com.vk.api.sdk.queries.ads;

import com.google.gson.Gson;
import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.UserSpecification;
import com.vk.api.sdk.objects.ads.responses.UpdateOfficeUsersResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.updateOfficeUsers method
 */
public class AdsUpdateOfficeUsersQuery extends AbstractQueryBuilder<AdsUpdateOfficeUsersQuery, List<UpdateOfficeUsersResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param accountId value of "account id" parameter. Minimum is 0.
     * @param data value of "data" parameter.
     */
    public AdsUpdateOfficeUsersQuery(VkApiClient client, UserActor actor, int accountId,
            UserSpecification... data) {
        super(client, "ads.updateOfficeUsers", Utils.buildParametrizedType(List.class, UpdateOfficeUsersResponse.class));
        accessToken(actor.getAccessToken());
        accountId(accountId);
        data(data);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param accountId value of "account id" parameter. Minimum is 0.
     * @param data value of "data" parameter.
     */
    public AdsUpdateOfficeUsersQuery(VkApiClient client, UserActor actor, int accountId,
            List<UserSpecification> data) {
        super(client, "ads.updateOfficeUsers", Utils.buildParametrizedType(List.class, UpdateOfficeUsersResponse.class));
        accessToken(actor.getAccessToken());
        accountId(accountId);
        data(data);
    }

    /**
     * Advertising account ID.
     *
     * @param value value of "account id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsUpdateOfficeUsersQuery accountId(int value) {
        return unsafeParam("account_id", value);
    }

    /**
     * data
     * Serialized JSON array of objects that describe added managers. Description of 'user_specification' objects see below.
     *
     * @param value value of "data" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsUpdateOfficeUsersQuery data(UserSpecification... value) {
        return unsafeParam("data", new Gson().toJson(value));
    }

    /**
     * Serialized JSON array of objects that describe added managers. Description of 'user_specification' objects see below.
     *
     * @param value value of "data" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsUpdateOfficeUsersQuery data(List<UserSpecification> value) {
        return unsafeParam("data", new Gson().toJson(value));
    }

    @Override
    protected AdsUpdateOfficeUsersQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("data", "account_id", "access_token");
    }
}

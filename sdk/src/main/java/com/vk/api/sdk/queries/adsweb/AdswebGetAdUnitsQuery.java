package com.vk.api.sdk.queries.adsweb;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.adsweb.responses.GetAdUnitsResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Adsweb.getAdUnits method
 */
public class AdswebGetAdUnitsQuery extends AbstractQueryBuilder<AdswebGetAdUnitsQuery, GetAdUnitsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param officeId value of "office id" parameter.
     */
    public AdswebGetAdUnitsQuery(VkApiClient client, UserActor actor, int officeId) {
        super(client, "adsweb.getAdUnits", GetAdUnitsResponse.class);
        accessToken(actor.getAccessToken());
        officeId(officeId);
    }

    /**
     * Set office id
     *
     * @param value value of "office id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdswebGetAdUnitsQuery officeId(int value) {
        return unsafeParam("office_id", value);
    }

    /**
     * Set sites ids
     *
     * @param value value of "sites ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdswebGetAdUnitsQuery sitesIds(String value) {
        return unsafeParam("sites_ids", value);
    }

    /**
     * Set ad units ids
     *
     * @param value value of "ad units ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdswebGetAdUnitsQuery adUnitsIds(String value) {
        return unsafeParam("ad_units_ids", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdswebGetAdUnitsQuery fields(String value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set limit
     *
     * @param value value of "limit" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdswebGetAdUnitsQuery limit(Integer value) {
        return unsafeParam("limit", value);
    }

    /**
     * Set offset
     *
     * @param value value of "offset" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdswebGetAdUnitsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    @Override
    protected AdswebGetAdUnitsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("office_id", "access_token");
    }
}

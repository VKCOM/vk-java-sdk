package com.vk.api.sdk.queries.database;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.database.responses.GetCitiesResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Database.getCities method
 */
public class DatabaseGetCitiesQuery extends AbstractQueryBuilder<DatabaseGetCitiesQuery, GetCitiesResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param countryId value of "country id" parameter. Minimum is 0.
     */
    public DatabaseGetCitiesQuery(VkApiClient client, UserActor actor, int countryId) {
        super(client, "database.getCities", GetCitiesResponse.class);
        accessToken(actor.getAccessToken());
        countryId(countryId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param countryId value of "country id" parameter. Minimum is 0.
     */
    public DatabaseGetCitiesQuery(VkApiClient client, ServiceActor actor, int countryId) {
        super(client, "database.getCities", GetCitiesResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        countryId(countryId);
    }

    /**
     * Country ID.
     *
     * @param value value of "country id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected DatabaseGetCitiesQuery countryId(int value) {
        return unsafeParam("country_id", value);
    }

    /**
     * Region ID.
     *
     * @param value value of "region id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetCitiesQuery regionId(Integer value) {
        return unsafeParam("region_id", value);
    }

    /**
     * Search query.
     *
     * @param value value of "q" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetCitiesQuery q(String value) {
        return unsafeParam("q", value);
    }

    /**
     * Return all cities in the country
     *
     * @param value value of "need all" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetCitiesQuery needAll(Boolean value) {
        return unsafeParam("need_all", value);
    }

    /**
     * Offset needed to return a specific subset of cities.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetCitiesQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of cities to return.
     *
     * @param value value of "count" parameter. Maximum is 1000. Minimum is 0. By default 100.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetCitiesQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected DatabaseGetCitiesQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("country_id");
    }
}

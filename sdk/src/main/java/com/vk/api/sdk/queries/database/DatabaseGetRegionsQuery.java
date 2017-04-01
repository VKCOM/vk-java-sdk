package com.vk.api.sdk.queries.database;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.database.responses.GetRegionsResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Database.getRegions method
 */
public class DatabaseGetRegionsQuery extends AbstractQueryBuilder<DatabaseGetRegionsQuery, GetRegionsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param countryId value of "country id" parameter. Minimum is 0.
     */
    public DatabaseGetRegionsQuery(VkApiClient client, UserActor actor, int countryId) {
        super(client, "database.getRegions", GetRegionsResponse.class);
        accessToken(actor.getAccessToken());
        countryId(countryId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param countryId value of "country id" parameter. Minimum is 0.
     */
    public DatabaseGetRegionsQuery(VkApiClient client, ServiceActor actor, int countryId) {
        super(client, "database.getRegions", GetRegionsResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        countryId(countryId);
    }

    /**
     * Country ID, received in database.getCountries method.
     *
     * @param value value of "country id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected DatabaseGetRegionsQuery countryId(int value) {
        return unsafeParam("country_id", value);
    }

    /**
     * Search query.
     *
     * @param value value of "q" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetRegionsQuery q(String value) {
        return unsafeParam("q", value);
    }

    /**
     * Offset needed to return specific subset of regions.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetRegionsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of regions to return.
     *
     * @param value value of "count" parameter. Maximum is 1000. Minimum is 0. By default 100.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetRegionsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected DatabaseGetRegionsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("country_id");
    }
}

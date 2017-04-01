package com.vk.api.sdk.queries.database;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.database.responses.GetUniversitiesResponse;

import java.util.Collections;
import java.util.List;

/**
 * Query for Database.getUniversities method
 */
public class DatabaseGetUniversitiesQuery extends AbstractQueryBuilder<DatabaseGetUniversitiesQuery, GetUniversitiesResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public DatabaseGetUniversitiesQuery(VkApiClient client, UserActor actor) {
        super(client, "database.getUniversities", GetUniversitiesResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public DatabaseGetUniversitiesQuery(VkApiClient client, ServiceActor actor) {
        super(client, "database.getUniversities", GetUniversitiesResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Search query.
     *
     * @param value value of "q" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetUniversitiesQuery q(String value) {
        return unsafeParam("q", value);
    }

    /**
     * Country ID.
     *
     * @param value value of "country id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetUniversitiesQuery countryId(Integer value) {
        return unsafeParam("country_id", value);
    }

    /**
     * City ID.
     *
     * @param value value of "city id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetUniversitiesQuery cityId(Integer value) {
        return unsafeParam("city_id", value);
    }

    /**
     * Offset needed to return a specific subset of universities.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetUniversitiesQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of universities to return.
     *
     * @param value value of "count" parameter. Maximum is 10000. Minimum is 0. By default 100.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetUniversitiesQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected DatabaseGetUniversitiesQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}

package com.vk.api.sdk.queries.database;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.database.responses.GetSchoolsResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Database.getSchools method
 */
public class DatabaseGetSchoolsQuery extends AbstractQueryBuilder<DatabaseGetSchoolsQuery, GetSchoolsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param cityId value of "city id" parameter. Minimum is 0.
     */
    public DatabaseGetSchoolsQuery(VkApiClient client, UserActor actor, int cityId) {
        super(client, "database.getSchools", GetSchoolsResponse.class);
        accessToken(actor.getAccessToken());
        cityId(cityId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param cityId value of "city id" parameter. Minimum is 0.
     */
    public DatabaseGetSchoolsQuery(VkApiClient client, ServiceActor actor, int cityId) {
        super(client, "database.getSchools", GetSchoolsResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        cityId(cityId);
    }

    /**
     * Search query.
     *
     * @param value value of "q" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetSchoolsQuery q(String value) {
        return unsafeParam("q", value);
    }

    /**
     * City ID.
     *
     * @param value value of "city id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected DatabaseGetSchoolsQuery cityId(int value) {
        return unsafeParam("city_id", value);
    }

    /**
     * Offset needed to return a specific subset of schools.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetSchoolsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of schools to return.
     *
     * @param value value of "count" parameter. Maximum is 10000. Minimum is 0. By default 100.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetSchoolsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected DatabaseGetSchoolsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("city_id");
    }
}

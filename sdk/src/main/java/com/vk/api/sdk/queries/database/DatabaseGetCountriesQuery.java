package com.vk.api.sdk.queries.database;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.database.responses.GetCountriesResponse;

import java.util.Collections;
import java.util.List;

/**
 * Query for Database.getCountries method
 */
public class DatabaseGetCountriesQuery extends AbstractQueryBuilder<DatabaseGetCountriesQuery, GetCountriesResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public DatabaseGetCountriesQuery(VkApiClient client, UserActor actor) {
        super(client, "database.getCountries", GetCountriesResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public DatabaseGetCountriesQuery(VkApiClient client, ServiceActor actor) {
        super(client, "database.getCountries", GetCountriesResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Return a full list of all countries
     *
     * @param value value of "need all" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetCountriesQuery needAll(Boolean value) {
        return unsafeParam("need_all", value);
    }

    /**
     * Country codes in ISO 3166-1 alpha-2 standard.
     *
     * @param value value of "code" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetCountriesQuery code(String value) {
        return unsafeParam("code", value);
    }

    /**
     * Offset needed to return a specific subset of countries.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetCountriesQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of countries to return.
     *
     * @param value value of "count" parameter. Maximum is 1000. Minimum is 0. By default 100.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetCountriesQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected DatabaseGetCountriesQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}

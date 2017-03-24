package com.vk.api.sdk.queries.database;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.Country;

import java.util.Collections;
import java.util.List;

/**
 * Query for Database.getCountriesById method
 */
public class DatabaseGetCountriesByIdQuery extends AbstractQueryBuilder<DatabaseGetCountriesByIdQuery, List<Country>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public DatabaseGetCountriesByIdQuery(VkApiClient client, UserActor actor) {
        super(client, "database.getCountriesById", Utils.buildParametrizedType(List.class, Country.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public DatabaseGetCountriesByIdQuery(VkApiClient client, ServiceActor actor) {
        super(client, "database.getCountriesById", Utils.buildParametrizedType(List.class, Country.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Country IDs.
     *
     * @param value value of "country ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetCountriesByIdQuery countryIds(Integer... value) {
        return unsafeParam("country_ids", value);
    }

    /**
     * Country IDs.
     *
     * @param value value of "country ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetCountriesByIdQuery countryIds(List<Integer> value) {
        return unsafeParam("country_ids", value);
    }

    @Override
    protected DatabaseGetCountriesByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}

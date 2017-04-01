package com.vk.api.sdk.queries.database;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.BaseObject;

import java.util.Collections;
import java.util.List;

/**
 * Query for Database.getCitiesById method
 */
public class DatabaseGetCitiesByIdQuery extends AbstractQueryBuilder<DatabaseGetCitiesByIdQuery, List<BaseObject>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public DatabaseGetCitiesByIdQuery(VkApiClient client, UserActor actor) {
        super(client, "database.getCitiesById", Utils.buildParametrizedType(List.class, BaseObject.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public DatabaseGetCitiesByIdQuery(VkApiClient client, ServiceActor actor) {
        super(client, "database.getCitiesById", Utils.buildParametrizedType(List.class, BaseObject.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * City IDs.
     *
     * @param value value of "city ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetCitiesByIdQuery cityIds(Integer... value) {
        return unsafeParam("city_ids", value);
    }

    /**
     * City IDs.
     *
     * @param value value of "city ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetCitiesByIdQuery cityIds(List<Integer> value) {
        return unsafeParam("city_ids", value);
    }


    @Override
    protected DatabaseGetCitiesByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}

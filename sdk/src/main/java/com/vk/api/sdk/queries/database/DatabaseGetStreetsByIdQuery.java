package com.vk.api.sdk.queries.database;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.database.Street;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Database.getStreetsById method
 */
public class DatabaseGetStreetsByIdQuery extends AbstractQueryBuilder<DatabaseGetStreetsByIdQuery, List<Street>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param streetIds value of "street ids" parameter.
     */
    public DatabaseGetStreetsByIdQuery(VkApiClient client, UserActor actor, int... streetIds) {
        super(client, "database.getStreetsById", Utils.buildParametrizedType(List.class, Street.class));
        accessToken(actor.getAccessToken());
        streetIds(streetIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param streetIds value of "street ids" parameter.
     */
    public DatabaseGetStreetsByIdQuery(VkApiClient client, UserActor actor, List<Integer> streetIds) {
        super(client, "database.getStreetsById", Utils.buildParametrizedType(List.class, Street.class));
        accessToken(actor.getAccessToken());
        streetIds(streetIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param streetIds value of "street ids" parameter.
     */
    public DatabaseGetStreetsByIdQuery(VkApiClient client, ServiceActor actor, int... streetIds) {
        super(client, "database.getStreetsById", Utils.buildParametrizedType(List.class, Street.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        streetIds(streetIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param streetIds value of "street ids" parameter.
     */
    public DatabaseGetStreetsByIdQuery(VkApiClient client, ServiceActor actor, List<Integer> streetIds) {
        super(client, "database.getStreetsById", Utils.buildParametrizedType(List.class, Street.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        streetIds(streetIds);
    }

    /**
     * Street IDs.
     *
     * @param value value of "street ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected DatabaseGetStreetsByIdQuery streetIds(int... value) {
        return unsafeParam("street_ids", value);
    }

    /**
     * Street IDs.
     *
     * @param value value of "street ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected DatabaseGetStreetsByIdQuery streetIds(List<Integer> value) {
        return unsafeParam("street_ids", value);
    }

    @Override
    protected DatabaseGetStreetsByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("street_ids");
    }
}

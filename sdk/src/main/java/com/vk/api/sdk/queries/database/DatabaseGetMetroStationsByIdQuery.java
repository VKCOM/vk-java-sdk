package com.vk.api.sdk.queries.database;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.database.responses.GetMetroStationsByIdResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Database.getMetroStationsById method
 */
public class DatabaseGetMetroStationsByIdQuery extends AbstractQueryBuilder<DatabaseGetMetroStationsByIdQuery, List<GetMetroStationsByIdResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public DatabaseGetMetroStationsByIdQuery(VkApiClient client, UserActor actor) {
        super(client, "database.getMetroStationsById", Utils.buildParametrizedType(List.class, GetMetroStationsByIdResponse.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public DatabaseGetMetroStationsByIdQuery(VkApiClient client, ServiceActor actor) {
        super(client, "database.getMetroStationsById", Utils.buildParametrizedType(List.class, GetMetroStationsByIdResponse.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * station_ids
     * Set station ids
     *
     * @param value value of "station ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetMetroStationsByIdQuery stationIds(Integer... value) {
        return unsafeParam("station_ids", value);
    }

    /**
     * Set station ids
     *
     * @param value value of "station ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetMetroStationsByIdQuery stationIds(List<Integer> value) {
        return unsafeParam("station_ids", value);
    }

    @Override
    protected DatabaseGetMetroStationsByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

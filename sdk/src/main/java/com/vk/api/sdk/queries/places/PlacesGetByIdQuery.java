package com.vk.api.sdk.queries.places;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.places.PlaceMin;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Places.getById method
 */
public class PlacesGetByIdQuery extends AbstractQueryBuilder<PlacesGetByIdQuery, List<PlaceMin>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param places value of "places" parameter.
     */
    public PlacesGetByIdQuery(VkApiClient client, UserActor actor, int... places) {
        super(client, "places.getById", Utils.buildParametrizedType(List.class, PlaceMin.class));
        accessToken(actor.getAccessToken());
        places(places);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param places value of "places" parameter.
     */
    public PlacesGetByIdQuery(VkApiClient client, UserActor actor, List<Integer> places) {
        super(client, "places.getById", Utils.buildParametrizedType(List.class, PlaceMin.class));
        accessToken(actor.getAccessToken());
        places(places);
    }

    /**
     * Location IDs.
     *
     * @param value value of "places" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PlacesGetByIdQuery places(int... value) {
        return unsafeParam("places", value);
    }

    /**
     * Location IDs.
     *
     * @param value value of "places" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PlacesGetByIdQuery places(List<Integer> value) {
        return unsafeParam("places", value);
    }

    @Override
    protected PlacesGetByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("places", "access_token");
    }
}

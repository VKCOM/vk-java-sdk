package com.vk.api.sdk.queries.places;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.places.responses.SearchResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Places.search method
 */
public class PlacesSearchQuery extends AbstractQueryBuilder<PlacesSearchQuery, SearchResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param latitude  value of "latitude" parameter.
     * @param longitude value of "longitude" parameter.
     */
    public PlacesSearchQuery(VkApiClient client, UserActor actor, float latitude, float longitude) {
        super(client, "places.search", SearchResponse.class);
        accessToken(actor.getAccessToken());
        latitude(latitude);
        longitude(longitude);
    }

    /**
     * Search query string.
     *
     * @param value value of "q" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesSearchQuery q(String value) {
        return unsafeParam("q", value);
    }

    /**
     * City ID.
     *
     * @param value value of "city" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesSearchQuery city(Integer value) {
        return unsafeParam("city", value);
    }

    /**
     * Geographical latitude of the initial search point, in degrees (from "-90" to "90").
     *
     * @param value value of "latitude" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PlacesSearchQuery latitude(float value) {
        return unsafeParam("latitude", value);
    }

    /**
     * Geographical longitude of the initial search point, in degrees (from "-180" to "180").
     *
     * @param value value of "longitude" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PlacesSearchQuery longitude(float value) {
        return unsafeParam("longitude", value);
    }

    /**
     * Radius of the search zone:
     * "1" - 100 m. (default)
     * "2" - 800 m.
     * "3" - 6 km.
     * "4" - 50 km.
     *
     * @param value value of "radius" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesSearchQuery radius(Integer value) {
        return unsafeParam("radius", value);
    }

    /**
     * Offset needed to return a specific subset of locations.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesSearchQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of locations to return.
     *
     * @param value value of "count" parameter. Maximum is 1000. Minimum is 0. By default 30.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesSearchQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected PlacesSearchQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("longitude", "latitude", "access_token");
    }
}

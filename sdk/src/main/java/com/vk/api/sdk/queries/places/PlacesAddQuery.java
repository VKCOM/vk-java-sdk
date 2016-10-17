package com.vk.api.sdk.queries.places;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.places.responses.AddResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Places.add method
 */
public class PlacesAddQuery extends AbstractQueryBuilder<PlacesAddQuery, AddResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param title     value of "title" parameter.
     * @param latitude  value of "latitude" parameter.
     * @param longitude value of "longitude" parameter.
     */
    public PlacesAddQuery(VkApiClient client, UserActor actor, String title, float latitude, float longitude) {
        super(client, "places.add", AddResponse.class);
        accessToken(actor.getAccessToken());
        title(title);
        latitude(latitude);
        longitude(longitude);
    }

    /**
     * ID of the location's type (e.g., "1" - Home, "2" - Work).
     * To get location type IDs, use the places.getTypes  method.
     *
     * @param value value of "type" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesAddQuery type(Integer value) {
        return unsafeParam("type", value);
    }

    /**
     * Title of the location.
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PlacesAddQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * Geographical latitude, in degrees (from "-90" to "90").
     *
     * @param value value of "latitude" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PlacesAddQuery latitude(float value) {
        return unsafeParam("latitude", value);
    }

    /**
     * Geographical longitude, in degrees (from "-180" to "180").
     *
     * @param value value of "longitude" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PlacesAddQuery longitude(float value) {
        return unsafeParam("longitude", value);
    }

    /**
     * ID of the location's country. To get country IDs, use the database.getCountries method.
     *
     * @param value value of "country" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesAddQuery country(Integer value) {
        return unsafeParam("country", value);
    }

    /**
     * ID of the location's city. To get city IDs, use the database.getCities method.
     *
     * @param value value of "city" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesAddQuery city(Integer value) {
        return unsafeParam("city", value);
    }

    /**
     * Street address of the location (e.g., "125 Elm Street").
     *
     * @param value value of "address" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesAddQuery address(String value) {
        return unsafeParam("address", value);
    }

    @Override
    protected PlacesAddQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("longitude", "title", "latitude", "access_token");
    }
}

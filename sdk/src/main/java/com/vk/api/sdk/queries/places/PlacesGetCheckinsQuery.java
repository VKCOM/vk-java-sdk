package com.vk.api.sdk.queries.places;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.places.responses.GetCheckinsResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Places.getCheckins method
 */
public class PlacesGetCheckinsQuery extends AbstractQueryBuilder<PlacesGetCheckinsQuery, GetCheckinsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public PlacesGetCheckinsQuery(VkApiClient client, UserActor actor) {
        super(client, "places.getCheckins", GetCheckinsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Geographical latitude of the initial search point, in degrees (from "-90" to "90").
     *
     * @param value value of "latitude" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesGetCheckinsQuery latitude(Float value) {
        return unsafeParam("latitude", value);
    }

    /**
     * Geographical longitude of the initial search point, in degrees (from "-180" to "180").
     *
     * @param value value of "longitude" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesGetCheckinsQuery longitude(Float value) {
        return unsafeParam("longitude", value);
    }

    /**
     * Location ID of check-ins to return. (Ignored if "latitude" and "longitude" are specified.)
     *
     * @param value value of "place" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesGetCheckinsQuery place(Integer value) {
        return unsafeParam("place", value);
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesGetCheckinsQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Offset needed to return a specific subset of check-ins. (Ignored if "timestamp" is not null.)
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesGetCheckinsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of check-ins to return. (Ignored if "timestamp" is not null.)
     *
     * @param value value of "count" parameter. Maximum is 100. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesGetCheckinsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Specifies that only those check-ins created after the specified timestamp will be returned.
     *
     * @param value value of "timestamp" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesGetCheckinsQuery timestamp(Integer value) {
        return unsafeParam("timestamp", value);
    }

    /**
     * Return only check-ins with set geographical coordinates.
     * Ignored if "latitude" and "longitude" are not set.
     *
     * @param value value of "friends only" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesGetCheckinsQuery friendsOnly(Boolean value) {
        return unsafeParam("friends_only", value);
    }

    /**
     * Return location information with the check-ins.
     * Ignored if "place" is not set.
     *
     * @param value value of "need places" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesGetCheckinsQuery needPlaces(Boolean value) {
        return unsafeParam("need_places", value);
    }

    @Override
    protected PlacesGetCheckinsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

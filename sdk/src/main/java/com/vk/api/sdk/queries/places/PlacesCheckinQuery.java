package com.vk.api.sdk.queries.places;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.places.responses.CheckinResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Places.checkin method
 */
public class PlacesCheckinQuery extends AbstractQueryBuilder<PlacesCheckinQuery, CheckinResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public PlacesCheckinQuery(VkApiClient client, UserActor actor) {
        super(client, "places.checkin", CheckinResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Location ID.
     *
     * @param value value of "place id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesCheckinQuery placeId(Integer value) {
        return unsafeParam("place_id", value);
    }

    /**
     * Text of the comment on the check-in (255 characters maximum; line breaks not supported).
     *
     * @param value value of "text" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesCheckinQuery text(String value) {
        return unsafeParam("text", value);
    }

    /**
     * Geographical latitude of the check-in, in degrees (from "-90" to "90").
     *
     * @param value value of "latitude" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesCheckinQuery latitude(Float value) {
        return unsafeParam("latitude", value);
    }

    /**
     * Geographical longitude of the check-in, in degrees (from "-180" to "180").
     *
     * @param value value of "longitude" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesCheckinQuery longitude(Float value) {
        return unsafeParam("longitude", value);
    }

    /**
     * heck-in will be available only for friends.
     *
     * @param value value of "friends only" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesCheckinQuery friendsOnly(Boolean value) {
        return unsafeParam("friends_only", value);
    }

    /**
     * List of services or websites (e.g., "twitter", "facebook") to which the check-in will be exported,
     * if the user has set up the respective option.
     *
     * @param value value of "services" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesCheckinQuery services(PlacesCheckinService... value) {
        return unsafeParam("services", value);
    }

    /**
     * List of services or websites (e.g., "twitter", "facebook") to which the check-in will be exported,
     * if the user has set up the respective option.
     *
     * @param value value of "services" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PlacesCheckinQuery services(List<PlacesCheckinService> value) {
        return unsafeParam("services", value);
    }

    @Override
    protected PlacesCheckinQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

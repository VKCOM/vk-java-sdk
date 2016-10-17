package com.vk.api.sdk.queries.users;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.users.responses.GetNearbyResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Users.getNearby method
 */
public class UsersGetNearbyQuery extends AbstractQueryBuilder<UsersGetNearbyQuery, GetNearbyResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param latitude  value of "latitude" parameter.
     * @param longitude value of "longitude" parameter.
     */
    public UsersGetNearbyQuery(VkApiClient client, UserActor actor, float latitude, float longitude) {
        super(client, "users.getNearby", GetNearbyResponse.class);
        accessToken(actor.getAccessToken());
        latitude(latitude);
        longitude(longitude);
    }

    /**
     * Geographic latitude of the place a user is located, in degrees (from -90 to 90)
     *
     * @param value value of "latitude" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected UsersGetNearbyQuery latitude(float value) {
        return unsafeParam("latitude", value);
    }

    /**
     * Geographic longitude of the place a user is located, in degrees (from -180 to 180)
     *
     * @param value value of "longitude" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected UsersGetNearbyQuery longitude(float value) {
        return unsafeParam("longitude", value);
    }

    /**
     * Current location accuracy in meters
     *
     * @param value value of "accuracy" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetNearbyQuery accuracy(Integer value) {
        return unsafeParam("accuracy", value);
    }

    /**
     * Time when a user disappears from location search results, in seconds
     *
     * @param value value of "timeout" parameter. Minimum is 0. By default 7200.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetNearbyQuery timeout(Integer value) {
        return unsafeParam("timeout", value);
    }

    /**
     * Search zone radius type
     *
     * @param value value of "radius" parameter. Minimum is 0. By default 1.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetNearbyQuery radius(UsersGetNearbyRadius value) {
        return unsafeParam("radius", value);
    }

    /**
     * List of additional fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetNearbyQuery fields(UserField... value) {
        return unsafeParam("fields", value);
    }

    /**
     * List of additional fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetNearbyQuery fields(List<UserField> value) {
        return unsafeParam("fields", value);
    }

    /**
     * Case for declension of user name and surname
     *
     * @param value value of "name case" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetNearbyQuery nameCase(UsersNameCase value) {
        return unsafeParam("name_case", value);
    }

    @Override
    protected UsersGetNearbyQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("longitude", "latitude", "access_token");
    }
}

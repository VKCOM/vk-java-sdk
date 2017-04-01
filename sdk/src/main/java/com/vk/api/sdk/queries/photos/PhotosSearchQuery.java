package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.photos.responses.SearchResponse;

import java.util.Collections;
import java.util.List;

/**
 * Query for Photos.search method
 */
public class PhotosSearchQuery extends AbstractQueryBuilder<PhotosSearchQuery, SearchResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public PhotosSearchQuery(VkApiClient client, UserActor actor) {
        super(client, "photos.search", SearchResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public PhotosSearchQuery(VkApiClient client, ServiceActor actor) {
        super(client, "photos.search", SearchResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Search query string.
     *
     * @param value value of "q" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSearchQuery q(String value) {
        return unsafeParam("q", value);
    }

    /**
     * Geographical latitude, in degrees (from "-90" to "90").
     *
     * @param value value of "lat" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSearchQuery lat(Float value) {
        return unsafeParam("lat", value);
    }

    /**
     * Geographical longitude, in degrees (from "-180" to "180").
     *
     * @param value value of "long" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSearchQuery lng(Float value) {
        return unsafeParam("long", value);
    }

    /**
     * @param value value of "start time" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSearchQuery startTime(Integer value) {
        return unsafeParam("start_time", value);
    }

    /**
     * @param value value of "end time" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSearchQuery endTime(Integer value) {
        return unsafeParam("end_time", value);
    }

    /**
     * Sort order:
     *
     * @param value value of "sort" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSearchQuery sort(Integer value) {
        return unsafeParam("sort", value);
    }

    /**
     * Offset needed to return a specific subset of photos.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSearchQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of photos to return.
     *
     * @param value value of "count" parameter. Maximum is 1000. Minimum is 0. By default 100.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSearchQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Radius of search in meters (works very approximately).
     * Available values: "10", "100", "800", "6000", "50000".
     *
     * @param value value of "radius" parameter. Minimum is 0. By default 5000.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSearchQuery radius(Integer value) {
        return unsafeParam("radius", value);
    }

    @Override
    protected PhotosSearchQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}

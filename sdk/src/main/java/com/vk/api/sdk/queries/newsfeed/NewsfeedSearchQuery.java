package com.vk.api.sdk.queries.newsfeed;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.newsfeed.responses.SearchResponse;

import java.util.Collections;
import java.util.List;

/**
 * Query for Newsfeed.search method
 */
public class NewsfeedSearchQuery extends AbstractQueryBuilder<NewsfeedSearchQuery, SearchResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public NewsfeedSearchQuery(VkApiClient client, UserActor actor) {
        super(client, "newsfeed.search", SearchResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public NewsfeedSearchQuery(VkApiClient client, ServiceActor actor) {
        super(client, "newsfeed.search", SearchResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Search query string (e.g., "New Year").
     *
     * @param value value of "q" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedSearchQuery q(String value) {
        return unsafeParam("q", value);
    }

    /**
     * Number of posts to return.
     *
     * @param value value of "count" parameter. Maximum is 200. Minimum is 0. By default 30.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedSearchQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Geographical latitude point (in degrees, -90 to 90) within which to search.
     *
     * @param value value of "latitude" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedSearchQuery latitude(Float value) {
        return unsafeParam("latitude", value);
    }

    /**
     * Geographical longitude point (in degrees, -180 to 180) within which to search.
     *
     * @param value value of "longitude" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedSearchQuery longitude(Float value) {
        return unsafeParam("longitude", value);
    }

    /**
     * Earliest timestamp (in Unix time) of a news item to return. By default, 24 hours ago.
     *
     * @param value value of "start time" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedSearchQuery startTime(Integer value) {
        return unsafeParam("start_time", value);
    }

    /**
     * Latest timestamp (in Unix time) of a news item to return. By default, the current time.
     *
     * @param value value of "end time" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedSearchQuery endTime(Integer value) {
        return unsafeParam("end_time", value);
    }

    /**
     * Set start from
     *
     * @param value value of "start from" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedSearchQuery startFrom(String value) {
        return unsafeParam("start_from", value);
    }

    @Override
    protected NewsfeedSearchQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}

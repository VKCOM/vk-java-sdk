package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.stories.responses.GetV5113Response;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Stories.search method
 */
public class StoriesSearchQueryWithV5113 extends AbstractQueryBuilder<StoriesSearchQueryWithV5113, GetV5113Response> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StoriesSearchQueryWithV5113(VkApiClient client, UserActor actor) {
        super(client, "stories.search", GetV5113Response.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set q
     *
     * @param value value of "q" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesSearchQueryWithV5113 q(String value) {
        return unsafeParam("q", value);
    }

    /**
     * Set place id
     *
     * @param value value of "place id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesSearchQueryWithV5113 placeId(Integer value) {
        return unsafeParam("place_id", value);
    }

    /**
     * Set latitude
     *
     * @param value value of "latitude" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesSearchQueryWithV5113 latitude(Number value) {
        return unsafeParam("latitude", value);
    }

    /**
     * Set longitude
     *
     * @param value value of "longitude" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesSearchQueryWithV5113 longitude(Number value) {
        return unsafeParam("longitude", value);
    }

    /**
     * Set radius
     *
     * @param value value of "radius" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesSearchQueryWithV5113 radius(Integer value) {
        return unsafeParam("radius", value);
    }

    /**
     * Set mentioned id
     *
     * @param value value of "mentioned id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesSearchQueryWithV5113 mentionedId(Integer value) {
        return unsafeParam("mentioned_id", value);
    }

    /**
     * Set count
     *
     * @param value value of "count" parameter. Maximum is 1000. Minimum is 1. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesSearchQueryWithV5113 count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Set extended
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesSearchQueryWithV5113 extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * fields
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesSearchQueryWithV5113 fields(String... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesSearchQueryWithV5113 fields(List<String> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected StoriesSearchQueryWithV5113 getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

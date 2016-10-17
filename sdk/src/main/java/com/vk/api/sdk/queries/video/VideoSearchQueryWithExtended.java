package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.video.responses.SearchExtendedResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.search method
 */
public class VideoSearchQueryWithExtended extends AbstractQueryBuilder<VideoSearchQueryWithExtended, SearchExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param q      value of "q" parameter.
     */
    public VideoSearchQueryWithExtended(VkApiClient client, UserActor actor, String q) {
        super(client, "video.search", SearchExtendedResponse.class);
        accessToken(actor.getAccessToken());
        q(q);
        extended(true);
    }

    /**
     * Search query string (e.g., "The Beatles").
     *
     * @param value value of "q" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoSearchQueryWithExtended q(String value) {
        return unsafeParam("q", value);
    }

    /**
     * Sort order
     *
     * @param value value of "sort" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSearchQueryWithExtended sort(VideoSearchSort value) {
        return unsafeParam("sort", value);
    }

    /**
     * If not null, only searches for high-definition videos.
     *
     * @param value value of "hd" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSearchQueryWithExtended hd(Integer value) {
        return unsafeParam("hd", value);
    }

    /**
     * Disable the Safe Search filter
     *
     * @param value value of "adult" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSearchQueryWithExtended adult(Boolean value) {
        return unsafeParam("adult", value);
    }

    /**
     * Set filters
     *
     * @param value value of "filters" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSearchQueryWithExtended filters(VideoSearchFilter... value) {
        return unsafeParam("filters", value);
    }

    /**
     * Set filters
     *
     * @param value value of "filters" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSearchQueryWithExtended filters(List<VideoSearchFilter> value) {
        return unsafeParam("filters", value);
    }

    /**
     * @param value value of "search own" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSearchQueryWithExtended searchOwn(Boolean value) {
        return unsafeParam("search_own", value);
    }

    /**
     * Offset needed to return a specific subset of videos.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSearchQueryWithExtended offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Set longer
     *
     * @param value value of "longer" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSearchQueryWithExtended longer(Integer value) {
        return unsafeParam("longer", value);
    }

    /**
     * Set shorter
     *
     * @param value value of "shorter" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSearchQueryWithExtended shorter(Integer value) {
        return unsafeParam("shorter", value);
    }

    /**
     * Number of videos to return.
     *
     * @param value value of "count" parameter. Maximum is 200. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSearchQueryWithExtended count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Set extended
     *
     * @param value value of "extended" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoSearchQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Set date
     *
     * @param value value of "date" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSearchQueryWithExtended date(Integer value) {
        return unsafeParam("date", value);
    }

    @Override
    protected VideoSearchQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("q", "access_token");
    }
}

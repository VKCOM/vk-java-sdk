package com.vk.api.sdk.queries.audio;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.audio.responses.SearchResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Audio.search method
 */
public class AudioSearchQuery extends AbstractQueryBuilder<AudioSearchQuery, SearchResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public AudioSearchQuery(VkApiClient client, UserActor actor) {
        super(client, "audio.search", SearchResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Search query string (e.g., "The Beatles").
     *
     * @param value value of "q" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioSearchQuery q(String value) {
        return unsafeParam("q", value);
    }

    /**
     * Correct for mistakes in the search query (e.g., if you enter "Beetles", the system will search for "Beatles")
     *
     * @param value value of "auto complete" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioSearchQuery autoComplete(Boolean value) {
        return unsafeParam("auto_complete", value);
    }

    /**
     * Return only audio files that have associated lyrics
     *
     * @param value value of "lyrics" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioSearchQuery lyrics(Boolean value) {
        return unsafeParam("lyrics", value);
    }

    /**
     * Search only by artist name
     *
     * @param value value of "performer only" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioSearchQuery performerOnly(Boolean value) {
        return unsafeParam("performer_only", value);
    }

    /**
     * Sort order
     *
     * @param value value of "sort" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioSearchQuery sort(AudioSearchSort value) {
        return unsafeParam("sort", value);
    }

    /**
     * Set search own
     *
     * @param value value of "search own" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioSearchQuery searchOwn(Boolean value) {
        return unsafeParam("search_own", value);
    }

    /**
     * Offset needed to return a specific subset of audio files.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioSearchQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of audio files to return.
     *
     * @param value value of "count" parameter. Maximum is 300. Minimum is 0. By default 30.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioSearchQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected AudioSearchQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

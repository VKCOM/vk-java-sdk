package com.vk.api.sdk.queries.audio;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.audio.responses.GetResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Audio.get method
 */
public class AudioGetQuery extends AbstractQueryBuilder<AudioGetQuery, GetResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public AudioGetQuery(VkApiClient client, UserActor actor) {
        super(client, "audio.get", GetResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of the user or community that owns the audio file. Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioGetQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Audio album ID.
     *
     * @param value value of "album id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioGetQuery albumId(Integer value) {
        return unsafeParam("album_id", value);
    }

    /**
     * IDs of the audio files to return.
     *
     * @param value value of "audio ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioGetQuery audioIds(Integer... value) {
        return unsafeParam("audio_ids", value);
    }

    /**
     * IDs of the audio files to return.
     *
     * @param value value of "audio ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioGetQuery audioIds(List<Integer> value) {
        return unsafeParam("audio_ids", value);
    }

    /**
     * Return information about users who uploaded audio files
     *
     * @param value value of "need user" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioGetQuery needUser(Boolean value) {
        return unsafeParam("need_user", value);
    }

    /**
     * Offset needed to return a specific subset of audio files.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioGetQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of audio files to return.
     *
     * @param value value of "count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioGetQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected AudioGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

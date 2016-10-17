package com.vk.api.sdk.queries.audio;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Audio.edit method
 */
public class AudioEditQuery extends AbstractQueryBuilder<AudioEditQuery, Integer> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param audioId value of "audio id" parameter. Minimum is 0.
     */
    public AudioEditQuery(VkApiClient client, UserActor actor, int ownerId, int audioId) {
        super(client, "audio.edit", Integer.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        audioId(audioId);
    }

    /**
     * ID of the user or community that owns the audio file.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AudioEditQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Audio file ID.
     *
     * @param value value of "audio id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AudioEditQuery audioId(int value) {
        return unsafeParam("audio_id", value);
    }

    /**
     * Name of the artist.
     *
     * @param value value of "artist" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioEditQuery artist(String value) {
        return unsafeParam("artist", value);
    }

    /**
     * Title of the audio file.
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioEditQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * Text of the lyrics of the audio file.
     *
     * @param value value of "text" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioEditQuery text(String value) {
        return unsafeParam("text", value);
    }

    /**
     * Genre of the audio file. See the list of audio genres.
     *
     * @param value value of "genre id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioEditQuery genreId(AudioGenre value) {
        return unsafeParam("genre_id", value);
    }

    /**
     * true - audio file will not be available for search
     * false - audio file will be available for search (default)
     *
     * @param value value of "no search" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioEditQuery noSearch(Boolean value) {
        return unsafeParam("no_search", value);
    }

    @Override
    protected AudioEditQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("audio_id", "owner_id", "access_token");
    }
}

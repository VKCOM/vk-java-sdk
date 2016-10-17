package com.vk.api.sdk.queries.audio;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.audio.AudioFull;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Audio.getPopular method
 */
public class AudioGetPopularQuery extends AbstractQueryBuilder<AudioGetPopularQuery, List<AudioFull>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public AudioGetPopularQuery(VkApiClient client, UserActor actor) {
        super(client, "audio.getPopular", Utils.buildParametrizedType(List.class, AudioFull.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Return only foreign audio files
     *
     * @param value value of "only eng" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioGetPopularQuery onlyEng(Boolean value) {
        return unsafeParam("only_eng", value);
    }

    /**
     * Genre ID. See the list of audio genres.
     *
     * @param value value of "genre id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioGetPopularQuery genreId(AudioGenre value) {
        return unsafeParam("genre_id", value);
    }

    /**
     * Offset needed to return a specific subset of audio files.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioGetPopularQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of audio files to return.
     *
     * @param value value of "count" parameter. Maximum is 1000. Minimum is 0. By default 100.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioGetPopularQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected AudioGetPopularQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

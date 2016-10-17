package com.vk.api.sdk.queries.audio;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.audio.AudioFull;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Audio.getRecommendations method
 */
public class AudioGetRecommendationsQuery extends AbstractQueryBuilder<AudioGetRecommendationsQuery, List<AudioFull>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public AudioGetRecommendationsQuery(VkApiClient client, UserActor actor) {
        super(client, "audio.getRecommendations", Utils.buildParametrizedType(List.class, AudioFull.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Use to get recommendations based on a particular audio file. The ID of the user or community that owns an audio file and that audio file's ID, separated by an underscore.
     *
     * @param value value of "target audio" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioGetRecommendationsQuery targetAudio(String value) {
        return unsafeParam("target_audio", value);
    }

    /**
     * Use to get recommendations based on a user's playlist. User ID. By default, the current user ID.
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioGetRecommendationsQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Offset needed to return a specific subset of audio files.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioGetRecommendationsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of audio files to return.
     *
     * @param value value of "count" parameter. Maximum is 1000. Minimum is 0. By default 100.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioGetRecommendationsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * true - shuffle on
     *
     * @param value value of "shuffle" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioGetRecommendationsQuery shuffle(Boolean value) {
        return unsafeParam("shuffle", value);
    }

    @Override
    protected AudioGetRecommendationsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

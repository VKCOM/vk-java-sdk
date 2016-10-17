package com.vk.api.sdk.queries.audio;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Audio.restore method
 */
public class AudioRestoreQuery extends AbstractQueryBuilder<AudioRestoreQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param audioId value of "audio id" parameter. Minimum is 0.
     */
    public AudioRestoreQuery(VkApiClient client, UserActor actor, int audioId) {
        super(client, "audio.restore", OkResponse.class);
        accessToken(actor.getAccessToken());
        audioId(audioId);
    }

    /**
     * Audio file ID.
     *
     * @param value value of "audio id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AudioRestoreQuery audioId(int value) {
        return unsafeParam("audio_id", value);
    }

    /**
     * ID of the user or community that owns the audio file.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioRestoreQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    @Override
    protected AudioRestoreQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("audio_id", "access_token");
    }
}

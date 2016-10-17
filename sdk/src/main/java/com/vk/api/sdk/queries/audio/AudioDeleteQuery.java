package com.vk.api.sdk.queries.audio;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Audio.delete method
 */
public class AudioDeleteQuery extends AbstractQueryBuilder<AudioDeleteQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param audioId value of "audio id" parameter. Minimum is 0.
     * @param ownerId value of "owner id" parameter.
     */
    public AudioDeleteQuery(VkApiClient client, UserActor actor, int audioId, int ownerId) {
        super(client, "audio.delete", OkResponse.class);
        accessToken(actor.getAccessToken());
        audioId(audioId);
        ownerId(ownerId);
    }

    /**
     * Audio file ID.
     *
     * @param value value of "audio id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AudioDeleteQuery audioId(int value) {
        return unsafeParam("audio_id", value);
    }

    /**
     * ID of the user or community that owns the audio file.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AudioDeleteQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    @Override
    protected AudioDeleteQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("audio_id", "owner_id", "access_token");
    }
}

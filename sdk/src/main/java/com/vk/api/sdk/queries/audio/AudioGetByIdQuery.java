package com.vk.api.sdk.queries.audio;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.audio.AudioFull;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Audio.getById method
 */
public class AudioGetByIdQuery extends AbstractQueryBuilder<AudioGetByIdQuery, List<AudioFull>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param audios value of "audios" parameter.
     */
    public AudioGetByIdQuery(VkApiClient client, UserActor actor, String... audios) {
        super(client, "audio.getById", Utils.buildParametrizedType(List.class, AudioFull.class));
        accessToken(actor.getAccessToken());
        audios(audios);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param audios value of "audios" parameter.
     */
    public AudioGetByIdQuery(VkApiClient client, UserActor actor, List<String> audios) {
        super(client, "audio.getById", Utils.buildParametrizedType(List.class, AudioFull.class));
        accessToken(actor.getAccessToken());
        audios(audios);
    }

    /**
     * Audio file IDs, in the following format:
     * {owner_id}_{audio_id}
     *
     * @param value value of "audios" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AudioGetByIdQuery audios(String... value) {
        return unsafeParam("audios", value);
    }

    /**
     * Audio file IDs, in the following format:
     * {owner_id}_{audio_id}
     *
     * @param value value of "audios" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AudioGetByIdQuery audios(List<String> value) {
        return unsafeParam("audios", value);
    }

    @Override
    protected AudioGetByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("audios", "access_token");
    }
}

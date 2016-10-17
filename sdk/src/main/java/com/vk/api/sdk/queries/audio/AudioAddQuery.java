package com.vk.api.sdk.queries.audio;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Audio.add method
 */
public class AudioAddQuery extends AbstractQueryBuilder<AudioAddQuery, Integer> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param audioId value of "audio id" parameter. Minimum is 0.
     * @param ownerId value of "owner id" parameter.
     */
    public AudioAddQuery(VkApiClient client, UserActor actor, int audioId, int ownerId) {
        super(client, "audio.add", Integer.class);
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
    protected AudioAddQuery audioId(int value) {
        return unsafeParam("audio_id", value);
    }

    /**
     * ID of the user or community that owns the audio file.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AudioAddQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Community ID, needed when adding the audio file to a community.
     *
     * @param value value of "group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioAddQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set album id
     *
     * @param value value of "album id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioAddQuery albumId(Integer value) {
        return unsafeParam("album_id", value);
    }

    @Override
    protected AudioAddQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("audio_id", "owner_id", "access_token");
    }
}

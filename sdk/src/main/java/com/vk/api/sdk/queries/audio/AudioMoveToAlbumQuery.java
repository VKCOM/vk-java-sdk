package com.vk.api.sdk.queries.audio;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Audio.moveToAlbum method
 */
public class AudioMoveToAlbumQuery extends AbstractQueryBuilder<AudioMoveToAlbumQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   VK API client
     * @param actor    actor with access token
     * @param audioIds value of "audio ids" parameter.
     */
    public AudioMoveToAlbumQuery(VkApiClient client, UserActor actor, int... audioIds) {
        super(client, "audio.moveToAlbum", OkResponse.class);
        accessToken(actor.getAccessToken());
        audioIds(audioIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   VK API client
     * @param actor    actor with access token
     * @param audioIds value of "audio ids" parameter.
     */
    public AudioMoveToAlbumQuery(VkApiClient client, UserActor actor, List<Integer> audioIds) {
        super(client, "audio.moveToAlbum", OkResponse.class);
        accessToken(actor.getAccessToken());
        audioIds(audioIds);
    }

    /**
     * ID of the community where the audio files are located. By default, current user ID.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioMoveToAlbumQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * ID of the album to which the audio files will be moved.
     *
     * @param value value of "album id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioMoveToAlbumQuery albumId(Integer value) {
        return unsafeParam("album_id", value);
    }

    /**
     * IDs of the audio files to be moved.
     * NOTE: An album can hold up to 1000 audio files.
     *
     * @param value value of "audio ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AudioMoveToAlbumQuery audioIds(int... value) {
        return unsafeParam("audio_ids", value);
    }

    /**
     * IDs of the audio files to be moved.
     * NOTE: An album can hold up to 1000 audio files.
     *
     * @param value value of "audio ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AudioMoveToAlbumQuery audioIds(List<Integer> value) {
        return unsafeParam("audio_ids", value);
    }

    @Override
    protected AudioMoveToAlbumQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("audio_ids", "access_token");
    }
}

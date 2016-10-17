package com.vk.api.sdk.queries.audio;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Audio.editAlbum method
 */
public class AudioEditAlbumQuery extends AbstractQueryBuilder<AudioEditAlbumQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param albumId value of "album id" parameter. Minimum is 0.
     * @param title   value of "title" parameter.
     */
    public AudioEditAlbumQuery(VkApiClient client, UserActor actor, int albumId, String title) {
        super(client, "audio.editAlbum", OkResponse.class);
        accessToken(actor.getAccessToken());
        albumId(albumId);
        title(title);
    }

    /**
     * ID of the community where the album is located.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioEditAlbumQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Album ID.
     *
     * @param value value of "album id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AudioEditAlbumQuery albumId(int value) {
        return unsafeParam("album_id", value);
    }

    /**
     * New album title.
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AudioEditAlbumQuery title(String value) {
        return unsafeParam("title", value);
    }

    @Override
    protected AudioEditAlbumQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("album_id", "title", "access_token");
    }
}

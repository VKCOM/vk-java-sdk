package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.addToAlbum method
 */
public class VideoAddToAlbumQuery extends AbstractQueryBuilder<VideoAddToAlbumQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param videoId value of "video id" parameter. Minimum is 0.
     */
    public VideoAddToAlbumQuery(VkApiClient client, UserActor actor, int ownerId, int videoId) {
        super(client, "video.addToAlbum", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        videoId(videoId);
    }

    /**
     * Set target id
     *
     * @param value value of "target id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoAddToAlbumQuery targetId(Integer value) {
        return unsafeParam("target_id", value);
    }

    /**
     * Set album id
     *
     * @param value value of "album id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoAddToAlbumQuery albumId(Integer value) {
        return unsafeParam("album_id", value);
    }

    /**
     * Set album ids
     *
     * @param value value of "album ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoAddToAlbumQuery albumIds(Integer... value) {
        return unsafeParam("album_ids", value);
    }

    /**
     * Set album ids
     *
     * @param value value of "album ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoAddToAlbumQuery albumIds(List<Integer> value) {
        return unsafeParam("album_ids", value);
    }

    /**
     * Set owner id
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoAddToAlbumQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Set video id
     *
     * @param value value of "video id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoAddToAlbumQuery videoId(int value) {
        return unsafeParam("video_id", value);
    }

    @Override
    protected VideoAddToAlbumQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("video_id", "owner_id", "access_token");
    }
}

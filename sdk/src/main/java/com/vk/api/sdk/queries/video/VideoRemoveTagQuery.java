package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.removeTag method
 */
public class VideoRemoveTagQuery extends AbstractQueryBuilder<VideoRemoveTagQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param tagId   value of "tag id" parameter.
     * @param videoId value of "video id" parameter. Minimum is 0.
     */
    public VideoRemoveTagQuery(VkApiClient client, UserActor actor, int tagId, int videoId) {
        super(client, "video.removeTag", OkResponse.class);
        accessToken(actor.getAccessToken());
        tagId(tagId);
        videoId(videoId);
    }

    /**
     * Tag ID.
     *
     * @param value value of "tag id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoRemoveTagQuery tagId(int value) {
        return unsafeParam("tag_id", value);
    }

    /**
     * ID of the user or community that owns the video.
     *
     * @param value value of "owner id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoRemoveTagQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Video ID.
     *
     * @param value value of "video id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoRemoveTagQuery videoId(int value) {
        return unsafeParam("video_id", value);
    }

    @Override
    protected VideoRemoveTagQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("video_id", "tag_id", "access_token");
    }
}

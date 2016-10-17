package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.add method
 */
public class VideoAddQuery extends AbstractQueryBuilder<VideoAddQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param videoId value of "video id" parameter. Minimum is 0.
     * @param ownerId value of "owner id" parameter.
     */
    public VideoAddQuery(VkApiClient client, UserActor actor, int videoId, int ownerId) {
        super(client, "video.add", OkResponse.class);
        accessToken(actor.getAccessToken());
        videoId(videoId);
        ownerId(ownerId);
    }

    /**
     * Identifier of a user or community to add a video to.
     * Use a negative value to designate a community ID.
     *
     * @param value value of "target id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoAddQuery targetId(Integer value) {
        return unsafeParam("target_id", value);
    }

    /**
     * Video ID.
     *
     * @param value value of "video id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoAddQuery videoId(int value) {
        return unsafeParam("video_id", value);
    }

    /**
     * ID of the user or community that owns the video.
     * Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoAddQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    @Override
    protected VideoAddQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("video_id", "owner_id", "access_token");
    }
}

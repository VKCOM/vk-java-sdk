package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.video.responses.GetUserVideosExtendedResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.getUserVideos method
 */
public class VideoGetUserVideosQueryWithExtended extends AbstractQueryBuilder<VideoGetUserVideosQueryWithExtended, GetUserVideosExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public VideoGetUserVideosQueryWithExtended(VkApiClient client, UserActor actor) {
        super(client, "video.getUserVideos", GetUserVideosExtendedResponse.class);
        accessToken(actor.getAccessToken());
        extended(true);
    }

    /**
     * User ID.
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetUserVideosQueryWithExtended userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Offset needed to return a specific subset of videos.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetUserVideosQueryWithExtended offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of videos to return.
     *
     * @param value value of "count" parameter. Maximum is 100. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetUserVideosQueryWithExtended count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Set extended
     *
     * @param value value of "extended" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoGetUserVideosQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }


    @Override
    protected VideoGetUserVideosQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

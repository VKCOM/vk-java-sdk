package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.video.responses.GetCommentsExtendedResponse;
import com.vk.api.sdk.queries.EnumParam;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.getComments method
 */
public class VideoGetCommentsQueryWithExtended extends AbstractQueryBuilder<VideoGetCommentsQueryWithExtended, GetCommentsExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param videoId value of "video id" parameter. Minimum is 0.
     */
    public VideoGetCommentsQueryWithExtended(VkApiClient client, UserActor actor, int videoId) {
        super(client, "video.getComments", GetCommentsExtendedResponse.class);
        accessToken(actor.getAccessToken());
        videoId(videoId);
        extended(true);
    }

    /**
     * ID of the user or community that owns the video.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetCommentsQueryWithExtended ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Video ID.
     *
     * @param value value of "video id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoGetCommentsQueryWithExtended videoId(int value) {
        return unsafeParam("video_id", value);
    }

    /**
     * Return an additional "likes" field
     *
     * @param value value of "need likes" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetCommentsQueryWithExtended needLikes(Boolean value) {
        return unsafeParam("need_likes", value);
    }

    /**
     * Set start comment id
     *
     * @param value value of "start comment id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetCommentsQueryWithExtended startCommentId(Integer value) {
        return unsafeParam("start_comment_id", value);
    }

    /**
     * Offset needed to return a specific subset of comments.
     *
     * @param value value of "offset" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetCommentsQueryWithExtended offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of comments to return.
     *
     * @param value value of "count" parameter. Maximum is 100. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetCommentsQueryWithExtended count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Sort order
     *
     * @param value value of "sort" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetCommentsQueryWithExtended sort(VideoGetCommentsSort value) {
        return unsafeParam("sort", value);
    }

    /**
     * Set extended
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoGetCommentsQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }


    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetCommentsQueryWithExtended fields(EnumParam... value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected VideoGetCommentsQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("video_id", "access_token");
    }
}

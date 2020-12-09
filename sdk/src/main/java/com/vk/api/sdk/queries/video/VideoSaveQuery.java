package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.video.responses.SaveResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.save method
 */
public class VideoSaveQuery extends AbstractQueryBuilder<VideoSaveQuery, SaveResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public VideoSaveQuery(VkApiClient client, UserActor actor) {
        super(client, "video.save", SaveResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Name of the video.
     *
     * @param value value of "name" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSaveQuery name(String value) {
        return unsafeParam("name", value);
    }

    /**
     * Description of the video.
     *
     * @param value value of "description" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSaveQuery description(String value) {
        return unsafeParam("description", value);
    }

    /**
     * '1' — to designate the video as private (send it via a private message), the video will not appear on the user's video list and will not be available by ID for other users, '0' — not to designate the video as private
     *
     * @param value value of "is private" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSaveQuery isPrivate(Boolean value) {
        return unsafeParam("is_private", value);
    }

    /**
     * '1' — to post the saved video on a user's wall, '0' — not to post the saved video on a user's wall
     *
     * @param value value of "wallpost" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSaveQuery wallpost(Boolean value) {
        return unsafeParam("wallpost", value);
    }

    /**
     * URL for embedding the video from an external website.
     *
     * @param value value of "link" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSaveQuery link(String value) {
        return unsafeParam("link", value);
    }

    /**
     * ID of the community in which the video will be saved. By default, the current user's page.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSaveQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * ID of the album to which the saved video will be added.
     *
     * @param value value of "album id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSaveQuery albumId(Integer value) {
        return unsafeParam("album_id", value);
    }

    /**
     * Set no comments
     *
     * @param value value of "no comments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSaveQuery noComments(Boolean value) {
        return unsafeParam("no_comments", value);
    }

    /**
     * '1' — to repeat the playback of the video, '0' — to play the video once,
     *
     * @param value value of "repeat" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSaveQuery repeat(Boolean value) {
        return unsafeParam("repeat", value);
    }

    /**
     * Set compression
     *
     * @param value value of "compression" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSaveQuery compression(Boolean value) {
        return unsafeParam("compression", value);
    }

    /**
     * privacy_view
     * Set privacy view
     *
     * @param value value of "privacy view" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSaveQuery privacyView(String... value) {
        return unsafeParam("privacy_view", value);
    }

    /**
     * Set privacy view
     *
     * @param value value of "privacy view" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSaveQuery privacyView(List<String> value) {
        return unsafeParam("privacy_view", value);
    }

    /**
     * privacy_comment
     * Set privacy comment
     *
     * @param value value of "privacy comment" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSaveQuery privacyComment(String... value) {
        return unsafeParam("privacy_comment", value);
    }

    /**
     * Set privacy comment
     *
     * @param value value of "privacy comment" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoSaveQuery privacyComment(List<String> value) {
        return unsafeParam("privacy_comment", value);
    }

    @Override
    protected VideoSaveQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

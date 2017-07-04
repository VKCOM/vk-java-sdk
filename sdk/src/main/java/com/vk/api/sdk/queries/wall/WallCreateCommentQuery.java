package com.vk.api.sdk.queries.wall;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.wall.responses.CreateCommentResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Wall.createComment method
 */
public class WallCreateCommentQuery extends AbstractQueryBuilder<WallCreateCommentQuery, CreateCommentResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param postId value of "post id" parameter. Minimum is 0.
     */
    public WallCreateCommentQuery(VkApiClient client, UserActor actor, int postId) {
        super(client, "wall.createComment", CreateCommentResponse.class);
        accessToken(actor.getAccessToken());
        postId(postId);
    }

    /**
     * User ID or community ID. Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallCreateCommentQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Post ID.
     *
     * @param value value of "post id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected WallCreateCommentQuery postId(int value) {
        return unsafeParam("post_id", value);
    }

    /**
     * Post the comment as from the community;
     *
     * @param value value of "from group" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallCreateCommentQuery fromGroup(Integer value) {
        return unsafeParam("from_group", value);
    }

    /**
     * (Required if "attachments" is not set.) Text of the comment.
     *
     * @param value value of "message" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallCreateCommentQuery message(String value) {
        return unsafeParam("message", value);
    }

    /**
     * ID of comment to reply.
     *
     * @param value value of "reply to comment" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallCreateCommentQuery replyToComment(Integer value) {
        return unsafeParam("reply_to_comment", value);
    }

    /**
     * (Required if "message" is not set.) List of media objects attached to the comment, in the following format:
     * "type""owner_id"_"media_id"
     * ""type"" - Type of media ojbect:
     * "photo" - photo
     * "video" - video
     * "audio" - audio
     * "doc" - document
     * ""owner_id"" - ID of the media owner.
     * ""media_id"" - Media ID.
     * <p>
     * For example:
     * photo100172_166443618,photo66748_265827614
     *
     * @param value value of "attachments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallCreateCommentQuery attachments(String... value) {
        return unsafeParam("attachments", value);
    }

    /**
     * (Required if "message" is not set.) List of media objects attached to the comment, in the following format:
     * "type""owner_id"_"media_id"
     * ""type"" - Type of media ojbect:
     * "photo" - photo
     * "video" - video
     * "audio" - audio
     * "doc" - document
     * ""owner_id"" - ID of the media owner.
     * ""media_id"" - Media ID.
     * <p>
     * For example:
     * photo100172_166443618,photo66748_265827614
     *
     * @param value value of "attachments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallCreateCommentQuery attachments(List<String> value) {
        return unsafeParam("attachments", value);
    }

    /**
     * Sticker ID.
     *
     * @param value value of "sticker id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallCreateCommentQuery stickerId(Integer value) {
        return unsafeParam("sticker_id", value);
    }

    /**
     * Unique identifier to avoid repeated comments.
     *
     * @param value value of "guid" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallCreateCommentQuery guid(String value) {
        return unsafeParam("guid", value);
    }

    @Override
    protected WallCreateCommentQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("post_id", "access_token");
    }
}

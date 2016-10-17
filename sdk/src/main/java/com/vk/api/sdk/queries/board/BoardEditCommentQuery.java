package com.vk.api.sdk.queries.board;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Board.editComment method
 */
public class BoardEditCommentQuery extends AbstractQueryBuilder<BoardEditCommentQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param groupId   value of "group id" parameter. Minimum is 0.
     * @param topicId   value of "topic id" parameter. Minimum is 0.
     * @param commentId value of "comment id" parameter. Minimum is 0.
     */
    public BoardEditCommentQuery(VkApiClient client, UserActor actor, int groupId, int topicId, int commentId) {
        super(client, "board.editComment", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        topicId(topicId);
        commentId(commentId);
    }

    /**
     * ID of the community that owns the discussion board.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected BoardEditCommentQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Topic ID.
     *
     * @param value value of "topic id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected BoardEditCommentQuery topicId(int value) {
        return unsafeParam("topic_id", value);
    }

    /**
     * ID of the comment on the topic.
     *
     * @param value value of "comment id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected BoardEditCommentQuery commentId(int value) {
        return unsafeParam("comment_id", value);
    }

    /**
     * New comment text.
     * Required if "attachments" is not set
     *
     * @param value value of "message" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public BoardEditCommentQuery message(String value) {
        return unsafeParam("message", value);
    }

    /**
     * List of media objects attached to the comment, in the following format:
     * "type""owner_id"_"media_id"
     * ""type"" - Type of media object:
     * "photo" - photo
     * "video" - video
     * "audio" - audio
     * "doc" - document
     * ""owner_id"" - ID of the media owner.
     * ""media_id"" - Media ID.
     * <p>
     * Example:
     * photo100172_166443618,photo66748_265827614
     * <p>
     * Required if "message" is not set.
     *
     * @param value value of "attachments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public BoardEditCommentQuery attachments(String... value) {
        return unsafeParam("attachments", value);
    }

    /**
     * List of media objects attached to the comment, in the following format:
     * "type""owner_id"_"media_id"
     * ""type"" - Type of media object:
     * "photo" - photo
     * "video" - video
     * "audio" - audio
     * "doc" - document
     * ""owner_id"" - ID of the media owner.
     * ""media_id"" - Media ID.
     * <p>
     * Example:
     * photo100172_166443618,photo66748_265827614
     * <p>
     * Required if "message" is not set.
     *
     * @param value value of "attachments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public BoardEditCommentQuery attachments(List<String> value) {
        return unsafeParam("attachments", value);
    }


    @Override
    protected BoardEditCommentQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "topic_id", "comment_id", "access_token");
    }
}

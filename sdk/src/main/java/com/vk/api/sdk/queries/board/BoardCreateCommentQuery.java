package com.vk.api.sdk.queries.board;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Board.createComment method
 */
public class BoardCreateCommentQuery extends AbstractQueryBuilder<BoardCreateCommentQuery, Integer> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     * @param topicId value of "topic id" parameter. Minimum is 0.
     */
    public BoardCreateCommentQuery(VkApiClient client, UserActor actor, int groupId, int topicId) {
        super(client, "board.createComment", Integer.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        topicId(topicId);
    }

    /**
     * ID of the community that owns the discussion board.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected BoardCreateCommentQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * ID of the topic to be commented on.
     *
     * @param value value of "topic id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected BoardCreateCommentQuery topicId(int value) {
        return unsafeParam("topic_id", value);
    }

    /**
     * Text of the comment.
     * Required if "attachments" is not set.
     *
     * @param value value of "message" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public BoardCreateCommentQuery message(String value) {
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
     * Required if "message" is not set.
     *
     * @param value value of "attachments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public BoardCreateCommentQuery attachments(String... value) {
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
     * Required if "message" is not set.
     *
     * @param value value of "attachments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public BoardCreateCommentQuery attachments(List<String> value) {
        return unsafeParam("attachments", value);
    }

    /**
     * true - to post the comment as by the community
     * false - to post the comment as by the user (default)
     *
     * @param value value of "from group" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public BoardCreateCommentQuery fromGroup(Boolean value) {
        return unsafeParam("from_group", value);
    }

    /**
     * Sticker ID.
     *
     * @param value value of "sticker id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public BoardCreateCommentQuery stickerId(Integer value) {
        return unsafeParam("sticker_id", value);
    }

    /**
     * Unique identifier to avoid repeated comments.
     *
     * @param value value of "guid" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public BoardCreateCommentQuery guid(String value) {
        return unsafeParam("guid", value);
    }

    @Override
    protected BoardCreateCommentQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "topic_id", "access_token");
    }
}

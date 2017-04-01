package com.vk.api.sdk.queries.board;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Board.restoreComment method
 */
public class BoardRestoreCommentQuery extends AbstractQueryBuilder<BoardRestoreCommentQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param groupId   value of "group id" parameter. Minimum is 0.
     * @param topicId   value of "topic id" parameter. Minimum is 0.
     * @param commentId value of "comment id" parameter. Minimum is 0.
     */
    public BoardRestoreCommentQuery(VkApiClient client, UserActor actor, int groupId, int topicId, int commentId) {
        super(client, "board.restoreComment", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        topicId(topicId);
        commentId(commentId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param topicId   value of "topic id" parameter. Minimum is 0.
     * @param commentId value of "comment id" parameter. Minimum is 0.
     */
    public BoardRestoreCommentQuery(VkApiClient client, GroupActor actor, int topicId, int commentId) {
        super(client, "board.restoreComment", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        topicId(topicId);
        commentId(commentId);
    }

    /**
     * ID of the community that owns the discussion board.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected BoardRestoreCommentQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Topic ID.
     *
     * @param value value of "topic id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected BoardRestoreCommentQuery topicId(int value) {
        return unsafeParam("topic_id", value);
    }

    /**
     * Comment ID.
     *
     * @param value value of "comment id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected BoardRestoreCommentQuery commentId(int value) {
        return unsafeParam("comment_id", value);
    }

    @Override
    protected BoardRestoreCommentQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "topic_id", "comment_id", "access_token");
    }
}

package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.board.BoardAddTopicQuery;
import com.vk.api.sdk.queries.board.BoardCloseTopicQuery;
import com.vk.api.sdk.queries.board.BoardCreateCommentQuery;
import com.vk.api.sdk.queries.board.BoardDeleteCommentQuery;
import com.vk.api.sdk.queries.board.BoardDeleteTopicQuery;
import com.vk.api.sdk.queries.board.BoardEditCommentQuery;
import com.vk.api.sdk.queries.board.BoardEditTopicQuery;
import com.vk.api.sdk.queries.board.BoardFixTopicQuery;
import com.vk.api.sdk.queries.board.BoardGetCommentsQuery;
import com.vk.api.sdk.queries.board.BoardGetCommentsQueryWithExtended;
import com.vk.api.sdk.queries.board.BoardGetTopicsQuery;
import com.vk.api.sdk.queries.board.BoardGetTopicsQueryWithExtended;
import com.vk.api.sdk.queries.board.BoardOpenTopicQuery;
import com.vk.api.sdk.queries.board.BoardRestoreCommentQuery;
import com.vk.api.sdk.queries.board.BoardUnfixTopicQuery;

/**
 * List of Board methods
 */
public class Board extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Board(VkApiClient client) {
        super(client);
    }

    /**
     * Returns a list of topics on a community's discussion board.
     */
    public BoardGetTopicsQuery getTopics(ServiceActor actor, int groupId) {
        return new BoardGetTopicsQuery(getClient(), actor, groupId);
    }

    /**
     * Returns a list of topics on a community's discussion board.
     */
    public BoardGetTopicsQuery getTopics(UserActor actor, int groupId) {
        return new BoardGetTopicsQuery(getClient(), actor, groupId);
    }

    /**
     * Returns a list of topics on a community's discussion board.
     */
    public BoardGetTopicsQueryWithExtended getTopicsExtended(ServiceActor actor, int groupId) {
        return new BoardGetTopicsQueryWithExtended(getClient(), actor, groupId);
    }

    /**
     * Returns a list of topics on a community's discussion board.
     */
    public BoardGetTopicsQueryWithExtended getTopicsExtended(UserActor actor, int groupId) {
        return new BoardGetTopicsQueryWithExtended(getClient(), actor, groupId);
    }

    /**
     * Returns a list of comments on a topic on a community's discussion board.
     */
    public BoardGetCommentsQuery getComments(ServiceActor actor, int groupId, int topicId) {
        return new BoardGetCommentsQuery(getClient(), actor, groupId, topicId);
    }

    /**
     * Returns a list of comments on a topic on a community's discussion board.
     */
    public BoardGetCommentsQuery getComments(UserActor actor, int groupId, int topicId) {
        return new BoardGetCommentsQuery(getClient(), actor, groupId, topicId);
    }

    /**
     * Returns a list of comments on a topic on a community's discussion board.
     */
    public BoardGetCommentsQueryWithExtended getCommentsExtended(ServiceActor actor, int groupId, int topicId) {
        return new BoardGetCommentsQueryWithExtended(getClient(), actor, groupId, topicId);
    }

    /**
     * Returns a list of comments on a topic on a community's discussion board.
     */
    public BoardGetCommentsQueryWithExtended getCommentsExtended(UserActor actor, int groupId, int topicId) {
        return new BoardGetCommentsQueryWithExtended(getClient(), actor, groupId, topicId);
    }

    /**
     * Creates a new topic on a community's discussion board.
     */
    public BoardAddTopicQuery addTopic(UserActor actor, int groupId, String title) {
        return new BoardAddTopicQuery(getClient(), actor, groupId, title);
    }

    /**
     * Adds a comment on a topic on a community's discussion board.
     */
    public BoardCreateCommentQuery createComment(UserActor actor, int groupId, int topicId) {
        return new BoardCreateCommentQuery(getClient(), actor, groupId, topicId);
    }

    /**
     * Deletes a topic from a community's discussion board.
     */
    public BoardDeleteTopicQuery deleteTopic(UserActor actor, int groupId, int topicId) {
        return new BoardDeleteTopicQuery(getClient(), actor, groupId, topicId);
    }

    /**
     * Edits the title of a topic on a community's discussion board.
     */
    public BoardEditTopicQuery editTopic(UserActor actor, int groupId, int topicId, String title) {
        return new BoardEditTopicQuery(getClient(), actor, groupId, topicId, title);
    }

    /**
     * Edits a comment on a topic on a community's discussion board.
     */
    public BoardEditCommentQuery editComment(UserActor actor, int groupId, int topicId, int commentId) {
        return new BoardEditCommentQuery(getClient(), actor, groupId, topicId, commentId);
    }

    /**
     * Restores a comment deleted from a topic on a community's discussion board.
     */
    public BoardRestoreCommentQuery restoreComment(UserActor actor, int groupId, int topicId, int commentId) {
        return new BoardRestoreCommentQuery(getClient(), actor, groupId, topicId, commentId);
    }

    /**
     * Restores a comment deleted from a topic on a community's discussion board.
     */
    public BoardRestoreCommentQuery restoreComment(GroupActor actor, int topicId, int commentId) {
        return new BoardRestoreCommentQuery(getClient(), actor, topicId, commentId);
    }

    /**
     * Deletes a comment on a topic on a community's discussion board.
     */
    public BoardDeleteCommentQuery deleteComment(UserActor actor, int groupId, int topicId, int commentId) {
        return new BoardDeleteCommentQuery(getClient(), actor, groupId, topicId, commentId);
    }

    /**
     * Deletes a comment on a topic on a community's discussion board.
     */
    public BoardDeleteCommentQuery deleteComment(GroupActor actor, int topicId, int commentId) {
        return new BoardDeleteCommentQuery(getClient(), actor, topicId, commentId);
    }

    /**
     * Re-opens a previously closed topic on a community's discussion board.
     */
    public BoardOpenTopicQuery openTopic(UserActor actor, int groupId, int topicId) {
        return new BoardOpenTopicQuery(getClient(), actor, groupId, topicId);
    }

    /**
     * Closes a topic on a community's discussion board so that comments cannot be posted.
     */
    public BoardCloseTopicQuery closeTopic(UserActor actor, int groupId, int topicId) {
        return new BoardCloseTopicQuery(getClient(), actor, groupId, topicId);
    }

    /**
     * Pins a topic (fixes its place) to the top of a community's discussion board.
     */
    public BoardFixTopicQuery fixTopic(UserActor actor, int groupId, int topicId) {
        return new BoardFixTopicQuery(getClient(), actor, groupId, topicId);
    }

    /**
     * Unpins a pinned topic from the top of a community's discussion board.
     */
    public BoardUnfixTopicQuery unfixTopic(UserActor actor, int groupId, int topicId) {
        return new BoardUnfixTopicQuery(getClient(), actor, groupId, topicId);
    }
}

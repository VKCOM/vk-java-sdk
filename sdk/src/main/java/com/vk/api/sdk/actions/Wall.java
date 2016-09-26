package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.queries.wall.WallCreateCommentQuery;
import com.vk.api.sdk.queries.wall.WallDeleteCommentQuery;
import com.vk.api.sdk.queries.wall.WallDeleteQuery;
import com.vk.api.sdk.queries.wall.WallEditCommentQuery;
import com.vk.api.sdk.queries.wall.WallEditQuery;
import com.vk.api.sdk.queries.wall.WallGetByIdQuery;
import com.vk.api.sdk.queries.wall.WallGetByIdQueryWithExtended;
import com.vk.api.sdk.queries.wall.WallGetCommentsQuery;
import com.vk.api.sdk.queries.wall.WallGetCommentsQueryWithExtended;
import com.vk.api.sdk.queries.wall.WallGetQuery;
import com.vk.api.sdk.queries.wall.WallGetQueryWithExtended;
import com.vk.api.sdk.queries.wall.WallGetRepostsQuery;
import com.vk.api.sdk.queries.wall.WallPinQuery;
import com.vk.api.sdk.queries.wall.WallPostQuery;
import com.vk.api.sdk.queries.wall.WallReportCommentQuery;
import com.vk.api.sdk.queries.wall.WallReportPostQuery;
import com.vk.api.sdk.queries.wall.WallRepostQuery;
import com.vk.api.sdk.queries.wall.WallRestoreCommentQuery;
import com.vk.api.sdk.queries.wall.WallRestoreQuery;
import com.vk.api.sdk.queries.wall.WallSearchQuery;
import com.vk.api.sdk.queries.wall.WallSearchQueryWithExtended;
import com.vk.api.sdk.queries.wall.WallUnpinQuery;

import java.util.List;

/**
 * List of Wall methods
 */
public class Wall extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Wall(VkApiClient client) {
        super(client);
    }

    /**
     * Returns a list of posts on a user wall or community wall.
     */
    public WallGetQuery get() {
        return new WallGetQuery(getClient());
    }

    /**
     * Returns a list of posts on a user wall or community wall.
     */
    public WallGetQuery get(Actor actor) {
        return new WallGetQuery(getClient(), actor);
    }

    /**
     * Returns a list of posts on a user wall or community wall.
     */
    public WallGetQueryWithExtended getExtended() {
        return new WallGetQueryWithExtended(getClient());
    }

    /**
     * Returns a list of posts on a user wall or community wall.
     */
    public WallGetQueryWithExtended getExtended(Actor actor) {
        return new WallGetQueryWithExtended(getClient(), actor);
    }

    /**
     * Allows to search posts on user or community walls.
     */
    public WallSearchQuery search() {
        return new WallSearchQuery(getClient());
    }

    /**
     * Allows to search posts on user or community walls.
     */
    public WallSearchQuery search(Actor actor) {
        return new WallSearchQuery(getClient(), actor);
    }

    /**
     * Allows to search posts on user or community walls.
     */
    public WallSearchQueryWithExtended searchExtended() {
        return new WallSearchQueryWithExtended(getClient());
    }

    /**
     * Allows to search posts on user or community walls.
     */
    public WallSearchQueryWithExtended searchExtended(Actor actor) {
        return new WallSearchQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of posts from user or community walls by their IDs.
     */
    public WallGetByIdQuery getById(String... posts) {
        return new WallGetByIdQuery(getClient(), posts);
    }

    /**
     * Returns a list of posts from user or community walls by their IDs.
     */
    public WallGetByIdQuery getById(List<String> posts) {
        return new WallGetByIdQuery(getClient(), posts);
    }

    /**
     * Returns a list of posts from user or community walls by their IDs.
     */
    public WallGetByIdQuery getById(Actor actor, String... posts) {
        return new WallGetByIdQuery(getClient(), actor, posts);
    }

    /**
     * Returns a list of posts from user or community walls by their IDs.
     */
    public WallGetByIdQuery getById(Actor actor, List<String> posts) {
        return new WallGetByIdQuery(getClient(), actor, posts);
    }

    /**
     * Returns a list of posts from user or community walls by their IDs.
     */
    public WallGetByIdQueryWithExtended getByIdExtended(String... posts) {
        return new WallGetByIdQueryWithExtended(getClient(), posts);
    }

    /**
     * Returns a list of posts from user or community walls by their IDs.
     */
    public WallGetByIdQueryWithExtended getByIdExtended(List<String> posts) {
        return new WallGetByIdQueryWithExtended(getClient(), posts);
    }

    /**
     * Returns a list of posts from user or community walls by their IDs.
     */
    public WallGetByIdQueryWithExtended getByIdExtended(Actor actor, String... posts) {
        return new WallGetByIdQueryWithExtended(getClient(), actor, posts);
    }

    /**
     * Returns a list of posts from user or community walls by their IDs.
     */
    public WallGetByIdQueryWithExtended getByIdExtended(Actor actor, List<String> posts) {
        return new WallGetByIdQueryWithExtended(getClient(), actor, posts);
    }

    /**
     * Adds a new post on a user wall or community wall. Can also be used to publish suggested or scheduled posts.
     */
    public WallPostQuery post(Actor actor) {
        return new WallPostQuery(getClient(), actor);
    }

    /**
     * Reposts (copies) an object to a user wall or community wall.
     */
    public WallRepostQuery repost(Actor actor, String object) {
        return new WallRepostQuery(getClient(), actor, object);
    }

    /**
     * Returns information about reposts of a post on user wall or community wall.
     */
    public WallGetRepostsQuery getReposts() {
        return new WallGetRepostsQuery(getClient());
    }

    /**
     * Returns information about reposts of a post on user wall or community wall.
     */
    public WallGetRepostsQuery getReposts(Actor actor) {
        return new WallGetRepostsQuery(getClient(), actor);
    }

    /**
     * Edits a post on a user wall or community wall.
     */
    public WallEditQuery edit(Actor actor, int postId) {
        return new WallEditQuery(getClient(), actor, postId);
    }

    /**
     * Deletes a post from a user wall or community wall.
     */
    public WallDeleteQuery delete(Actor actor) {
        return new WallDeleteQuery(getClient(), actor);
    }

    /**
     * Restores a post deleted from a user wall or community wall.
     */
    public WallRestoreQuery restore(Actor actor) {
        return new WallRestoreQuery(getClient(), actor);
    }

    /**
     * Pins the post on wall.
     */
    public WallPinQuery pin(Actor actor, int postId) {
        return new WallPinQuery(getClient(), actor, postId);
    }

    /**
     * Unpins the post on wall.
     */
    public WallUnpinQuery unpin(Actor actor, int postId) {
        return new WallUnpinQuery(getClient(), actor, postId);
    }

    /**
     * Returns a list of comments on a post on a user wall or community wall.
     */
    public WallGetCommentsQuery getComments(int postId) {
        return new WallGetCommentsQuery(getClient(), postId);
    }

    /**
     * Returns a list of comments on a post on a user wall or community wall.
     */
    public WallGetCommentsQuery getComments(Actor actor, int postId) {
        return new WallGetCommentsQuery(getClient(), actor, postId);
    }

    /**
     * Returns a list of comments on a post on a user wall or community wall.
     */
    public WallGetCommentsQueryWithExtended getCommentsExtended(int postId) {
        return new WallGetCommentsQueryWithExtended(getClient(), postId);
    }

    /**
     * Returns a list of comments on a post on a user wall or community wall.
     */
    public WallGetCommentsQueryWithExtended getCommentsExtended(Actor actor, int postId) {
        return new WallGetCommentsQueryWithExtended(getClient(), actor, postId);
    }

    /**
     * Adds a comment to a post on a user wall or community wall.
     */
    public WallCreateCommentQuery createComment(Actor actor, int postId) {
        return new WallCreateCommentQuery(getClient(), actor, postId);
    }

    /**
     * Edits a comment on a user wall or community wall.
     */
    public WallEditCommentQuery editComment(Actor actor, int commentId) {
        return new WallEditCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Deletes a comment on a post on a user wall or community wall.
     */
    public WallDeleteCommentQuery deleteComment(Actor actor, int commentId) {
        return new WallDeleteCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Restores a comment deleted from a user wall or community wall.
     */
    public WallRestoreCommentQuery restoreComment(Actor actor, int commentId) {
        return new WallRestoreCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Reports (submits a complaint about) a post on a user wall or community wall.
     */
    public WallReportPostQuery reportPost(Actor actor, int ownerId, int postId) {
        return new WallReportPostQuery(getClient(), actor, ownerId, postId);
    }

    /**
     * Reports (submits a complaint about) a comment on a post on a user wall or community wall.
     */
    public WallReportCommentQuery reportComment(Actor actor, int ownerId, int commentId) {
        return new WallReportCommentQuery(getClient(), actor, ownerId, commentId);
    }
}

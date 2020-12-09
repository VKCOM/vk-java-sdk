package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.wall.WallCheckCopyrightLinkQuery;
import com.vk.api.sdk.queries.wall.WallCloseCommentsQuery;
import com.vk.api.sdk.queries.wall.WallCreateCommentQuery;
import com.vk.api.sdk.queries.wall.WallDeleteCommentQuery;
import com.vk.api.sdk.queries.wall.WallDeleteQuery;
import com.vk.api.sdk.queries.wall.WallEditAdsStealthQuery;
import com.vk.api.sdk.queries.wall.WallEditCommentQuery;
import com.vk.api.sdk.queries.wall.WallEditQuery;
import com.vk.api.sdk.queries.wall.WallGetByIdQueryWithExtended;
import com.vk.api.sdk.queries.wall.WallGetByIdQueryWithLegacy;
import com.vk.api.sdk.queries.wall.WallGetCommentQuery;
import com.vk.api.sdk.queries.wall.WallGetCommentQueryWithExtended;
import com.vk.api.sdk.queries.wall.WallGetCommentsQuery;
import com.vk.api.sdk.queries.wall.WallGetCommentsQueryWithExtended;
import com.vk.api.sdk.queries.wall.WallGetQuery;
import com.vk.api.sdk.queries.wall.WallGetQueryWithExtended;
import com.vk.api.sdk.queries.wall.WallGetRepostsQuery;
import com.vk.api.sdk.queries.wall.WallOpenCommentsQuery;
import com.vk.api.sdk.queries.wall.WallPinQuery;
import com.vk.api.sdk.queries.wall.WallPostAdsStealthQuery;
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
     * @param actor vk actor
     * @param link
     * @return query
     */
    public WallCheckCopyrightLinkQuery checkCopyrightLink(UserActor actor, String link) {
        return new WallCheckCopyrightLinkQuery(getClient(), actor, link);
    }

    /**
     * @param actor vk actor
     * @param ownerId
     * @param postId
     * @return query
     */
    public WallCloseCommentsQuery closeComments(UserActor actor, int ownerId, int postId) {
        return new WallCloseCommentsQuery(getClient(), actor, ownerId, postId);
    }

    /**
     * @param actor vk actor
     * @param ownerId
     * @param postId
     * @return query
     */
    public WallCloseCommentsQuery closeComments(GroupActor actor, int ownerId, int postId) {
        return new WallCloseCommentsQuery(getClient(), actor, ownerId, postId);
    }

    /**
     * Adds a comment to a post on a user wall or community wall.
     *
     * @param actor vk actor
     * @param postId Post ID.
     * @return query
     */
    public WallCreateCommentQuery createComment(UserActor actor, int postId) {
        return new WallCreateCommentQuery(getClient(), actor, postId);
    }

    /**
     * Adds a comment to a post on a user wall or community wall.
     *
     * @param actor vk actor
     * @param postId Post ID.
     * @return query
     */
    public WallCreateCommentQuery createComment(GroupActor actor, int postId) {
        return new WallCreateCommentQuery(getClient(), actor, postId);
    }

    /**
     * Deletes a post from a user wall or community wall.
     *
     * @param actor vk actor
     * @return query
     */
    public WallDeleteQuery delete(UserActor actor) {
        return new WallDeleteQuery(getClient(), actor);
    }

    /**
     * Deletes a comment on a post on a user wall or community wall.
     *
     * @param actor vk actor
     * @param commentId Comment ID.
     * @return query
     */
    public WallDeleteCommentQuery deleteComment(UserActor actor, int commentId) {
        return new WallDeleteCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Edits a post on a user wall or community wall.
     *
     * @param actor vk actor
     * @param postId
     * @return query
     */
    public WallEditQuery edit(UserActor actor, int postId) {
        return new WallEditQuery(getClient(), actor, postId);
    }

    /**
     * Allows to edit hidden post.
     *
     * @param actor vk actor
     * @param postId Post ID. Used for publishing of scheduled and suggested posts.
     * @return query
     */
    public WallEditAdsStealthQuery editAdsStealth(UserActor actor, int postId) {
        return new WallEditAdsStealthQuery(getClient(), actor, postId);
    }

    /**
     * Edits a comment on a user wall or community wall.
     *
     * @param actor vk actor
     * @param commentId Comment ID.
     * @return query
     */
    public WallEditCommentQuery editComment(UserActor actor, int commentId) {
        return new WallEditCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Returns a list of posts on a user wall or community wall.
     *
     * @param actor vk actor
     * @return query
     */
    public WallGetQueryWithExtended getExtended(UserActor actor) {
        return new WallGetQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of posts on a user wall or community wall.
     *
     * @param actor vk actor
     * @return query
     */
    public WallGetQueryWithExtended getExtended(ServiceActor actor) {
        return new WallGetQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of posts on a user wall or community wall.
     *
     * @param actor vk actor
     * @return query
     */
    public WallGetQuery get(UserActor actor) {
        return new WallGetQuery(getClient(), actor);
    }

    /**
     * Returns a list of posts on a user wall or community wall.
     *
     * @param actor vk actor
     * @return query
     */
    public WallGetQuery get(ServiceActor actor) {
        return new WallGetQuery(getClient(), actor);
    }

    /**
     * Returns a list of posts from user or community walls by their IDs.
     *
     * @param actor vk actor
     * @param posts User or community IDs and post IDs, separated by underscores. Use a negative value to designate a community ID. Example: "93388_21539,93388_20904,2943_4276,-1_1"
     * @return query
     */
    public WallGetByIdQueryWithLegacy getByIdLegacy(UserActor actor, String... posts) {
        return new WallGetByIdQueryWithLegacy(getClient(), actor, posts);
    }

    /**
     * Returns a list of posts from user or community walls by their IDs.
     *
     * @param actor vk actor
     * @param posts User or community IDs and post IDs, separated by underscores. Use a negative value to designate a community ID. Example: "93388_21539,93388_20904,2943_4276,-1_1"
     * @return query
     */
    public WallGetByIdQueryWithLegacy getByIdLegacy(UserActor actor, List<String> posts) {
        return new WallGetByIdQueryWithLegacy(getClient(), actor, posts);
    }

    /**
     * Returns a list of posts from user or community walls by their IDs.
     *
     * @param actor vk actor
     * @param posts User or community IDs and post IDs, separated by underscores. Use a negative value to designate a community ID. Example: "93388_21539,93388_20904,2943_4276,-1_1"
     * @return query
     */
    public WallGetByIdQueryWithLegacy getByIdLegacy(ServiceActor actor, String... posts) {
        return new WallGetByIdQueryWithLegacy(getClient(), actor, posts);
    }

    /**
     * Returns a list of posts from user or community walls by their IDs.
     *
     * @param actor vk actor
     * @param posts User or community IDs and post IDs, separated by underscores. Use a negative value to designate a community ID. Example: "93388_21539,93388_20904,2943_4276,-1_1"
     * @return query
     */
    public WallGetByIdQueryWithLegacy getByIdLegacy(ServiceActor actor, List<String> posts) {
        return new WallGetByIdQueryWithLegacy(getClient(), actor, posts);
    }

    /**
     * Returns a list of posts from user or community walls by their IDs.
     *
     * @param actor vk actor
     * @param posts User or community IDs and post IDs, separated by underscores. Use a negative value to designate a community ID. Example: "93388_21539,93388_20904,2943_4276,-1_1"
     * @return query
     */
    public WallGetByIdQueryWithExtended getByIdExtended(UserActor actor, String... posts) {
        return new WallGetByIdQueryWithExtended(getClient(), actor, posts);
    }

    /**
     * Returns a list of posts from user or community walls by their IDs.
     *
     * @param actor vk actor
     * @param posts User or community IDs and post IDs, separated by underscores. Use a negative value to designate a community ID. Example: "93388_21539,93388_20904,2943_4276,-1_1"
     * @return query
     */
    public WallGetByIdQueryWithExtended getByIdExtended(UserActor actor, List<String> posts) {
        return new WallGetByIdQueryWithExtended(getClient(), actor, posts);
    }

    /**
     * Returns a list of posts from user or community walls by their IDs.
     *
     * @param actor vk actor
     * @param posts User or community IDs and post IDs, separated by underscores. Use a negative value to designate a community ID. Example: "93388_21539,93388_20904,2943_4276,-1_1"
     * @return query
     */
    public WallGetByIdQueryWithExtended getByIdExtended(ServiceActor actor, String... posts) {
        return new WallGetByIdQueryWithExtended(getClient(), actor, posts);
    }

    /**
     * Returns a list of posts from user or community walls by their IDs.
     *
     * @param actor vk actor
     * @param posts User or community IDs and post IDs, separated by underscores. Use a negative value to designate a community ID. Example: "93388_21539,93388_20904,2943_4276,-1_1"
     * @return query
     */
    public WallGetByIdQueryWithExtended getByIdExtended(ServiceActor actor, List<String> posts) {
        return new WallGetByIdQueryWithExtended(getClient(), actor, posts);
    }

    /**
     * Returns a comment on a post on a user wall or community wall.
     *
     * @param actor vk actor
     * @param commentId Comment ID.
     * @return query
     */
    public WallGetCommentQueryWithExtended getCommentExtended(UserActor actor, int commentId) {
        return new WallGetCommentQueryWithExtended(getClient(), actor, commentId);
    }

    /**
     * Returns a comment on a post on a user wall or community wall.
     *
     * @param actor vk actor
     * @param commentId Comment ID.
     * @return query
     */
    public WallGetCommentQuery getComment(UserActor actor, int commentId) {
        return new WallGetCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Returns a list of comments on a post on a user wall or community wall.
     *
     * @param actor vk actor
     * @return query
     */
    public WallGetCommentsQueryWithExtended getCommentsExtended(UserActor actor) {
        return new WallGetCommentsQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of comments on a post on a user wall or community wall.
     *
     * @param actor vk actor
     * @return query
     */
    public WallGetCommentsQueryWithExtended getCommentsExtended(ServiceActor actor) {
        return new WallGetCommentsQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of comments on a post on a user wall or community wall.
     *
     * @param actor vk actor
     * @return query
     */
    public WallGetCommentsQuery getComments(UserActor actor) {
        return new WallGetCommentsQuery(getClient(), actor);
    }

    /**
     * Returns a list of comments on a post on a user wall or community wall.
     *
     * @param actor vk actor
     * @return query
     */
    public WallGetCommentsQuery getComments(ServiceActor actor) {
        return new WallGetCommentsQuery(getClient(), actor);
    }

    /**
     * Returns information about reposts of a post on user wall or community wall.
     *
     * @param actor vk actor
     * @return query
     */
    public WallGetRepostsQuery getReposts(UserActor actor) {
        return new WallGetRepostsQuery(getClient(), actor);
    }

    /**
     * Returns information about reposts of a post on user wall or community wall.
     *
     * @param actor vk actor
     * @return query
     */
    public WallGetRepostsQuery getReposts(ServiceActor actor) {
        return new WallGetRepostsQuery(getClient(), actor);
    }

    /**
     * @param actor vk actor
     * @param ownerId
     * @param postId
     * @return query
     */
    public WallOpenCommentsQuery openComments(UserActor actor, int ownerId, int postId) {
        return new WallOpenCommentsQuery(getClient(), actor, ownerId, postId);
    }

    /**
     * @param actor vk actor
     * @param ownerId
     * @param postId
     * @return query
     */
    public WallOpenCommentsQuery openComments(GroupActor actor, int ownerId, int postId) {
        return new WallOpenCommentsQuery(getClient(), actor, ownerId, postId);
    }

    /**
     * Pins the post on wall.
     *
     * @param actor vk actor
     * @param postId Post ID.
     * @return query
     */
    public WallPinQuery pin(UserActor actor, int postId) {
        return new WallPinQuery(getClient(), actor, postId);
    }

    /**
     * Adds a new post on a user wall or community wall. Can also be used to publish suggested or scheduled posts.
     *
     * @param actor vk actor
     * @return query
     */
    public WallPostQuery post(UserActor actor) {
        return new WallPostQuery(getClient(), actor);
    }

    /**
     * Allows to create hidden post which will not be shown on the community's wall and can be used for creating an ad with type "Community post".
     *
     * @param actor vk actor
     * @param ownerId User ID or community ID. Use a negative value to designate a community ID.
     * @return query
     */
    public WallPostAdsStealthQuery postAdsStealth(UserActor actor, int ownerId) {
        return new WallPostAdsStealthQuery(getClient(), actor, ownerId);
    }

    /**
     * Reports (submits a complaint about) a comment on a post on a user wall or community wall.
     *
     * @param actor vk actor
     * @param ownerId ID of the user or community that owns the wall.
     * @param commentId Comment ID.
     * @return query
     */
    public WallReportCommentQuery reportComment(UserActor actor, int ownerId, int commentId) {
        return new WallReportCommentQuery(getClient(), actor, ownerId, commentId);
    }

    /**
     * Reports (submits a complaint about) a post on a user wall or community wall.
     *
     * @param actor vk actor
     * @param ownerId ID of the user or community that owns the wall.
     * @param postId Post ID.
     * @return query
     */
    public WallReportPostQuery reportPost(UserActor actor, int ownerId, int postId) {
        return new WallReportPostQuery(getClient(), actor, ownerId, postId);
    }

    /**
     * Reposts (copies) an object to a user wall or community wall.
     *
     * @param actor vk actor
     * @param object ID of the object to be reposted on the wall. Example: "wall66748_3675"
     * @return query
     */
    public WallRepostQuery repost(UserActor actor, String object) {
        return new WallRepostQuery(getClient(), actor, object);
    }

    /**
     * Restores a post deleted from a user wall or community wall.
     *
     * @param actor vk actor
     * @return query
     */
    public WallRestoreQuery restore(UserActor actor) {
        return new WallRestoreQuery(getClient(), actor);
    }

    /**
     * Restores a comment deleted from a user wall or community wall.
     *
     * @param actor vk actor
     * @param commentId Comment ID.
     * @return query
     */
    public WallRestoreCommentQuery restoreComment(UserActor actor, int commentId) {
        return new WallRestoreCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Allows to search posts on user or community walls.
     *
     * @param actor vk actor
     * @return query
     */
    public WallSearchQuery search(UserActor actor) {
        return new WallSearchQuery(getClient(), actor);
    }

    /**
     * Allows to search posts on user or community walls.
     *
     * @param actor vk actor
     * @return query
     */
    public WallSearchQuery search(ServiceActor actor) {
        return new WallSearchQuery(getClient(), actor);
    }

    /**
     * Allows to search posts on user or community walls.
     *
     * @param actor vk actor
     * @return query
     */
    public WallSearchQueryWithExtended searchExtended(UserActor actor) {
        return new WallSearchQueryWithExtended(getClient(), actor);
    }

    /**
     * Allows to search posts on user or community walls.
     *
     * @param actor vk actor
     * @return query
     */
    public WallSearchQueryWithExtended searchExtended(ServiceActor actor) {
        return new WallSearchQueryWithExtended(getClient(), actor);
    }

    /**
     * Unpins the post on wall.
     *
     * @param actor vk actor
     * @param postId Post ID.
     * @return query
     */
    public WallUnpinQuery unpin(UserActor actor, int postId) {
        return new WallUnpinQuery(getClient(), actor, postId);
    }
}

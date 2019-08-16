package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.video.VideoAddAlbumQuery;
import com.vk.api.sdk.queries.video.VideoAddQuery;
import com.vk.api.sdk.queries.video.VideoAddToAlbumQuery;
import com.vk.api.sdk.queries.video.VideoCreateCommentQuery;
import com.vk.api.sdk.queries.video.VideoDeleteAlbumQuery;
import com.vk.api.sdk.queries.video.VideoDeleteCommentQuery;
import com.vk.api.sdk.queries.video.VideoDeleteQuery;
import com.vk.api.sdk.queries.video.VideoDuplicateQuery;
import com.vk.api.sdk.queries.video.VideoEditAlbumQuery;
import com.vk.api.sdk.queries.video.VideoEditCommentQuery;
import com.vk.api.sdk.queries.video.VideoEditQuery;
import com.vk.api.sdk.queries.video.VideoGetAlbumByIdQuery;
import com.vk.api.sdk.queries.video.VideoGetAlbumsByVideoQuery;
import com.vk.api.sdk.queries.video.VideoGetAlbumsByVideoQueryWithExtended;
import com.vk.api.sdk.queries.video.VideoGetAlbumsQuery;
import com.vk.api.sdk.queries.video.VideoGetAlbumsQueryWithExtended;
import com.vk.api.sdk.queries.video.VideoGetCommentsQuery;
import com.vk.api.sdk.queries.video.VideoGetCommentsQueryWithExtended;
import com.vk.api.sdk.queries.video.VideoGetQuery;
import com.vk.api.sdk.queries.video.VideoGetQueryWithExtended;
import com.vk.api.sdk.queries.video.VideoRemoveFromAlbumQuery;
import com.vk.api.sdk.queries.video.VideoReorderAlbumsQuery;
import com.vk.api.sdk.queries.video.VideoReorderVideosQuery;
import com.vk.api.sdk.queries.video.VideoReportCommentQuery;
import com.vk.api.sdk.queries.video.VideoReportQuery;
import com.vk.api.sdk.queries.video.VideoRestoreCommentQuery;
import com.vk.api.sdk.queries.video.VideoRestoreQuery;
import com.vk.api.sdk.queries.video.VideoSaveQuery;
import com.vk.api.sdk.queries.video.VideoSearchQuery;
import com.vk.api.sdk.queries.video.VideoSearchQueryWithExtended;

/**
 * List of Videos methods
 */
public class Videos extends AbstractAction {
    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Videos(VkApiClient client) {
        super(client);
    }

    /**
     * Adds a video to a user or community page.
     *
     * @param actor vk actor
     * @param videoId Video ID.
     * @param ownerId ID of the user or community that owns the video. Use a negative value to designate a community ID.
     * @return query
     */
    public VideoAddQuery add(UserActor actor, int videoId, int ownerId) {
        return new VideoAddQuery(getClient(), actor, videoId, ownerId);
    }

    /**
     * Creates an empty album for videos.
     *
     * @param actor vk actor
     * @return query
     */
    public VideoAddAlbumQuery addAlbum(UserActor actor) {
        return new VideoAddAlbumQuery(getClient(), actor);
    }

    /**
     * @param actor vk actor
     * @param ownerId
     * @param videoId
     * @return query
     */
    public VideoAddToAlbumQuery addToAlbum(UserActor actor, int ownerId, int videoId) {
        return new VideoAddToAlbumQuery(getClient(), actor, ownerId, videoId);
    }

    /**
     * Adds a new comment on a video.
     *
     * @param actor vk actor
     * @param videoId Video ID.
     * @return query
     */
    public VideoCreateCommentQuery createComment(UserActor actor, int videoId) {
        return new VideoCreateCommentQuery(getClient(), actor, videoId);
    }

    /**
     * Deletes a video from a user or community page.
     *
     * @param actor vk actor
     * @param videoId Video ID.
     * @return query
     */
    public VideoDeleteQuery delete(UserActor actor, int videoId) {
        return new VideoDeleteQuery(getClient(), actor, videoId);
    }

    /**
     * Deletes a video album.
     *
     * @param actor vk actor
     * @param albumId Album ID.
     * @return query
     */
    public VideoDeleteAlbumQuery deleteAlbum(UserActor actor, int albumId) {
        return new VideoDeleteAlbumQuery(getClient(), actor, albumId);
    }

    /**
     * Deletes a comment on a video.
     *
     * @param actor vk actor
     * @param commentId ID of the comment to be deleted.
     * @return query
     */
    public VideoDeleteCommentQuery deleteComment(UserActor actor, int commentId) {
        return new VideoDeleteCommentQuery(getClient(), actor, commentId);
    }

    /**
     * @param actor vk actor
     * @param ownerId
     * @param videoId
     * @param md5sum
     * @param size
     * @return query
     */
    public VideoDuplicateQuery duplicate(UserActor actor, int ownerId, int videoId, String md5sum,
            int size) {
        return new VideoDuplicateQuery(getClient(), actor, ownerId, videoId, md5sum, size);
    }

    /**
     * Edits information about a video on a user or community page.
     *
     * @param actor vk actor
     * @param videoId Video ID.
     * @return query
     */
    public VideoEditQuery edit(UserActor actor, int videoId) {
        return new VideoEditQuery(getClient(), actor, videoId);
    }

    /**
     * Edits the title of a video album.
     *
     * @param actor vk actor
     * @param albumId Album ID.
     * @param title New album title.
     * @return query
     */
    public VideoEditAlbumQuery editAlbum(UserActor actor, int albumId, String title) {
        return new VideoEditAlbumQuery(getClient(), actor, albumId, title);
    }

    /**
     * Edits the text of a comment on a video.
     *
     * @param actor vk actor
     * @param commentId Comment ID.
     * @return query
     */
    public VideoEditCommentQuery editComment(UserActor actor, int commentId) {
        return new VideoEditCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Returns detailed information about videos.
     *
     * @param actor vk actor
     * @return query
     */
    public VideoGetQueryWithExtended getExtended(UserActor actor) {
        return new VideoGetQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns detailed information about videos.
     *
     * @param actor vk actor
     * @return query
     */
    public VideoGetQuery get(UserActor actor) {
        return new VideoGetQuery(getClient(), actor);
    }

    /**
     * Returns video album info
     *
     * @param actor vk actor
     * @param albumId Album ID.
     * @return query
     */
    public VideoGetAlbumByIdQuery getAlbumById(UserActor actor, int albumId) {
        return new VideoGetAlbumByIdQuery(getClient(), actor, albumId);
    }

    /**
     * Returns a list of video albums owned by a user or community.
     *
     * @param actor vk actor
     * @return query
     */
    public VideoGetAlbumsQueryWithExtended getAlbumsExtended(UserActor actor) {
        return new VideoGetAlbumsQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of video albums owned by a user or community.
     *
     * @param actor vk actor
     * @return query
     */
    public VideoGetAlbumsQuery getAlbums(UserActor actor) {
        return new VideoGetAlbumsQuery(getClient(), actor);
    }

    /**
     * @param actor vk actor
     * @param ownerId
     * @param videoId
     * @return query
     */
    public VideoGetAlbumsByVideoQueryWithExtended getAlbumsByVideoExtended(UserActor actor,
            int ownerId, int videoId) {
        return new VideoGetAlbumsByVideoQueryWithExtended(getClient(), actor, ownerId, videoId);
    }

    /**
     * @param actor vk actor
     * @param ownerId
     * @param videoId
     * @return query
     */
    public VideoGetAlbumsByVideoQuery getAlbumsByVideo(UserActor actor, int ownerId, int videoId) {
        return new VideoGetAlbumsByVideoQuery(getClient(), actor, ownerId, videoId);
    }

    /**
     * Returns a list of comments on a video.
     *
     * @param actor vk actor
     * @param videoId Video ID.
     * @return query
     */
    public VideoGetCommentsQueryWithExtended getCommentsExtended(UserActor actor, int videoId) {
        return new VideoGetCommentsQueryWithExtended(getClient(), actor, videoId);
    }

    /**
     * Returns a list of comments on a video.
     *
     * @param actor vk actor
     * @param videoId Video ID.
     * @return query
     */
    public VideoGetCommentsQuery getComments(UserActor actor, int videoId) {
        return new VideoGetCommentsQuery(getClient(), actor, videoId);
    }

    /**
     * @param actor vk actor
     * @param ownerId
     * @param videoId
     * @return query
     */
    public VideoRemoveFromAlbumQuery removeFromAlbum(UserActor actor, int ownerId, int videoId) {
        return new VideoRemoveFromAlbumQuery(getClient(), actor, ownerId, videoId);
    }

    /**
     * Reorders the album in the list of user video albums.
     *
     * @param actor vk actor
     * @param albumId Album ID.
     * @return query
     */
    public VideoReorderAlbumsQuery reorderAlbums(UserActor actor, int albumId) {
        return new VideoReorderAlbumsQuery(getClient(), actor, albumId);
    }

    /**
     * Reorders the video in the video album.
     *
     * @param actor vk actor
     * @param ownerId ID of the user or community that owns the video.
     * @param videoId ID of the video.
     * @return query
     */
    public VideoReorderVideosQuery reorderVideos(UserActor actor, int ownerId, int videoId) {
        return new VideoReorderVideosQuery(getClient(), actor, ownerId, videoId);
    }

    /**
     * Reports (submits a complaint about) a video.
     *
     * @param actor vk actor
     * @param ownerId ID of the user or community that owns the video.
     * @param videoId Video ID.
     * @return query
     */
    public VideoReportQuery report(UserActor actor, int ownerId, int videoId) {
        return new VideoReportQuery(getClient(), actor, ownerId, videoId);
    }

    /**
     * Reports (submits a complaint about) a comment on a video.
     *
     * @param actor vk actor
     * @param ownerId ID of the user or community that owns the video.
     * @param commentId ID of the comment being reported.
     * @return query
     */
    public VideoReportCommentQuery reportComment(UserActor actor, int ownerId, int commentId) {
        return new VideoReportCommentQuery(getClient(), actor, ownerId, commentId);
    }

    /**
     * Restores a previously deleted video.
     *
     * @param actor vk actor
     * @param videoId Video ID.
     * @return query
     */
    public VideoRestoreQuery restore(UserActor actor, int videoId) {
        return new VideoRestoreQuery(getClient(), actor, videoId);
    }

    /**
     * Restores a previously deleted comment on a video.
     *
     * @param actor vk actor
     * @param commentId ID of the deleted comment.
     * @return query
     */
    public VideoRestoreCommentQuery restoreComment(UserActor actor, int commentId) {
        return new VideoRestoreCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Returns a server address (required for upload) and video data.
     *
     * @param actor vk actor
     * @return query
     */
    public VideoSaveQuery save(UserActor actor) {
        return new VideoSaveQuery(getClient(), actor);
    }

    /**
     * Returns a list of videos under the set search criterion.
     *
     * @param actor vk actor
     * @param q Search query string (e.g., 'The Beatles').
     * @return query
     */
    public VideoSearchQueryWithExtended searchExtended(UserActor actor, String q) {
        return new VideoSearchQueryWithExtended(getClient(), actor, q);
    }

    /**
     * Returns a list of videos under the set search criterion.
     *
     * @param actor vk actor
     * @param q Search query string (e.g., 'The Beatles').
     * @return query
     */
    public VideoSearchQuery search(UserActor actor, String q) {
        return new VideoSearchQuery(getClient(), actor, q);
    }
}

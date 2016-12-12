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
import com.vk.api.sdk.queries.video.VideoEditAlbumQuery;
import com.vk.api.sdk.queries.video.VideoEditCommentQuery;
import com.vk.api.sdk.queries.video.VideoEditQuery;
import com.vk.api.sdk.queries.video.VideoGetAlbumByIdQuery;
import com.vk.api.sdk.queries.video.VideoGetAlbumsByVideoQuery;
import com.vk.api.sdk.queries.video.VideoGetAlbumsQuery;
import com.vk.api.sdk.queries.video.VideoGetAlbumsQueryWithExtended;
import com.vk.api.sdk.queries.video.VideoGetCatalogQuery;
import com.vk.api.sdk.queries.video.VideoGetCatalogQueryWithExtended;
import com.vk.api.sdk.queries.video.VideoGetCatalogSectionQuery;
import com.vk.api.sdk.queries.video.VideoGetCatalogSectionQueryWithExtended;
import com.vk.api.sdk.queries.video.VideoGetCommentsQuery;
import com.vk.api.sdk.queries.video.VideoGetCommentsQueryWithExtended;
import com.vk.api.sdk.queries.video.VideoGetNewTagsQuery;
import com.vk.api.sdk.queries.video.VideoGetQuery;
import com.vk.api.sdk.queries.video.VideoGetQueryWithExtended;
import com.vk.api.sdk.queries.video.VideoGetTagsQuery;
import com.vk.api.sdk.queries.video.VideoGetUserVideosQuery;
import com.vk.api.sdk.queries.video.VideoGetUserVideosQueryWithExtended;
import com.vk.api.sdk.queries.video.VideoHideCatalogSectionQuery;
import com.vk.api.sdk.queries.video.VideoPutTagQuery;
import com.vk.api.sdk.queries.video.VideoRemoveFromAlbumQuery;
import com.vk.api.sdk.queries.video.VideoRemoveTagQuery;
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
     * Returns detailed information about videos.
     */
    public VideoGetQuery get(UserActor actor) {
        return new VideoGetQuery(getClient(), actor);
    }

    /**
     * Returns detailed information about videos.
     */
    public VideoGetQueryWithExtended getExtended(UserActor actor) {
        return new VideoGetQueryWithExtended(getClient(), actor);
    }

    /**
     * Edits information about a video on a user or community page.
     */
    public VideoEditQuery edit(UserActor actor, int videoId) {
        return new VideoEditQuery(getClient(), actor, videoId);
    }

    /**
     * Adds a video to a user or community page.
     */
    public VideoAddQuery add(UserActor actor, int videoId, int ownerId) {
        return new VideoAddQuery(getClient(), actor, videoId, ownerId);
    }

    /**
     * Returns a server address (required for upload) and video data.
     */
    public VideoSaveQuery save(UserActor actor) {
        return new VideoSaveQuery(getClient(), actor);
    }

    /**
     * Deletes a video from a user or community page.
     */
    public VideoDeleteQuery delete(UserActor actor, int videoId) {
        return new VideoDeleteQuery(getClient(), actor, videoId);
    }

    /**
     * Restores a previously deleted video.
     */
    public VideoRestoreQuery restore(UserActor actor, int videoId) {
        return new VideoRestoreQuery(getClient(), actor, videoId);
    }

    /**
     * Returns a list of videos under the set search criterion.
     */
    public VideoSearchQuery search(UserActor actor, String q) {
        return new VideoSearchQuery(getClient(), actor, q);
    }

    /**
     * Returns a list of videos under the set search criterion.
     */
    public VideoSearchQueryWithExtended searchExtended(UserActor actor, String q) {
        return new VideoSearchQueryWithExtended(getClient(), actor, q);
    }

    /**
     * Returns list of videos in which the user is tagged.
     */
    public VideoGetUserVideosQuery getUserVideos(UserActor actor) {
        return new VideoGetUserVideosQuery(getClient(), actor);
    }

    /**
     * Returns list of videos in which the user is tagged.
     */
    public VideoGetUserVideosQueryWithExtended getUserVideosExtended(UserActor actor) {
        return new VideoGetUserVideosQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of video albums owned by a user or community.
     */
    public VideoGetAlbumsQuery getAlbums(UserActor actor) {
        return new VideoGetAlbumsQuery(getClient(), actor);
    }

    /**
     * Returns a list of video albums owned by a user or community.
     */
    public VideoGetAlbumsQueryWithExtended getAlbumsExtended(UserActor actor) {
        return new VideoGetAlbumsQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns video album info
     */
    public VideoGetAlbumByIdQuery getAlbumById(UserActor actor, int albumId) {
        return new VideoGetAlbumByIdQuery(getClient(), actor, albumId);
    }

    /**
     * Creates an empty album for videos.
     */
    public VideoAddAlbumQuery addAlbum(UserActor actor) {
        return new VideoAddAlbumQuery(getClient(), actor);
    }

    /**
     * Edits the title of a video album.
     */
    public VideoEditAlbumQuery editAlbum(UserActor actor, int albumId, String title) {
        return new VideoEditAlbumQuery(getClient(), actor, albumId, title);
    }

    /**
     * Deletes a video album.
     */
    public VideoDeleteAlbumQuery deleteAlbum(UserActor actor, int albumId) {
        return new VideoDeleteAlbumQuery(getClient(), actor, albumId);
    }

    /**
     * Reorders the album in the list of user video albums.
     */
    public VideoReorderAlbumsQuery reorderAlbums(UserActor actor, int albumId) {
        return new VideoReorderAlbumsQuery(getClient(), actor, albumId);
    }

    /**
     * Reorders the video in the video album.
     */
    public VideoReorderVideosQuery reorderVideos(UserActor actor, int ownerId, int videoId) {
        return new VideoReorderVideosQuery(getClient(), actor, ownerId, videoId);
    }

    public VideoAddToAlbumQuery addToAlbum(UserActor actor, int ownerId, int videoId) {
        return new VideoAddToAlbumQuery(getClient(), actor, ownerId, videoId);
    }

    public VideoRemoveFromAlbumQuery removeFromAlbum(UserActor actor, int ownerId, int videoId) {
        return new VideoRemoveFromAlbumQuery(getClient(), actor, ownerId, videoId);
    }

    public VideoGetAlbumsByVideoQuery getAlbumsByVideo(UserActor actor, int ownerId, int videoId) {
        return new VideoGetAlbumsByVideoQuery(getClient(), actor, ownerId, videoId);
    }

    /**
     * Returns a list of comments on a video.
     */
    public VideoGetCommentsQuery getComments(UserActor actor, int videoId) {
        return new VideoGetCommentsQuery(getClient(), actor, videoId);
    }

    /**
     * Returns a list of comments on a video.
     */
    public VideoGetCommentsQueryWithExtended getCommentsExtended(UserActor actor, int videoId) {
        return new VideoGetCommentsQueryWithExtended(getClient(), actor, videoId);
    }

    /**
     * Adds a new comment on a video.
     */
    public VideoCreateCommentQuery createComment(UserActor actor, int videoId) {
        return new VideoCreateCommentQuery(getClient(), actor, videoId);
    }

    /**
     * Deletes a comment on a video.
     */
    public VideoDeleteCommentQuery deleteComment(UserActor actor, int commentId) {
        return new VideoDeleteCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Restores a previously deleted comment on a video.
     */
    public VideoRestoreCommentQuery restoreComment(UserActor actor, int commentId) {
        return new VideoRestoreCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Edits the text of a comment on a video.
     */
    public VideoEditCommentQuery editComment(UserActor actor, int commentId) {
        return new VideoEditCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Returns a list of tags on a video.
     */
    public VideoGetTagsQuery getTags(UserActor actor, int videoId) {
        return new VideoGetTagsQuery(getClient(), actor, videoId);
    }

    /**
     * Adds a tag on a video.
     */
    public VideoPutTagQuery putTag(UserActor actor, int userId, int videoId) {
        return new VideoPutTagQuery(getClient(), actor, userId, videoId);
    }

    /**
     * Removes a tag from a video.
     */
    public VideoRemoveTagQuery removeTag(UserActor actor, int tagId, int videoId) {
        return new VideoRemoveTagQuery(getClient(), actor, tagId, videoId);
    }

    /**
     * Returns a list of videos with tags that have not been viewed.
     */
    public VideoGetNewTagsQuery getNewTags(UserActor actor) {
        return new VideoGetNewTagsQuery(getClient(), actor);
    }

    /**
     * Reports (submits a complaint about) a video.
     */
    public VideoReportQuery report(UserActor actor, int ownerId, int videoId) {
        return new VideoReportQuery(getClient(), actor, ownerId, videoId);
    }

    /**
     * Reports (submits a complaint about) a comment on a video.
     */
    public VideoReportCommentQuery reportComment(UserActor actor, int ownerId, int commentId) {
        return new VideoReportCommentQuery(getClient(), actor, ownerId, commentId);
    }

    /**
     * Returns video catalog
     */
    public VideoGetCatalogQuery getCatalog() {
        return new VideoGetCatalogQuery(getClient());
    }

    /**
     * Returns video catalog
     */
    public VideoGetCatalogQueryWithExtended getCatalogExtended() {
        return new VideoGetCatalogQueryWithExtended(getClient());
    }

    /**
     * Returns video catalog
     */
    public VideoGetCatalogQuery getCatalog(UserActor actor) {
        return new VideoGetCatalogQuery(getClient(), actor);
    }

    /**
     * Returns video catalog
     */
    public VideoGetCatalogQueryWithExtended getCatalogExtended(UserActor actor) {
        return new VideoGetCatalogQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a separate catalog section
     */
    public VideoGetCatalogSectionQuery getCatalogSection(String sectionId, String from) {
        return new VideoGetCatalogSectionQuery(getClient(), sectionId, from);
    }

    /**
     * Returns a separate catalog section
     */
    public VideoGetCatalogSectionQueryWithExtended getCatalogSectionExtended(String sectionId, String from) {
        return new VideoGetCatalogSectionQueryWithExtended(getClient(), sectionId, from);
    }

    /**
     * Returns a separate catalog section
     */
    public VideoGetCatalogSectionQuery getCatalogSection(UserActor actor, String sectionId, String from) {
        return new VideoGetCatalogSectionQuery(getClient(), actor, sectionId, from);
    }

    /**
     * Returns a separate catalog section
     */
    public VideoGetCatalogSectionQueryWithExtended getCatalogSectionExtended(UserActor actor, String sectionId, String from) {
        return new VideoGetCatalogSectionQueryWithExtended(getClient(), actor, sectionId, from);
    }

    /**
     * Hides a video catalog section from a user.
     */
    public VideoHideCatalogSectionQuery hideCatalogSection(UserActor actor, int sectionId) {
        return new VideoHideCatalogSectionQuery(getClient(), actor, sectionId);
    }
}

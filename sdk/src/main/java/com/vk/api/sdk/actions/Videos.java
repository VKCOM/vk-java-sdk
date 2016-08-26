package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
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
import com.vk.api.sdk.queries.video.VideoGetCatalogSectionQuery;
import com.vk.api.sdk.queries.video.VideoGetCommentsQuery;
import com.vk.api.sdk.queries.video.VideoGetCommentsQueryWithExtended;
import com.vk.api.sdk.queries.video.VideoGetNewTagsQuery;
import com.vk.api.sdk.queries.video.VideoGetQuery;
import com.vk.api.sdk.queries.video.VideoGetQueryWithExtended;
import com.vk.api.sdk.queries.video.VideoGetTagsQuery;
import com.vk.api.sdk.queries.video.VideoGetUserVideosQuery;
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
    public Videos(VkApiClient client) {
        super(client);
    }

    /**
     * Returns detailed information about videos.
     */
    public VideoGetQuery get(Actor actor) {
        return new VideoGetQuery(getClient(), actor);
    }

    /**
     * Returns detailed information about videos.
     */
    public VideoGetQueryWithExtended getExtended(Actor actor) {
        return new VideoGetQueryWithExtended(getClient(), actor);
    }

    /**
     * Edits information about a video on a user or community page.
     */
    public VideoEditQuery edit(Actor actor, int videoId) {
        return new VideoEditQuery(getClient(), actor, videoId);
    }

    /**
     * Adds a video to a user or community page.
     */
    public VideoAddQuery add(Actor actor, int videoId, int ownerId) {
        return new VideoAddQuery(getClient(), actor, videoId, ownerId);
    }

    /**
     * Returns a server address (required for upload) and video data.
     */
    public VideoSaveQuery save(Actor actor) {
        return new VideoSaveQuery(getClient(), actor);
    }

    /**
     * Deletes a video from a user or community page.
     */
    public VideoDeleteQuery delete(Actor actor, int videoId) {
        return new VideoDeleteQuery(getClient(), actor, videoId);
    }

    /**
     * Restores a previously deleted video.
     */
    public VideoRestoreQuery restore(Actor actor, int videoId) {
        return new VideoRestoreQuery(getClient(), actor, videoId);
    }

    /**
     * Returns a list of videos under the set search criterion.
     */
    public VideoSearchQuery search(Actor actor, String q) {
        return new VideoSearchQuery(getClient(), actor, q);
    }

    /**
     * Returns a list of videos under the set search criterion.
     */
    public VideoSearchQueryWithExtended searchExtended(Actor actor, String q) {
        return new VideoSearchQueryWithExtended(getClient(), actor, q);
    }

    /**
     * Returns list of videos in which the user is tagged.
     */
    public VideoGetUserVideosQuery getUserVideos(Actor actor) {
        return new VideoGetUserVideosQuery(getClient(), actor);
    }

    /**
     * Returns a list of video albums owned by a user or community.
     */
    public VideoGetAlbumsQuery getAlbums(Actor actor) {
        return new VideoGetAlbumsQuery(getClient(), actor);
    }

    /**
     * Returns a list of video albums owned by a user or community.
     */
    public VideoGetAlbumsQueryWithExtended getAlbumsExtended(Actor actor) {
        return new VideoGetAlbumsQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns video album info
     */
    public VideoGetAlbumByIdQuery getAlbumById(Actor actor, int albumId) {
        return new VideoGetAlbumByIdQuery(getClient(), actor, albumId);
    }

    /**
     * Creates an empty album for videos.
     */
    public VideoAddAlbumQuery addAlbum(Actor actor) {
        return new VideoAddAlbumQuery(getClient(), actor);
    }

    /**
     * Edits the title of a video album.
     */
    public VideoEditAlbumQuery editAlbum(Actor actor, int albumId, String title) {
        return new VideoEditAlbumQuery(getClient(), actor, albumId, title);
    }

    /**
     * Deletes a video album.
     */
    public VideoDeleteAlbumQuery deleteAlbum(Actor actor, int albumId) {
        return new VideoDeleteAlbumQuery(getClient(), actor, albumId);
    }

    /**
     * Reorders the album in the list of user video albums.
     */
    public VideoReorderAlbumsQuery reorderAlbums(Actor actor, int albumId) {
        return new VideoReorderAlbumsQuery(getClient(), actor, albumId);
    }

    /**
     * Reorders the video in the video album.
     */
    public VideoReorderVideosQuery reorderVideos(Actor actor, int ownerId, int videoId) {
        return new VideoReorderVideosQuery(getClient(), actor, ownerId, videoId);
    }

    public VideoAddToAlbumQuery addToAlbum(Actor actor, int ownerId, int videoId) {
        return new VideoAddToAlbumQuery(getClient(), actor, ownerId, videoId);
    }

    public VideoRemoveFromAlbumQuery removeFromAlbum(Actor actor, int ownerId, int videoId) {
        return new VideoRemoveFromAlbumQuery(getClient(), actor, ownerId, videoId);
    }

    public VideoGetAlbumsByVideoQuery getAlbumsByVideo(Actor actor, int ownerId, int videoId) {
        return new VideoGetAlbumsByVideoQuery(getClient(), actor, ownerId, videoId);
    }

    /**
     * Returns a list of comments on a video.
     */
    public VideoGetCommentsQuery getComments(Actor actor, int videoId) {
        return new VideoGetCommentsQuery(getClient(), actor, videoId);
    }

    /**
     * Returns a list of comments on a video.
     */
    public VideoGetCommentsQueryWithExtended getCommentsExtended(Actor actor, int videoId) {
        return new VideoGetCommentsQueryWithExtended(getClient(), actor, videoId);
    }

    /**
     * Adds a new comment on a video.
     */
    public VideoCreateCommentQuery createComment(Actor actor, int videoId) {
        return new VideoCreateCommentQuery(getClient(), actor, videoId);
    }

    /**
     * Deletes a comment on a video.
     */
    public VideoDeleteCommentQuery deleteComment(Actor actor, int commentId) {
        return new VideoDeleteCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Restores a previously deleted comment on a video.
     */
    public VideoRestoreCommentQuery restoreComment(Actor actor, int commentId) {
        return new VideoRestoreCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Edits the text of a comment on a video.
     */
    public VideoEditCommentQuery editComment(Actor actor, int commentId) {
        return new VideoEditCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Returns a list of tags on a video.
     */
    public VideoGetTagsQuery getTags(Actor actor, int videoId) {
        return new VideoGetTagsQuery(getClient(), actor, videoId);
    }

    /**
     * Adds a tag on a video.
     */
    public VideoPutTagQuery putTag(Actor actor, int userId, int videoId) {
        return new VideoPutTagQuery(getClient(), actor, userId, videoId);
    }

    /**
     * Removes a tag from a video.
     */
    public VideoRemoveTagQuery removeTag(Actor actor, int tagId, int videoId) {
        return new VideoRemoveTagQuery(getClient(), actor, tagId, videoId);
    }

    /**
     * Returns a list of videos with tags that have not been viewed.
     */
    public VideoGetNewTagsQuery getNewTags(Actor actor) {
        return new VideoGetNewTagsQuery(getClient(), actor);
    }

    /**
     * Reports (submits a complaint about) a video.
     */
    public VideoReportQuery report(Actor actor, int ownerId, int videoId) {
        return new VideoReportQuery(getClient(), actor, ownerId, videoId);
    }

    /**
     * Reports (submits a complaint about) a comment on a video.
     */
    public VideoReportCommentQuery reportComment(Actor actor, int ownerId, int commentId) {
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
    public VideoGetCatalogQuery getCatalog(Actor actor) {
        return new VideoGetCatalogQuery(getClient(), actor);
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
    public VideoGetCatalogSectionQuery getCatalogSection(Actor actor, String sectionId, String from) {
        return new VideoGetCatalogSectionQuery(getClient(), actor, sectionId, from);
    }

    /**
     * Hides a video catalog section from a user.
     */
    public VideoHideCatalogSectionQuery hideCatalogSection(Actor actor, int sectionId) {
        return new VideoHideCatalogSectionQuery(getClient(), actor, sectionId);
    }
}

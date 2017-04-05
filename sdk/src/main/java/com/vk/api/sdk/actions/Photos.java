package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.photos.PhotosConfirmTagQuery;
import com.vk.api.sdk.queries.photos.PhotosCopyQuery;
import com.vk.api.sdk.queries.photos.PhotosCreateAlbumQuery;
import com.vk.api.sdk.queries.photos.PhotosCreateCommentQuery;
import com.vk.api.sdk.queries.photos.PhotosDeleteAlbumQuery;
import com.vk.api.sdk.queries.photos.PhotosDeleteCommentQuery;
import com.vk.api.sdk.queries.photos.PhotosDeleteQuery;
import com.vk.api.sdk.queries.photos.PhotosEditAlbumQuery;
import com.vk.api.sdk.queries.photos.PhotosEditCommentQuery;
import com.vk.api.sdk.queries.photos.PhotosEditQuery;
import com.vk.api.sdk.queries.photos.PhotosGetAlbumsCountQuery;
import com.vk.api.sdk.queries.photos.PhotosGetAlbumsQuery;
import com.vk.api.sdk.queries.photos.PhotosGetAllCommentsQuery;
import com.vk.api.sdk.queries.photos.PhotosGetAllQuery;
import com.vk.api.sdk.queries.photos.PhotosGetAllQueryWithExtended;
import com.vk.api.sdk.queries.photos.PhotosGetByIdQuery;
import com.vk.api.sdk.queries.photos.PhotosGetByIdQueryWithExtended;
import com.vk.api.sdk.queries.photos.PhotosGetChatUploadServerQuery;
import com.vk.api.sdk.queries.photos.PhotosGetCommentsQuery;
import com.vk.api.sdk.queries.photos.PhotosGetCommentsQueryWithExtended;
import com.vk.api.sdk.queries.photos.PhotosGetMarketAlbumUploadServerQuery;
import com.vk.api.sdk.queries.photos.PhotosGetMarketUploadServerQuery;
import com.vk.api.sdk.queries.photos.PhotosGetMessagesUploadServerQuery;
import com.vk.api.sdk.queries.photos.PhotosGetNewTagsQuery;
import com.vk.api.sdk.queries.photos.PhotosGetOwnerCoverPhotoUploadServerQuery;
import com.vk.api.sdk.queries.photos.PhotosGetOwnerPhotoUploadServerQuery;
import com.vk.api.sdk.queries.photos.PhotosGetQuery;
import com.vk.api.sdk.queries.photos.PhotosGetQueryWithExtended;
import com.vk.api.sdk.queries.photos.PhotosGetTagsQuery;
import com.vk.api.sdk.queries.photos.PhotosGetUploadServerQuery;
import com.vk.api.sdk.queries.photos.PhotosGetUserPhotosQuery;
import com.vk.api.sdk.queries.photos.PhotosGetWallUploadServerQuery;
import com.vk.api.sdk.queries.photos.PhotosMakeCoverQuery;
import com.vk.api.sdk.queries.photos.PhotosMoveQuery;
import com.vk.api.sdk.queries.photos.PhotosPutTagQuery;
import com.vk.api.sdk.queries.photos.PhotosRemoveTagQuery;
import com.vk.api.sdk.queries.photos.PhotosReorderAlbumsQuery;
import com.vk.api.sdk.queries.photos.PhotosReorderPhotosQuery;
import com.vk.api.sdk.queries.photos.PhotosReportCommentQuery;
import com.vk.api.sdk.queries.photos.PhotosReportQuery;
import com.vk.api.sdk.queries.photos.PhotosRestoreCommentQuery;
import com.vk.api.sdk.queries.photos.PhotosRestoreQuery;
import com.vk.api.sdk.queries.photos.PhotosSaveMarketAlbumPhotoQuery;
import com.vk.api.sdk.queries.photos.PhotosSaveMarketPhotoQuery;
import com.vk.api.sdk.queries.photos.PhotosSaveMessagesPhotoQuery;
import com.vk.api.sdk.queries.photos.PhotosSaveOwnerCoverPhotoQuery;
import com.vk.api.sdk.queries.photos.PhotosSaveOwnerPhotoQuery;
import com.vk.api.sdk.queries.photos.PhotosSaveQuery;
import com.vk.api.sdk.queries.photos.PhotosSaveWallPhotoQuery;
import com.vk.api.sdk.queries.photos.PhotosSearchQuery;

import java.util.List;

/**
 * List of Photos methods
 */
public class Photos extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Photos(VkApiClient client) {
        super(client);
    }

    /**
     * Creates an empty photo album.
     */
    public PhotosCreateAlbumQuery createAlbum(UserActor actor, String title) {
        return new PhotosCreateAlbumQuery(getClient(), actor, title);
    }

    /**
     * Edits information about a photo album.
     */
    public PhotosEditAlbumQuery editAlbum(UserActor actor, int albumId) {
        return new PhotosEditAlbumQuery(getClient(), actor, albumId);
    }

    /**
     * Returns a list of a user's or community's photo albums.
     */
    public PhotosGetAlbumsQuery getAlbums(ServiceActor actor) {
        return new PhotosGetAlbumsQuery(getClient(), actor);
    }

    /**
     * Returns a list of a user's or community's photo albums.
     */
    public PhotosGetAlbumsQuery getAlbums(UserActor actor) {
        return new PhotosGetAlbumsQuery(getClient(), actor);
    }

    /**
     * Returns a list of a user's or community's photos.
     */
    public PhotosGetQuery get(ServiceActor actor) {
        return new PhotosGetQuery(getClient(), actor);
    }

    /**
     * Returns a list of a user's or community's photos.
     */
    public PhotosGetQuery get(UserActor actor) {
        return new PhotosGetQuery(getClient(), actor);
    }

    /**
     * Returns a list of a user's or community's photos.
     */
    public PhotosGetQueryWithExtended getExtended(ServiceActor actor) {
        return new PhotosGetQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of a user's or community's photos.
     */
    public PhotosGetQueryWithExtended getExtended(UserActor actor) {
        return new PhotosGetQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns the number of photo albums belonging to a user or community.
     */
    public PhotosGetAlbumsCountQuery getAlbumsCount(UserActor actor) {
        return new PhotosGetAlbumsCountQuery(getClient(), actor);
    }

    /**
     * Returns information about photos by their IDs.
     */
    public PhotosGetByIdQuery getById(ServiceActor actor, String... photos) {
        return new PhotosGetByIdQuery(getClient(), actor, photos);
    }

    /**
     * Returns information about photos by their IDs.
     */
    public PhotosGetByIdQuery getById(ServiceActor actor, List<String> photos) {
        return new PhotosGetByIdQuery(getClient(), actor, photos);
    }

    /**
     * Returns information about photos by their IDs.
     */
    public PhotosGetByIdQuery getById(UserActor actor, String... photos) {
        return new PhotosGetByIdQuery(getClient(), actor, photos);
    }

    /**
     * Returns information about photos by their IDs.
     */
    public PhotosGetByIdQuery getById(UserActor actor, List<String> photos) {
        return new PhotosGetByIdQuery(getClient(), actor, photos);
    }

    /**
     * Returns information about photos by their IDs.
     */
    public PhotosGetByIdQueryWithExtended getByIdExtended(ServiceActor actor, String... photos) {
        return new PhotosGetByIdQueryWithExtended(getClient(), actor, photos);
    }

    /**
     * Returns information about photos by their IDs.
     */
    public PhotosGetByIdQueryWithExtended getByIdExtended(ServiceActor actor, List<String> photos) {
        return new PhotosGetByIdQueryWithExtended(getClient(), actor, photos);
    }

    /**
     * Returns information about photos by their IDs.
     */
    public PhotosGetByIdQueryWithExtended getByIdExtended(UserActor actor, String... photos) {
        return new PhotosGetByIdQueryWithExtended(getClient(), actor, photos);
    }

    /**
     * Returns information about photos by their IDs.
     */
    public PhotosGetByIdQueryWithExtended getByIdExtended(UserActor actor, List<String> photos) {
        return new PhotosGetByIdQueryWithExtended(getClient(), actor, photos);
    }

    /**
     * Returns the server address for photo upload.
     */
    public PhotosGetUploadServerQuery getUploadServer(UserActor actor) {
        return new PhotosGetUploadServerQuery(getClient(), actor);
    }

    /**
     * Returns an upload server address for a profile or community photo.
     */
    public PhotosGetOwnerPhotoUploadServerQuery getOwnerPhotoUploadServer(UserActor actor) {
        return new PhotosGetOwnerPhotoUploadServerQuery(getClient(), actor);
    }

    /**
     * Returns an upload link for chat cover pictures.
     */
    public PhotosGetChatUploadServerQuery getChatUploadServer(UserActor actor, int chatId) {
        return new PhotosGetChatUploadServerQuery(getClient(), actor, chatId);
    }

    /**
     * Returns the server address for market photo upload.
     */
    public PhotosGetMarketUploadServerQuery getMarketUploadServer(UserActor actor, int groupId) {
        return new PhotosGetMarketUploadServerQuery(getClient(), actor, groupId);
    }

    /**
     * Returns the server address for market album photo upload.
     */
    public PhotosGetMarketAlbumUploadServerQuery getMarketAlbumUploadServer(UserActor actor, int groupId) {
        return new PhotosGetMarketAlbumUploadServerQuery(getClient(), actor, groupId);
    }

    /**
     * Saves market photos after successful uploading.
     */
    public PhotosSaveMarketPhotoQuery saveMarketPhoto(UserActor actor, String photo, int server, String hash) {
        return new PhotosSaveMarketPhotoQuery(getClient(), actor, photo, server, hash);
    }

    /**
     * Saves market album photos after successful uploading.
     */
    public PhotosSaveMarketAlbumPhotoQuery saveMarketAlbumPhoto(UserActor actor, int groupId, String photo,
                                                                int server, String hash) {
        return new PhotosSaveMarketAlbumPhotoQuery(getClient(), actor, groupId, photo, server, hash);
    }

    /**
     * Saves a profile or community photo.
     */
    public PhotosSaveOwnerPhotoQuery saveOwnerPhoto(UserActor actor) {
        return new PhotosSaveOwnerPhotoQuery(getClient(), actor);
    }

    /**
     * Saves a photo to a user's or community's wall after being uploaded.
     */
    public PhotosSaveWallPhotoQuery saveWallPhoto(UserActor actor, String photo) {
        return new PhotosSaveWallPhotoQuery(getClient(), actor, photo);
    }

    /**
     * Returns the server address for photo upload onto a user's wall.
     */
    public PhotosGetWallUploadServerQuery getWallUploadServer(UserActor actor) {
        return new PhotosGetWallUploadServerQuery(getClient(), actor);
    }

    /**
     * Returns the server address for photo upload in a private message for a user.
     */
    public PhotosGetMessagesUploadServerQuery getMessagesUploadServer(UserActor actor) {
        return new PhotosGetMessagesUploadServerQuery(getClient(), actor);
    }

    /**
     * Returns the server address for photo upload in a private message for a user.
     */
    public PhotosGetMessagesUploadServerQuery getMessagesUploadServer(GroupActor actor) {
        return new PhotosGetMessagesUploadServerQuery(getClient(), actor);
    }

    /**
     * Returns the server address for owner cover upload.
     */
    public PhotosGetOwnerCoverPhotoUploadServerQuery getOwnerCoverPhotoUploadServer(UserActor actor, Integer groupId) {
        return new PhotosGetOwnerCoverPhotoUploadServerQuery(getClient(), actor, groupId);
    }

    /**
     * Returns the server address for owner cover upload.
     */
    public PhotosGetOwnerCoverPhotoUploadServerQuery getOwnerCoverPhotoUploadServer(GroupActor actor) {
        return new PhotosGetOwnerCoverPhotoUploadServerQuery(getClient(), actor);
    }

    /**
     * Saves cover photo after successful uploading. URL obtained with photos.getOwnerCoverPhotoUploadServer method.
     */
    public PhotosSaveOwnerCoverPhotoQuery saveOwnerCoverPhoto(UserActor actor, String photo, String hash) {
        return new PhotosSaveOwnerCoverPhotoQuery(getClient(), actor, photo, hash);
    }

    /**
     * Saves cover photo after successful uploading. URL obtained with photos.getOwnerCoverPhotoUploadServer method.
     */
    public PhotosSaveOwnerCoverPhotoQuery saveOwnerCoverPhoto(GroupActor actor, String photo, String hash) {
        return new PhotosSaveOwnerCoverPhotoQuery(getClient(), actor, photo, hash);
    }

    /**
     * Saves a photo after being successfully uploaded. URL obtained with photos.getMessagesUploadServer method.
     */
    public PhotosSaveMessagesPhotoQuery saveMessagesPhoto(UserActor actor, String photo) {
        return new PhotosSaveMessagesPhotoQuery(getClient(), actor, photo);
    }

    /**
     * Saves a photo after being successfully uploaded. URL obtained with photos.getMessagesUploadServer method.
     */
    public PhotosSaveMessagesPhotoQuery saveMessagesPhoto(GroupActor actor, String photo) {
        return new PhotosSaveMessagesPhotoQuery(getClient(), actor, photo);
    }


    /**
     * Reports (submits a complaint about) a photo.
     */
    public PhotosReportQuery report(UserActor actor, int ownerId, int photoId) {
        return new PhotosReportQuery(getClient(), actor, ownerId, photoId);
    }

    /**
     * Reports (submits a complaint about) a comment on a photo.
     */
    public PhotosReportCommentQuery reportComment(UserActor actor, int ownerId, int commentId) {
        return new PhotosReportCommentQuery(getClient(), actor, ownerId, commentId);
    }

    /**
     * Returns a list of photos.
     */
    public PhotosSearchQuery search(ServiceActor actor) {
        return new PhotosSearchQuery(getClient(), actor);
    }

    /**
     * Returns a list of photos.
     */
    public PhotosSearchQuery search(UserActor actor) {
        return new PhotosSearchQuery(getClient(), actor);
    }

    /**
     * Saves photos after successful uploading.
     */
    public PhotosSaveQuery save(UserActor actor) {
        return new PhotosSaveQuery(getClient(), actor);
    }

    /**
     * Allows to copy a photo to the "Saved photos" album
     */
    public PhotosCopyQuery copy(UserActor actor, int ownerId, int photoId) {
        return new PhotosCopyQuery(getClient(), actor, ownerId, photoId);
    }

    /**
     * Edits the caption of a photo.
     */
    public PhotosEditQuery edit(UserActor actor, int photoId) {
        return new PhotosEditQuery(getClient(), actor, photoId);
    }

    /**
     * Moves a photo from one album to another.
     */
    public PhotosMoveQuery move(UserActor actor, int targetAlbumId, int photoId) {
        return new PhotosMoveQuery(getClient(), actor, targetAlbumId, photoId);
    }

    /**
     * Makes a photo into an album cover.
     */
    public PhotosMakeCoverQuery makeCover(UserActor actor, int photoId) {
        return new PhotosMakeCoverQuery(getClient(), actor, photoId);
    }

    /**
     * Reorders the album in the list of user albums.
     */
    public PhotosReorderAlbumsQuery reorderAlbums(UserActor actor, int albumId) {
        return new PhotosReorderAlbumsQuery(getClient(), actor, albumId);
    }

    /**
     * Reorders the photo in the list of photos of the user album.
     */
    public PhotosReorderPhotosQuery reorderPhotos(UserActor actor, int photoId) {
        return new PhotosReorderPhotosQuery(getClient(), actor, photoId);
    }

    /**
     * Returns a list of photos belonging to a user or community, in reverse chronological order.
     */
    public PhotosGetAllQuery getAll(UserActor actor) {
        return new PhotosGetAllQuery(getClient(), actor);
    }

    /**
     * Returns a list of photos belonging to a user or community, in reverse chronological order.
     */
    public PhotosGetAllQueryWithExtended getAllExtended(UserActor actor) {
        return new PhotosGetAllQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of photos in which a user is tagged.
     */
    public PhotosGetUserPhotosQuery getUserPhotos(UserActor actor) {
        return new PhotosGetUserPhotosQuery(getClient(), actor);
    }

    /**
     * Deletes a photo album belonging to the current user.
     */
    public PhotosDeleteAlbumQuery deleteAlbum(UserActor actor, int albumId) {
        return new PhotosDeleteAlbumQuery(getClient(), actor, albumId);
    }

    /**
     * Deletes a photo.
     */
    public PhotosDeleteQuery delete(UserActor actor, int photoId) {
        return new PhotosDeleteQuery(getClient(), actor, photoId);
    }

    /**
     * Restores a deleted photo.
     */
    public PhotosRestoreQuery restore(UserActor actor, int photoId) {
        return new PhotosRestoreQuery(getClient(), actor, photoId);
    }

    /**
     * Confirms a tag on a photo.
     */
    public PhotosConfirmTagQuery confirmTag(UserActor actor, String photoId, int tagId) {
        return new PhotosConfirmTagQuery(getClient(), actor, photoId, tagId);
    }

    /**
     * Returns a list of comments on a photo.
     */
    public PhotosGetCommentsQuery getComments(UserActor actor, int photoId) {
        return new PhotosGetCommentsQuery(getClient(), actor, photoId);
    }

    /**
     * Returns a list of comments on a photo.
     */
    public PhotosGetCommentsQueryWithExtended getCommentsExtended(UserActor actor, int photoId) {
        return new PhotosGetCommentsQueryWithExtended(getClient(), actor, photoId);
    }

    /**
     * Returns a list of comments on a specific photo album or all albums of the user sorted in reverse chronological order.
     */
    public PhotosGetAllCommentsQuery getAllComments(UserActor actor) {
        return new PhotosGetAllCommentsQuery(getClient(), actor);
    }

    /**
     * Adds a new comment on the photo.
     */
    public PhotosCreateCommentQuery createComment(UserActor actor, int photoId) {
        return new PhotosCreateCommentQuery(getClient(), actor, photoId);
    }

    /**
     * Deletes a comment on the photo.
     */
    public PhotosDeleteCommentQuery deleteComment(UserActor actor, int commentId) {
        return new PhotosDeleteCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Restores a deleted comment on a photo.
     */
    public PhotosRestoreCommentQuery restoreComment(UserActor actor, int commentId) {
        return new PhotosRestoreCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Edits a comment on a photo.
     */
    public PhotosEditCommentQuery editComment(UserActor actor, int commentId) {
        return new PhotosEditCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Returns a list of tags on a photo.
     */
    public PhotosGetTagsQuery getTags(UserActor actor, int photoId) {
        return new PhotosGetTagsQuery(getClient(), actor, photoId);
    }

    /**
     * Adds a tag on the photo.
     */
    public PhotosPutTagQuery putTag(UserActor actor, int photoId, int userId) {
        return new PhotosPutTagQuery(getClient(), actor, photoId, userId);
    }

    /**
     * Removes a tag from a photo.
     */
    public PhotosRemoveTagQuery removeTag(UserActor actor, int photoId, int tagId) {
        return new PhotosRemoveTagQuery(getClient(), actor, photoId, tagId);
    }

    /**
     * Returns a list of photos with tags that have not been viewed.
     */
    public PhotosGetNewTagsQuery getNewTags(UserActor actor) {
        return new PhotosGetNewTagsQuery(getClient(), actor);
    }
}

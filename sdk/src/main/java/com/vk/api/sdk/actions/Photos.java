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
import com.vk.api.sdk.queries.photos.PhotosGetUserPhotosQueryWithExtended;
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
     * Confirms a tag on a photo.
     *
     * @param actor vk actor
     * @param photoId Photo ID.
     * @param tagId Tag ID.
     * @return query
     */
    public PhotosConfirmTagQuery confirmTag(UserActor actor, String photoId, int tagId) {
        return new PhotosConfirmTagQuery(getClient(), actor, photoId, tagId);
    }

    /**
     * Allows to copy a photo to the "Saved photos" album
     *
     * @param actor vk actor
     * @param ownerId photo's owner ID
     * @param photoId photo ID
     * @return query
     */
    public PhotosCopyQuery copy(UserActor actor, int ownerId, int photoId) {
        return new PhotosCopyQuery(getClient(), actor, ownerId, photoId);
    }

    /**
     * Creates an empty photo album.
     *
     * @param actor vk actor
     * @param title Album title.
     * @return query
     */
    public PhotosCreateAlbumQuery createAlbum(UserActor actor, String title) {
        return new PhotosCreateAlbumQuery(getClient(), actor, title);
    }

    /**
     * Adds a new comment on the photo.
     *
     * @param actor vk actor
     * @param photoId Photo ID.
     * @return query
     */
    public PhotosCreateCommentQuery createComment(UserActor actor, int photoId) {
        return new PhotosCreateCommentQuery(getClient(), actor, photoId);
    }

    /**
     * Deletes a photo.
     *
     * @param actor vk actor
     * @param photoId Photo ID.
     * @return query
     */
    public PhotosDeleteQuery delete(UserActor actor, int photoId) {
        return new PhotosDeleteQuery(getClient(), actor, photoId);
    }

    /**
     * Deletes a photo album belonging to the current user.
     *
     * @param actor vk actor
     * @param albumId Album ID.
     * @return query
     */
    public PhotosDeleteAlbumQuery deleteAlbum(UserActor actor, int albumId) {
        return new PhotosDeleteAlbumQuery(getClient(), actor, albumId);
    }

    /**
     * Deletes a comment on the photo.
     *
     * @param actor vk actor
     * @param commentId Comment ID.
     * @return query
     */
    public PhotosDeleteCommentQuery deleteComment(UserActor actor, int commentId) {
        return new PhotosDeleteCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Edits the caption of a photo.
     *
     * @param actor vk actor
     * @param photoId Photo ID.
     * @return query
     */
    public PhotosEditQuery edit(UserActor actor, int photoId) {
        return new PhotosEditQuery(getClient(), actor, photoId);
    }

    /**
     * Edits information about a photo album.
     *
     * @param actor vk actor
     * @param albumId ID of the photo album to be edited.
     * @return query
     */
    public PhotosEditAlbumQuery editAlbum(UserActor actor, int albumId) {
        return new PhotosEditAlbumQuery(getClient(), actor, albumId);
    }

    /**
     * Edits a comment on a photo.
     *
     * @param actor vk actor
     * @param commentId Comment ID.
     * @return query
     */
    public PhotosEditCommentQuery editComment(UserActor actor, int commentId) {
        return new PhotosEditCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Returns a list of a user's or community's photos.
     *
     * @param actor vk actor
     * @return query
     */
    public PhotosGetQuery get(UserActor actor) {
        return new PhotosGetQuery(getClient(), actor);
    }

    /**
     * Returns a list of a user's or community's photos.
     *
     * @param actor vk actor
     * @return query
     */
    public PhotosGetQuery get(ServiceActor actor) {
        return new PhotosGetQuery(getClient(), actor);
    }

    /**
     * Returns a list of a user's or community's photos.
     *
     * @param actor vk actor
     * @return query
     */
    public PhotosGetQueryWithExtended getExtended(UserActor actor) {
        return new PhotosGetQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of a user's or community's photos.
     *
     * @param actor vk actor
     * @return query
     */
    public PhotosGetQueryWithExtended getExtended(ServiceActor actor) {
        return new PhotosGetQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of a user's or community's photo albums.
     *
     * @param actor vk actor
     * @return query
     */
    public PhotosGetAlbumsQuery getAlbums(UserActor actor) {
        return new PhotosGetAlbumsQuery(getClient(), actor);
    }

    /**
     * Returns a list of a user's or community's photo albums.
     *
     * @param actor vk actor
     * @return query
     */
    public PhotosGetAlbumsQuery getAlbums(ServiceActor actor) {
        return new PhotosGetAlbumsQuery(getClient(), actor);
    }

    /**
     * Returns the number of photo albums belonging to a user or community.
     *
     * @param actor vk actor
     * @return query
     */
    public PhotosGetAlbumsCountQuery getAlbumsCount(UserActor actor) {
        return new PhotosGetAlbumsCountQuery(getClient(), actor);
    }

    /**
     * Returns a list of photos belonging to a user or community, in reverse chronological order.
     *
     * @param actor vk actor
     * @return query
     */
    public PhotosGetAllQueryWithExtended getAllExtended(UserActor actor) {
        return new PhotosGetAllQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of photos belonging to a user or community, in reverse chronological order.
     *
     * @param actor vk actor
     * @return query
     */
    public PhotosGetAllQuery getAll(UserActor actor) {
        return new PhotosGetAllQuery(getClient(), actor);
    }

    /**
     * Returns a list of comments on a specific photo album or all albums of the user sorted in reverse chronological order.
     *
     * @param actor vk actor
     * @return query
     */
    public PhotosGetAllCommentsQuery getAllComments(UserActor actor) {
        return new PhotosGetAllCommentsQuery(getClient(), actor);
    }

    /**
     * Returns information about photos by their IDs.
     *
     * @param actor vk actor
     * @param photos IDs separated with a comma, that are IDs of users who posted photos and IDs of photos themselves with an underscore character between such IDs. To get information about a photo in the group album, you shall specify group ID instead of user ID. Example: "1_129207899,6492_135055734, , -20629724_271945303"
     * @return query
     */
    public PhotosGetByIdQuery getById(UserActor actor, String... photos) {
        return new PhotosGetByIdQuery(getClient(), actor, photos);
    }

    /**
     * Returns information about photos by their IDs.
     *
     * @param actor vk actor
     * @param photos IDs separated with a comma, that are IDs of users who posted photos and IDs of photos themselves with an underscore character between such IDs. To get information about a photo in the group album, you shall specify group ID instead of user ID. Example: "1_129207899,6492_135055734, , -20629724_271945303"
     * @return query
     */
    public PhotosGetByIdQuery getById(UserActor actor, List<String> photos) {
        return new PhotosGetByIdQuery(getClient(), actor, photos);
    }

    /**
     * Returns information about photos by their IDs.
     *
     * @param actor vk actor
     * @param photos IDs separated with a comma, that are IDs of users who posted photos and IDs of photos themselves with an underscore character between such IDs. To get information about a photo in the group album, you shall specify group ID instead of user ID. Example: "1_129207899,6492_135055734, , -20629724_271945303"
     * @return query
     */
    public PhotosGetByIdQuery getById(ServiceActor actor, String... photos) {
        return new PhotosGetByIdQuery(getClient(), actor, photos);
    }

    /**
     * Returns information about photos by their IDs.
     *
     * @param actor vk actor
     * @param photos IDs separated with a comma, that are IDs of users who posted photos and IDs of photos themselves with an underscore character between such IDs. To get information about a photo in the group album, you shall specify group ID instead of user ID. Example: "1_129207899,6492_135055734, , -20629724_271945303"
     * @return query
     */
    public PhotosGetByIdQuery getById(ServiceActor actor, List<String> photos) {
        return new PhotosGetByIdQuery(getClient(), actor, photos);
    }

    /**
     * Returns information about photos by their IDs.
     *
     * @param actor vk actor
     * @param photos IDs separated with a comma, that are IDs of users who posted photos and IDs of photos themselves with an underscore character between such IDs. To get information about a photo in the group album, you shall specify group ID instead of user ID. Example: "1_129207899,6492_135055734, , -20629724_271945303"
     * @return query
     */
    public PhotosGetByIdQueryWithExtended getByIdExtended(UserActor actor, String... photos) {
        return new PhotosGetByIdQueryWithExtended(getClient(), actor, photos);
    }

    /**
     * Returns information about photos by their IDs.
     *
     * @param actor vk actor
     * @param photos IDs separated with a comma, that are IDs of users who posted photos and IDs of photos themselves with an underscore character between such IDs. To get information about a photo in the group album, you shall specify group ID instead of user ID. Example: "1_129207899,6492_135055734, , -20629724_271945303"
     * @return query
     */
    public PhotosGetByIdQueryWithExtended getByIdExtended(UserActor actor, List<String> photos) {
        return new PhotosGetByIdQueryWithExtended(getClient(), actor, photos);
    }

    /**
     * Returns information about photos by their IDs.
     *
     * @param actor vk actor
     * @param photos IDs separated with a comma, that are IDs of users who posted photos and IDs of photos themselves with an underscore character between such IDs. To get information about a photo in the group album, you shall specify group ID instead of user ID. Example: "1_129207899,6492_135055734, , -20629724_271945303"
     * @return query
     */
    public PhotosGetByIdQueryWithExtended getByIdExtended(ServiceActor actor, String... photos) {
        return new PhotosGetByIdQueryWithExtended(getClient(), actor, photos);
    }

    /**
     * Returns information about photos by their IDs.
     *
     * @param actor vk actor
     * @param photos IDs separated with a comma, that are IDs of users who posted photos and IDs of photos themselves with an underscore character between such IDs. To get information about a photo in the group album, you shall specify group ID instead of user ID. Example: "1_129207899,6492_135055734, , -20629724_271945303"
     * @return query
     */
    public PhotosGetByIdQueryWithExtended getByIdExtended(ServiceActor actor, List<String> photos) {
        return new PhotosGetByIdQueryWithExtended(getClient(), actor, photos);
    }

    /**
     * Returns an upload link for chat cover pictures.
     *
     * @param actor vk actor
     * @param chatId ID of the chat for which you want to upload a cover photo.
     * @return query
     */
    public PhotosGetChatUploadServerQuery getChatUploadServer(UserActor actor, int chatId) {
        return new PhotosGetChatUploadServerQuery(getClient(), actor, chatId);
    }

    /**
     * Returns an upload link for chat cover pictures.
     *
     * @param actor vk actor
     * @param chatId ID of the chat for which you want to upload a cover photo.
     * @return query
     */
    public PhotosGetChatUploadServerQuery getChatUploadServer(GroupActor actor, int chatId) {
        return new PhotosGetChatUploadServerQuery(getClient(), actor, chatId);
    }

    /**
     * Returns a list of comments on a photo.
     *
     * @param actor vk actor
     * @param photoId Photo ID.
     * @return query
     */
    public PhotosGetCommentsQuery getComments(UserActor actor, int photoId) {
        return new PhotosGetCommentsQuery(getClient(), actor, photoId);
    }

    /**
     * Returns a list of comments on a photo.
     *
     * @param actor vk actor
     * @param photoId Photo ID.
     * @return query
     */
    public PhotosGetCommentsQueryWithExtended getCommentsExtended(UserActor actor, int photoId) {
        return new PhotosGetCommentsQueryWithExtended(getClient(), actor, photoId);
    }

    /**
     * Returns the server address for market album photo upload.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @return query
     */
    public PhotosGetMarketAlbumUploadServerQuery getMarketAlbumUploadServer(UserActor actor,
            int groupId) {
        return new PhotosGetMarketAlbumUploadServerQuery(getClient(), actor, groupId);
    }

    /**
     * Returns the server address for market photo upload.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @return query
     */
    public PhotosGetMarketUploadServerQuery getMarketUploadServer(UserActor actor, int groupId) {
        return new PhotosGetMarketUploadServerQuery(getClient(), actor, groupId);
    }

    /**
     * Returns the server address for photo upload in a private message for a user.
     *
     * @param actor vk actor
     * @return query
     */
    public PhotosGetMessagesUploadServerQuery getMessagesUploadServer(UserActor actor) {
        return new PhotosGetMessagesUploadServerQuery(getClient(), actor);
    }

    /**
     * Returns the server address for photo upload in a private message for a user.
     *
     * @param actor vk actor
     * @return query
     */
    public PhotosGetMessagesUploadServerQuery getMessagesUploadServer(GroupActor actor) {
        return new PhotosGetMessagesUploadServerQuery(getClient(), actor);
    }

    /**
     * Returns a list of photos with tags that have not been viewed.
     *
     * @param actor vk actor
     * @return query
     */
    public PhotosGetNewTagsQuery getNewTags(UserActor actor) {
        return new PhotosGetNewTagsQuery(getClient(), actor);
    }

    /**
     * Returns the server address for owner cover upload.
     *
     * @param actor vk actor
     * @param groupId ID of community that owns the album (if the photo will be uploaded to a community album).
     * @return query
     */
    public PhotosGetOwnerCoverPhotoUploadServerQuery getOwnerCoverPhotoUploadServer(UserActor actor,
            int groupId) {
        return new PhotosGetOwnerCoverPhotoUploadServerQuery(getClient(), actor, groupId);
    }

    /**
     * Returns the server address for owner cover upload.
     *
     * @param actor vk actor
     * @param groupId ID of community that owns the album (if the photo will be uploaded to a community album).
     * @return query
     */
    public PhotosGetOwnerCoverPhotoUploadServerQuery getOwnerCoverPhotoUploadServer(
            GroupActor actor, int groupId) {
        return new PhotosGetOwnerCoverPhotoUploadServerQuery(getClient(), actor, groupId);
    }

    /**
     * Returns an upload server address for a profile or community photo.
     *
     * @param actor vk actor
     * @return query
     */
    public PhotosGetOwnerPhotoUploadServerQuery getOwnerPhotoUploadServer(UserActor actor) {
        return new PhotosGetOwnerPhotoUploadServerQuery(getClient(), actor);
    }

    /**
     * Returns a list of tags on a photo.
     *
     * @param actor vk actor
     * @param photoId Photo ID.
     * @return query
     */
    public PhotosGetTagsQuery getTags(UserActor actor, int photoId) {
        return new PhotosGetTagsQuery(getClient(), actor, photoId);
    }

    /**
     * Returns the server address for photo upload.
     *
     * @param actor vk actor
     * @return query
     */
    public PhotosGetUploadServerQuery getUploadServer(UserActor actor) {
        return new PhotosGetUploadServerQuery(getClient(), actor);
    }

    /**
     * Returns a list of photos in which a user is tagged.
     *
     * @param actor vk actor
     * @return query
     */
    public PhotosGetUserPhotosQueryWithExtended getUserPhotosExtended(UserActor actor) {
        return new PhotosGetUserPhotosQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of photos in which a user is tagged.
     *
     * @param actor vk actor
     * @return query
     */
    public PhotosGetUserPhotosQuery getUserPhotos(UserActor actor) {
        return new PhotosGetUserPhotosQuery(getClient(), actor);
    }

    /**
     * Returns the server address for photo upload onto a user's wall.
     *
     * @param actor vk actor
     * @return query
     */
    public PhotosGetWallUploadServerQuery getWallUploadServer(UserActor actor) {
        return new PhotosGetWallUploadServerQuery(getClient(), actor);
    }

    /**
     * Makes a photo into an album cover.
     *
     * @param actor vk actor
     * @param photoId Photo ID.
     * @return query
     */
    public PhotosMakeCoverQuery makeCover(UserActor actor, int photoId) {
        return new PhotosMakeCoverQuery(getClient(), actor, photoId);
    }

    /**
     * Moves a photo from one album to another.
     *
     * @param actor vk actor
     * @param targetAlbumId ID of the album to which the photo will be moved.
     * @param photoId Photo ID.
     * @return query
     */
    public PhotosMoveQuery move(UserActor actor, int targetAlbumId, int photoId) {
        return new PhotosMoveQuery(getClient(), actor, targetAlbumId, photoId);
    }

    /**
     * Adds a tag on the photo.
     *
     * @param actor vk actor
     * @param photoId Photo ID.
     * @param userId ID of the user to be tagged.
     * @return query
     */
    public PhotosPutTagQuery putTag(UserActor actor, int photoId, int userId) {
        return new PhotosPutTagQuery(getClient(), actor, photoId, userId);
    }

    /**
     * Removes a tag from a photo.
     *
     * @param actor vk actor
     * @param photoId Photo ID.
     * @param tagId Tag ID.
     * @return query
     */
    public PhotosRemoveTagQuery removeTag(UserActor actor, int photoId, int tagId) {
        return new PhotosRemoveTagQuery(getClient(), actor, photoId, tagId);
    }

    /**
     * Reorders the album in the list of user albums.
     *
     * @param actor vk actor
     * @param albumId Album ID.
     * @return query
     */
    public PhotosReorderAlbumsQuery reorderAlbums(UserActor actor, int albumId) {
        return new PhotosReorderAlbumsQuery(getClient(), actor, albumId);
    }

    /**
     * Reorders the photo in the list of photos of the user album.
     *
     * @param actor vk actor
     * @param photoId Photo ID.
     * @return query
     */
    public PhotosReorderPhotosQuery reorderPhotos(UserActor actor, int photoId) {
        return new PhotosReorderPhotosQuery(getClient(), actor, photoId);
    }

    /**
     * Reports (submits a complaint about) a photo.
     *
     * @param actor vk actor
     * @param ownerId ID of the user or community that owns the photo.
     * @param photoId Photo ID.
     * @return query
     */
    public PhotosReportQuery report(UserActor actor, int ownerId, int photoId) {
        return new PhotosReportQuery(getClient(), actor, ownerId, photoId);
    }

    /**
     * Reports (submits a complaint about) a comment on a photo.
     *
     * @param actor vk actor
     * @param ownerId ID of the user or community that owns the photo.
     * @param commentId ID of the comment being reported.
     * @return query
     */
    public PhotosReportCommentQuery reportComment(UserActor actor, int ownerId, int commentId) {
        return new PhotosReportCommentQuery(getClient(), actor, ownerId, commentId);
    }

    /**
     * Restores a deleted photo.
     *
     * @param actor vk actor
     * @param photoId Photo ID.
     * @return query
     */
    public PhotosRestoreQuery restore(UserActor actor, int photoId) {
        return new PhotosRestoreQuery(getClient(), actor, photoId);
    }

    /**
     * Restores a deleted comment on a photo.
     *
     * @param actor vk actor
     * @param commentId ID of the deleted comment.
     * @return query
     */
    public PhotosRestoreCommentQuery restoreComment(UserActor actor, int commentId) {
        return new PhotosRestoreCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Saves photos after successful uploading.
     *
     * @param actor vk actor
     * @return query
     */
    public PhotosSaveQuery save(UserActor actor) {
        return new PhotosSaveQuery(getClient(), actor);
    }

    /**
     * Saves market album photos after successful uploading.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @param photo Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
     * @param server Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
     * @param hash Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
     * @return query
     */
    public PhotosSaveMarketAlbumPhotoQuery saveMarketAlbumPhoto(UserActor actor, int groupId,
            String photo, int server, String hash) {
        return new PhotosSaveMarketAlbumPhotoQuery(getClient(), actor, groupId, photo, server, hash);
    }

    /**
     * Saves market photos after successful uploading.
     *
     * @param actor vk actor
     * @param photo Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
     * @param server Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
     * @param hash Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
     * @return query
     */
    public PhotosSaveMarketPhotoQuery saveMarketPhoto(UserActor actor, String photo, int server,
            String hash) {
        return new PhotosSaveMarketPhotoQuery(getClient(), actor, photo, server, hash);
    }

    /**
     * Saves a photo after being successfully uploaded. URL obtained with [vk.com/dev/photos.getMessagesUploadServer|photos.getMessagesUploadServer] method.
     *
     * @param actor vk actor
     * @param photo Parameter returned when the photo is [vk.com/dev/upload_files|uploaded to the server].
     * @return query
     */
    public PhotosSaveMessagesPhotoQuery saveMessagesPhoto(UserActor actor, String photo) {
        return new PhotosSaveMessagesPhotoQuery(getClient(), actor, photo);
    }

    /**
     * Saves a photo after being successfully uploaded. URL obtained with [vk.com/dev/photos.getMessagesUploadServer|photos.getMessagesUploadServer] method.
     *
     * @param actor vk actor
     * @param photo Parameter returned when the photo is [vk.com/dev/upload_files|uploaded to the server].
     * @return query
     */
    public PhotosSaveMessagesPhotoQuery saveMessagesPhoto(GroupActor actor, String photo) {
        return new PhotosSaveMessagesPhotoQuery(getClient(), actor, photo);
    }

    /**
     * Saves cover photo after successful uploading.
     *
     * @param actor vk actor
     * @param hash Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
     * @param photo Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
     * @return query
     */
    public PhotosSaveOwnerCoverPhotoQuery saveOwnerCoverPhoto(UserActor actor, String hash,
            String photo) {
        return new PhotosSaveOwnerCoverPhotoQuery(getClient(), actor, hash, photo);
    }

    /**
     * Saves cover photo after successful uploading.
     *
     * @param actor vk actor
     * @param hash Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
     * @param photo Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
     * @return query
     */
    public PhotosSaveOwnerCoverPhotoQuery saveOwnerCoverPhoto(GroupActor actor, String hash,
            String photo) {
        return new PhotosSaveOwnerCoverPhotoQuery(getClient(), actor, hash, photo);
    }

    /**
     * Saves a profile or community photo. Upload URL can be got with the [vk.com/dev/photos.getOwnerPhotoUploadServer|photos.getOwnerPhotoUploadServer] method.
     *
     * @param actor vk actor
     * @return query
     */
    public PhotosSaveOwnerPhotoQuery saveOwnerPhoto(UserActor actor) {
        return new PhotosSaveOwnerPhotoQuery(getClient(), actor);
    }

    /**
     * Saves a photo to a user's or community's wall after being uploaded.
     *
     * @param actor vk actor
     * @param photo Parameter returned when the the photo is [vk.com/dev/upload_files|uploaded to the server].
     * @return query
     */
    public PhotosSaveWallPhotoQuery saveWallPhoto(UserActor actor, String photo) {
        return new PhotosSaveWallPhotoQuery(getClient(), actor, photo);
    }

    /**
     * Returns a list of photos.
     *
     * @param actor vk actor
     * @return query
     */
    public PhotosSearchQuery search(UserActor actor) {
        return new PhotosSearchQuery(getClient(), actor);
    }

    /**
     * Returns a list of photos.
     *
     * @param actor vk actor
     * @return query
     */
    public PhotosSearchQuery search(ServiceActor actor) {
        return new PhotosSearchQuery(getClient(), actor);
    }
}

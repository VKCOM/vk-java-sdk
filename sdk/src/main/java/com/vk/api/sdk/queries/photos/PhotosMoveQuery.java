package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.move method
 */
public class PhotosMoveQuery extends AbstractQueryBuilder<PhotosMoveQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client        VK API client
     * @param actor         actor with access token
     * @param targetAlbumId value of "target album id" parameter.
     * @param photoId       value of "photo id" parameter.
     */
    public PhotosMoveQuery(VkApiClient client, UserActor actor, int targetAlbumId, int photoId) {
        super(client, "photos.move", OkResponse.class);
        accessToken(actor.getAccessToken());
        targetAlbumId(targetAlbumId);
        photoId(photoId);
    }

    /**
     * ID of the user or community that owns the photo.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosMoveQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * ID of the album to which the photo will be moved.
     *
     * @param value value of "target album id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosMoveQuery targetAlbumId(int value) {
        return unsafeParam("target_album_id", value);
    }

    /**
     * Photo ID.
     *
     * @param value value of "photo id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosMoveQuery photoId(int value) {
        return unsafeParam("photo_id", value);
    }

    @Override
    protected PhotosMoveQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("photo_id", "target_album_id", "access_token");
    }
}

package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.reorderPhotos method
 */
public class PhotosReorderPhotosQuery extends AbstractQueryBuilder<PhotosReorderPhotosQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param photoId value of "photo id" parameter.
     */
    public PhotosReorderPhotosQuery(VkApiClient client, UserActor actor, int photoId) {
        super(client, "photos.reorderPhotos", OkResponse.class);
        accessToken(actor.getAccessToken());
        photoId(photoId);
    }

    /**
     * ID of the user or community that owns the photo.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosReorderPhotosQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Photo ID.
     *
     * @param value value of "photo id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosReorderPhotosQuery photoId(int value) {
        return unsafeParam("photo_id", value);
    }

    /**
     * ID of the photo before which the photo in question shall be placed.
     *
     * @param value value of "before" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosReorderPhotosQuery before(Integer value) {
        return unsafeParam("before", value);
    }

    /**
     * ID of the photo after which the photo in question shall be placed.
     *
     * @param value value of "after" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosReorderPhotosQuery after(Integer value) {
        return unsafeParam("after", value);
    }

    @Override
    protected PhotosReorderPhotosQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("photo_id", "access_token");
    }
}

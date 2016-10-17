package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.reorderAlbums method
 */
public class PhotosReorderAlbumsQuery extends AbstractQueryBuilder<PhotosReorderAlbumsQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param albumId value of "album id" parameter.
     */
    public PhotosReorderAlbumsQuery(VkApiClient client, UserActor actor, int albumId) {
        super(client, "photos.reorderAlbums", OkResponse.class);
        accessToken(actor.getAccessToken());
        albumId(albumId);
    }

    /**
     * ID of the user or community that owns the album.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosReorderAlbumsQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Album ID.
     *
     * @param value value of "album id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosReorderAlbumsQuery albumId(int value) {
        return unsafeParam("album_id", value);
    }

    /**
     * ID of the album before which the album in question shall be placed.
     *
     * @param value value of "before" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosReorderAlbumsQuery before(Integer value) {
        return unsafeParam("before", value);
    }

    /**
     * ID of the album after which the album in question shall be placed.
     *
     * @param value value of "after" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosReorderAlbumsQuery after(Integer value) {
        return unsafeParam("after", value);
    }

    @Override
    protected PhotosReorderAlbumsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("album_id", "access_token");
    }
}

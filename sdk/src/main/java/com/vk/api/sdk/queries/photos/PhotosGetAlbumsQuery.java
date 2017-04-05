package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.photos.responses.GetAlbumsResponse;

import java.util.Collections;
import java.util.List;

/**
 * Query for Photos.getAlbums method
 */
public class PhotosGetAlbumsQuery extends AbstractQueryBuilder<PhotosGetAlbumsQuery, GetAlbumsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public PhotosGetAlbumsQuery(VkApiClient client, UserActor actor) {
        super(client, "photos.getAlbums", GetAlbumsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public PhotosGetAlbumsQuery(VkApiClient client, ServiceActor actor) {
        super(client, "photos.getAlbums", GetAlbumsResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * ID of the user or community that owns the albums.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetAlbumsQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Album IDs.
     *
     * @param value value of "album ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetAlbumsQuery albumIds(Integer... value) {
        return unsafeParam("album_ids", value);
    }

    /**
     * Album IDs.
     *
     * @param value value of "album ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetAlbumsQuery albumIds(List<Integer> value) {
        return unsafeParam("album_ids", value);
    }

    /**
     * Offset needed to return a specific subset of albums.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetAlbumsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of albums to return.
     *
     * @param value value of "count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetAlbumsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Return system albums with negative IDs
     *
     * @param value value of "need system" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetAlbumsQuery needSystem(Boolean value) {
        return unsafeParam("need_system", value);
    }

    /**
     * Return an additional "thumb_src" field
     *
     * @param value value of "need covers" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetAlbumsQuery needCovers(Boolean value) {
        return unsafeParam("need_covers", value);
    }

    /**
     * Return photo sizes in a special format
     *
     * @param value value of "photo sizes" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetAlbumsQuery photoSizes(Boolean value) {
        return unsafeParam("photo_sizes", value);
    }

    @Override
    protected PhotosGetAlbumsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}

package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.edit method
 */
public class PhotosEditQuery extends AbstractQueryBuilder<PhotosEditQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param photoId value of "photo id" parameter. Minimum is 0.
     */
    public PhotosEditQuery(VkApiClient client, UserActor actor, int photoId) {
        super(client, "photos.edit", OkResponse.class);
        accessToken(actor.getAccessToken());
        photoId(photoId);
    }

    /**
     * ID of the user or community that owns the photo.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosEditQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Photo ID.
     *
     * @param value value of "photo id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosEditQuery photoId(int value) {
        return unsafeParam("photo_id", value);
    }

    /**
     * New caption for the photo. If this parameter is not set, it is considered to be equal to an empty string.
     *
     * @param value value of "caption" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosEditQuery caption(String value) {
        return unsafeParam("caption", value);
    }

    /**
     * Set latitude
     *
     * @param value value of "latitude" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosEditQuery latitude(Float value) {
        return unsafeParam("latitude", value);
    }

    /**
     * Set longitude
     *
     * @param value value of "longitude" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosEditQuery longitude(Float value) {
        return unsafeParam("longitude", value);
    }

    /**
     * Set place str
     *
     * @param value value of "place str" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosEditQuery placeStr(String value) {
        return unsafeParam("place_str", value);
    }

    /**
     * Set foursquare id
     *
     * @param value value of "foursquare id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosEditQuery foursquareId(String value) {
        return unsafeParam("foursquare_id", value);
    }

    /**
     * Set delete place
     *
     * @param value value of "delete place" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosEditQuery deletePlace(Boolean value) {
        return unsafeParam("delete_place", value);
    }

    @Override
    protected PhotosEditQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("photo_id", "access_token");
    }
}

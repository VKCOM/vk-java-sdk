package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.photos.Photo;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.saveWallPhoto method
 */
public class PhotosSaveWallPhotoQuery extends AbstractQueryBuilder<PhotosSaveWallPhotoQuery, List<Photo>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param photo  value of "photo" parameter.
     */
    public PhotosSaveWallPhotoQuery(VkApiClient client, Actor actor, String photo) {
        super(client, "photos.saveWallPhoto", Utils.buildParametrizedType(List.class, Photo.class));
        accessToken(actor.getAccessToken());
        photo(photo);
    }

    /**
     * ID of the user on whose wall the photo will be saved.
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSaveWallPhotoQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * ID of community on whose wall the photo will be saved.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSaveWallPhotoQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Parameter returned when the photo is uploaded to the server.
     *
     * @param value value of "photo" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosSaveWallPhotoQuery photo(String value) {
        return unsafeParam("photo", value);
    }

    /**
     * Set server
     *
     * @param value value of "server" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSaveWallPhotoQuery server(Integer value) {
        return unsafeParam("server", value);
    }

    /**
     * Set hash
     *
     * @param value value of "hash" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSaveWallPhotoQuery hash(String value) {
        return unsafeParam("hash", value);
    }

    @Override
    protected PhotosSaveWallPhotoQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("photo", "access_token");
    }
}

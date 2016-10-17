package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.putTag method
 */
public class PhotosPutTagQuery extends AbstractQueryBuilder<PhotosPutTagQuery, Integer> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param photoId value of "photo id" parameter. Minimum is 0.
     * @param userId  value of "user id" parameter.
     */
    public PhotosPutTagQuery(VkApiClient client, UserActor actor, int photoId, int userId) {
        super(client, "photos.putTag", Integer.class);
        accessToken(actor.getAccessToken());
        photoId(photoId);
        userId(userId);
    }

    /**
     * ID of the user or community that owns the photo.
     *
     * @param value value of "owner id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosPutTagQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Photo ID.
     *
     * @param value value of "photo id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosPutTagQuery photoId(int value) {
        return unsafeParam("photo_id", value);
    }

    /**
     * ID of the user to be tagged.
     *
     * @param value value of "user id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosPutTagQuery userId(int value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Upper left-corner coordinate of the tagged area (as a percentage of the photo's width).
     *
     * @param value value of "x" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosPutTagQuery x(Float value) {
        return unsafeParam("x", value);
    }

    /**
     * Upper left-corner coordinate of the tagged area (as a percentage of the photo's height).
     *
     * @param value value of "y" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosPutTagQuery y(Float value) {
        return unsafeParam("y", value);
    }

    /**
     * Lower right-corner coordinate of the tagged area (as a percentage of the photo's width).
     *
     * @param value value of "x2" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosPutTagQuery x2(Float value) {
        return unsafeParam("x2", value);
    }

    /**
     * Lower right-corner coordinate of the tagged area (as a percentage of the photo's height).
     *
     * @param value value of "y2" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosPutTagQuery y2(Float value) {
        return unsafeParam("y2", value);
    }

    @Override
    protected PhotosPutTagQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("photo_id", "user_id", "access_token");
    }
}

package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.copy method
 */
public class PhotosCopyQuery extends AbstractQueryBuilder<PhotosCopyQuery, Integer> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param photoId value of "photo id" parameter. Minimum is 0.
     */
    public PhotosCopyQuery(VkApiClient client, UserActor actor, int ownerId, int photoId) {
        super(client, "photos.copy", Integer.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        photoId(photoId);
    }

    /**
     * Photo's owner ID
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosCopyQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Photo ID
     *
     * @param value value of "photo id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosCopyQuery photoId(int value) {
        return unsafeParam("photo_id", value);
    }

    /**
     * Special access key for private photos
     *
     * @param value value of "access key" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosCopyQuery accessKey(String value) {
        return unsafeParam("access_key", value);
    }

    @Override
    protected PhotosCopyQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("photo_id", "owner_id", "access_token");
    }
}

package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.removeTag method
 */
public class PhotosRemoveTagQuery extends AbstractQueryBuilder<PhotosRemoveTagQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param photoId value of "photo id" parameter.
     * @param tagId   value of "tag id" parameter.
     */
    public PhotosRemoveTagQuery(VkApiClient client, UserActor actor, int photoId, int tagId) {
        super(client, "photos.removeTag", OkResponse.class);
        accessToken(actor.getAccessToken());
        photoId(photoId);
        tagId(tagId);
    }

    /**
     * ID of the user or community that owns the photo.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosRemoveTagQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Photo ID.
     *
     * @param value value of "photo id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosRemoveTagQuery photoId(int value) {
        return unsafeParam("photo_id", value);
    }

    /**
     * Tag ID.
     *
     * @param value value of "tag id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosRemoveTagQuery tagId(int value) {
        return unsafeParam("tag_id", value);
    }

    @Override
    protected PhotosRemoveTagQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("photo_id", "tag_id", "access_token");
    }
}

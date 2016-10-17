package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.photos.PhotoUpload;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.getUploadServer method
 */
public class PhotosGetUploadServerQuery extends AbstractQueryBuilder<PhotosGetUploadServerQuery, PhotoUpload> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public PhotosGetUploadServerQuery(VkApiClient client, UserActor actor) {
        super(client, "photos.getUploadServer", PhotoUpload.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Album ID.
     *
     * @param value value of "album id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetUploadServerQuery albumId(Integer value) {
        return unsafeParam("album_id", value);
    }

    /**
     * ID of community that owns the album (if the photo will be uploaded to a community album).
     *
     * @param value value of "group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetUploadServerQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected PhotosGetUploadServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

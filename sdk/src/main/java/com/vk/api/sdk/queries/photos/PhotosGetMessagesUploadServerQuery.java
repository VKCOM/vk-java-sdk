package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.photos.PhotoUpload;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.getMessagesUploadServer method
 */
public class PhotosGetMessagesUploadServerQuery extends AbstractQueryBuilder<PhotosGetMessagesUploadServerQuery, PhotoUpload> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public PhotosGetMessagesUploadServerQuery(VkApiClient client, Actor actor) {
        super(client, "photos.getMessagesUploadServer", PhotoUpload.class);
        accessToken(actor.getAccessToken());
    }

    @Override
    protected PhotosGetMessagesUploadServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

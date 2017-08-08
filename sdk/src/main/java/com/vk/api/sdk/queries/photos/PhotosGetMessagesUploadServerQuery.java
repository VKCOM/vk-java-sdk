package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
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
    public PhotosGetMessagesUploadServerQuery(VkApiClient client, UserActor actor) {
        super(client, "photos.getMessagesUploadServer", PhotoUpload.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public PhotosGetMessagesUploadServerQuery(VkApiClient client, GroupActor actor) {
        super(client, "photos.getMessagesUploadServer", PhotoUpload.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set peer id
     *
     * @param value value of "peer id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetMessagesUploadServerQuery peerId(Integer value) {
        return unsafeParam("peer_id", value);
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

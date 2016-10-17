package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.photos.responses.GetMarketAlbumUploadServerResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.getMarketAlbumUploadServer method
 */
public class PhotosGetMarketAlbumUploadServerQuery extends AbstractQueryBuilder<PhotosGetMarketAlbumUploadServerQuery, GetMarketAlbumUploadServerResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public PhotosGetMarketAlbumUploadServerQuery(VkApiClient client, UserActor actor, int groupId) {
        super(client, "photos.getMarketAlbumUploadServer", GetMarketAlbumUploadServerResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosGetMarketAlbumUploadServerQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected PhotosGetMarketAlbumUploadServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}

package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.photos.responses.GetWallUploadServerResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.getWallUploadServer method
 */
public class PhotosGetWallUploadServerQuery extends AbstractQueryBuilder<PhotosGetWallUploadServerQuery, GetWallUploadServerResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public PhotosGetWallUploadServerQuery(VkApiClient client, UserActor actor) {
        super(client, "photos.getWallUploadServer", GetWallUploadServerResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of community to whose wall the photo will be uploaded.
     *
     * @param value value of "group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetWallUploadServerQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected PhotosGetWallUploadServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

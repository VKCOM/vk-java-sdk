package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.GetUploadServerResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.getOwnerPhotoUploadServer method
 */
public class PhotosGetOwnerPhotoUploadServerQuery extends AbstractQueryBuilder<PhotosGetOwnerPhotoUploadServerQuery, GetUploadServerResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public PhotosGetOwnerPhotoUploadServerQuery(VkApiClient client, UserActor actor) {
        super(client, "photos.getOwnerPhotoUploadServer", GetUploadServerResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Identifier of a community or current user. "Note that community id must be negative. 'owner_id=1' – user, 'owner_id=-1' – community, "
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetOwnerPhotoUploadServerQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    @Override
    protected PhotosGetOwnerPhotoUploadServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

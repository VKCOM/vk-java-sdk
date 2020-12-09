package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.photos.responses.GetTagsResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.getTags method
 */
public class PhotosGetTagsQuery extends AbstractQueryBuilder<PhotosGetTagsQuery, List<GetTagsResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param photoId value of "photo id" parameter.
     */
    public PhotosGetTagsQuery(VkApiClient client, UserActor actor, int photoId) {
        super(client, "photos.getTags", Utils.buildParametrizedType(List.class, GetTagsResponse.class));
        accessToken(actor.getAccessToken());
        photoId(photoId);
    }

    /**
     * ID of the user or community that owns the photo.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetTagsQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Photo ID.
     *
     * @param value value of "photo id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosGetTagsQuery photoId(int value) {
        return unsafeParam("photo_id", value);
    }

    /**
     * Set access key
     *
     * @param value value of "access key" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetTagsQuery accessKey(String value) {
        return unsafeParam("access_key", value);
    }

    @Override
    protected PhotosGetTagsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("photo_id", "access_token");
    }
}

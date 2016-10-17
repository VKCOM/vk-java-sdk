package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.photos.responses.GetMarketUploadServerResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.getMarketUploadServer method
 */
public class PhotosGetMarketUploadServerQuery extends AbstractQueryBuilder<PhotosGetMarketUploadServerQuery, GetMarketUploadServerResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public PhotosGetMarketUploadServerQuery(VkApiClient client, UserActor actor, int groupId) {
        super(client, "photos.getMarketUploadServer", GetMarketUploadServerResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosGetMarketUploadServerQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * You want to upload the main item photo.
     *
     * @param value value of "main photo" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetMarketUploadServerQuery mainPhoto(Boolean value) {
        return unsafeParam("main_photo", value);
    }

    /**
     * X coordinate of the crop left upper corner.
     *
     * @param value value of "crop x" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetMarketUploadServerQuery cropX(Integer value) {
        return unsafeParam("crop_x", value);
    }

    /**
     * Y coordinate of the crop left upper corner.
     *
     * @param value value of "crop y" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetMarketUploadServerQuery cropY(Integer value) {
        return unsafeParam("crop_y", value);
    }

    /**
     * Width of the cropped photo in px.
     *
     * @param value value of "crop width" parameter. Minimum is 400.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetMarketUploadServerQuery cropWidth(Integer value) {
        return unsafeParam("crop_width", value);
    }

    @Override
    protected PhotosGetMarketUploadServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}

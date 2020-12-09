package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.GetUploadServerResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.getOwnerCoverPhotoUploadServer method
 */
public class PhotosGetOwnerCoverPhotoUploadServerQuery extends AbstractQueryBuilder<PhotosGetOwnerCoverPhotoUploadServerQuery, GetUploadServerResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public PhotosGetOwnerCoverPhotoUploadServerQuery(VkApiClient client, UserActor actor,
            int groupId) {
        super(client, "photos.getOwnerCoverPhotoUploadServer", GetUploadServerResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public PhotosGetOwnerCoverPhotoUploadServerQuery(VkApiClient client, GroupActor actor,
            int groupId) {
        super(client, "photos.getOwnerCoverPhotoUploadServer", GetUploadServerResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        groupId(groupId);
    }

    /**
     * ID of community that owns the album (if the photo will be uploaded to a community album).
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosGetOwnerCoverPhotoUploadServerQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * X coordinate of the left-upper corner
     *
     * @param value value of "crop x" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetOwnerCoverPhotoUploadServerQuery cropX(Integer value) {
        return unsafeParam("crop_x", value);
    }

    /**
     * Y coordinate of the left-upper corner
     *
     * @param value value of "crop y" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetOwnerCoverPhotoUploadServerQuery cropY(Integer value) {
        return unsafeParam("crop_y", value);
    }

    /**
     * X coordinate of the right-bottom corner
     *
     * @param value value of "crop x2" parameter. Minimum is 0. By default 795.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetOwnerCoverPhotoUploadServerQuery cropX2(Integer value) {
        return unsafeParam("crop_x2", value);
    }

    /**
     * Y coordinate of the right-bottom corner
     *
     * @param value value of "crop y2" parameter. Minimum is 0. By default 200.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetOwnerCoverPhotoUploadServerQuery cropY2(Integer value) {
        return unsafeParam("crop_y2", value);
    }

    @Override
    protected PhotosGetOwnerCoverPhotoUploadServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}

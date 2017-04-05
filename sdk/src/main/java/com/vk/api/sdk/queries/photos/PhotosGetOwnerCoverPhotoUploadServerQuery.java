package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.photos.responses.GetOwnerCoverPhotoUploadServerResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.getOwnerCoverPhotoUploadServer method
 */
public class PhotosGetOwnerCoverPhotoUploadServerQuery extends AbstractQueryBuilder<PhotosGetOwnerCoverPhotoUploadServerQuery, GetOwnerCoverPhotoUploadServerResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public PhotosGetOwnerCoverPhotoUploadServerQuery(VkApiClient client, UserActor actor, Integer groupId) {
        super(client, "photos.getOwnerCoverPhotoUploadServer", GetOwnerCoverPhotoUploadServerResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public PhotosGetOwnerCoverPhotoUploadServerQuery(VkApiClient client, GroupActor actor) {
        super(client, "photos.getOwnerCoverPhotoUploadServer", GetOwnerCoverPhotoUploadServerResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
    }

    protected PhotosGetOwnerCoverPhotoUploadServerQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    public PhotosGetOwnerCoverPhotoUploadServerQuery cropX(Integer value) {
        return unsafeParam("crop_x", value);
    }

    public PhotosGetOwnerCoverPhotoUploadServerQuery cropY(Integer value) {
        return unsafeParam("crop_y", value);
    }

    public PhotosGetOwnerCoverPhotoUploadServerQuery cropX2(Integer value) {
        return unsafeParam("crop_x2", value);
    }

    public PhotosGetOwnerCoverPhotoUploadServerQuery cropY2(Integer value) {
        return unsafeParam("crop_y2", value);
    }

    @Override
    protected PhotosGetOwnerCoverPhotoUploadServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token", "group_id");
    }
}

package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.photos.responses.OwnerUploadResponse;

import java.io.File;
import java.util.Map;

public class UploadPhotoOwnerQuery extends UploadQueryBuilder<UploadPhotoOwnerQuery, OwnerUploadResponse> {

    public UploadPhotoOwnerQuery(VkApiClient client, String uploadUrl, Map<String, File> files) {
        super(client, uploadUrl, files, OwnerUploadResponse.class);
    }

    @Override
    protected UploadPhotoOwnerQuery getThis() {
        return this;
    }
}

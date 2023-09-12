package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.photos.responses.OwnerCoverUploadResponse;

import java.io.File;
import java.util.Map;

public class UploadPhotoOwnerCoverQuery extends UploadQueryBuilder<UploadPhotoOwnerCoverQuery, OwnerCoverUploadResponse> {

    public UploadPhotoOwnerCoverQuery(VkApiClient client, String uploadUrl, Map<String, File> files) {
        super(client, uploadUrl, files, OwnerCoverUploadResponse.class);
    }

    @Override
    protected UploadPhotoOwnerCoverQuery getThis() {
        return this;
    }
}

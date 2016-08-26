package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.photos.responses.OwnerUploadResponse;

import java.io.File;

/**
 * Created by tsivarev on 22.07.16.
 */
public class UploadPhotoOwnerQuery extends UploadQueryBuilder<UploadPhotoOwnerQuery, OwnerUploadResponse> {

    public UploadPhotoOwnerQuery(VkApiClient client, String uploadUrl, File file) {
        super(client, uploadUrl, "photo", OwnerUploadResponse.class);
        file(file);
    }

    @Override
    protected UploadPhotoOwnerQuery getThis() {
        return this;
    }
}

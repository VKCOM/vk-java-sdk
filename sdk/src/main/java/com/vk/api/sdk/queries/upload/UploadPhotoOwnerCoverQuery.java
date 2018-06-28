package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.photos.responses.OwnerCoverUploadResponse;

import java.io.File;
import java.io.InputStream;

/**
 * Created by tsivarev on 22.07.16.
 */
public class UploadPhotoOwnerCoverQuery extends UploadQueryBuilder<UploadPhotoOwnerCoverQuery, OwnerCoverUploadResponse> {

    public UploadPhotoOwnerCoverQuery(VkApiClient client, String uploadUrl, File file) {
        super(client, uploadUrl, "photo", OwnerCoverUploadResponse.class);
        file(file);
    }

    public UploadPhotoOwnerCoverQuery(VkApiClient client, String uploadUrl, InputStream content) {
        super(client, uploadUrl, "photo", OwnerCoverUploadResponse.class);
        content(content);
    }

    @Override
    protected UploadPhotoOwnerCoverQuery getThis() {
        return this;
    }
}

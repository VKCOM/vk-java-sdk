package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;

import java.io.File;

public class UploadPhotoStringQuery extends UploadQueryBuilder<UploadPhotoStringQuery, String> {

    public UploadPhotoStringQuery(VkApiClient client, String uploadUrl, File file) {
        super(client, uploadUrl, "photo", String.class);
        file(file);
    }

    @Override
    protected UploadPhotoStringQuery getThis() {
        return this;
    }
}


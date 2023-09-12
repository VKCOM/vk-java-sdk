package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;

import java.io.File;
import java.util.Map;

public class UploadPhotoStringQuery extends UploadQueryBuilder<UploadPhotoStringQuery, String> {

    public UploadPhotoStringQuery(VkApiClient client, String uploadUrl, Map<String, File> files) {
        super(client, uploadUrl, files, String.class);
    }

    @Override
    protected UploadPhotoStringQuery getThis() {
        return this;
    }
}


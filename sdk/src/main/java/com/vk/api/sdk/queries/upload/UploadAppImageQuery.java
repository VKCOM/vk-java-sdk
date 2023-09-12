package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.apps.responses.ImageUploadResponse;

import java.io.File;
import java.util.Map;

public class UploadAppImageQuery extends UploadQueryBuilder<UploadAppImageQuery, ImageUploadResponse> {

    public UploadAppImageQuery(VkApiClient client, String uploadUrl, Map<String, File> files) {
        super(client, uploadUrl, files, ImageUploadResponse.class);
    }

    @Override
    protected UploadAppImageQuery getThis() {
        return this;
    }
}

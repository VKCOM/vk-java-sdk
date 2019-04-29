package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.responses.UploadImageResponse;

import java.io.File;

public class UploadAppImageQuery extends UploadQueryBuilder<UploadAppImageQuery, UploadImageResponse> {

    public UploadAppImageQuery(VkApiClient client, String uploadUrl, File file) {
        super(client, uploadUrl, "image", UploadImageResponse.class);
        file(file);
    }

    @Override
    protected UploadAppImageQuery getThis() {
        return this;
    }
}

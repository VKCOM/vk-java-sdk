package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.app.widgets.responses.UploadImageResponse;

import java.io.File;
import java.io.InputStream;

public class UploadAppImageQuery extends UploadQueryBuilder<UploadAppImageQuery, UploadImageResponse> {

    public UploadAppImageQuery(VkApiClient client, String uploadUrl, File file) {
        super(client, uploadUrl, "image", UploadImageResponse.class);
        file(file);
    }

    public UploadAppImageQuery(VkApiClient client, String uploadUrl, InputStream content, String inputStreamFilename) {
        super(client, uploadUrl, "image", UploadImageResponse.class);
        content(content, inputStreamFilename);
    }

    @Override
    protected UploadAppImageQuery getThis() {
        return this;
    }
}

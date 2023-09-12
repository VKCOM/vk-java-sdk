package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.video.responses.UploadResponse;

import java.io.File;
import java.util.Map;

public class UploadVideoQuery extends UploadQueryBuilder<UploadVideoQuery, UploadResponse> {

    public UploadVideoQuery(VkApiClient client, String uploadUrl, Map<String, File> files) {
        super(client, uploadUrl, files, UploadResponse.class);
    }

    @Override
    protected UploadVideoQuery getThis() {
        return this;
    }
}

package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.stories.responses.UploadResponse;

import java.io.File;

public class UploadPhotoStoryQuery extends UploadQueryBuilder<UploadPhotoStoryQuery, UploadResponse> {

    public UploadPhotoStoryQuery(VkApiClient client, String uploadUrl, File file) {
        super(client, uploadUrl, "file", UploadResponse.class);
        file(file);
    }

    @Override
    protected UploadPhotoStoryQuery getThis() {
        return this;
    }
}

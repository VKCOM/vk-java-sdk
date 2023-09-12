package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.stories.responses.UploadResponse;

import java.io.File;
import java.util.Map;

public class UploadPhotoStoryQuery extends UploadQueryBuilder<UploadPhotoStoryQuery, UploadResponse> {

    public UploadPhotoStoryQuery(VkApiClient client, String uploadUrl, Map<String, File> files) {
        super(client, uploadUrl, files, UploadResponse.class);
    }

    @Override
    protected UploadPhotoStoryQuery getThis() {
        return this;
    }
}

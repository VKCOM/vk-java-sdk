package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;

import java.io.File;
import com.vk.api.sdk.objects.stories.responses.UploadResponse;

/**
 * Created by tsivarev on 22.07.16.
 */
public class UploadVideoStoryQuery extends UploadQueryBuilder<UploadVideoStoryQuery, UploadResponse> {

    public UploadVideoStoryQuery(VkApiClient client, String uploadUrl, File file) {
        super(client, uploadUrl, "video_file", UploadResponse.class);
        file(file);
    }

    @Override
    protected UploadVideoStoryQuery getThis() {
        return this;
    }
}

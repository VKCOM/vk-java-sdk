package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.video.responses.UploadResponse;

import java.io.File;

/**
 * Created by tsivarev on 22.07.16.
 */
public class UploadVideoQuery extends UploadQueryBuilder<UploadVideoQuery, UploadResponse> {

    public UploadVideoQuery(VkApiClient client, String uploadUrl, File file) {
        super(client, uploadUrl, "video_file", UploadResponse.class);
        file(file);
    }

    @Override
    protected UploadVideoQuery getThis() {
        return this;
    }
}

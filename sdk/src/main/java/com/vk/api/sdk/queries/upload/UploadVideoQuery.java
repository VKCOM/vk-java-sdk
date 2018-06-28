package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.video.responses.VideoUploadResponse;

import java.io.File;
import java.io.InputStream;

/**
 * Created by tsivarev on 22.07.16.
 */
public class UploadVideoQuery extends UploadQueryBuilder<UploadVideoQuery, VideoUploadResponse> {

    public UploadVideoQuery(VkApiClient client, String uploadUrl, File file) {
        super(client, uploadUrl, "video_file", VideoUploadResponse.class);
        file(file);
    }

    public UploadVideoQuery(VkApiClient client, String uploadUrl, InputStream content, String inputStreamFilename) {
        super(client, uploadUrl, "video_file", VideoUploadResponse.class);
        content(content, inputStreamFilename);
    }

    @Override
    protected UploadVideoQuery getThis() {
        return this;
    }
}

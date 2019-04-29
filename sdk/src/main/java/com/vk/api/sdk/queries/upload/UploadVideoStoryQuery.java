package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.responses.VideoUploadResponse;
import com.vk.api.sdk.objects.stories.Story;

import java.io.File;

/**
 * Created by tsivarev on 22.07.16.
 */
public class UploadVideoStoryQuery extends UploadQueryBuilder<UploadVideoStoryQuery, Story> {

    public UploadVideoStoryQuery(VkApiClient client, String uploadUrl, File file) {
        super(client, uploadUrl, "video_file", Story.class);
        file(file);
    }

    @Override
    protected UploadVideoStoryQuery getThis() {
        return this;
    }
}

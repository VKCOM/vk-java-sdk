package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.stories.Story;

import java.io.File;

/**
 * Created by tsivarev on 22.07.16.
 */
public class UploadPhotoStoryQuery extends UploadQueryBuilder<UploadPhotoStoryQuery, Story> {

    public UploadPhotoStoryQuery(VkApiClient client, String uploadUrl, File file) {
        super(client, uploadUrl, "file", Story.class);
        file(file);
    }

    @Override
    protected UploadPhotoStoryQuery getThis() {
        return this;
    }
}

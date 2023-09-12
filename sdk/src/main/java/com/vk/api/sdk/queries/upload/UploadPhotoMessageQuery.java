package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.photos.responses.MessageUploadResponse;

import java.io.File;
import java.util.Map;

/**
 * Created by tsivarev on 22.07.16.
 */
public class UploadPhotoMessageQuery extends UploadQueryBuilder<UploadPhotoMessageQuery, MessageUploadResponse> {

    public UploadPhotoMessageQuery(VkApiClient client, String uploadUrl, Map<String, File> files) {
        super(client, uploadUrl, files, MessageUploadResponse.class);
    }

    @Override
    protected UploadPhotoMessageQuery getThis() {
        return this;
    }
}

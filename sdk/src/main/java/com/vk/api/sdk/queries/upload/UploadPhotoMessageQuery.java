package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.photos.responses.MessageUploadResponse;

import java.io.File;

/**
 * Created by tsivarev on 22.07.16.
 */
public class UploadPhotoMessageQuery extends UploadQueryBuilder<UploadPhotoMessageQuery, MessageUploadResponse> {

    public UploadPhotoMessageQuery(VkApiClient client, String uploadUrl, File file) {
        super(client, uploadUrl, "photo", MessageUploadResponse.class);
        file(file);
    }

    public UploadPhotoMessageQuery(VkApiClient client, String uploadUrl, byte[] file) {
        super(client, uploadUrl, "photo", MessageUploadResponse.class);
        file(file);
    }

    @Override
    protected UploadPhotoMessageQuery getThis() {
        return this;
    }
}

package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.photos.responses.PhotoUploadResponse;

import java.io.File;
import java.util.Map;

/**
 * Created by tsivarev on 22.07.16.
 */
public class UploadPhotoQuery extends UploadQueryBuilder<UploadPhotoQuery, PhotoUploadResponse> {

    public UploadPhotoQuery(VkApiClient client, String uploadUrl, Map<String, File> files) {
        super(client, uploadUrl, files, PhotoUploadResponse.class);
    }

    @Override
    protected UploadPhotoQuery getThis() {
        return this;
    }
}

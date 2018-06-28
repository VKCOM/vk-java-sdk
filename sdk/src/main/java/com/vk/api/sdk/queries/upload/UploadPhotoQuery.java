package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.photos.responses.PhotoUploadResponse;

import java.io.File;
import java.io.InputStream;

/**
 * Created by tsivarev on 22.07.16.
 */
public class UploadPhotoQuery extends UploadQueryBuilder<UploadPhotoQuery, PhotoUploadResponse> {

    public UploadPhotoQuery(VkApiClient client, String uploadUrl, File file) {
        super(client, uploadUrl, "photo", PhotoUploadResponse.class);
        file(file);
    }

    public UploadPhotoQuery(VkApiClient client, String uploadUrl, InputStream content, String inputStreamFilename) {
        super(client, uploadUrl, "photo", PhotoUploadResponse.class);
        content(content, inputStreamFilename);
    }

    @Override
    protected UploadPhotoQuery getThis() {
        return this;
    }
}


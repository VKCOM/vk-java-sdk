package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.photos.responses.WallUploadResponse;

import java.io.File;
import java.util.Map;

public class UploadPhotoWallQuery extends UploadQueryBuilder<UploadPhotoWallQuery, WallUploadResponse> {

    public UploadPhotoWallQuery(VkApiClient client, String uploadUrl, Map<String, File> files) {
        super(client, uploadUrl, files, WallUploadResponse.class);
    }

    @Override
    protected UploadPhotoWallQuery getThis() {
        return this;
    }
}

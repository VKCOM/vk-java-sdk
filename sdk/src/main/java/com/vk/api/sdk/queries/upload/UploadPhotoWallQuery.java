package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.photos.responses.WallUploadResponse;

import java.io.File;

/**
 * Created by tsivarev on 22.07.16.
 */
public class UploadPhotoWallQuery extends UploadQueryBuilder<UploadPhotoWallQuery, WallUploadResponse> {

    public UploadPhotoWallQuery(VkApiClient client, String uploadUrl, File file) {
        super(client, uploadUrl, "photo", WallUploadResponse.class);
        file(file);
    }

    @Override
    protected UploadPhotoWallQuery getThis() {
        return this;
    }
}

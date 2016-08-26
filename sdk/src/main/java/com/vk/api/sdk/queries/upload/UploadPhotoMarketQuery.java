package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.photos.responses.MarketUploadResponse;

import java.io.File;

/**
 * Created by tsivarev on 22.07.16.
 */
public class UploadPhotoMarketQuery extends UploadQueryBuilder<UploadPhotoMarketQuery, MarketUploadResponse> {

    public UploadPhotoMarketQuery(VkApiClient client, String uploadUrl, File file) {
        super(client, uploadUrl, "photo", MarketUploadResponse.class);
        file(file);
    }

    @Override
    protected UploadPhotoMarketQuery getThis() {
        return this;
    }
}

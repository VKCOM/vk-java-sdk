package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.photos.responses.MarketUploadResponse;

import java.io.File;
import java.util.Map;

/**
 * Created by tsivarev on 22.07.16.
 */
public class UploadPhotoMarketQuery extends UploadQueryBuilder<UploadPhotoMarketQuery, MarketUploadResponse> {

    public UploadPhotoMarketQuery(VkApiClient client, String uploadUrl, Map<String, File> files) {
        super(client, uploadUrl, files, MarketUploadResponse.class);
    }

    @Override
    protected UploadPhotoMarketQuery getThis() {
        return this;
    }
}

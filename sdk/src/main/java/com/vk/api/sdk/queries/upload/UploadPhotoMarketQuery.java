package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.photos.responses.MarketUploadResponse;

import java.io.File;
import java.io.InputStream;

/**
 * Created by tsivarev on 22.07.16.
 */
public class UploadPhotoMarketQuery extends UploadQueryBuilder<UploadPhotoMarketQuery, MarketUploadResponse> {

    public UploadPhotoMarketQuery(VkApiClient client, String uploadUrl, File file) {
        super(client, uploadUrl, "photo", MarketUploadResponse.class);
        file(file);
    }

    public UploadPhotoMarketQuery(VkApiClient client, String uploadUrl, InputStream content, String inputStreamFilename) {
        super(client, uploadUrl, "photo", MarketUploadResponse.class);
        content(content, inputStreamFilename);
    }

    @Override
    protected UploadPhotoMarketQuery getThis() {
        return this;
    }
}

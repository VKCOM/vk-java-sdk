package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.photos.responses.MarketAlbumUploadResponse;

import java.io.File;
import java.io.InputStream;

/**
 * Created by tsivarev on 22.07.16.
 */
public class UploadPhotoMarketAlbumQuery extends UploadQueryBuilder<UploadPhotoMarketAlbumQuery, MarketAlbumUploadResponse> {

    public UploadPhotoMarketAlbumQuery(VkApiClient client, String uploadUrl, File file) {
        super(client, uploadUrl, "photo", MarketAlbumUploadResponse.class);
        file(file);
    }

    public UploadPhotoMarketAlbumQuery(VkApiClient client, String uploadUrl, InputStream content) {
        super(client, uploadUrl, "photo", MarketAlbumUploadResponse.class);
        content(content);
    }

    @Override
    protected UploadPhotoMarketAlbumQuery getThis() {
        return this;
    }
}

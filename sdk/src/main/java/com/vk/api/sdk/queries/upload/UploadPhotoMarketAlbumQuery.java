package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.photos.responses.MarketAlbumUploadResponse;

import java.io.File;
import java.util.Map;

/**
 * Created by tsivarev on 22.07.16.
 */
public class UploadPhotoMarketAlbumQuery extends UploadQueryBuilder<UploadPhotoMarketAlbumQuery, MarketAlbumUploadResponse> {

    public UploadPhotoMarketAlbumQuery(VkApiClient client, String uploadUrl, Map<String, File> files) {
        super(client, uploadUrl, files, MarketAlbumUploadResponse.class);
    }

    @Override
    protected UploadPhotoMarketAlbumQuery getThis() {
        return this;
    }
}

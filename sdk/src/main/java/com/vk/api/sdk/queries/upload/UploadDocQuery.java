package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.docs.responses.DocUploadResponse;

import java.io.File;


/**
 * Created by tsivarev on 22.07.16.
 */
public class UploadDocQuery extends UploadQueryBuilder<UploadDocQuery, DocUploadResponse> {

    public UploadDocQuery(VkApiClient client, String uploadUrl, File file) {
        super(client, uploadUrl, "file", DocUploadResponse.class);
        file(file);
    }

    @Override
    protected UploadDocQuery getThis() {
        return this;
    }
}

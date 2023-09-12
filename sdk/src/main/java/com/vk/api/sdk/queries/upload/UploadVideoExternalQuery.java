package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import static java.util.Collections.singletonMap;

public class UploadVideoExternalQuery extends UploadQueryBuilder<UploadVideoExternalQuery, OkResponse> {

    public UploadVideoExternalQuery(VkApiClient client, String uploadUrl) {
        super(client, uploadUrl, null, OkResponse.class);
    }

    @Override
    protected UploadVideoExternalQuery getThis() {
        return this;
    }
}

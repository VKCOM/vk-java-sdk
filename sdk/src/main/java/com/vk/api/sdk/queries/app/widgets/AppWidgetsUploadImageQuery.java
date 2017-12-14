package com.vk.api.sdk.queries.app.widgets;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.app.widgets.responses.UploadImageResponse;
import com.vk.api.sdk.queries.upload.UploadQueryBuilder;

import java.io.File;

public class AppWidgetsUploadImageQuery extends UploadQueryBuilder<AppWidgetsUploadImageQuery, UploadImageResponse> {


    public AppWidgetsUploadImageQuery(VkApiClient client, String uploadUrl, File file) {
        super(client, uploadUrl, "image", UploadImageResponse.class);
        file(file);
    }

    @Override
    protected AppWidgetsUploadImageQuery getThis() {
        return this;
    }
}

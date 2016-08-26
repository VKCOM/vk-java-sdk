package com.vk.api.sdk.queries.upload;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.audio.responses.AudioUploadResponse;

import java.io.File;

/**
 * Created by tsivarev on 22.07.16.
 */
public class UploadAudioQuery extends UploadQueryBuilder<UploadAudioQuery, AudioUploadResponse> {

    public UploadAudioQuery(VkApiClient client, String uploadUrl, File file) {
        super(client, uploadUrl, "file", AudioUploadResponse.class);
        file(file);
    }

    @Override
    protected UploadAudioQuery getThis() {
        return this;
    }
}

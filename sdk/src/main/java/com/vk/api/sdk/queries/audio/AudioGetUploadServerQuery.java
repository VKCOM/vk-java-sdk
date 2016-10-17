package com.vk.api.sdk.queries.audio;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.audio.responses.GetUploadServerResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Audio.getUploadServer method
 */
public class AudioGetUploadServerQuery extends AbstractQueryBuilder<AudioGetUploadServerQuery, GetUploadServerResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public AudioGetUploadServerQuery(VkApiClient client, UserActor actor) {
        super(client, "audio.getUploadServer", GetUploadServerResponse.class);
        accessToken(actor.getAccessToken());
    }

    @Override
    protected AudioGetUploadServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

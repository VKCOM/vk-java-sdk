package com.vk.api.sdk.queries.streaming;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.streaming.responses.GetServerUrlResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Streaming.getUrl method
 */
public class StreamingGetServerUrl extends AbstractQueryBuilder<StreamingGetServerUrl, GetServerUrlResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public StreamingGetServerUrl(VkApiClient client, ServiceActor actor) {
        super(client, "streaming.getServerUrl", GetServerUrlResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    @Override
    protected StreamingGetServerUrl getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

package com.vk.api.sdk.queries.streaming;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.streaming.responses.GetServerUrlResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Streaming.getServerUrl method
 */
public class StreamingGetServerUrlQuery extends AbstractQueryBuilder<StreamingGetServerUrlQuery, GetServerUrlResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StreamingGetServerUrlQuery(VkApiClient client, ServiceActor actor) {
        super(client, "streaming.getServerUrl", GetServerUrlResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    @Override
    protected StreamingGetServerUrlQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

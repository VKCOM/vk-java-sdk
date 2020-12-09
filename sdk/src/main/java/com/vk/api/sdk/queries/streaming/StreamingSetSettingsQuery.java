package com.vk.api.sdk.queries.streaming;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import com.vk.api.sdk.objects.enums.StreamingMonthlyTier;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Streaming.setSettings method
 */
public class StreamingSetSettingsQuery extends AbstractQueryBuilder<StreamingSetSettingsQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StreamingSetSettingsQuery(VkApiClient client, ServiceActor actor) {
        super(client, "streaming.setSettings", OkResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Set monthly tier
     *
     * @param value value of "monthly tier" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StreamingSetSettingsQuery monthlyTier(StreamingMonthlyTier value) {
        return unsafeParam("monthly_tier", value);
    }

    @Override
    protected StreamingSetSettingsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

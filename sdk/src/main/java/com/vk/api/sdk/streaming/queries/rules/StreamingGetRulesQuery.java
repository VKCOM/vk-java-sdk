package com.vk.api.sdk.streaming.queries.rules;

import com.vk.api.sdk.streaming.clients.VkStreamingApiClient;
import com.vk.api.sdk.streaming.clients.actors.StreamingActor;
import com.vk.api.sdk.streaming.objects.responses.StreamingGetRulesResponse;
import com.vk.api.sdk.streaming.queries.StreamingAbstractGetQuery;

/**
 * Query for GET /rules
 */
public class StreamingGetRulesQuery extends StreamingAbstractGetQuery {

    public StreamingGetRulesQuery(VkStreamingApiClient client, StreamingActor actor) {
        super(client, actor, "rules", StreamingGetRulesResponse.class);
    }
}

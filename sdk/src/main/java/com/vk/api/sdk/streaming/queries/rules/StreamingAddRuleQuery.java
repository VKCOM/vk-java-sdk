package com.vk.api.sdk.streaming.queries.rules;

import com.vk.api.sdk.streaming.clients.VkStreamingApiClient;
import com.vk.api.sdk.streaming.clients.actors.StreamingActor;
import com.vk.api.sdk.streaming.objects.responses.StreamingResponse;
import com.vk.api.sdk.streaming.queries.StreamingAbstractPostQuery;
import com.vk.api.sdk.streaming.queries.rules.payloads.StreamingAddRulePayload;

/**
 * Query for POST /rules
 */
public class StreamingAddRuleQuery extends StreamingAbstractPostQuery {

    public StreamingAddRuleQuery(VkStreamingApiClient client, StreamingActor actor, String tag, String value) {
        super(client, actor, "rules", StreamingResponse.class);
        setBody(new StreamingAddRulePayload(tag, value));
    }
}

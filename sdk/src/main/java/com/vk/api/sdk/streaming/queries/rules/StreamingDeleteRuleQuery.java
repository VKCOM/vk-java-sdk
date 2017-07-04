package com.vk.api.sdk.streaming.queries.rules;

import com.vk.api.sdk.streaming.clients.VkStreamingApiClient;
import com.vk.api.sdk.streaming.clients.actors.StreamingActor;
import com.vk.api.sdk.streaming.objects.responses.StreamingResponse;
import com.vk.api.sdk.streaming.queries.StreamingAbstractDeleteQuery;
import com.vk.api.sdk.streaming.queries.rules.payloads.StreamingDeleteRulePayload;

/**
 * Query for DELETE /rules
 */
public class StreamingDeleteRuleQuery extends StreamingAbstractDeleteQuery {

    public StreamingDeleteRuleQuery(VkStreamingApiClient client, StreamingActor actor, String tag) {
        super(client, actor, "rules", StreamingResponse.class);
        setBody(new StreamingDeleteRulePayload(tag));
    }
}

package com.vk.api.sdk.streaming.actions;

import com.vk.api.sdk.streaming.clients.VkStreamingApiClient;
import com.vk.api.sdk.streaming.clients.actors.StreamingActor;
import com.vk.api.sdk.streaming.exceptions.StreamingApiException;
import com.vk.api.sdk.streaming.exceptions.StreamingClientException;
import com.vk.api.sdk.streaming.queries.rules.StreamingAddRuleQuery;
import com.vk.api.sdk.streaming.queries.rules.StreamingDeleteRuleQuery;
import com.vk.api.sdk.streaming.queries.rules.StreamingGetRulesQuery;

/**
 * Streaming rules action
 */
public class StreamingRules extends StreamingAbstractAction {

    public StreamingRules(VkStreamingApiClient streamingClient) {
        super(streamingClient);
    }

    public StreamingGetRulesQuery get(StreamingActor actor) throws StreamingClientException, StreamingApiException {
        return new StreamingGetRulesQuery(getClient(), actor);
    }

    public StreamingAddRuleQuery add(StreamingActor actor, String tag, String value) throws StreamingClientException, StreamingApiException {
        return new StreamingAddRuleQuery(getClient(), actor, tag, value);
    }

    public StreamingDeleteRuleQuery delete(StreamingActor actor, String tag) throws StreamingClientException, StreamingApiException {
        return new StreamingDeleteRuleQuery(getClient(), actor, tag);
    }
}

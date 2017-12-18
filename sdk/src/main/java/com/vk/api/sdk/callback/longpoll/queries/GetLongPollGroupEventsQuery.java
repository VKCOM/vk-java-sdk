package com.vk.api.sdk.callback.longpoll.queries;

import com.vk.api.sdk.callback.longpoll.LongPollQueryBuilder;
import com.vk.api.sdk.callback.longpoll.responses.GetLongPollGroupEventsResponse;
import com.vk.api.sdk.client.VkApiClient;

import java.util.Arrays;
import java.util.List;

public class GetLongPollGroupEventsQuery extends LongPollQueryBuilder<GetLongPollGroupEventsQuery, GetLongPollGroupEventsResponse> {

    private static final String ACT_PARAM_VALUE = "a_check";

    /**
     * Creates a LongPollQueryBuilder instance that can be used to build long polling request with various parameters
     *
     * @param client VK API client
     * @param url    server url
     * @param key    secret key
     * @param ts     timestamp
     */
    public GetLongPollGroupEventsQuery(VkApiClient client, String url, String key, Integer ts) {
        super(client, url, GetLongPollGroupEventsResponse.class);
        act(ACT_PARAM_VALUE);
        key(key);
        ts(ts);
    }

    public GetLongPollGroupEventsQuery waitTime(Integer value) {
        return unsafeParam("wait", value);
    }

    protected GetLongPollGroupEventsQuery key(String value) {
        return unsafeParam("key", value);
    }

    protected GetLongPollGroupEventsQuery ts(Integer value) {
        return unsafeParam("ts", value);
    }

    protected GetLongPollGroupEventsQuery act(String value) {
        return unsafeParam("act", value);
    }

    @Override
    protected GetLongPollGroupEventsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("act", "key", "ts");
    }
}


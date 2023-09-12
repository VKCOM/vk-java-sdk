package com.vk.api.sdk.queries.longpoll;

import com.vk.api.sdk.events.longpoll.LongPollQueryBuilder;
import com.vk.api.sdk.objects.callback.longpoll.responses.GetLongPollEventsResponse;
import com.vk.api.sdk.objects.callback.longpoll.GetLongPollEventsActInfo;
import com.vk.api.sdk.client.VkApiClient;
import java.net.URI;

import java.util.Arrays;
import java.util.List;

public class GetLongPollEventsQuery extends LongPollQueryBuilder<GetLongPollEventsQuery, GetLongPollEventsResponse> {
    /**
     * Creates a LongPollQueryBuilder instance that can be used to build long polling request with various parameters
     *
     * @param client VK API client
     * @param url    server url
     * @param key    secret key
     * @param ts     timestamp
     */
    public GetLongPollEventsQuery(VkApiClient client, URI url, String key, String ts) {
        super(client, url, GetLongPollEventsResponse.class);
        act(GetLongPollEventsActInfo.CHECK);
        key(key);
        ts(ts);
    }

    public GetLongPollEventsQuery waitTime(Integer value) {
        return unsafeParam("wait", value);
    }

    protected GetLongPollEventsQuery key(String value) {
        return unsafeParam("key", value);
    }

    protected GetLongPollEventsQuery ts(String value) {
        return unsafeParam("ts", value);
    }

    protected GetLongPollEventsQuery act(GetLongPollEventsActInfo actInfo) {
        return unsafeParam("act", actInfo.getValue());
    }

    @Override
    protected GetLongPollEventsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("act", "key", "ts");
    }
}


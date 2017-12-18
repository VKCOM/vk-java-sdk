package com.vk.api.sdk.queries.groups.longpoll;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.groups.longpoll.GetEventsResponse;

import java.util.Arrays;
import java.util.List;

public class GetEventsLongPollQuery extends LongPollQueryBuilder<GetEventsLongPollQuery, GetEventsResponse> {

    private static final String ACT_PARAM_VALUE = "a_check";

    public GetEventsLongPollQuery(VkApiClient client, String url, String key, Integer ts) {
        super(client, url, GetEventsResponse.class);
        act(ACT_PARAM_VALUE);
        key(key);
        ts(ts);
    }

    public GetEventsLongPollQuery waitParam(Integer value) {
        return unsafeParam("wait", value);
    }

    protected GetEventsLongPollQuery key(String value) {
        return unsafeParam("key", value);
    }

    protected GetEventsLongPollQuery ts(Integer value) {
        return unsafeParam("ts", value);
    }

    protected GetEventsLongPollQuery act(String value) {
        return unsafeParam("act", value);
    }

    @Override
    protected GetEventsLongPollQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("act", "key", "ts");
    }
}

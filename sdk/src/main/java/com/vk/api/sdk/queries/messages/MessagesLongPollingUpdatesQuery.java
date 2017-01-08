package com.vk.api.sdk.queries.messages;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.vk.api.sdk.client.ApiRequest;
import com.vk.api.sdk.client.ClientResponse;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.objects.updates.responses.LongPollingUpdatesResponse;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Denis Kokorin
 */
public class MessagesLongPollingUpdatesQuery extends ApiRequest<LongPollingUpdatesResponse>{
    private String server;
    private final Map<String, String> params = new HashMap<>();

    public MessagesLongPollingUpdatesQuery(VkApiClient client) {
        super(client.getTransportClient(), client.getGson(), LongPollingUpdatesResponse.class);
        params.put("act", "a_check");
        params.put("wait", "25");
    }

    public MessagesLongPollingUpdatesQuery server(String server) {
        this.server = server;
        return this;
    }

    public MessagesLongPollingUpdatesQuery key(String key) {
        params.put("key", key);
        return this;
    }

    public MessagesLongPollingUpdatesQuery ts(Integer ts) {
        params.put("ts", String.valueOf(ts));
        return this;
    }

    public MessagesLongPollingUpdatesQuery waitTime(Integer wait) {
        params.put("wait", String.valueOf(wait));
        return this;
    }

    public MessagesLongPollingUpdatesQuery modes(MessagesLongPolliingUpdatesMode... modes) {
        int value = 0;
        for (MessagesLongPolliingUpdatesMode mode : modes) {
            value += mode.getValue();
        }

        params.put("mode", String.valueOf(value));
        return this;
    }

    public MessagesLongPollingUpdatesQuery act(String act) {
        params.put("act", act);
        return this;
    }

    public MessagesLongPollingUpdatesQuery version(String version) {
        params.put("version", version);
        return this;
    }

    @Override
    protected ClientResponse sendRequest(TransportClient client) throws IOException {
        if (StringUtils.isEmpty(server)) {
            throw new IllegalArgumentException("Server address is required");
        }
        if (!params.containsKey("key")) {
            throw new IllegalArgumentException("Key is required");
        }

        String url = "https://" + server + "?" + urlEncodeParams(params);
        return client.get(url);
    }

    @Override
    protected String getExpectedContentType() {
        return "text/javascript";
    }

    @Override
    protected JsonElement handleJson(JsonObject json, Gson gson) throws ApiException {
        return json;
    }
}

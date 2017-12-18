package com.vk.api.sdk.callback.longpoll;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.vk.api.sdk.client.ApiRequest;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.exceptions.LongPollServerKeyExpiredException;
import com.vk.api.sdk.exceptions.LongPollServerTsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class LongPollQueryBuilder<T, R> extends ApiRequest<R> {

    private static final Logger LOG = LoggerFactory.getLogger(LongPollQueryBuilder.class);
    private static final Integer RETRY_ATTEMPTS = 3;

    private static final int INCORRECT_TS_VALUE_ERROR_CODE = 1;
    private static final int TOKEN_EXPIRED_ERROR_CODE = 2;

    private static final String FAILED_CODE = "failed";

    private final Map<String, String> params = new HashMap<>();

    public LongPollQueryBuilder(VkApiClient client, String url, Type type) {
        super(url, client.getTransportClient(), client.getGson(), RETRY_ATTEMPTS, type);
    }

    private static String escape(String data) {
        try {
            return URLEncoder.encode(data, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }

    protected T key(String key) {
        return unsafeParam("key", key);
    }

    public T unsafeParam(String key, String value) {
        params.put(key, value);
        return getThis();
    }

    public T unsafeParam(String key, int value) {
        return unsafeParam(key, Integer.toString(value));
    }

    private static String mapToGetString(Map<String, String> params) {
        return params.entrySet().stream()
                .map(entry -> entry.getKey() + "=" + (entry.getValue() != null ? escape(entry.getValue()) : ""))
                .collect(Collectors.joining("&"));
    }

    @Override
    protected String getBody() {
        return mapToGetString(build());
    }

    protected abstract T getThis();

    protected abstract Collection<String> essentialKeys();

    public Map<String, String> build() {
        if (!params.keySet().containsAll(essentialKeys())) {
            throw new IllegalArgumentException("Not all the keys are passed: essential keys are " + essentialKeys());
        }

        return Collections.unmodifiableMap(params);
    }

    @Override
    public R execute() throws ApiException, ClientException {
        String textResponse = executeAsString();
        JsonReader jsonReader = new JsonReader(new StringReader(textResponse));
        JsonObject json = (JsonObject) new JsonParser().parse(jsonReader);
        if (json.has(FAILED_CODE)) {
            JsonPrimitive failedParam = json.getAsJsonPrimitive(FAILED_CODE);
            int code = failedParam.getAsInt();
            switch (code) {
                case INCORRECT_TS_VALUE_ERROR_CODE:
                    int ts = json.getAsJsonPrimitive("ts").getAsInt();
                    throw new LongPollServerTsException("\'ts\' value is incorrect, minimal value is 1, maximal value is " + ts);
                case TOKEN_EXPIRED_ERROR_CODE:
                    throw new LongPollServerKeyExpiredException("Try to generate a new key.");
                default:
                    throw new ClientException("Unknown LongPollServer exception, something went wrong.");
            }
        }

        try {
            return getGson().fromJson(json, getResponseClass());
        } catch (JsonSyntaxException e) {
            LOG.error("Invalid JSON: " + textResponse, e);
            throw new ClientException("Can't parse json response");
        }
    }

}


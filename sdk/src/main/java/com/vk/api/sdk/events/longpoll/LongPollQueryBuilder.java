package com.vk.api.sdk.events.longpoll;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.vk.api.sdk.client.ApiRequest;
import com.vk.api.sdk.client.ClientResponse;
import com.vk.api.sdk.client.ClientResponseTypeable;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.exceptions.*;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.util.*;
import java.util.stream.Collectors;
import java.net.URI;

public abstract class LongPollQueryBuilder<T, R> extends ApiRequest<R> {

    private static final Logger LOG = LoggerFactory.getLogger(LongPollQueryBuilder.class);
    private static final Integer RETRY_ATTEMPTS = 3;

    private static final int INCORRECT_TS_VALUE_ERROR_CODE = 1;
    private static final int TOKEN_EXPIRED_ERROR_CODE = 2;

    private static final String FAILED_CODE = "failed";

    private final Map<String, String> params = new HashMap<>();

    private final List<Header> headers = new ArrayList<>();

    public LongPollQueryBuilder(VkApiClient client, URI url, Type type) {
        super(url.toString(), client.getTransportClient(), client.getGson(), RETRY_ATTEMPTS, type);
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

    /**
     * Add header to request
     *
     * @param header Header to be added to the request
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public T withHeader(BasicHeader header) {
        headers.add(header);
        return getThis();
    }

    /**
     * Add multiple headers to request
     *
     * @param list List of headers which need to be added to request
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public T withHeaders(List<BasicHeader> list) {
        headers.addAll(list);
        return getThis();
    }

    @Override
    protected String getBody() {
        return mapToGetString(build());
    }

    @Override
    protected Header[] getQueryHeaders() {
        List<Header> result = new ArrayList<>(this.headers);
        return result.toArray(new Header[0]);
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
        return parseClientResponse(executeAsStringWithReturningFullInfo());
    }

    @Override
    public ClientResponseTypeable<R> executeTypeable() throws ApiExtendedException, ClientException {
        ClientResponse response = executeAsStringWithReturningFullInfo();

        return new ClientResponseTypeable<R>(
                response.getStatusCode(),
                parseClientResponse(response),
                response.getHeaders()
        );
    }

    private R parseClientResponse(ClientResponse response) throws ClientException, ApiExtendedException {
        String textResponse = response.getContent();
        JsonReader jsonReader = new JsonReader(new StringReader(textResponse));
        JsonObject json = (JsonObject) new JsonParser().parse(jsonReader);
        if (json.has(FAILED_CODE)) {
            JsonPrimitive failedParam = json.getAsJsonPrimitive(FAILED_CODE);
            int code = failedParam.getAsInt();
            switch (code) {
                case INCORRECT_TS_VALUE_ERROR_CODE:
                    int ts = json.getAsJsonPrimitive("ts").getAsInt();
                    throw new LongPollServerTsException(
                            response.getStatusCode(),
                            "\'ts\' value is incorrect, minimal value is 1, maximal value is " + ts,
                            response.getHeaders()
                    );
                case TOKEN_EXPIRED_ERROR_CODE:
                    throw new LongPollServerKeyExpiredException(
                            response.getStatusCode(),
                            "Try to generate a new key.",
                            response.getHeaders()
                    );
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


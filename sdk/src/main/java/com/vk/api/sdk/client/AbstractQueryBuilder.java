package com.vk.api.sdk.client;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ExceptionMapper;
import com.vk.api.sdk.objects.base.Error;
import com.vk.api.sdk.queries.EnumParam;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

/**
 * Query builder for API request
 */
public abstract class AbstractQueryBuilder<T, R> extends ApiRequest<R> {

    private static final Logger LOG = LogManager.getLogger(AbstractQueryBuilder.class);

    private final Map<String, String> params = new HashMap<>();

    private final String endpoint;
    private final String method;

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param method method name
     * @param type   type of method response
     */
    public AbstractQueryBuilder(VkApiClient client, String method, Type type) {
        this(client, client.getApiEndpoint(), method, type);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   VK API client
     * @param type     type of method response
     * @param endpoint server's address
     * @param method   method name
     */
    public AbstractQueryBuilder(VkApiClient client, String endpoint, String method, Type type) {
        super(client.getTransportClient(), client.getGson(), type);
        this.endpoint = endpoint;
        this.method = method;
        version(client.getVersion());
    }

    /**
     * Convert boolean value to integer flag
     *
     * @param param value
     * @return integer flag
     */
    private static String boolAsParam(boolean param) {
        return param ? "1" : "0";
    }

    /**
     * Set access token
     *
     * @param value access token
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected T accessToken(String value) {
        return unsafeParam("access_token", value);
    }

    /**
     * Set lang
     *
     * @param value lang
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public T lang(Lang value) {
        return unsafeParam("lang", value.getValue());
    }

    /**
     * Set version
     *
     * @param value version
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected T version(String value) {
        return unsafeParam("v", value);
    }


    /**
     * Set captcha sid
     *
     * @param value captcha sid
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public T captchaSid(String value) {
        return unsafeParam("captcha_sid", value);
    }

    /**
     * Set captcha key
     *
     * @param value captcha key
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public T captchaKey(String value) {
        return unsafeParam("captcha_key", value);
    }

    /**
     * Set confirmation
     *
     * @param value confirm
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public T confirm(Boolean value) {
        return unsafeParam("confirm", value);
    }


    /**
     * Set parameter
     *
     * @param key   name of parameter
     * @param value value of parameter
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public T unsafeParam(String key, String value) {
        params.put(key, value);
        return getThis();
    }

    /**
     * Set parameter
     *
     * @param key   name of parameter
     * @param value value of parameter
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public T unsafeParam(String key, int value) {
        return unsafeParam(key, Integer.toString(value));
    }

    /**
     * Set parameter
     *
     * @param key   name of parameter
     * @param value value of parameter
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public T unsafeParam(String key, boolean value) {
        return unsafeParam(key, boolAsParam(value));
    }

    /**
     * Set parameter
     *
     * @param key   name of parameter
     * @param value value of parameter
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public T unsafeParam(String key, Collection<?> value) {
        return unsafeParam(key, value.stream().map(Objects::toString).collect(Collectors.joining(",")));
    }

    /**
     * Set parameter
     *
     * @param key   name of parameter
     * @param value value of parameter
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public <U> T unsafeParam(String key, U... value) {
        return unsafeParam(key, asList(value));
    }

    /**
     * Set parameter
     *
     * @param key   name of parameter
     * @param value value of parameter
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public T unsafeParam(String key, int[] value) {
        return unsafeParam(key, IntStream.of(value).mapToObj(Integer::toString).collect(Collectors.joining(",")));
    }

    /**
     * Set parameter
     *
     * @param key   name of parameter
     * @param value value of parameter
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public T unsafeParam(String key, double value) {
        return unsafeParam(key, Double.toString(value));
    }

    /**
     * Set parameter
     *
     * @param key   name of parameter
     * @param value value of parameter
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public T unsafeParam(String key, EnumParam value) {
        return unsafeParam(key, value.getValue());
    }

    /**
     * Set parameter
     *
     * @param key    name of parameter
     * @param fields value of parameter
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public T unsafeParam(String key, EnumParam... fields) {
        return unsafeParam(key, Arrays.stream(fields).map(EnumParam::getValue).collect(Collectors.joining(",")));
    }

    /**
     * Set parameter
     *
     * @param key    name of parameter
     * @param fields value of parameter
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public T unsafeParam(String key, List<? extends EnumParam> fields) {
        return unsafeParam(key, fields.stream().map(EnumParam::getValue).collect(Collectors.joining(",")));
    }

    /**
     * Get reference to this object
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected abstract T getThis();

    /**
     * Get list of required parameter names
     *
     * @return list of names
     */
    protected abstract Collection<String> essentialKeys();

    /**
     * Get map of parameter values
     *
     * @return map of values
     */
    public Map<String, String> build() {
        if (!params.keySet().containsAll(essentialKeys())) {
            throw new IllegalArgumentException("Not all the keys are passed: essential keys are " + essentialKeys());
        }

        return Collections.unmodifiableMap(params);
    }

    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Get method name
     *
     * @return method name
     */
    public String getMethod() {
        return method;
    }

    @Override
    protected ClientResponse sendRequest(TransportClient client) throws IOException {
        return client.post(endpoint + method, urlEncodeParams(build()));
    }

    @Override
    protected String getExpectedContentType() {
        return "application/json";
    }

    @Override
    protected JsonElement handleJson(JsonObject json, Gson gson) throws ApiException {
        if (json.has("error")) {
            JsonElement errorElement = json.get("error");
            Error error = gson.fromJson(errorElement, Error.class);
            ApiException exception = ExceptionMapper.parseException(error);
            LOG.error("API error", exception);
            throw exception;
        }

        if (json.has("response")) {
            return json.get("response");
        }

        return json;
    }

    protected String getParam(String key) {
        return params.get(key);
    }
}

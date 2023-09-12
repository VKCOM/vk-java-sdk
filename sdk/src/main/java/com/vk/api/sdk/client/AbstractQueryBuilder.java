package com.vk.api.sdk.client;

import com.vk.api.sdk.queries.EnumParam;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

/**
 * Query builder for API request
 */
public abstract class AbstractQueryBuilder<T, R> extends ApiRequest<R> {

    private final Map<String, String> params = new HashMap<String, String>();
    private final List<Header> headers = new ArrayList<>();

    private String method;

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param method method name
     * @param type   type of method response
     */
    public AbstractQueryBuilder(VkApiClient client, String method, Type type) {
        super(client.getApiEndpoint() + method, client.getTransportClient(), client.getGson(), client.getRetryAttemptsInternalServerErrorCount(), type);
        this.method = method;
        version(client.getVersion());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   VK API client
     * @param endpoint API endpoint
     * @param method   method name
     * @param type     type of method response
     */
    public AbstractQueryBuilder(VkApiClient client, String endpoint, String method, Type type) {
        super(endpoint + method, client.getTransportClient(), client.getGson(), client.getRetryAttemptsInternalServerErrorCount(), type);
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
     * Build request parameter map to query
     *
     * @param params parameters
     * @return string query
     */
    private static String mapToGetString(Map<String, String> params) {
        return params.entrySet().stream()
                .map(entry -> entry.getKey() + "=" + (entry.getValue() != null ? escape(entry.getValue()) : ""))
                .collect(Collectors.joining("&"));
    }

    /**
     * Encode request data
     *
     * @param data request data
     * @return encoded data
     */
    private static String escape(String data) {
        try {
            return URLEncoder.encode(data, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
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
     * Set client secret
     *
     * @param value client secret
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected T clientSecret(String value) {
        return unsafeParam("client_secret", value);
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
    public T unsafeParam(String key, float value) {
        return unsafeParam(key, Float.toString(value));
    }

    /**
     * Set parameter
     *
     * @param key   name of parameter
     * @param value value of parameter
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public T unsafeParam(String key, Long value) {
        return unsafeParam(key, Long.toString(value));
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

    /**
     * Get method name
     *
     * @return method name
     */
    public String getMethod() {
        return method;
    }

    /**
     * Get params
     *
     * @return parameters of method
     */
    public Map<String, String> getParams() {
        return params;
    }

    public String toString(){
        return this.getMethod();
    }
}

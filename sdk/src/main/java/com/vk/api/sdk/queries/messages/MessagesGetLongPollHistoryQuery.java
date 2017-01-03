package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.ClientResponse;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.messages.responses.GetLongPollHistoryResponse;
import com.vk.api.sdk.queries.EnumParam;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Query for Messages.getLongPollHistory method
 */
public class MessagesGetLongPollHistoryQuery extends AbstractQueryBuilder<MessagesGetLongPollHistoryQuery, GetLongPollHistoryResponse> {
    private static String SERVER_PARAM = "server";
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public MessagesGetLongPollHistoryQuery(VkApiClient client) {
        super(client, "messages.getLongPollHistory", GetLongPollHistoryResponse.class);
        //TODO is's unclear from documentation, which values can be passed for an "act" parameter
        unsafeParam("act", "a_check");
    }

    /**
     * Server address to which a request needs to be sent.
     *
     * @param value value of "server" parameter. Required.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetLongPollHistoryQuery server(String value) {
        return unsafeParam(SERVER_PARAM, value);
    }

    /**
     * The session's secret key. Do not miss with "access_token".
     *
     * @param value value of "server" parameter. Required.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetLongPollHistoryQuery key(String value) {
        return unsafeParam("key", value);
    }

    /**
     * Last value of the "ts" parameter returned from the Long Poll server or by using messages.getLongPollServer method.
     *
     * @param value value of "ts" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetLongPollHistoryQuery ts(Integer value) {
        return unsafeParam("ts", value);
    }

    /**
     * Set pts
     *
     * @param value value of "pts" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetLongPollHistoryQuery pts(Integer value) {
        return unsafeParam("pts", value);
    }

    /**
     * Set request modes
     *
     * @param modes value of "mode" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetLongPollHistoryQuery mode(MessagesGetLongPollHistoryMode... modes) {
        int value = 0;
        for (MessagesGetLongPollHistoryMode mode : modes) {
            value += mode.getValue();
        }

        return unsafeParam("mode", value);
    }

    /**
     * Set request wait time
     *
     * @param value long-poll server wait time in seconds. Value of 25 is recommeded.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetLongPollHistoryQuery wait(Integer value) {
        return unsafeParam("wait", value);
    }

    /**
     * Number of characters after which to truncate a previewed message. To preview the full message, specify "0".
     * NOTE: Messages are not truncated by default. Messages are truncated by words.
     *
     * @param value value of "preview length" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetLongPollHistoryQuery previewLength(Integer value) {
        return unsafeParam("preview_length", value);
    }

    /**
     * Return user onlines
     *
     * @param value value of "onlines" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetLongPollHistoryQuery onlines(Boolean value) {
        return unsafeParam("onlines", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetLongPollHistoryQuery fields(EnumParam... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetLongPollHistoryQuery fields(List<EnumParam> value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set events limit
     *
     * @param value value of "events limit" parameter. Minimum is 1000. By default 1000.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetLongPollHistoryQuery eventsLimit(Integer value) {
        return unsafeParam("events_limit", value);
    }

    /**
     * Set messages limit
     *
     * @param value value of "msgs limit" parameter. Minimum is 200. By default 200.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetLongPollHistoryQuery msgsLimit(Integer value) {
        return unsafeParam("msgs_limit", value);
    }

    /**
     * Maximum ID of the message among existing ones in the local copy. Both messages received with API methods (for example, messages.getDialogs]], [[messages.getHistory), and data received from a Long Poll server (events with code 4) are taken into account.
     *
     * @param value value of "max msg id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetLongPollHistoryQuery maxMsgId(Integer value) {
        return unsafeParam("max_msg_id", value);
    }

    @Override
    protected MessagesGetLongPollHistoryQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList(SERVER_PARAM, "key", "ts");
    }

    @Override
    protected ClientResponse sendRequest(TransportClient client) throws IOException {
        String baseUrl = getParam(SERVER_PARAM);
        String query = urlEncodeParams(build());
        return client.get(baseUrl + "?" + query);
    }

    @Override
    public Map<String, String> build() {
        //We have to skip SERVER_PARAM since we use it as request URL
        Map<String, String> result = new HashMap<>(super.build());
        result.remove(SERVER_PARAM);
        return result;
    }
}

package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.objects.enums.MessagesIntent;
import com.vk.api.sdk.objects.messages.responses.GetIntentUsersResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getIntentUsers method
 */
public class MessagesGetIntentUsersQuery extends AbstractQueryBuilder<MessagesGetIntentUsersQuery, GetIntentUsersResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param intent value of "intent" parameter.
     */
    public MessagesGetIntentUsersQuery(VkApiClient client, GroupActor actor,
            MessagesIntent intent) {
        super(client, "messages.getIntentUsers", GetIntentUsersResponse.class);
        accessToken(actor.getAccessToken());
        intent(intent);
    }

    /**
     * Set intent
     *
     * @param value value of "intent" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetIntentUsersQuery intent(MessagesIntent value) {
        return unsafeParam("intent", value);
    }

    /**
     * Set subscribe id
     *
     * @param value value of "subscribe id" parameter. Maximum is 100. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetIntentUsersQuery subscribeId(Integer value) {
        return unsafeParam("subscribe_id", value);
    }

    /**
     * Set offset
     *
     * @param value value of "offset" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetIntentUsersQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Set count
     *
     * @param value value of "count" parameter. Maximum is 200. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetIntentUsersQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Set extended
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetIntentUsersQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * name_case
     * Set name case
     *
     * @param value value of "name case" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetIntentUsersQuery nameCase(String... value) {
        return unsafeParam("name_case", value);
    }

    /**
     * Set name case
     *
     * @param value value of "name case" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetIntentUsersQuery nameCase(List<String> value) {
        return unsafeParam("name_case", value);
    }

    /**
     * fields
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetIntentUsersQuery fields(String... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetIntentUsersQuery fields(List<String> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected MessagesGetIntentUsersQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("intent", "access_token");
    }
}

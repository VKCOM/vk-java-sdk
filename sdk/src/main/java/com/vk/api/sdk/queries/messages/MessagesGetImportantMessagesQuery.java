package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.UserGroupFields;
import com.vk.api.sdk.objects.messages.responses.GetImportantMessagesResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getImportantMessages method
 */
public class MessagesGetImportantMessagesQuery extends AbstractQueryBuilder<MessagesGetImportantMessagesQuery, GetImportantMessagesResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesGetImportantMessagesQuery(VkApiClient client, UserActor actor) {
        super(client, "messages.getImportantMessages", GetImportantMessagesResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesGetImportantMessagesQuery(VkApiClient client, GroupActor actor) {
        super(client, "messages.getImportantMessages", GetImportantMessagesResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
    }

    /**
     * Amount of needed important messages.
     *
     * @param value value of "count" parameter. Maximum is 200. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetImportantMessagesQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Set offset
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetImportantMessagesQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Set start message id
     *
     * @param value value of "start message id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetImportantMessagesQuery startMessageId(Integer value) {
        return unsafeParam("start_message_id", value);
    }

    /**
     * Maximum length of messages body.
     *
     * @param value value of "preview length" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetImportantMessagesQuery previewLength(Integer value) {
        return unsafeParam("preview_length", value);
    }

    /**
     * Return extended properties
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetImportantMessagesQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Group ID (for group messages with group access token)
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetImportantMessagesQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * fields
     * Actors fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetImportantMessagesQuery fields(UserGroupFields... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Actors fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetImportantMessagesQuery fields(List<UserGroupFields> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected MessagesGetImportantMessagesQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

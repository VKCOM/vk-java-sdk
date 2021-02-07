package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.UserGroupFields;
import com.vk.api.sdk.objects.messages.responses.GetImportantMessagesExtendedResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getImportantMessages method
 */
public class MessagesGetImportantMessagesQueryWithExtended extends AbstractQueryBuilder<MessagesGetImportantMessagesQueryWithExtended, GetImportantMessagesExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesGetImportantMessagesQueryWithExtended(VkApiClient client, UserActor actor) {
        super(client, "messages.getImportantMessages", GetImportantMessagesExtendedResponse.class);
        accessToken(actor.getAccessToken());
        extended(true);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesGetImportantMessagesQueryWithExtended(VkApiClient client, GroupActor actor) {
        super(client, "messages.getImportantMessages", GetImportantMessagesExtendedResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        extended(true);
    }

    /**
     * Amount of needed important messages.
     *
     * @param value value of "count" parameter. Maximum is 200. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetImportantMessagesQueryWithExtended count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Set offset
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetImportantMessagesQueryWithExtended offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Set start message id
     *
     * @param value value of "start message id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetImportantMessagesQueryWithExtended startMessageId(Integer value) {
        return unsafeParam("start_message_id", value);
    }

    /**
     * Maximum length of messages body.
     *
     * @param value value of "preview length" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetImportantMessagesQueryWithExtended previewLength(Integer value) {
        return unsafeParam("preview_length", value);
    }

    /**
     * Return extended properties
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetImportantMessagesQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Group ID (for group messages with group access token)
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetImportantMessagesQueryWithExtended groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * fields
     * Actors fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetImportantMessagesQueryWithExtended fields(UserGroupFields... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Actors fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetImportantMessagesQueryWithExtended fields(List<UserGroupFields> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected MessagesGetImportantMessagesQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

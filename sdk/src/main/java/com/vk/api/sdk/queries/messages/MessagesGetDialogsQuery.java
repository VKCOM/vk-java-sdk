package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.messages.responses.GetDialogsResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getDialogs method
 */
public class MessagesGetDialogsQuery extends AbstractQueryBuilder<MessagesGetDialogsQuery, GetDialogsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public MessagesGetDialogsQuery(VkApiClient client, UserActor actor) {
        super(client, "messages.getDialogs", GetDialogsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public MessagesGetDialogsQuery(VkApiClient client, GroupActor actor) {
        super(client, "messages.getDialogs", GetDialogsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Offset needed to return a specific subset of messages.
     *
     * @param value value of "offset" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetDialogsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of messages to return.
     *
     * @param value value of "count" parameter. Maximum is 200. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetDialogsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * ID of the message from what to return dialogs.
     *
     * @param value value of "start message id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetDialogsQuery startMessageId(Integer value) {
        return unsafeParam("start_message_id", value);
    }

    /**
     * Number of characters after which to truncate a previewed message.
     * To preview the full message, specify "0".
     * NOTE: Messages are not truncated by default. Messages are truncated by words.
     *
     * @param value value of "preview length" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetDialogsQuery previewLength(Integer value) {
        return unsafeParam("preview_length", value);
    }

    /**
     * Return unread dialogs only.
     *
     * @param value value of "unread" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetDialogsQuery unread(Boolean value) {
        return unsafeParam("unread", value);
    }

    /**
     * Return important dialogs only.
     *
     * @param value value of "important" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetDialogsQuery important(Boolean value) {
        return unsafeParam("important", value);
    }

    /**
     * Return unanswered dialogs only.
     *
     * @param value value of "unanswered" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetDialogsQuery unanswered1(Boolean value) {
        return unsafeParam("unanswered", value);
    }

    @Override
    protected MessagesGetDialogsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

package com.vk.api.sdk.queries.notifications;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.notifications.SendMessageItem;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Notifications.sendMessage method
 */
public class NotificationsSendMessageQuery extends AbstractQueryBuilder<NotificationsSendMessageQuery, List<SendMessageItem>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param message value of "message" parameter.
     * @param userIds value of "user ids" parameter.
     */
    public NotificationsSendMessageQuery(VkApiClient client, UserActor actor, String message,
            Integer... userIds) {
        super(client, "notifications.sendMessage", Utils.buildParametrizedType(List.class, SendMessageItem.class));
        accessToken(actor.getAccessToken());
        message(message);
        userIds(userIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param message value of "message" parameter.
     * @param userIds value of "user ids" parameter.
     */
    public NotificationsSendMessageQuery(VkApiClient client, UserActor actor, String message,
            List<Integer> userIds) {
        super(client, "notifications.sendMessage", Utils.buildParametrizedType(List.class, SendMessageItem.class));
        accessToken(actor.getAccessToken());
        message(message);
        userIds(userIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param message value of "message" parameter.
     * @param userIds value of "user ids" parameter.
     */
    public NotificationsSendMessageQuery(VkApiClient client, ServiceActor actor, String message,
            Integer... userIds) {
        super(client, "notifications.sendMessage", Utils.buildParametrizedType(List.class, SendMessageItem.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        message(message);
        userIds(userIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param message value of "message" parameter.
     * @param userIds value of "user ids" parameter.
     */
    public NotificationsSendMessageQuery(VkApiClient client, ServiceActor actor, String message,
            List<Integer> userIds) {
        super(client, "notifications.sendMessage", Utils.buildParametrizedType(List.class, SendMessageItem.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        message(message);
        userIds(userIds);
    }

    /**
     * Set message
     *
     * @param value value of "message" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected NotificationsSendMessageQuery message(String value) {
        return unsafeParam("message", value);
    }

    /**
     * Set fragment
     *
     * @param value value of "fragment" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotificationsSendMessageQuery fragment(String value) {
        return unsafeParam("fragment", value);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotificationsSendMessageQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * user_ids
     * Set user ids
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected NotificationsSendMessageQuery userIds(Integer... value) {
        return unsafeParam("user_ids", value);
    }

    /**
     * Set user ids
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected NotificationsSendMessageQuery userIds(List<Integer> value) {
        return unsafeParam("user_ids", value);
    }

    @Override
    protected NotificationsSendMessageQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("user_ids", "message", "access_token");
    }
}

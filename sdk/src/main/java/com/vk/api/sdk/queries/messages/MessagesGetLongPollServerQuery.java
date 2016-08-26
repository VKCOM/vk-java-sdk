package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.messages.LongpollParams;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getLongPollServer method
 */
public class MessagesGetLongPollServerQuery extends AbstractQueryBuilder<MessagesGetLongPollServerQuery, LongpollParams> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public MessagesGetLongPollServerQuery(VkApiClient client, Actor actor) {
        super(client, "messages.getLongPollServer", LongpollParams.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ''1'' - to use SSL.
     *
     * @param value value of "use ssl" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetLongPollServerQuery useSsl(Boolean value) {
        return unsafeParam("use_ssl", value);
    }

    /**
     * ''1'' - to return the "pts" field, needed for the messages.getLongPollHistory method.
     *
     * @param value value of "need pts" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetLongPollServerQuery needPts(Boolean value) {
        return unsafeParam("need_pts", value);
    }

    @Override
    protected MessagesGetLongPollServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

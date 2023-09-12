package com.vk.api.sdk.actions;

import com.vk.api.sdk.queries.longpoll.GetLongPollEventsQuery;
import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import java.net.URI;

public class LongPoll extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public LongPoll(VkApiClient client) {
        super(client);
    }

    /**
     * Retrieves events from long poll server starting from the specified timestamp.
     */
    public GetLongPollEventsQuery getEvents(URI url, String key, String ts) {
        return new GetLongPollEventsQuery(getClient(), url, key, ts);
    }
}

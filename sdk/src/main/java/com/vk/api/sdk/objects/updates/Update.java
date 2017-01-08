package com.vk.api.sdk.objects.updates;

import com.google.gson.annotations.JsonAdapter;
import com.vk.api.sdk.deserializers.LongPollingUpdateDeserializer;

/**
 * Marker interface for any long-polling update
 * @author Denis Kokorin
 * @see <a href="https://vk.com/dev/using_longpoll">Connecting to the LongPoll Server</a>
 *
 */
@JsonAdapter(LongPollingUpdateDeserializer.class)
public interface Update {
}

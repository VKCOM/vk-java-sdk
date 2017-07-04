package com.vk.api.sdk.streaming;


import com.vk.api.sdk.streaming.objects.StreamingCallbackMessage;

/**
 * Handler for messages from stream
 */
public abstract class StreamingEventHandler {

    public abstract void handle(StreamingCallbackMessage message);
}

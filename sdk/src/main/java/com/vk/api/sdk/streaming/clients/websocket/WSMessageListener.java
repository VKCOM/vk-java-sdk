package com.vk.api.sdk.streaming.clients.websocket;

import com.google.gson.Gson;
import com.vk.api.sdk.streaming.clients.StreamingEventHandler;
import com.vk.api.sdk.streaming.objects.StreamingCallbackMessage;
import org.asynchttpclient.ws.WebSocket;
import org.asynchttpclient.ws.WebSocketTextListener;

/**
 * Listener for messages
 */
public class WSMessageListener implements WebSocketTextListener {

    private StreamingEventHandler handler;
    private Gson gson;

    public WSMessageListener(Gson gson, StreamingEventHandler handler) {
        this.handler = handler;
        this.gson = gson;
    }

    @Override
    public void onMessage(String message) {
        handler.handle(gson.fromJson(message, StreamingCallbackMessage.class));
    }

    @Override
    public void onOpen(WebSocket websocket) {
    }

    @Override
    public void onClose(WebSocket websocket) {
    }

    @Override
    public void onError(Throwable t) {
    }
}

package com.vk.api.sdk.streaming.clients.websocket;

import com.google.gson.Gson;
import com.vk.api.sdk.streaming.clients.StreamingEventHandler;
import com.vk.api.sdk.streaming.objects.StreamingCallbackMessage;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.asynchttpclient.ws.WebSocket;
import org.asynchttpclient.ws.WebSocketListener;

/**
 * Listener for messages
 */
public class WSMessageListener implements WebSocketListener {

    private StreamingEventHandler handler;
    private Gson gson;
    private static final Logger LOG = LoggerFactory.getLogger(WSMessageListener.class);


    public WSMessageListener(Gson gson, StreamingEventHandler handler) {
        this.handler = handler;
        this.gson = gson;
    }

    public void onTextFrame(String message, boolean finalFragment, int rsv) {
        handler.handle(gson.fromJson(message, StreamingCallbackMessage.class));
    }

    @Override
    public void onOpen(WebSocket websocket) {
        LOG.info("Open websocket" + websocket);
    }

    public void onClose(WebSocket websocket) {
        LOG.info("Close websocket" + websocket);
    }

    public void onClose(WebSocket websocket, int code, String reason) {
        LOG.info("Close websocket" + websocket);
    }

    @Override
    public void onError(Throwable t) {
        LOG.info("Websocket error " + t);
    }
}


package com.vk.api.sdk.streaming.clients.websocket;

import org.asynchttpclient.ws.WebSocket;
import org.asynchttpclient.ws.WebSocketPingListener;

/**
 * Listener for ping messages
 */
public class WSPingListener implements WebSocketPingListener {

    private WebSocket webSocket;

    @Override
    public void onPing(byte[] message) {
        webSocket.sendPong(message);
    }

    @Override
    public void onOpen(WebSocket websocket) {
        webSocket = websocket;
    }

    @Override
    public void onClose(WebSocket websocket) {
    }

    @Override
    public void onError(Throwable t) {
    }
}

package com.vk.api.sdk.streaming.clients.websocket;

import org.asynchttpclient.ws.WebSocket;
import org.asynchttpclient.ws.WebSocketListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Listener for ping messages
 */
public class WSPingListener implements WebSocketListener {

    private WebSocket webSocket;
    private static final Logger LOG = LogManager.getLogger(WSMessageListener.class);

    public void onOpen(WebSocket websocket) {
        webSocket = websocket;
    }

    public void onClose(WebSocket websocket) {
        LOG.info("Close websocket" + websocket);
    }

    public void onClose(WebSocket websocket, int code, String reason) {
        LOG.info("Close websocket" + websocket);
    }

    @Override
    public void onPingFrame(byte[] payload){
        webSocket.sendPongFrame(payload);
    }
    
    @Override
    public void onError(Throwable t) {
        LOG.info("Websocket error " + t);
    }
}

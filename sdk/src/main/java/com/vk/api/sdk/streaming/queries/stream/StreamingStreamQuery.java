package com.vk.api.sdk.streaming.queries.stream;

import com.google.gson.Gson;
import com.vk.api.sdk.streaming.clients.StreamingEventHandler;
import com.vk.api.sdk.streaming.clients.VkStreamingApiClient;
import com.vk.api.sdk.streaming.clients.actors.StreamingActor;
import com.vk.api.sdk.streaming.clients.websocket.WSMessageListener;
import com.vk.api.sdk.streaming.clients.websocket.WSPingListener;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.ws.WebSocket;
import org.asynchttpclient.ws.WebSocketUpgradeHandler;

import java.util.concurrent.ExecutionException;

/**
 * Streaming stream query via web sockets
 */
public class StreamingStreamQuery {

    private static final String WEB_SOCKET_SCHEMA = "wss://";
    private StreamingEventHandler handler;
    private Gson gson;
    private String url;
    private AsyncHttpClient client;

    public StreamingStreamQuery(VkStreamingApiClient client, StreamingActor actor, StreamingEventHandler handler) {
        this.client = client.getAsyncHttpClient();
        this.gson = client.getGson();
        this.url = buildUrl(actor);
        this.handler = handler;
    }

    public WebSocket execute() throws ExecutionException, InterruptedException {
        return client.prepareGet(url).execute(
                new WebSocketUpgradeHandler.Builder()
                        .addWebSocketListener(new WSMessageListener(gson, handler))
                        .addWebSocketListener(new WSPingListener())
                        .build()
        ).get();
    }

    private String buildUrl(StreamingActor actor) {
        return WEB_SOCKET_SCHEMA + actor.getEndpoint() + "/stream?key=" + actor.getKey();
    }
}

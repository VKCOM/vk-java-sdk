package com.vk.api.sdk.streaming.clients;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.streaming.actions.StreamingRules;
import com.vk.api.sdk.streaming.actions.StreamingStream;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.DefaultAsyncHttpClient;
import org.asynchttpclient.DefaultAsyncHttpClientConfig;

import java.io.Closeable;
import java.io.IOException;

public class VkStreamingApiClient implements Closeable {

    private static final int DEFAULT_MAX_BUFFER_SIZE = 1024000;
    private static final int DEFAULT_MAX_FRAME_SIZE = 1024000;
    private static final int DEFAULT_MAX_REQUEST_RETRY = 0;

    private Gson gson;
    private TransportClient transportClient;
    private AsyncHttpClient asyncHttpClient;

    public VkStreamingApiClient(TransportClient transportClient) {
        this(transportClient, new GsonBuilder().disableHtmlEscaping().create(), getDefaultAsyncClient());
    }

    public VkStreamingApiClient(TransportClient transportClient, Gson gson, AsyncHttpClient asyncHttpClient) {
        this.transportClient = transportClient;
        this.asyncHttpClient = asyncHttpClient;
        this.gson = gson;
    }

    public Gson getGson() {
        return gson;
    }

    public TransportClient getTransportClient() {
        return transportClient;
    }

    public AsyncHttpClient getAsyncHttpClient() {
        return asyncHttpClient;
    }

    public StreamingRules rules() {
        return new StreamingRules(this);
    }

    public StreamingStream stream() {
        return new StreamingStream(this);
    }

    @Override
    public void close() throws IOException {
        asyncHttpClient.close();
    }

    private static DefaultAsyncHttpClient getDefaultAsyncClient() {
        return new DefaultAsyncHttpClient(new DefaultAsyncHttpClientConfig.Builder()
                .setMaxRequestRetry(DEFAULT_MAX_REQUEST_RETRY)
                .setWebSocketMaxBufferSize(DEFAULT_MAX_BUFFER_SIZE)
                .setWebSocketMaxFrameSize(DEFAULT_MAX_FRAME_SIZE).build());
    }
}

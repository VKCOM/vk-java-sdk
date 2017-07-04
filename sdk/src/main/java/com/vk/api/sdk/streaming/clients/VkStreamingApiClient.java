package com.vk.api.sdk.streaming.clients;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.streaming.actions.StreamingRules;
import com.vk.api.sdk.streaming.actions.StreamingStream;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.DefaultAsyncHttpClient;

public class VkStreamingApiClient {

    private Gson gson;
    private TransportClient transportClient;
    private AsyncHttpClient asyncHttpClient;

    public VkStreamingApiClient(TransportClient transportClient) {
        this(transportClient, new GsonBuilder().create());
    }

    public VkStreamingApiClient(TransportClient transportClient, Gson gson) {
        this.transportClient = transportClient;
        this.gson = gson;
        this.asyncHttpClient = new DefaultAsyncHttpClient();
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
}

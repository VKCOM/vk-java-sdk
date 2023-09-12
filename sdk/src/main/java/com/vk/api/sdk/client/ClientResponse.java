package com.vk.api.sdk.client;

import java.util.Map;

public class ClientResponse extends ClientResponseTypeable<String> {
    public ClientResponse(int statusCode, String content, Map<String, String> headers) {
        super(statusCode, content, headers);
    }
}

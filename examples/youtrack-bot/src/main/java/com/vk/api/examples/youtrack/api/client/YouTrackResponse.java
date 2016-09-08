package com.vk.api.examples.youtrack.api.client;

import java.util.Map;

/**
 * Created by Anton Tsivarev on 11.09.15.
 */
public class YouTrackResponse {

    private int statusCode;

    private String content;

    private Map<String, String> headers;

    public YouTrackResponse(int statusCode, String content, Map<String, String> headers) {
        this.statusCode = statusCode;
        this.content = content;
        this.headers = headers;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getContent() {
        return content;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("YouTrackResponse{");
        sb.append("statusCode=").append(statusCode);
        sb.append(", content='").append(content).append('\'');
        sb.append(", headers=").append(headers);
        sb.append('}');
        return sb.toString();
    }
}

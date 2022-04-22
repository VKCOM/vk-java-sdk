package com.vk.api.sdk.captcha.anticaptcha.simpleRequest;

import com.google.gson.Gson;
import com.vk.api.sdk.client.ClientResponse;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import org.apache.http.Header;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class simpleRequest {
    private String url;
    private List<Header> headers;

    public simpleRequest setUrl(String url) {
        this.url = url;
        return this;
    }


    public simpleRequest addHeader(Header header) {
        if(headers==null) headers = new ArrayList<>();
        this.headers.add(header);
        return this;
    }

    public Header[] getHeaders() {
        return this.headers.toArray(new Header[0]);
    }

    public  <T> T doRequest(Object requestObject, Class<T> responseObject) throws IOException {
        TransportClient transportClient = new HttpTransportClient();
        ClientResponse clientResponse = null;
        if(url==null) throw new IOException("URL is null!");
        try {
            clientResponse = transportClient.post(url, new Gson().toJson(requestObject), getHeaders());
            return new Gson().fromJson(clientResponse.getContent(), responseObject);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}

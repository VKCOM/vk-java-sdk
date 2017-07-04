package com.vk.api.sdk.httpclient;

import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

import java.net.URI;

public class HttpDeleteWithBody extends HttpEntityEnclosingRequestBase {

    public HttpDeleteWithBody(final String uri) {
        this(URI.create(uri));
    }

    public HttpDeleteWithBody(final URI uri) {
        super();
        setURI(uri);
    }

    @Override
    public String getMethod() {
        return "DELETE";
    }
}

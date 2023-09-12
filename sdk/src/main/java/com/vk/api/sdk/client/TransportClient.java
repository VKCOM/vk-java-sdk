package com.vk.api.sdk.client;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.apache.http.Header;

public interface TransportClient {

    ClientResponse post(String url, String body) throws IOException;

    ClientResponse post(String url, Map<String, File> files) throws IOException;

    ClientResponse post(String url, String body, String contentType) throws IOException;

    ClientResponse post(String url) throws IOException;

    ClientResponse post(String url, String body, Header[] headers) throws IOException;


    ClientResponse get(String url) throws IOException;

    ClientResponse get(String url, String contentType) throws IOException;

    ClientResponse get(String url, Header[] headers) throws IOException;


    ClientResponse delete(String url) throws IOException;

    ClientResponse delete(String url, String body) throws IOException;

    ClientResponse delete(String url, String body, String contentType) throws IOException;

    ClientResponse delete(String url, String body, Header[] headers) throws IOException;
}

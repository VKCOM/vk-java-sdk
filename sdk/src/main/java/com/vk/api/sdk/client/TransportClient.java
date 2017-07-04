package com.vk.api.sdk.client;

import java.io.File;
import java.io.IOException;

/**
 * Created by tsivarev on 21.07.16.
 */
public interface TransportClient {

    ClientResponse get(String url) throws IOException;

    ClientResponse post(String url, String body) throws IOException;

    ClientResponse post(String url, String fileName, File file) throws IOException;

    ClientResponse post(String url, String body, String contentType) throws IOException;

    ClientResponse get(String url, String contentType) throws IOException;

    ClientResponse post(String url) throws IOException;

    ClientResponse delete(String url) throws IOException;

    ClientResponse delete(String url, String body) throws IOException;

    ClientResponse delete(String url, String body, String contentType) throws IOException;
}

package com.vk.api.examples.group.bot;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, ClientException, ApiException {
        Application application = new Application();
        application.run();
    }
}

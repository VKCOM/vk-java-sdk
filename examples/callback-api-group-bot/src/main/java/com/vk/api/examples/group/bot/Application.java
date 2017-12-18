package com.vk.api.examples.group.bot;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import com.vk.api.sdk.objects.groups.responses.GetLongPollServerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Application {

    private final String PROPERTIES_FILE = "config.properties";

    public void run() throws FileNotFoundException, ClientException, ApiException {
        Properties properties = readProperties();
        GroupActor groupActor = Utils.createGroupActor(properties);

        String groupId = properties.getProperty("groupId");

        String adminId = properties.getProperty("adminId");
        String adminToken = properties.getProperty("adminToken");
        UserActor adminActor = new UserActor(Integer.parseInt(adminId), adminToken);

        HttpTransportClient httpClient = HttpTransportClient.getInstance();
        VkApiClient vk = new VkApiClient(httpClient);

        CallbackApiHandler handler = new CallbackApiHandler(vk, groupActor, groupId);
        handler.setGroupActor(groupActor);
        handler.setUserActor(adminActor);
        handler.run();
    }

    private Properties readProperties() throws FileNotFoundException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(PROPERTIES_FILE);
        if (inputStream == null) {
            throw new FileNotFoundException("property file '" + PROPERTIES_FILE + "' not found in the classpath");
        }
        try {
            Properties properties = new Properties();
            properties.load(inputStream);
            return properties;
        } catch (IOException e) {
            throw new RuntimeException("Incorrect properties file");
        }
    }
}

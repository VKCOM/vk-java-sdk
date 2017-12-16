package com.vk.api.examples.group.bot;

import com.google.gson.JsonObject;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import com.vk.api.sdk.objects.groups.longpoll.GetEventsResponse;
import com.vk.api.sdk.objects.groups.responses.GetLongPollServerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Application {

    private final String PROPERTIES_FILE = "config.properties";

    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    public void run() throws FileNotFoundException, ClientException, ApiException {
        Properties properties = readProperties();
        GroupActor groupActor = Utils.createGroupActor(properties);

        String groupId = properties.getProperty("groupId");

        HttpTransportClient httpClient = HttpTransportClient.getInstance();
        VkApiClient vk = new VkApiClient(httpClient);

        CallbackApiHandler handler = new CallbackApiHandler(vk, groupActor);

        System.out.println("Start");
        GetLongPollServerResponse credentials = refreshCredentials(vk, groupActor, groupId);
        int lastTs = credentials.getTs();

        while (true) {
            System.out.println("\n\n\nWaiting for response from server...");
            GetEventsResponse eventsResponse = vk.groups().getEventsLongPoll(credentials.getServer(), credentials.getKey(), lastTs).waitParam(10).execute();
            for (JsonObject jsonObject: eventsResponse.getUpdates()) {
                handler.parse(jsonObject);
            }
            lastTs += eventsResponse.getUpdates().size();
            System.out.println(eventsResponse);
        }
    }

    private GetLongPollServerResponse refreshCredentials(VkApiClient vk, GroupActor actor, String groupId) throws ClientException, ApiException {
        return Utils.getLongPollServer(vk, actor, groupId);
    }

    private Properties readProperties() throws FileNotFoundException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(PROPERTIES_FILE);
        if (inputStream == null)
            throw new FileNotFoundException("property file '" + PROPERTIES_FILE + "' not found in the classpath");

        try {
            Properties properties = new Properties();
            properties.load(inputStream);
            return properties;
        } catch (IOException e) {
            throw new RuntimeException("Incorrect properties file");
        }
    }
}

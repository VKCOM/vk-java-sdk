package com.vk.api.examples.group.bot;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.httpclient.HttpTransportClient;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Application {

    private static final String PROPERTIES_FILE = "config.properties";

    public static void main(String[] args) throws IOException, ClientException, ApiException {
        Properties properties = readProperties();
        GroupActor groupActor = createGroupActor(properties);

        HttpTransportClient httpClient = HttpTransportClient.getInstance();
        VkApiClient vk = new VkApiClient(httpClient);

        if (!vk.groups().getLongPollSettings(groupActor).execute().getEnabled()) {
            Integer responseCode = vk.groups().setLongPollSettings(groupActor).enabled(1).wallPostNew(1).execute();
            if (responseCode == 1) {
                System.out.println("Yes, set settings method was run successfully!");
            } else {
                System.out.println("Ooops, something weird");
            }
        }

        CallbackApiHandler handler = new CallbackApiHandler(vk, groupActor);
        handler.run();

        System.out.println(vk.groups().getLongPollSettings(groupActor).execute());
    }

    private static GroupActor createGroupActor(Properties properties) {
        String groupId = properties.getProperty("groupId");
        String accessToken = properties.getProperty("token");
        return new GroupActor(Integer.parseInt(groupId), accessToken);
    }

    private static Properties readProperties() throws IOException {
        InputStream inputStream = Application.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE);
        if (inputStream == null) {
            throw new FileNotFoundException("property file '" + PROPERTIES_FILE + "' not found in the classpath");
        }
        try {
            Properties properties = new Properties();
            properties.load(inputStream);
            return properties;
        } catch (IOException e) {
            throw new RuntimeException("Incorrect properties file");
        } finally {
            inputStream.close();
        }
    }
}

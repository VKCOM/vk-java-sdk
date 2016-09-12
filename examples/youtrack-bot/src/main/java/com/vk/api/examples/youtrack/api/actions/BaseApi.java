package com.vk.api.examples.youtrack.api.actions;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.vk.api.examples.youtrack.api.client.YouTrackResponse;

import java.io.IOException;

public abstract class BaseApi {

    public static <T> T fromXml(YouTrackResponse response, Class<T> tClass) throws IOException {
        ObjectMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return xmlMapper.readValue(response.getContent(), tClass);
    }

}

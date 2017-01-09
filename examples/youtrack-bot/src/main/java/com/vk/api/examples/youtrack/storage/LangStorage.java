package com.vk.api.examples.youtrack.storage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by tsivarev on 07.09.16.
 */
public class LangStorage {

    private static final Logger LOG = LoggerFactory.getLogger(DataStorage.class);

    private static LangStorage instance;

    private Properties properties;

    private String filePath = null;

    private LangStorage() {
        properties = new Properties();
    }

    public static LangStorage getInstance() {
        if (instance == null) {
            instance = new LangStorage();
        }

        return instance;
    }

    public void load(String path) {
        LOG.info("Load data from " + path);

        filePath = path;

        try {
            properties.load(new FileReader(path));
        } catch (IOException e) {
            LOG.error("Can't load properties file", e);
            throw new IllegalStateException(e);
        }

        LOG.info("Loaded config", properties);
    }

    public void add(String name, Object value) {
        properties.put(name, value.toString());
        if (filePath != null) {
            try {
                properties.store(new FileWriter(filePath), "");
            } catch (IOException e) {
                LOG.error("Can't store properties file", e);
                throw new IllegalStateException(e);
            }
        }
    }

    public String get(String name) {
        return properties.getProperty(name);
    }
}

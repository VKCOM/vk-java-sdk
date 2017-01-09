package com.vk.api.examples.youtrack.storage.users;

import com.vk.api.examples.youtrack.storage.Statistic;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by tsivarev on 29.04.16.
 */
public class YouTrackUsersStorage {

    private static final Logger LOG = LoggerFactory.getLogger(YouTrackUsersStorage.class);
    private static final Map<String, YouTrackUser> USERS = new HashMap<>();
    private static YouTrackUsersStorage instance;
    private String filePath;

    private YouTrackUsersStorage() {
    }

    public static YouTrackUsersStorage getInstance() {
        if (instance == null) {
            instance = new YouTrackUsersStorage();
        }

        return instance;
    }

    private static Map<SettingName, SettingValue> deserializeSettings(String settings) {
        Map<SettingName, SettingValue> map = new HashMap<>();
        Set<String> settingValues = new HashSet<>(Arrays.asList(StringUtils.split(settings, "&")));
        for (String setting : settingValues) {
            if (setting.isEmpty()) {
                throw new IllegalStateException("Wrong setting: " + setting);
            }

            String[] values = StringUtils.split(setting, "=");

            try {
                map.put(SettingName.byValue(values[0]), SettingValue.byValue(values[1]));
            } catch (IllegalArgumentException e) {
                throw new IllegalStateException("Wrong values: " + setting);
            }
        }

        return map;
    }

    private static String serializeSettings(Map<SettingName, SettingValue> map) {
        Set<String> values = new HashSet<>();
        for (Map.Entry<SettingName, SettingValue> entry : map.entrySet()) {
            values.add(entry.getKey() + "=" + entry.getValue());
        }

        return StringUtils.join(values, "&");
    }

    public YouTrackUser getUserByLogin(String name) {
        return USERS.get(name);
    }

    public YouTrackUser getUserById(Integer userId) {
        for (Map.Entry<String, YouTrackUser> entry : USERS.entrySet()) {
            if (entry.getValue().getVkId().equals(userId)) {
                return entry.getValue();
            }
        }

        return null;
    }

    public Set<Integer> getIds() {
        Set<Integer> ids = new HashSet<>();

        for (Map.Entry<String, YouTrackUser> entry : USERS.entrySet()) {
            ids.add(entry.getValue().getVkId());
        }

        return ids;
    }

    public void load(String path) {
        LOG.info("Load data from " + path);

        filePath = path;

        BufferedReader br = null;
        String line;


        try {
            br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null) {
                deserializeLine(line);
            }

        } catch (Exception e) {
            LOG.error("Can't load " + filePath, e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    LOG.error("Can't close stream for " + filePath);
                }
            }
        }


        LOG.info("Loaded " + USERS.size() + " users");
    }

    private void deserializeLine(String line) {
        String cvsSplitBy = ",";

        String[] values = line.split(cvsSplitBy);
        if (values.length < 2) {
            throw new IllegalStateException("Wrong line: " + line);
        }

        Statistic.increment(Statistic.Event.USER_LOAD);
        String ytLogin = values[0];
        Integer vkId = Integer.valueOf(values[1]);
        Map<SettingName, SettingValue> settings = deserializeSettings(values.length >= 3 ? values[2] : "");

        YouTrackUser youTrackUser = new YouTrackUser(vkId, ytLogin, settings);
        USERS.put(ytLogin, youTrackUser);
    }

    private String serializeLine(YouTrackUser youTrackUser) {
        return youTrackUser.getYtLogin() + "," + youTrackUser.getVkId() + "," + serializeSettings(youTrackUser.getSettings()) + "\n";
    }

    public void add(String login, Integer userId) throws IOException {
        if (getUserById(userId) != null || getUserByLogin(login) != null) {
            return;
        }

        YouTrackUser youTrackUser = new YouTrackUser(userId, login, Collections.emptyMap());
        USERS.put(login, youTrackUser);
        LOG.info("Add new user " + login + "/" + userId);

        save();
    }

    public void remove(Integer userId) throws IOException {
        YouTrackUser user = getUserById(userId);
        if (user == null) {
            return;
        }

        USERS.remove(user.getYtLogin());
        LOG.info("Delete user " + userId);

        save();
    }

    private void save() throws IOException {
        FileWriter writer = new FileWriter(filePath);
        for (Map.Entry<String, YouTrackUser> entry : USERS.entrySet()) {
            writer.append(serializeLine(entry.getValue()));
        }

        writer.flush();
        writer.close();

        LOG.info("YouTrackUsersStorage config updated");
    }

    public void updateSettings(YouTrackUser youTrackUser) throws IOException {
        save();
    }

    public int getCount() {
        return USERS.size();
    }
}

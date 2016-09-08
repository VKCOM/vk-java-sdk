package com.vk.api.examples.youtrack.storage.users;

import java.util.Map;

/**
 * Created by tsivarev on 06.05.16.
 */
public class YouTrackUser {

    private Integer vkId;

    private String ytLogin;

    private Map<SettingName, SettingValue> settings;

    public YouTrackUser(Integer vkId, String ytLogin, Map<SettingName, SettingValue> settings) {
        this.vkId = vkId;
        this.ytLogin = ytLogin;
        this.settings = settings;
    }

    public Integer getVkId() {
        return vkId;
    }

    public String getYtLogin() {
        return ytLogin;
    }

    public Map<SettingName, SettingValue> getSettings() {
        return settings;
    }

    public void setSettings(Map<SettingName, SettingValue> settings) {
        this.settings = settings;
    }

    public SettingValue getSettingValue(SettingName name) {
        if (!settings.containsKey(name)) {
            return SettingValue.ON;
        }

        return settings.get(name);
    }
}

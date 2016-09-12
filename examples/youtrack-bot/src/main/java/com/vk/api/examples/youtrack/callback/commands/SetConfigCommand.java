package com.vk.api.examples.youtrack.callback.commands;

import com.vk.api.examples.youtrack.storage.users.SettingName;
import com.vk.api.examples.youtrack.storage.users.SettingValue;
import com.vk.api.examples.youtrack.storage.users.YouTrackUser;
import com.vk.api.examples.youtrack.storage.users.YouTrackUsersStorage;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;

import java.io.IOException;
import java.util.Map;

/**
 * Created by tsivarev on 07.09.16.
 */
public class SetConfigCommand extends VkCommand {

    private final String value;
    private final String name;

    public SetConfigCommand(Integer vkId, String name, String value) {
        super(vkId);
        this.name = name;
        this.value = value;
    }

    @Override
    public void run() throws ClientException, ApiException {
        YouTrackUser youTrackUser = YouTrackUsersStorage.getInstance().getUserById(getVkId());
        Map<SettingName, SettingValue> settings = youTrackUser.getSettings();

        SettingName setting;
        try {
            setting = SettingName.byValue(name);
        } catch (IllegalArgumentException e) {
            sendMessage("Wrong name");
            return;
        }

        SettingValue settingValue;
        try {
            settingValue = SettingValue.byValue(value);
        } catch (IllegalArgumentException e) {
            sendMessage("Wrong value");
            return;
        }

        settings.put(setting, settingValue);

        try {
            YouTrackUsersStorage.getInstance().updateSettings(youTrackUser);
        } catch (IOException e) {
            throw new IllegalStateException("Can't update settings", e);
        }

        String msg = "Saved";
        sendMessage(msg);
    }
}

package com.vk.api.examples.youtrack.callback.commands;

import com.vk.api.examples.youtrack.storage.users.SettingName;
import com.vk.api.examples.youtrack.storage.users.SettingValue;
import com.vk.api.examples.youtrack.storage.users.YouTrackUser;
import com.vk.api.examples.youtrack.storage.users.YouTrackUsersStorage;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tsivarev on 07.09.16.
 */
public class GetConfigCommand extends VkCommand {

    public GetConfigCommand(Integer vkId) {
        super(vkId);
    }

    @Override
    public void run() throws ClientException, ApiException {
        YouTrackUser youTrackUser = YouTrackUsersStorage.getInstance().getUserById(getVkId());

        Map<SettingName, SettingValue> settings = youTrackUser.getSettings();
        String response = "";
        Map<SettingName, String> description = new HashMap<>();
        description.put(SettingName.ISSUE_NOTIFICATION, "Notification about issues changes");
        description.put(SettingName.CLOSED_ISSUE_NOTIFICATION, "Notification about closed issues changes");

        for (Map.Entry<SettingName, String> entry : description.entrySet()) {
            SettingValue value = settings.get(entry.getKey());
            if (value == null) {
                value = SettingValue.ON;
            }

            response += entry.getKey() + ": " + value + " - " + entry.getValue() + "\n";
        }

        String msg = response;


        sendMessage(msg);
    }
}

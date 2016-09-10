package com.vk.api.examples.youtrack.callback.commands;

import com.vk.api.examples.youtrack.storage.users.YouTrackUsersStorage;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;

import java.io.IOException;

/**
 * Created by tsivarev on 07.09.16.
 */
public class LogoutCommand extends VkCommand {

    public LogoutCommand(Integer vkId) {
        super(vkId);
    }

    @Override
    public void run() throws ClientException, ApiException {
        try {
            YouTrackUsersStorage.getInstance().remove(getVkId());
        } catch (IOException e) {
            throw new IllegalStateException("Can't remove user", e);
        }

        String msg = "Bye bye! Hope to see you soon.";
        sendMessage(msg);
    }
}

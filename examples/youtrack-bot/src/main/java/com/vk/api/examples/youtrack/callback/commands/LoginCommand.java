package com.vk.api.examples.youtrack.callback.commands;

import com.vk.api.examples.youtrack.storage.users.YouTrackUsersStorage;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by tsivarev on 07.09.16.
 */
public class LoginCommand extends VkCommand {

    private static final Logger LOG = LoggerFactory.getLogger(LoginCommand.class);

    private String ytLogin;

    public LoginCommand(Integer vkId, String ytLogin) {
        super(vkId);
        this.ytLogin = ytLogin;
    }

    @Override
    public void run() throws ClientException, ApiException, IOException {
        //@TODO: Add moderation
//        User user = UsersApi.getUser(ytLogin);
//        if (StringUtils.isBlank(user.getFullName())) {
//            LOG.info("Can't find user " + ytLogin + " in youtrack");
//            sendMessage("This is invalid login");
//            return;
//        }

        try {
            YouTrackUsersStorage.getInstance().add(ytLogin, getVkId());
        } catch (IOException e) {
            throw new IllegalStateException("Can't add user", e);
        }

        String msg = "Good! You're in team!";
        sendMessage(msg);

        new HelpCommand(getVkId()).run();
    }
}

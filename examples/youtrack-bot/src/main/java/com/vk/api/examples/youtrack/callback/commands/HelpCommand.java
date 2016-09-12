package com.vk.api.examples.youtrack.callback.commands;

import com.vk.api.examples.youtrack.Application;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;

/**
 * Created by tsivarev on 07.09.16.
 */
public class HelpCommand extends VkCommand {

    public HelpCommand(Integer vkId) {
        super(vkId);
    }

    @Override
    public void run() throws ClientException, ApiException {
        String msg = "I understand the following commands:\n\n" +
                "login [yt_login] - login\n" +
                "logout - logout\n\n" +
                "config - show configuration for notifications\n" +
                "setconfig [name] [on|off] - configure notifications\n" +
                "mine [count] - assigned to me tasks\n" +
                "search [filter] - search issues by query\n" +
                "uptime - uptime information about bot\n" +
                "help - information about commands\n\n" +
                "Version " + Application.getVersion() + "\n" +
                "If you have ideas for improvements for the bot, please contact https://vk.me/tsivarev_a.";


        sendMessage(msg);
    }
}

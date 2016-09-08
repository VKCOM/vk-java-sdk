package com.vk.api.examples.youtrack.jobs.vkbot;

import com.vk.api.examples.youtrack.Application;
import com.vk.api.examples.youtrack.jobs.Job;
import com.vk.api.examples.youtrack.jobs.MembersUpdateJob;
import com.vk.api.examples.youtrack.jobs.vkbot.commands.CreateTaskCommand;
import com.vk.api.examples.youtrack.jobs.vkbot.commands.GetConfigCommand;
import com.vk.api.examples.youtrack.jobs.vkbot.commands.HelpCommand;
import com.vk.api.examples.youtrack.jobs.vkbot.commands.LoginCommand;
import com.vk.api.examples.youtrack.jobs.vkbot.commands.LogoutCommand;
import com.vk.api.examples.youtrack.jobs.vkbot.commands.MineTasksCommand;
import com.vk.api.examples.youtrack.jobs.vkbot.commands.SearchTasksCommand;
import com.vk.api.examples.youtrack.jobs.vkbot.commands.SetConfigCommand;
import com.vk.api.examples.youtrack.jobs.vkbot.commands.UptimeCommand;
import com.vk.api.examples.youtrack.storage.DataStorage;
import com.vk.api.examples.youtrack.storage.Statistic;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import com.vk.api.sdk.objects.messages.responses.GetResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by tsivarev on 07.09.16.
 */
public class VkMessagesJob implements Job {

    private static final Logger LOG = LogManager.getLogger(MembersUpdateJob.class);
    private static final String LAST_MESSAGE_ID_KEY = "vk.bot.lastMessageId";

    private Integer lastMessageId = 0;

    public VkMessagesJob() throws ClientException, ApiException {
        lastMessageId = DataStorage.getInstance().getInt(LAST_MESSAGE_ID_KEY);
        if (lastMessageId == 0) {
            GetResponse getResponse = Application.vk().messages().get(Application.actor()).out(false).count(1).execute();

            if (!getResponse.getItems().isEmpty()) {
                lastMessageId = getResponse.getItems().get(0).getId();
                DataStorage.getInstance().add(LAST_MESSAGE_ID_KEY, String.valueOf(lastMessageId));
            }
        }
    }

    private static Integer parseInt(String[] args, int index, int defaultValue) {
        if (args.length <= index) {
            return defaultValue;
        }

        try {
            return Integer.parseInt(args[index]);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    @Override
    public void doJob() throws Exception {
        GetResponse getResponse = Application.vk().messages().get(Application.actor()).out(false).lastMessageId(lastMessageId).execute();
        for (Message message : getResponse.getItems()) {
            parseCmd(message);

            if (lastMessageId < message.getId()) {
                lastMessageId = message.getId();
                DataStorage.getInstance().add(LAST_MESSAGE_ID_KEY, lastMessageId);
            }
        }
    }

    private void parseCmd(Message message) {
        Integer vkId = message.getUserId();
        String[] args = message.getBody().split(" ");
        String command = args[0];

        try {
            switch (command.toLowerCase()) {
                case "help":
                    new HelpCommand(vkId).run();
                    break;

                case "login":
                    if (args.length != 2) {
                        new HelpCommand(vkId).run();
                        break;
                    }

                    String ytLogin = args[1];
                    new LoginCommand(vkId, ytLogin).run();
                    break;

                case "logout":
                    new LogoutCommand(vkId).run();
                    break;

                case "mine":
                    new MineTasksCommand(vkId, parseInt(args, 1, 10)).run();
                    break;

                case "search":
                    String filter = message.getBody().substring(command.length() + 1);
                    new SearchTasksCommand(vkId, filter, 10).run();
                    break;

                case "config":
                    new GetConfigCommand(vkId).run();
                    break;

                case "setconfig":
                    if (args.length != 3) {
                        new HelpCommand(vkId).run();
                        break;
                    }

                    String name = args[1];
                    String value = args[2];

                    new SetConfigCommand(vkId, name, value).run();
                    break;

                case "uptime":
                    new UptimeCommand(vkId).run();
                    break;

                case "create":
                    String project = "API";
                    String text = message.getBody().substring(command.length() + 1);
                    String description = message.getFwdMessages().isEmpty() ? "" : message.getFwdMessages().get(0).getBody();
                    new CreateTaskCommand(vkId, project, text, description).run();
                    break;


                default:
                    new HelpCommand(vkId).run();
            }

            Statistic.increment(Statistic.Event.COMMAND);
        } catch (Exception e) {
            LOG.error("Can't execute command", e);
            Statistic.increment(Statistic.Event.FAILED_COMMAND);
        }
    }
}

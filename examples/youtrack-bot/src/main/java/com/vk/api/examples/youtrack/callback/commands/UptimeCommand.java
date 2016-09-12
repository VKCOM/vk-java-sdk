package com.vk.api.examples.youtrack.callback.commands;

import com.vk.api.examples.youtrack.storage.Statistic;
import com.vk.api.examples.youtrack.storage.users.YouTrackUsersStorage;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.concurrent.TimeUnit;

/**
 * Created by tsivarev on 07.09.16.
 */
public class UptimeCommand extends VkCommand {

    public UptimeCommand(Integer vkId) {
        super(vkId);
    }

    @Override
    public void run() throws ClientException, ApiException {
        RuntimeMXBean mxBean = ManagementFactory.getRuntimeMXBean();
        long uptime = mxBean.getUptime();

        String hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(uptime),
                TimeUnit.MILLISECONDS.toMinutes(uptime) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(uptime)),
                TimeUnit.MILLISECONDS.toSeconds(uptime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(uptime)));

        String msg = "Uptime is " + hms + ".\n" +
                "Statistics: \n"
                + "Executed commands " + Statistic.get(Statistic.Event.COMMAND) + "\n"
                + "Failed commands " + Statistic.get(Statistic.Event.FAILED_COMMAND) + "\n"
                + "Loaded users " + YouTrackUsersStorage.getInstance().getCount();


        sendMessage(msg);
    }
}

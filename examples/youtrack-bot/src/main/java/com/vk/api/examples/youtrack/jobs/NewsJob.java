package com.vk.api.examples.youtrack.jobs;

import com.vk.api.examples.youtrack.Application;
import com.vk.api.examples.youtrack.storage.DataStorage;
import com.vk.api.examples.youtrack.storage.MembersStorage;
import com.vk.api.examples.youtrack.storage.Statistic;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Created by tsivarev on 06.05.16.
 */
public class NewsJob implements Job {

    private final static int NEWS_ID = 1;

    private static String getNews(Integer userId) {
        String msg = "Hi!";

        List<String> endsOne = Arrays.asList("Have a nice day!", "Have a good day!", "Have a fun time!", "Your dear bot.");
        List<String> endsTwo = Arrays.asList("&#128521;", "&#128540;", "&#128526;", "&#9786;", "&#128522;", "&#9996;");
        return msg + endsOne.get(userId % endsOne.size()) + " " + endsTwo.get(userId % endsTwo.size());
    }

    private static void sendMessage(int vkId, String msg) throws ClientException, ApiException {
        Statistic.increment(Statistic.Event.SEND_NOTIFY);
        Application.vk().messages().send(Application.actor())
                .randomId(new Random().nextInt(10000))
                .message(msg)
                .peerId(vkId).execute();
    }

    @Override
    public void doJob() throws IOException, ClientException, ApiException {
        int lastNewsId = DataStorage.getInstance().getInt("news.lastId");
        if (lastNewsId < NEWS_ID) {
            Set<Integer> userIds = MembersStorage.getInstance().getIds();
            for (Integer userId : userIds) {
                String news = getNews(userId);
                sendMessage(userId, news);
            }
        }

        DataStorage.getInstance().add("news.lastId", NEWS_ID);
    }
}

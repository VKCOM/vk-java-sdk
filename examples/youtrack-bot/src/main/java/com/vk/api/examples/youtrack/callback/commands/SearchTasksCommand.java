package com.vk.api.examples.youtrack.callback.commands;

import com.vk.api.examples.youtrack.Application;
import com.vk.api.examples.youtrack.api.actions.IssuesApi;
import com.vk.api.examples.youtrack.api.objects.issues.Issue;
import com.vk.api.examples.youtrack.api.objects.issues.IssueList;
import com.vk.api.examples.youtrack.storage.users.YouTrackUser;
import com.vk.api.examples.youtrack.storage.users.YouTrackUsersStorage;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;

import java.io.IOException;
import java.util.List;

/**
 * Created by tsivarev on 07.09.16.
 */
public class SearchTasksCommand extends VkCommand {

    private String filter;
    private Integer count;

    public SearchTasksCommand(Integer vkId, String filter, Integer count) {
        super(vkId);
        this.filter = filter;
        this.count = count;
    }

    private static String issueList(List<Issue> issues) {
        if (issues == null || issues.isEmpty()) {
            return "Not found";

        }

        String msg = "";
        int index = 1;
        for (Issue issue : issues) {
            String url = "(" + Application.ytHost() + "/issue/" + issue.getId() + ")";
            String summary = issue.getFieldValue("summary");
            String description = issue.getFieldValue("description");
            String title = summary == null || summary.isEmpty() ? description.substring(0, Math.min(description.length(), 100)) + "..." : summary;

            msg += index + ". " + title + " " + url + "\n\n";
            index++;
        }


        return msg;
    }

    @Override
    public void run() throws ClientException, ApiException, IOException {
        YouTrackUser youTrackUser = YouTrackUsersStorage.getInstance().getUserById(getVkId());

        filter = filter.replaceAll("me", youTrackUser.getYtLogin());

        IssueList issueList;

        try {
            issueList = IssuesApi.getIssues(filter, count);
        } catch (IOException e) {
            throw new IllegalStateException("Can't search issues", e);
        }

        String msg = issueList(issueList.getIssues());
        sendMessage(msg);
    }
}

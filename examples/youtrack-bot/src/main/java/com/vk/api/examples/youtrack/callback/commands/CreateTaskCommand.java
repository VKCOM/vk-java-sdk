package com.vk.api.examples.youtrack.callback.commands;

import com.vk.api.examples.youtrack.Application;
import com.vk.api.examples.youtrack.api.actions.IssuesApi;
import com.vk.api.examples.youtrack.api.objects.issues.Issue;
import com.vk.api.examples.youtrack.storage.IssueNotifications;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;

import java.io.IOException;

/**
 * Created by tsivarev on 07.09.16.
 */
public class CreateTaskCommand extends VkCommand {

    private String project;
    private String text;
    private String description;

    public CreateTaskCommand(Integer vkId, String project, String text, String description) {
        super(vkId);
        this.project = project;
        this.text = text;
        this.description = description;
    }

    private static String issue(Issue issue) {
        String changes = "";
        String url = Application.ytHost() + "/issue/" + issue.getId();
        String summary = issue.getFieldValue("summary") != null ? issue.getFieldValue("summary") : "";
        String description = issue.getFieldValue("description") != null ? issue.getFieldValue("description") : "";
        String title = summary.isEmpty() ? description.substring(0, Math.min(description.length(), 100)) + "..." : summary;
        return issue.getId() + "\n" + "Issue updated" + "\n" + issue.getFieldValue("Type") + " - " + title + "\n\n" + changes + url + "\n-------";
    }

    @Override
    public void run() throws ClientException, ApiException, IOException {
        String issueId = IssuesApi.create(project, text, description);
        IssueNotifications.getInstance().disable(getVkId(), issueId);

        Issue issue = IssuesApi.getIssue(issueId);
        String msg = issue(issue);
        sendMessage("Created: \n" + msg);
    }
}

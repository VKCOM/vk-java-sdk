package com.vk.api.examples.youtrack.api.actions;


import com.vk.api.examples.youtrack.Application;
import com.vk.api.examples.youtrack.api.client.YouTrackResponse;
import com.vk.api.examples.youtrack.api.objects.issues.Issue;
import com.vk.api.examples.youtrack.api.objects.issues.IssueChangeList;
import com.vk.api.examples.youtrack.api.objects.issues.IssueList;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class IssuesApi extends BaseApi {

    public static Issue getIssue(String issueId) throws IOException {
        return fromXml(Application.yt().get("/rest/issue/" + issueId), Issue.class);
    }

    public static IssueList getIssues(String projectId, Integer count, long lastTime) throws IOException {
        Map<String, String> params = new HashMap<>();
        params.put("max", count.toString());
        params.put("updatedAfter", String.valueOf(lastTime));
        return fromXml(Application.yt().get("/rest/issue/byproject/" + projectId, params), IssueList.class);
    }

    public static IssueList getIssues(String filter, Integer count) throws IOException {
        Map<String, String> params = new HashMap<>();
        params.put("max", count.toString());
        params.put("filter", filter);
        return fromXml(Application.yt().get("/rest/issue", params), IssueList.class);
    }

    public static IssueChangeList getChanges(String issueId) throws IOException {
        return fromXml(Application.yt().get("/rest/issue/" + issueId + "/changes"), IssueChangeList.class);
    }

    public static String create(String project, String summary, String description) throws IOException {
        Map<String, String> params = new HashMap<>();
        params.put("project", project);
        params.put("summary", summary);
        params.put("description", description);

        YouTrackResponse response = Application.yt().put("/rest/issue", params);
        String issue = response.getHeaders().get("Location");
        return issue.substring(issue.indexOf("/rest/issue/") + "/rest/issue/".length());
    }
}

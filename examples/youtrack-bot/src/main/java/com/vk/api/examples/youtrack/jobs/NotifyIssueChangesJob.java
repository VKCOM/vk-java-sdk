package com.vk.api.examples.youtrack.jobs;

import com.vk.api.examples.youtrack.Application;
import com.vk.api.examples.youtrack.api.actions.IssuesApi;
import com.vk.api.examples.youtrack.api.actions.ProjectApi;
import com.vk.api.examples.youtrack.api.objects.issues.Issue;
import com.vk.api.examples.youtrack.api.objects.issues.IssueChange;
import com.vk.api.examples.youtrack.api.objects.issues.IssueChangeField;
import com.vk.api.examples.youtrack.api.objects.issues.IssueChangeList;
import com.vk.api.examples.youtrack.api.objects.issues.IssueList;
import com.vk.api.examples.youtrack.api.objects.projects.ProjectList;
import com.vk.api.examples.youtrack.storage.DataStorage;
import com.vk.api.examples.youtrack.storage.IssueNotifications;
import com.vk.api.examples.youtrack.storage.Statistic;
import com.vk.api.examples.youtrack.storage.users.SettingName;
import com.vk.api.examples.youtrack.storage.users.SettingValue;
import com.vk.api.examples.youtrack.storage.users.YouTrackUser;
import com.vk.api.examples.youtrack.storage.users.YouTrackUsersStorage;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by tsivarev on 29.04.16.
 */
public class NotifyIssueChangesJob implements Job {

    private static final Logger LOG = LoggerFactory.getLogger(NotifyIssueChangesJob.class);

    private static final int COUNT = 100;
    private static final Set<String> SKIP_FIELDS = new HashSet<>();
    private static final String LAST_TIME_KEY = "yt.bot.lastTime";

    static {
        SKIP_FIELDS.add("updated");
        SKIP_FIELDS.add("resolved");
    }

    private long lastTime;

    public NotifyIssueChangesJob() {
        lastTime = DataStorage.getInstance().getLong(LAST_TIME_KEY);
        if (lastTime == 0) {
            lastTime = System.currentTimeMillis();
            DataStorage.getInstance().add(LAST_TIME_KEY, lastTime);
        }
    }

    public static void sendMessage(Integer userId, String msg) throws IOException, ClientException, ApiException {
        YouTrackUser user = YouTrackUsersStorage.getInstance().getUserById(userId);
        if (user != null && user.getSettingValue(SettingName.ISSUE_NOTIFICATION) == SettingValue.OFF) {
            return;
        }

        Statistic.increment(Statistic.Event.SEND_NOTIFY);
        Application.vk().messages().send(Application.actor())
                .randomId(new Random().nextInt(10000))
                .message(msg)
                .peerId(userId).execute();
    }

    @Override
    public void doJob() throws IOException, ClientException, ApiException {
        ProjectList list = ProjectApi.list();
        for (ProjectList.Project project : list.getProjects()) {
            IssueList issueList = IssuesApi.getIssues(project.getShortName(), COUNT, lastTime);
            if (issueList.getIssues().isEmpty()) {
                continue;
            }

            for (Issue issue : issueList.getIssues()) {
                long updatedTime = Long.parseLong(issue.getFieldValue("updated"));
                if (lastTime < updatedTime) {
                    lastTime = updatedTime;
                    DataStorage.getInstance().add(LAST_TIME_KEY, lastTime);
                }

                String assignee = issue.getFieldValue("Assignee") != null ? issue.getFieldValue("Assignee") : "";
                String reporter = issue.getFieldValue("reporterName") != null ? issue.getFieldValue("reporterName") : "";

                Boolean isClosed = issue.getFieldValue("State").equalsIgnoreCase("Closed");

                String updater = "";
                IssueChangeList changeList = IssuesApi.getChanges(issue.getId());
                IssueChange change = null;
                if (!changeList.getChanges().isEmpty()) {
                    change = changeList.getChanges().get(changeList.getChanges().size() - 1);
                    for (IssueChangeField field : change.getFields()) {
                        if (field.getName().equals("updaterName")) {
                            if (field.getValue() != null) {
                                updater = field.getValue();
                            }
                            break;
                        }
                    }
                }

                if (!updater.equalsIgnoreCase(assignee) && !assignee.equalsIgnoreCase(reporter)) {
                    LOG.info("Assignee: " + assignee);
                    LOG.info("Updater: " + updater);
                    YouTrackUser youTrackUser = YouTrackUsersStorage.getInstance().getUserByLogin(assignee);
                    if (youTrackUser != null) {
                        if (IssueNotifications.getInstance().isDisabled(youTrackUser.getVkId(), issue.getId())) {
                            LOG.info("Temp disabled issues notifications");
                        } else if (isClosed && youTrackUser.getSettingValue(SettingName.CLOSED_ISSUE_NOTIFICATION) == SettingValue.OFF) {
                            LOG.info("Disabled closed issues notifications");
                        } else {
                            sendMessage(youTrackUser.getVkId(), getMessage(issue, change));
                        }
                    }
                }

                if (!updater.isEmpty() && !updater.equalsIgnoreCase(reporter)) {
                    LOG.info("Reporter: " + reporter);
                    LOG.info("Updater: " + updater);
                    YouTrackUser youTrackUser = YouTrackUsersStorage.getInstance().getUserByLogin(reporter);
                    if (youTrackUser != null) {
                        if (IssueNotifications.getInstance().isDisabled(youTrackUser.getVkId(), issue.getId())) {
                            LOG.info("Temp disabled issues notifications");
                        } else if (isClosed && youTrackUser.getSettingValue(SettingName.CLOSED_ISSUE_NOTIFICATION) == SettingValue.OFF) {
                            LOG.info("Disabled closed issues notifications");
                        } else {
                            sendMessage(youTrackUser.getVkId(), getMessage(issue, change));
                        }
                    }
                }
            }
        }
    }

    private String getMessage(Issue issue, IssueChange change) throws IOException {
        if (change != null) {
            return changedIssueMessage(issue, change);
        }

        return newIssueMessage(issue);
    }

    private String newIssueMessage(Issue issue) {
        String url = Application.ytHost() + "/issue/" + issue.getId();
        String summary = issue.getFieldValue("summary") != null ? issue.getFieldValue("summary") : "";
        String description = issue.getFieldValue("description") != null ? issue.getFieldValue("description") : "";
        String title = summary.isEmpty() ? description.substring(0, Math.min(description.length(), 100)) + "..." : summary;
        return issue.getId() + "\n" + "New issues from " + issue.getFieldValue("reporterName") + "\n" + issue.getFieldValue("Type") + " - " + title + "\n\n" + url + "\n-------";
    }

    private String changedIssueMessage(Issue issue, IssueChange change) {
        String changes = "";
        if (change != null) {
            changes = "Changes:\n";
            for (IssueChangeField field : change.getFields()) {
                if (SKIP_FIELDS.contains(field.getName()) || StringUtils.isEmpty(field.getName())) {
                    continue;
                }

                if (field.getName().equals("updaterName")) {
                    changes += "Updater: " + field.getValue() + "\n";
                } else {
                    changes += StringUtils.capitalize(field.getName()) + ": " + field.getOldValue() + " > " + field.getNewValue() + "\n";
                }
            }

            changes += "\n\n";
        }

        String url = Application.ytHost() + "/issue/" + issue.getId();
        String summary = issue.getFieldValue("summary") != null ? issue.getFieldValue("summary") : "";
        String description = issue.getFieldValue("description") != null ? issue.getFieldValue("description") : "";
        String title = summary.isEmpty() ? description.substring(0, Math.min(description.length(), 100)) + "..." : summary;
        return issue.getId() + "\n" + "Issue updated" + "\n" + issue.getFieldValue("Type") + " - " + title + "\n\n" + changes + url + "\n-------";
    }
}

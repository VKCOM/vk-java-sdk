package com.vk.api.examples.youtrack.storage;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tsivarev on 07.09.16.
 */
public class IssueNotifications {

    private static final Map<String, Long> MAP = new HashMap<>();

    private static IssueNotifications instance;

    public static IssueNotifications getInstance() {
        if (instance == null) {
            instance = new IssueNotifications();
        }

        return instance;
    }

    public void disable(Integer userId, String issueId) {
        MAP.put(getId(userId, issueId), System.currentTimeMillis() + 60 * 1000);
    }

    public boolean isDisabled(Integer userId, String issueId) {
        Long time = MAP.get(getId(userId, issueId));
        if (time == null) {
            return false;
        }

        if (time > System.currentTimeMillis()) {
            return true;
        }

        MAP.remove(getId(userId, issueId));
        return false;
    }

    private String getId(Integer userId, String issueId) {
        return userId + "__" + issueId;
    }
}

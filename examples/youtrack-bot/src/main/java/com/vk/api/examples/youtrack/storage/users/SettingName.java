package com.vk.api.examples.youtrack.storage.users;

/**
 * Created by tsivarev on 06.05.16.
 */
public enum SettingName {
    ISSUE_NOTIFICATION("issue_notification"),
    CLOSED_ISSUE_NOTIFICATION("closed_issue_notification");

    private String value;

    SettingName(String value) {
        this.value = value;
    }

    public static SettingName byValue(String searchValue) {
        for (SettingName value : SettingName.values()) {
            if (searchValue.equalsIgnoreCase(value.value)) {
                return value;
            }
        }

        throw new IllegalArgumentException("Invalid value " + searchValue);
    }

    @Override
    public String toString() {
        return value;
    }
}

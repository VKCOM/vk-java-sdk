package com.vk.api.examples.youtrack.storage.users;

/**
 * Created by tsivarev on 06.05.16.
 */
public enum SettingValue {
    ON("on"),
    OFF("off");

    private String value;

    SettingValue(String value) {
        this.value = value;
    }

    public static SettingValue byValue(String searchValue) {
        for (SettingValue value : SettingValue.values()) {
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

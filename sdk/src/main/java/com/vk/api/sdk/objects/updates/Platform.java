package com.vk.api.sdk.objects.updates;

/**
 * @author Denis Kokorin
 */
public enum Platform {
    MOBILE(1),
    IPHONE(2),
    IPAD(3),
    ANDROID(4),
    WINDOWS_PHONE(5),
    WINDOWS_8(6),
    WEB(7);

    private final int code;

    Platform(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Platform fromCode(int code) {
        for (Platform platform : values()) {
            if (platform.getCode() == code) {
                return platform;
            }
        }

        return null;
    }
}

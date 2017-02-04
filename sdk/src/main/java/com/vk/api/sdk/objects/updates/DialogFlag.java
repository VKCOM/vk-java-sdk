package com.vk.api.sdk.objects.updates;

import java.util.EnumSet;
import java.util.Set;

/**
 * @author Denis Kokorin
 * @see <a href="https://vk.com/dev/using_longpoll">Connecting to the LongPoll Server</a>
 */
public enum DialogFlag {
    IMPORTANT(1),
    ANSWERED(2);

    private final int code;

    DialogFlag(int code) {
        this.code = code;
    }

    public static Set<DialogFlag> fromCode(int code) {
        Set<DialogFlag> result = EnumSet.noneOf(DialogFlag.class);

        for (DialogFlag flag : values()) {
            if ((flag.code & code) > 0) {
                result.add(flag);
            }
        }

        return result;
    }

}

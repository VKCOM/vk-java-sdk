package com.vk.api.sdk.objects.updates;

import java.util.EnumSet;
import java.util.Set;

/**
 * @author Denis Kokorin
 * @see <a href="https://vk.com/dev/using_longpoll">Connecting to the LongPoll Server</a>
 */
public enum MessageFlag {
    UNREAD(+1),
    OUTBOX(+2),
    REPLIED(+4),
    IMPORTANT(+8),
    CHAT(+16),
    FRIENDS(+32),
    SPAM(+64),
    DELETED(+128),
    /**
     * message checked for spam by the user
     */
    FIXED(+256),
    MEDIA(+512);

    private final int code;

    MessageFlag(int code) {
        this.code = code;
    }

    public static Set<MessageFlag> fromCode(int code) {
        Set<MessageFlag> result = EnumSet.noneOf(MessageFlag.class);

        for (MessageFlag flag : values()) {
            if ((flag.code & code) > 0) {
                result.add(flag);
            }
        }

        return result;
    }
}

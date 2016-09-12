package com.vk.api.examples.youtrack.storage;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tsivarev on 01.05.16.
 */
public class Statistic {

    private static final Map<Event, Integer> EVENTS = new HashMap<>();

    public synchronized static void increment(Event event) {
        if (EVENTS.containsKey(event)) {
            Integer count = EVENTS.get(event);
            EVENTS.put(event, count + 1);
        } else {
            EVENTS.put(event, 1);
        }
    }

    public synchronized static int get(Event event) {
        if (EVENTS.containsKey(event)) {
            return EVENTS.get(event);
        }

        return 0;
    }

    public enum Event {
        USER_LOAD,
        SEND_NOTIFY,
        COMMAND,
        FAILED_COMMAND,
    }
}

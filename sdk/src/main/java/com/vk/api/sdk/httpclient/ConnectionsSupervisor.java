package com.vk.api.sdk.httpclient;

import org.apache.http.client.methods.HttpUriRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Anton Tsivarev on 11.09.15.
 */
public class ConnectionsSupervisor extends Thread {

    private static final Logger LOG = LoggerFactory.getLogger(ConnectionsSupervisor.class);

    private static final int FULL_CONNECTION_TIMEOUT_S = 60;
    private static final int WAIT_BEFORE_KILL_REQUEST_S = 10;
    private static final int CONNECTIONS_SUPERVISOR_WAIT_MS = 1000;

    private final Map<HttpUriRequest, Long> streams = new ConcurrentHashMap<>();

    ConnectionsSupervisor() {
        setDaemon(true);
        setName("Connections supervisor");
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(CONNECTIONS_SUPERVISOR_WAIT_MS);
            } catch (InterruptedException ignored) {
                //nop
            }

            long time = Instant.now().getEpochSecond();
            streams.entrySet().stream().filter(entry -> time > entry.getValue()).forEach(entry -> {
                HttpUriRequest request = entry.getKey();
                // double check
                if (streams.containsKey(request)) {
                    LOG.error(String.format("HttpUriRequest killed after timeout (%d sec.) exceeded: %s",
                            FULL_CONNECTION_TIMEOUT_S,
                            request));

                    request.abort();
                    removeRequest(request);
                }
            });
        }
    }

    void addRequest(HttpUriRequest request) {
        streams.put(request, Instant.now().getEpochSecond() + FULL_CONNECTION_TIMEOUT_S + WAIT_BEFORE_KILL_REQUEST_S);
    }

    void removeRequest(HttpUriRequest request) {
        streams.remove(request);
    }
}

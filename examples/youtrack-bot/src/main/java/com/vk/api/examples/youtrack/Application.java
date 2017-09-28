package com.vk.api.examples.youtrack;

import com.vk.api.examples.youtrack.api.client.YouTrackClient;
import com.vk.api.examples.youtrack.jobs.Job;
import com.vk.api.examples.youtrack.jobs.MembersUpdateJob;
import com.vk.api.examples.youtrack.jobs.MessagesJob;
import com.vk.api.examples.youtrack.jobs.NewsJob;
import com.vk.api.examples.youtrack.jobs.NotifyIssueChangesJob;
import com.vk.api.examples.youtrack.jobs.SprintEndJob;
import com.vk.api.examples.youtrack.server.CallbackRequestHandler;
import com.vk.api.examples.youtrack.server.ConfirmationCodeRequestHandler;
import com.vk.api.examples.youtrack.storage.DataStorage;
import com.vk.api.examples.youtrack.storage.LangStorage;
import com.vk.api.examples.youtrack.storage.MembersStorage;
import com.vk.api.examples.youtrack.storage.users.YouTrackUsersStorage;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import com.vk.api.sdk.objects.groups.CallbackServer;
import com.vk.api.sdk.objects.groups.responses.AddCallbackServerResponse;
import com.vk.api.sdk.objects.groups.responses.GetCallbackConfirmationCodeResponse;
import com.vk.api.sdk.objects.groups.responses.GetCallbackServersResponse;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by Anton Tsivarev on 07.09.16.
 */
public class Application {

    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    private static GroupActor actor = null;

    private static String version = "1.0";

    private static String mode = "standalone";

    private static Integer groupId = null;

    private static VkApiClient vk;

    private static YouTrackClient yt;

    private static String ytHost;

    private static List<Job> jobs = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        init();

        run();
    }

    private static void init() throws Exception {
        Properties properties = loadConfiguration();

        version = properties.getProperty("version");
        mode = properties.getProperty("mode");
        groupId = Integer.valueOf(properties.getProperty("vk.group.id"));

        initClients(properties);
        initData(properties);

        if (isServerMode()) {
            initServer(properties);
        }

        initJobs();
    }

    private static CallbackServer isServerExist(List<CallbackServer> items, String host) {
        for (CallbackServer callbackServer : items) {
            if (callbackServer.getUrl().equals(host)) {
                return callbackServer;
            }
        }

        return null;
    }

    private static void initServer(Properties properties) throws Exception {
        Integer port = Integer.valueOf(properties.getProperty("server.port"));
        String host = properties.getProperty("server.host");
        HandlerCollection handlers = new HandlerCollection();

        ConfirmationCodeRequestHandler confirmationCodeRequestHandler = null;

        GetCallbackServersResponse getCallbackServersResponse = vk.groups().getCallbackServers(actor).execute();
        CallbackServer callbackServer = isServerExist(getCallbackServersResponse.getItems(), host);

        if (callbackServer == null) {
            GetCallbackConfirmationCodeResponse getCallbackConfirmationCodeResponse = vk().groups().getCallbackConfirmationCode(actor).execute();
            String confirmationCode = getCallbackConfirmationCodeResponse.getCode();
            confirmationCodeRequestHandler = new ConfirmationCodeRequestHandler(confirmationCode);
        }

        CallbackRequestHandler callbackRequestHandler = new CallbackRequestHandler();

        if (callbackServer == null) {
            handlers.setHandlers(new Handler[]{confirmationCodeRequestHandler, callbackRequestHandler});
        } else {
            handlers.setHandlers(new Handler[]{callbackRequestHandler}); //temp solution
        }

        Server server = new Server(port);
        server.setHandler(handlers);

        server.start();

        if (callbackServer == null) {
            AddCallbackServerResponse addServerResponse = vk.groups().addCallbackServer(actor, host, "YouTrack Bot").execute();
            Integer serverId = addServerResponse.getServerId();
            vk.groups().setCallbackSettings(actor, serverId).messageNew(true).execute();
        }

        server.join();
    }

    private static void initClients(Properties properties) throws IOException {
        TransportClient client = HttpTransportClient.getInstance();
        vk = new VkApiClient(client);

        ytHost = properties.getProperty("yt.host");
        actor = new GroupActor(Integer.parseInt(properties.getProperty("vk.group.id")), properties.getProperty("vk.group.token"));
        yt = new YouTrackClient(ytHost,
                properties.getProperty("http.keystore.type"), properties.getProperty("http.keystore.path"), properties.getProperty("http.keystore.password"), properties.getProperty("http.key.password"),
                properties.getProperty("http.truststore.type"), properties.getProperty("http.truststore.path"), properties.getProperty("http.truststore.password"));
        yt.login(properties.getProperty("yt.login"), properties.getProperty("yt.password"));

    }

    private static void initJobs() throws ClientException, ApiException {
        jobs.add(new MembersUpdateJob());
        jobs.add(new NewsJob());
        jobs.add(new NotifyIssueChangesJob());
        jobs.add(new SprintEndJob());

        if (!isServerMode()) {
            jobs.add(new MessagesJob());
        }
    }


    private static void initData(Properties properties) throws IOException {
        LangStorage.getInstance().load(Application.class.getResource("/lang.properties").getPath());

        String dataDirectoryPath = properties.getProperty("data.global");
        File dataDirectory = new File(dataDirectoryPath);
        if (!dataDirectory.exists()) {
            LOG.warn("data directory not exist. Create " + dataDirectory.getPath());
            dataDirectory.mkdir();
        }

        File dataPath = new File(dataDirectoryPath + "/data.properties");
        if (!dataPath.exists()) {
            LOG.warn("data.properties not exist. Create " + dataPath.getPath());
            dataPath.createNewFile();
        }

        DataStorage dataStorage = DataStorage.getInstance();
        dataStorage.load(dataPath.getPath());

        File usersPath = new File(dataDirectoryPath + "/users.csv");
        if (!usersPath.exists()) {
            LOG.warn("users.csv not exist. Create " + usersPath.getPath());
            usersPath.createNewFile();
        }

        YouTrackUsersStorage youTrackUsersStorage = YouTrackUsersStorage.getInstance();
        youTrackUsersStorage.load(usersPath.getPath());

        File membersPath = new File(dataDirectoryPath + "/members.csv");
        if (!membersPath.exists()) {
            LOG.warn("members.csv not exist. Create " + membersPath.getPath());
            membersPath.createNewFile();
        }

        MembersStorage membersStorage = MembersStorage.getInstance();
        membersStorage.load(membersPath.getPath());
    }

    private static void run() throws Exception {
        if (jobs.isEmpty()) {
            LOG.warn("No jobs configured. Exist");
            return;
        }

        while (true) {
            for (Job job : jobs) {
                try {
                    job.doJob();
                } catch (Exception e) {
                    LOG.error("Something wrong", e);
                }
            }

            TimeUnit.SECONDS.sleep(1);
        }
    }

    private static Properties loadConfiguration() {
        Properties properties = new Properties();
        try (InputStream is = Application.class.getResourceAsStream("/config.properties")) {
            properties.load(is);
        } catch (IOException e) {
            LOG.error("Can't load properties file", e);
            throw new IllegalStateException(e);
        }

        return properties;
    }

    public static GroupActor actor() {
        return actor;
    }

    public static VkApiClient vk() {
        return vk;
    }

    public static YouTrackClient yt() {
        return yt;
    }

    public static String ytHost() {
        return ytHost;
    }

    public static String getVersion() {
        return version;
    }

    public static boolean isServerMode() {
        return mode.equalsIgnoreCase("server");
    }

    public static Integer groupId() {
        return groupId;
    }
}

package com.vk.api.examples.youtrack;

import com.google.gson.Gson;
import com.vk.api.examples.youtrack.api.client.YouTrackClient;
import com.vk.api.examples.youtrack.jobs.Job;
import com.vk.api.examples.youtrack.jobs.MembersUpdateJob;
import com.vk.api.examples.youtrack.jobs.NewsJob;
import com.vk.api.examples.youtrack.jobs.NotifyIssueChangesJob;
import com.vk.api.examples.youtrack.server.CallbackRequestHandler;
import com.vk.api.examples.youtrack.server.ConfirmationCodeRequestHandler;
import com.vk.api.examples.youtrack.storage.DataStorage;
import com.vk.api.examples.youtrack.storage.LangStorage;
import com.vk.api.examples.youtrack.storage.MembersStorage;
import com.vk.api.examples.youtrack.storage.users.YouTrackUsersStorage;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import com.vk.api.sdk.objects.groups.responses.GetCallbackConfirmationCodeResponse;
import com.vk.api.sdk.objects.groups.responses.GetCallbackServerSettingsResponse;
import com.vk.api.sdk.objects.groups.responses.SetCallbackServerResponse;
import com.vk.api.sdk.objects.groups.responses.SetCallbackServerResponseStateCode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerCollection;

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

    private static final Logger LOG = LogManager.getLogger(Application.class);

    private static GroupActor actor = null;

    private static String version = "1.0";

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

        initClients(properties);
        initData(properties);
        initServer(properties);
        initJobs();
    }

    private static void initServer(Properties properties) throws Exception {
        Integer port = Integer.valueOf(properties.getProperty("server.port"));
        String host = properties.getProperty("server.host");
        HandlerCollection handlers = new HandlerCollection();

        ConfirmationCodeRequestHandler confirmationCodeRequestHandler = null;

        GetCallbackServerSettingsResponse getCallbackServerSettingsResponse = vk.groups().getCallbackServerSettings(actor, actor.getGroupId()).execute();
        if (!getCallbackServerSettingsResponse.getServerUrl().equals(host)) {
            GetCallbackConfirmationCodeResponse getCallbackConfirmationCodeResponse = vk().groups().getCallbackConfirmationCode(actor, actor.getGroupId()).execute();
            String confirmationCode = getCallbackConfirmationCodeResponse.getCode();
            confirmationCodeRequestHandler = new ConfirmationCodeRequestHandler(confirmationCode);
        }

        vk.groups().setCallbackSettings(actor, actor.getGroupId()).messageNew(true).execute();

        CallbackRequestHandler callbackRequestHandler = new CallbackRequestHandler();

        if (confirmationCodeRequestHandler != null) {
            handlers.setHandlers(new Handler[]{confirmationCodeRequestHandler, callbackRequestHandler});
        } else {
            handlers.setHandlers(new Handler[]{callbackRequestHandler}); //temp solution
        }

        Server server = new Server(port);
        server.setHandler(handlers);

        server.start();

        for (int i = 0; i < 10; i++) {
            SetCallbackServerResponse response = vk.groups().setCallbackServer(actor, actor.getGroupId())
                    .serverUrl(host)
                    .execute();

            if (response.getStateCode() == SetCallbackServerResponseStateCode.FAILED) {
                throw new IllegalStateException("Can't set callback server");
            }

            if (response.getStateCode() == SetCallbackServerResponseStateCode.OK) {
                return;
            }

            TimeUnit.SECONDS.sleep(1);
        }

        server.join();
    }

    private static void initClients(Properties properties) throws IOException {
        TransportClient client = HttpTransportClient.getInstance();
        vk = new VkApiClient(client, new Gson());

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

    public static Actor actor() {
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
}

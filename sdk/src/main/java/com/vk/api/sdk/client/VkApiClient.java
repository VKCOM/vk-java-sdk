package com.vk.api.sdk.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vk.api.sdk.actions.Account;
import com.vk.api.sdk.actions.Ads;
import com.vk.api.sdk.actions.Adsweb;
import com.vk.api.sdk.actions.AppWidgets;
import com.vk.api.sdk.actions.Apps;
import com.vk.api.sdk.actions.Asr;
import com.vk.api.sdk.actions.Auth;
import com.vk.api.sdk.actions.Board;
import com.vk.api.sdk.actions.Bugtracker;
import com.vk.api.sdk.actions.Calls;
import com.vk.api.sdk.actions.Database;
import com.vk.api.sdk.actions.Docs;
import com.vk.api.sdk.actions.Donut;
import com.vk.api.sdk.actions.DownloadedGames;
import com.vk.api.sdk.actions.Execute;
import com.vk.api.sdk.actions.Fave;
import com.vk.api.sdk.actions.Friends;
import com.vk.api.sdk.actions.Gifts;
import com.vk.api.sdk.actions.Groups;
import com.vk.api.sdk.actions.GroupsLongPoll;
import com.vk.api.sdk.actions.LeadForms;
import com.vk.api.sdk.actions.Likes;
import com.vk.api.sdk.actions.LongPoll;
import com.vk.api.sdk.actions.Market;
import com.vk.api.sdk.actions.Messages;
import com.vk.api.sdk.actions.Newsfeed;
import com.vk.api.sdk.actions.Notes;
import com.vk.api.sdk.actions.Notifications;
import com.vk.api.sdk.actions.OAuth;
import com.vk.api.sdk.actions.Orders;
import com.vk.api.sdk.actions.Pages;
import com.vk.api.sdk.actions.Photos;
import com.vk.api.sdk.actions.Podcasts;
import com.vk.api.sdk.actions.Polls;
import com.vk.api.sdk.actions.PrettyCards;
import com.vk.api.sdk.actions.Search;
import com.vk.api.sdk.actions.Secure;
import com.vk.api.sdk.actions.Stats;
import com.vk.api.sdk.actions.Status;
import com.vk.api.sdk.actions.Storage;
import com.vk.api.sdk.actions.Store;
import com.vk.api.sdk.actions.Stories;
import com.vk.api.sdk.actions.Streaming;
import com.vk.api.sdk.actions.Translations;
import com.vk.api.sdk.actions.Upload;
import com.vk.api.sdk.actions.Users;
import com.vk.api.sdk.actions.Utils;
import com.vk.api.sdk.actions.Video;
import com.vk.api.sdk.actions.Wall;
import com.vk.api.sdk.actions.Widgets;
import org.apache.commons.lang3.StringUtils;

public class VkApiClient {
    private static final String API_ADDRESS = "https://api.vk.com/method/";

    private static final String OAUTH_ENDPOINT = "https://oauth.vk.com/";

    private static final int DEFAULT_RETRY_ATTEMPTS_INTERNAL_SERVER_ERROR_COUNT = 3;

    private String apiVersion = "5.199";

    private TransportClient transportClient;

    private Gson gson;

    private String apiEndpoint;

    private String oauthEndpoint;

    private int retryAttemptsInternalServerErrorCount;

    public VkApiClient(TransportClient transportClient) {
        this(transportClient, new GsonBuilder().disableHtmlEscaping().create(), DEFAULT_RETRY_ATTEMPTS_INTERNAL_SERVER_ERROR_COUNT);
    }

    public VkApiClient(TransportClient transportClient, Gson gson,
            int retryAttemptsInternalServerErrorCount) {
        this.transportClient = transportClient;
        this.gson = gson;
        this.retryAttemptsInternalServerErrorCount = retryAttemptsInternalServerErrorCount;

        if (StringUtils.isNoneEmpty(System.getProperty("api.host"))) {
           apiEndpoint = "https://" + System.getProperty("api.host") + "/method/";
        } else {
           apiEndpoint = API_ADDRESS;
        }

        if (StringUtils.isNoneEmpty(System.getProperty("oauth.host"))) {
           oauthEndpoint = "https://" + System.getProperty("oauth.host") + "/";
        } else {
           oauthEndpoint = OAUTH_ENDPOINT;
        }
    }

    public TransportClient getTransportClient() {
        return transportClient;
    }

    public Gson getGson() {
        return gson;
    }

    public int getRetryAttemptsInternalServerErrorCount() {
        return retryAttemptsInternalServerErrorCount;
    }

    public String getApiEndpoint() {
        return apiEndpoint;
    }

    public String getOAuthEndpoint() {
        return oauthEndpoint;
    }

    public String getVersion() {
        return apiVersion;
    }

    public void setVersion(String version) {
        this.apiVersion = version;
    }

    public Asr asr() {
        return new Asr(this);
    }

    public Notes notes() {
        return new Notes(this);
    }

    public Auth auth() {
        return new Auth(this);
    }

    public Fave fave() {
        return new Fave(this);
    }

    public Secure secure() {
        return new Secure(this);
    }

    public Photos photos() {
        return new Photos(this);
    }

    public Pages pages() {
        return new Pages(this);
    }

    public Docs docs() {
        return new Docs(this);
    }

    public GroupsLongPoll groupsLongPoll() {
        return new GroupsLongPoll(this);
    }

    public Stats stats() {
        return new Stats(this);
    }

    public LeadForms leadForms() {
        return new LeadForms(this);
    }

    public Translations translations() {
        return new Translations(this);
    }

    public Utils utils() {
        return new Utils(this);
    }

    public Donut donut() {
        return new Donut(this);
    }

    public Adsweb adsweb() {
        return new Adsweb(this);
    }

    public Bugtracker bugtracker() {
        return new Bugtracker(this);
    }

    public Gifts gifts() {
        return new Gifts(this);
    }

    public Likes likes() {
        return new Likes(this);
    }

    public AppWidgets appWidgets() {
        return new AppWidgets(this);
    }

    public Execute execute() {
        return new Execute(this);
    }

    public Friends friends() {
        return new Friends(this);
    }

    public Users users() {
        return new Users(this);
    }

    public Market market() {
        return new Market(this);
    }

    public Ads ads() {
        return new Ads(this);
    }

    public Messages messages() {
        return new Messages(this);
    }

    public Orders orders() {
        return new Orders(this);
    }

    public DownloadedGames downloadedGames() {
        return new DownloadedGames(this);
    }

    public Notifications notifications() {
        return new Notifications(this);
    }

    public Status status() {
        return new Status(this);
    }

    public LongPoll longPoll() {
        return new LongPoll(this);
    }

    public Upload upload() {
        return new Upload(this);
    }

    public Polls polls() {
        return new Polls(this);
    }

    public Storage storage() {
        return new Storage(this);
    }

    public Video video() {
        return new Video(this);
    }

    public Widgets widgets() {
        return new Widgets(this);
    }

    public Database database() {
        return new Database(this);
    }

    public Search search() {
        return new Search(this);
    }

    public Streaming streaming() {
        return new Streaming(this);
    }

    public Newsfeed newsfeed() {
        return new Newsfeed(this);
    }

    public Apps apps() {
        return new Apps(this);
    }

    public Stories stories() {
        return new Stories(this);
    }

    public Groups groups() {
        return new Groups(this);
    }

    public Store store() {
        return new Store(this);
    }

    public OAuth oAuth() {
        return new OAuth(this);
    }

    public Podcasts podcasts() {
        return new Podcasts(this);
    }

    public Calls calls() {
        return new Calls(this);
    }

    public PrettyCards prettyCards() {
        return new PrettyCards(this);
    }

    public Wall wall() {
        return new Wall(this);
    }

    public Account account() {
        return new Account(this);
    }

    public Board board() {
        return new Board(this);
    }
}

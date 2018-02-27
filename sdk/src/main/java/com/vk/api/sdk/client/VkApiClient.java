package com.vk.api.sdk.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vk.api.sdk.actions.Account;
import com.vk.api.sdk.actions.Ads;
import com.vk.api.sdk.actions.AppWidgets;
import com.vk.api.sdk.actions.Apps;
import com.vk.api.sdk.actions.Auth;
import com.vk.api.sdk.actions.Board;
import com.vk.api.sdk.actions.Database;
import com.vk.api.sdk.actions.Docs;
import com.vk.api.sdk.actions.Execute;
import com.vk.api.sdk.actions.Fave;
import com.vk.api.sdk.actions.Friends;
import com.vk.api.sdk.actions.Gifts;
import com.vk.api.sdk.actions.Groups;
import com.vk.api.sdk.actions.Leads;
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
import com.vk.api.sdk.actions.Places;
import com.vk.api.sdk.actions.Polls;
import com.vk.api.sdk.actions.Search;
import com.vk.api.sdk.actions.Secure;
import com.vk.api.sdk.actions.Stats;
import com.vk.api.sdk.actions.Status;
import com.vk.api.sdk.actions.Storage;
import com.vk.api.sdk.actions.Streaming;
import com.vk.api.sdk.actions.Upload;
import com.vk.api.sdk.actions.Users;
import com.vk.api.sdk.actions.Videos;
import com.vk.api.sdk.actions.Wall;
import com.vk.api.sdk.actions.Widgets;
import org.apache.commons.lang3.StringUtils;

public class VkApiClient {

    private static final String API_VERSION = "5.69";
    private static final String API_ADDRESS = "https://api.vk.com/method/";
    private static final String OAUTH_ENDPOINT = "https://oauth.vk.com/";
    private static final int DEFAULT_RETRY_ATTEMPTS_INTERNAL_SERVER_ERROR_COUNT = 3;

    private TransportClient transportClient;
    private Gson gson;

    private String apiEndpoint;
    private String oauthEndpoint;
    private int retryAttemptsInternalServerErrorCount;

    public VkApiClient(TransportClient transportClient) {
        this(transportClient, new GsonBuilder().create(), DEFAULT_RETRY_ATTEMPTS_INTERNAL_SERVER_ERROR_COUNT);
    }

    public VkApiClient(TransportClient transportClient, Gson gson, int retryAttemptsInternalServerErrorCount) {
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

    int getRetryAttemptsInternalServerErrorCount() {
        return retryAttemptsInternalServerErrorCount;
    }

    public String getApiEndpoint() {
        return apiEndpoint;
    }

    public String getOAuthEndpoint() {
        return oauthEndpoint;
    }

    public String getVersion() {
        return API_VERSION;
    }

    public OAuth oauth() {
        return new OAuth(this);
    }

    public Account account() {
        return new Account(this);
    }

    public Ads ads() {
        return new Ads(this);
    }

    public Apps apps() {
        return new Apps(this);
    }

    public Auth auth() {
        return new Auth(this);
    }

    public Board board() {
        return new Board(this);
    }

    public Database database() {
        return new Database(this);
    }

    public Docs docs() {
        return new Docs(this);
    }

    public Fave fave() {
        return new Fave(this);
    }

    public Friends friends() {
        return new Friends(this);
    }

    public Gifts gifts() {
        return new Gifts(this);
    }

    public Groups groups() {
        return new Groups(this);
    }

    public Leads leads() {
        return new Leads(this);
    }

    public Likes likes() {
        return new Likes(this);
    }

    public Market market() {
        return new Market(this);
    }

    public Messages messages() {
        return new Messages(this);
    }

    public Newsfeed newsfeed() {
        return new Newsfeed(this);
    }

    public Notes notes() {
        return new Notes(this);
    }

    public Notifications notifications() {
        return new Notifications(this);
    }

    public Orders orders() {
        return new Orders(this);
    }

    public Pages pages() {
        return new Pages(this);
    }

    public Photos photos() {
        return new Photos(this);
    }

    public Places places() {
        return new Places(this);
    }

    public Polls polls() {
        return new Polls(this);
    }

    public Search search() {
        return new Search(this);
    }

    public Secure secure() {
        return new Secure(this);
    }

    public Stats stats() {
        return new Stats(this);
    }

    public Status status() {
        return new Status(this);
    }

    public Storage storage() {
        return new Storage(this);
    }

    public Streaming streaming() {
        return new Streaming(this);
    }

    public Users users() {
        return new Users(this);
    }

    public Upload upload() {
        return new Upload(this);
    }

    public com.vk.api.sdk.actions.Utils utils() {
        return new com.vk.api.sdk.actions.Utils(this);
    }

    public Videos videos() {
        return new Videos(this);
    }

    public Wall wall() {
        return new Wall(this);
    }

    public Widgets widgets() {
        return new Widgets(this);
    }

    public AppWidgets appWidgets() {
        return new AppWidgets(this);
    }

    public LongPoll longPoll() {
        return new LongPoll(this);
    }

    public Execute execute() {
        return new Execute(this);
    }
}

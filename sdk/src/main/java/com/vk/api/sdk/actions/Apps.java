package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.queries.apps.AppsDeleteAppRequestsQuery;
import com.vk.api.sdk.queries.apps.AppsGetCatalogQuery;
import com.vk.api.sdk.queries.apps.AppsGetFriendsListQuery;
import com.vk.api.sdk.queries.apps.AppsGetLeaderboardQuery;
import com.vk.api.sdk.queries.apps.AppsGetQuery;
import com.vk.api.sdk.queries.apps.AppsGetScoreQuery;
import com.vk.api.sdk.queries.apps.AppsSendRequestQuery;

/**
 * List of Apps methods
 */
public class Apps extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Apps(VkApiClient client) {
        super(client);
    }

    /**
     * Returns a list of applications (apps) available to users in the App Catalog.
     *
     * @param count count of apps
     * @return query
     */
    public AppsGetCatalogQuery getCatalog(int count) {
        return new AppsGetCatalogQuery(getClient(), count);
    }

    /**
     * Returns a list of applications (apps) available to users in the App Catalog.
     *
     * @param actor vk actor
     * @param count count of apps
     * @return query
     */
    public AppsGetCatalogQuery getCatalog(Actor actor, int count) {
        return new AppsGetCatalogQuery(getClient(), actor, count);
    }

    /**
     * Returns applications data.
     *
     * @return query
     */
    public AppsGetQuery get() {
        return new AppsGetQuery(getClient());
    }

    /**
     * Returns applications data.
     *
     * @param actor vk actor
     * @return query
     */
    public AppsGetQuery get(Actor actor) {
        return new AppsGetQuery(getClient(), actor);
    }

    /**
     * Sends a request to another user in an app that uses VK authorization.
     *
     * @param actor  vk actor
     * @param userId user id
     * @return query
     */
    public AppsSendRequestQuery sendRequest(Actor actor, int userId) {
        return new AppsSendRequestQuery(getClient(), actor, userId);
    }

    /**
     * Deletes all request notifications from the current app.
     *
     * @param actor vk actor
     * @return query
     */
    public AppsDeleteAppRequestsQuery deleteAppRequests(Actor actor) {
        return new AppsDeleteAppRequestsQuery(getClient(), actor);
    }

    /**
     * Creates friends list for requests and invites in current app.
     *
     * @param actor vk actor
     * @return query
     */
    public AppsGetFriendsListQuery getFriendsList(Actor actor) {
        return new AppsGetFriendsListQuery(getClient(), actor);
    }

    /**
     * Returns players rating in the game.
     *
     * @param actor vk actor
     * @param type  leaderboard type
     * @return query
     */
    public AppsGetLeaderboardQuery getLeaderboard(Actor actor, String type) {
        return new AppsGetLeaderboardQuery(getClient(), actor, type);
    }

    /**
     * Returns user score in app
     *
     * @param actor  vk actor
     * @param userId user id
     * @return query
     */
    public AppsGetScoreQuery getScore(Actor actor, int userId) {
        return new AppsGetScoreQuery(getClient(), actor, userId);
    }
}

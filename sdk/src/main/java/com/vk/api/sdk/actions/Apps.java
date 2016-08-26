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
    public Apps(VkApiClient client) {
        super(client);
    }

    /**
     * Returns a list of applications (apps) available to users in the App Catalog.
     */
    public AppsGetCatalogQuery getCatalog(int count) {
        return new AppsGetCatalogQuery(getClient(), count);
    }

    /**
     * Returns a list of applications (apps) available to users in the App Catalog.
     */
    public AppsGetCatalogQuery getCatalog(Actor actor, int count) {
        return new AppsGetCatalogQuery(getClient(), actor, count);
    }

    /**
     * Returns applications data.
     */
    public AppsGetQuery get() {
        return new AppsGetQuery(getClient());
    }

    /**
     * Returns applications data.
     */
    public AppsGetQuery get(Actor actor) {
        return new AppsGetQuery(getClient(), actor);
    }

    /**
     * Sends a request to another user in an app that uses VK authorization.
     */
    public AppsSendRequestQuery sendRequest(Actor actor, int userId) {
        return new AppsSendRequestQuery(getClient(), actor, userId);
    }

    /**
     * Deletes all request notifications from the current app.
     */
    public AppsDeleteAppRequestsQuery deleteAppRequests(Actor actor) {
        return new AppsDeleteAppRequestsQuery(getClient(), actor);
    }

    /**
     * Creates friends list for requests and invites in current app.
     */
    public AppsGetFriendsListQuery getFriendsList(Actor actor) {
        return new AppsGetFriendsListQuery(getClient(), actor);
    }

    /**
     * Returns players rating in the game.
     */
    public AppsGetLeaderboardQuery getLeaderboard(Actor actor, String type) {
        return new AppsGetLeaderboardQuery(getClient(), actor, type);
    }

    /**
     * Returns user score in app
     */
    public AppsGetScoreQuery getScore(Actor actor, int userId) {
        return new AppsGetScoreQuery(getClient(), actor, userId);
    }
}

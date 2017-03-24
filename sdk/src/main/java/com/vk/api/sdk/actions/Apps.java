package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.apps.AppsDeleteAppRequestsQuery;
import com.vk.api.sdk.queries.apps.AppsGetCatalogQuery;
import com.vk.api.sdk.queries.apps.AppsGetFriendsListQuery;
import com.vk.api.sdk.queries.apps.AppsGetLeaderboardQuery;
import com.vk.api.sdk.queries.apps.AppsGetLeaderboardQueryWithExtended;
import com.vk.api.sdk.queries.apps.AppsGetLeaderboardType;
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
    public AppsGetCatalogQuery getCatalog(ServiceActor actor, int count) {
        return new AppsGetCatalogQuery(getClient(), actor, count);
    }

    /**
     * Returns a list of applications (apps) available to users in the App Catalog.
     *
     * @param actor vk actor
     * @param count count of apps
     * @return query
     */
    public AppsGetCatalogQuery getCatalog(UserActor actor, int count) {
        return new AppsGetCatalogQuery(getClient(), actor, count);
    }

    /**
     * Returns applications data.
     *
     * @return query
     */
    public AppsGetQuery get(ServiceActor actor) {
        return new AppsGetQuery(getClient(), actor);
    }

    /**
     * Returns applications data.
     *
     * @param actor vk actor
     * @return query
     */
    public AppsGetQuery get(UserActor actor) {
        return new AppsGetQuery(getClient(), actor);
    }

    /**
     * Sends a request to another user in an app that uses VK authorization.
     *
     * @param actor  vk actor
     * @param userId user id
     * @return query
     */
    public AppsSendRequestQuery sendRequest(UserActor actor, int userId) {
        return new AppsSendRequestQuery(getClient(), actor, userId);
    }

    /**
     * Deletes all request notifications from the current app.
     *
     * @param actor vk actor
     * @return query
     */
    public AppsDeleteAppRequestsQuery deleteAppRequests(UserActor actor) {
        return new AppsDeleteAppRequestsQuery(getClient(), actor);
    }

    /**
     * Creates friends list for requests and invites in current app.
     *
     * @param actor vk actor
     * @return query
     */
    public AppsGetFriendsListQuery getFriendsList(UserActor actor) {
        return new AppsGetFriendsListQuery(getClient(), actor);
    }

    /**
     * Returns players rating in the game.
     *
     * @param actor vk actor
     * @param type  leaderboard type
     * @return query
     */
    public AppsGetLeaderboardQuery getLeaderboard(UserActor actor, AppsGetLeaderboardType type) {
        return new AppsGetLeaderboardQuery(getClient(), actor, type);
    }

    /**
     * Returns players rating in the game.
     *
     * @param actor vk actor
     * @param type  leaderboard type
     * @return query
     */
    public AppsGetLeaderboardQueryWithExtended getLeaderboardExtended(UserActor actor, AppsGetLeaderboardType type) {
        return new AppsGetLeaderboardQueryWithExtended(getClient(), actor, type);
    }

    /**
     * Returns user score in app
     *
     * @param actor  vk actor
     * @param userId user id
     * @return query
     */
    public AppsGetScoreQuery getScore(UserActor actor, int userId) {
        return new AppsGetScoreQuery(getClient(), actor, userId);
    }
}

package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.enums.AppsType;
import com.vk.api.sdk.queries.apps.AppsDeleteAppRequestsQuery;
import com.vk.api.sdk.queries.apps.AppsGetCatalogQuery;
import com.vk.api.sdk.queries.apps.AppsGetFriendsListQuery;
import com.vk.api.sdk.queries.apps.AppsGetLeaderboardQuery;
import com.vk.api.sdk.queries.apps.AppsGetLeaderboardQueryWithExtended;
import com.vk.api.sdk.queries.apps.AppsGetQuery;
import com.vk.api.sdk.queries.apps.AppsGetScopesQuery;
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
     * Deletes all request notifications from the current app.
     *
     * @param actor vk actor
     * @return query
     */
    public AppsDeleteAppRequestsQuery deleteAppRequests(UserActor actor) {
        return new AppsDeleteAppRequestsQuery(getClient(), actor);
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
     * Returns applications data.
     *
     * @param actor vk actor
     * @return query
     */
    public AppsGetQuery get(ServiceActor actor) {
        return new AppsGetQuery(getClient(), actor);
    }

    /**
     * Returns a list of applications (apps) available to users in the App Catalog.
     *
     * @param actor vk actor
     * @param count Number of apps to return.
     * @return query
     */
    public AppsGetCatalogQuery getCatalog(UserActor actor, int count) {
        return new AppsGetCatalogQuery(getClient(), actor, count);
    }

    /**
     * Returns a list of applications (apps) available to users in the App Catalog.
     *
     * @param actor vk actor
     * @param count Number of apps to return.
     * @return query
     */
    public AppsGetCatalogQuery getCatalog(ServiceActor actor, int count) {
        return new AppsGetCatalogQuery(getClient(), actor, count);
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
     * @param type Leaderboard type. Possible values: *'level' — by level,, *'points' — by mission points,, *'score' — by score ().
     * @return query
     */
    public AppsGetLeaderboardQueryWithExtended getLeaderboardExtended(UserActor actor,
            AppsType type) {
        return new AppsGetLeaderboardQueryWithExtended(getClient(), actor, type);
    }

    /**
     * Returns players rating in the game.
     *
     * @param actor vk actor
     * @param type Leaderboard type. Possible values: *'level' — by level,, *'points' — by mission points,, *'score' — by score ().
     * @return query
     */
    public AppsGetLeaderboardQuery getLeaderboard(UserActor actor, AppsType type) {
        return new AppsGetLeaderboardQuery(getClient(), actor, type);
    }

    /**
     * Returns scopes for auth
     *
     * @param actor vk actor
     * @return query
     */
    public AppsGetScopesQuery getScopes(UserActor actor) {
        return new AppsGetScopesQuery(getClient(), actor);
    }

    /**
     * Returns user score in app
     *
     * @param actor vk actor
     * @param userId
     * @return query
     */
    public AppsGetScoreQuery getScore(UserActor actor, int userId) {
        return new AppsGetScoreQuery(getClient(), actor, userId);
    }

    /**
     * Sends a request to another user in an app that uses VK authorization.
     *
     * @param actor vk actor
     * @param userId id of the user to send a request
     * @return query
     */
    public AppsSendRequestQuery sendRequest(UserActor actor, int userId) {
        return new AppsSendRequestQuery(getClient(), actor, userId);
    }
}

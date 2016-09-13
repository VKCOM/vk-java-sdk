package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.queries.Field;
import com.vk.api.sdk.queries.users.UsersGetFollowersQuery;
import com.vk.api.sdk.queries.users.UsersGetFollowersQueryWithFields;
import com.vk.api.sdk.queries.users.UsersGetNearbyQuery;
import com.vk.api.sdk.queries.users.UsersGetQuery;
import com.vk.api.sdk.queries.users.UsersGetSubscriptionsQuery;
import com.vk.api.sdk.queries.users.UsersGetSubscriptionsQueryWithExtended;
import com.vk.api.sdk.queries.users.UsersIsAppUserQuery;
import com.vk.api.sdk.queries.users.UsersReportQuery;
import com.vk.api.sdk.queries.users.UsersSearchQuery;

/**
 * List of Users methods
 */
public class Users extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Users(VkApiClient client) {
        super(client);
    }

    /**
     * Returns detailed information on users.
     */
    public UsersGetQuery get() {
        return new UsersGetQuery(getClient());
    }

    /**
     * Returns detailed information on users.
     */
    public UsersGetQuery get(Actor actor) {
        return new UsersGetQuery(getClient(), actor);
    }

    /**
     * Returns a list of users matching the search criteria.
     */
    public UsersSearchQuery search(Actor actor) {
        return new UsersSearchQuery(getClient(), actor);
    }

    /**
     * Returns information whether a user installed the application.
     */
    public UsersIsAppUserQuery isAppUser(Actor actor) {
        return new UsersIsAppUserQuery(getClient(), actor);
    }

    /**
     * Returns a list of IDs of users and communities followed by the user.
     */
    public UsersGetSubscriptionsQuery getSubscriptions() {
        return new UsersGetSubscriptionsQuery(getClient());
    }

    /**
     * Returns a list of IDs of users and communities followed by the user.
     */
    public UsersGetSubscriptionsQuery getSubscriptions(Actor actor) {
        return new UsersGetSubscriptionsQuery(getClient(), actor);
    }

    /**
     * Returns a list of IDs of users and communities followed by the user.
     */
    public UsersGetSubscriptionsQueryWithExtended getSubscriptionsExtended() {
        return new UsersGetSubscriptionsQueryWithExtended(getClient());
    }

    /**
     * Returns a list of IDs of users and communities followed by the user.
     */
    public UsersGetSubscriptionsQueryWithExtended getSubscriptionsExtended(Actor actor) {
        return new UsersGetSubscriptionsQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of IDs of followers of the user in question, sorted by date added, most recent first.
     */
    public UsersGetFollowersQuery getFollowers() {
        return new UsersGetFollowersQuery(getClient());
    }

    /**
     * Returns a list of IDs of followers of the user in question, sorted by date added, most recent first.
     */
    public UsersGetFollowersQuery getFollowers(Actor actor) {
        return new UsersGetFollowersQuery(getClient(), actor);
    }

    /**
     * Returns a list of IDs of followers of the user in question, sorted by date added, most recent first.
     */
    public UsersGetFollowersQueryWithFields getFollowers(Field... fields) {
        return new UsersGetFollowersQueryWithFields(getClient(), fields);
    }

    /**
     * Returns a list of IDs of followers of the user in question, sorted by date added, most recent first.
     */
    public UsersGetFollowersQueryWithFields getFollowers(Actor actor, Field... fields) {
        return new UsersGetFollowersQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Reports (submits a complain about) a user.
     */
    public UsersReportQuery report(Actor actor, int userId, String type) {
        return new UsersReportQuery(getClient(), actor, userId, type);
    }

    /**
     * Indexes current user location and returns nearby users.
     */
    public UsersGetNearbyQuery getNearby(Actor actor, float latitude, float longitude) {
        return new UsersGetNearbyQuery(getClient(), actor, latitude, longitude);
    }
}

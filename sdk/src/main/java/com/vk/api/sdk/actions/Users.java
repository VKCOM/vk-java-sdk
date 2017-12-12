package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.users.UserField;
import com.vk.api.sdk.queries.users.UsersGetFollowersQuery;
import com.vk.api.sdk.queries.users.UsersGetFollowersQueryWithFields;
import com.vk.api.sdk.queries.users.UsersGetNearbyQuery;
import com.vk.api.sdk.queries.users.UsersGetQuery;
import com.vk.api.sdk.queries.users.UsersGetSubscriptionsQuery;
import com.vk.api.sdk.queries.users.UsersGetSubscriptionsQueryWithExtended;
import com.vk.api.sdk.queries.users.UsersIsAppUserQuery;
import com.vk.api.sdk.queries.users.UsersReportQuery;
import com.vk.api.sdk.queries.users.UsersReportType;
import com.vk.api.sdk.queries.users.UsersSearchQuery;

import java.util.List;

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
     * @param actor service actor
     */
    public UsersGetQuery get(ServiceActor actor) {
        return new UsersGetQuery(getClient(), actor);
    }

    /**
     * Returns detailed information on users.
     * @param actor user actor
     */
    public UsersGetQuery get(UserActor actor) {
        return new UsersGetQuery(getClient(), actor);
    }

    /**
     * Returns detailed information on users.
     * @param actor group actor
     */
    public UsersGetQuery get(GroupActor actor) {
        return new UsersGetQuery(getClient(), actor);
    }

    /**
     * Returns a list of users matching the search criteria.
     */
    public UsersSearchQuery search(UserActor actor) {
        return new UsersSearchQuery(getClient(), actor);
    }

    /**
     * Returns information whether a user installed the application.
     */
    public UsersIsAppUserQuery isAppUser(UserActor actor) {
        return new UsersIsAppUserQuery(getClient(), actor);
    }

    /**
     * Returns a list of IDs of users and communities followed by the user.
     */
    public UsersGetSubscriptionsQuery getSubscriptions(ServiceActor actor) {
        return new UsersGetSubscriptionsQuery(getClient(), actor);
    }

    /**
     * Returns a list of IDs of users and communities followed by the user.
     */
    public UsersGetSubscriptionsQuery getSubscriptions(UserActor actor) {
        return new UsersGetSubscriptionsQuery(getClient(), actor);
    }

    /**
     * Returns a list of IDs of users and communities followed by the user.
     */
    public UsersGetSubscriptionsQueryWithExtended getSubscriptionsExtended(ServiceActor actor) {
        return new UsersGetSubscriptionsQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of IDs of users and communities followed by the user.
     */
    public UsersGetSubscriptionsQueryWithExtended getSubscriptionsExtended(UserActor actor) {
        return new UsersGetSubscriptionsQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of IDs of followers of the user in question, sorted by date added, most recent first.
     */
    public UsersGetFollowersQuery getFollowers(ServiceActor actor) {
        return new UsersGetFollowersQuery(getClient(), actor);
    }

    /**
     * Returns a list of IDs of followers of the user in question, sorted by date added, most recent first.
     */
    public UsersGetFollowersQuery getFollowers(UserActor actor) {
        return new UsersGetFollowersQuery(getClient(), actor);
    }

    /**
     * Returns a list of IDs of followers of the user in question, sorted by date added, most recent first.
     */
    public UsersGetFollowersQueryWithFields getFollowers(ServiceActor actor, UserField... fields) {
        return new UsersGetFollowersQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns a list of IDs of followers of the user in question, sorted by date added, most recent first.
     */
    public UsersGetFollowersQueryWithFields getFollowers(ServiceActor actor, List<UserField> fields) {
        return new UsersGetFollowersQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns a list of IDs of followers of the user in question, sorted by date added, most recent first.
     */
    public UsersGetFollowersQueryWithFields getFollowers(UserActor actor, UserField... fields) {
        return new UsersGetFollowersQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns a list of IDs of followers of the user in question, sorted by date added, most recent first.
     */
    public UsersGetFollowersQueryWithFields getFollowers(UserActor actor, List<UserField> fields) {
        return new UsersGetFollowersQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Reports (submits a complain about) a user.
     */
    public UsersReportQuery report(UserActor actor, int userId, UsersReportType type) {
        return new UsersReportQuery(getClient(), actor, userId, type);
    }

    /**
     * Indexes current user location and returns nearby users.
     */
    public UsersGetNearbyQuery getNearby(UserActor actor, float latitude, float longitude) {
        return new UsersGetNearbyQuery(getClient(), actor, latitude, longitude);
    }
}

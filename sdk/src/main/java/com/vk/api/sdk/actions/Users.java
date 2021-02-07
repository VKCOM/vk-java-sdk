package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.enums.UsersType;
import com.vk.api.sdk.objects.users.Fields;
import com.vk.api.sdk.queries.users.UsersGetFollowersQuery;
import com.vk.api.sdk.queries.users.UsersGetFollowersQueryWithFields;
import com.vk.api.sdk.queries.users.UsersGetQuery;
import com.vk.api.sdk.queries.users.UsersGetSubscriptionsQuery;
import com.vk.api.sdk.queries.users.UsersGetSubscriptionsQueryWithExtended;
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
     *
     * @param actor vk actor
     * @return query
     */
    public UsersGetQuery get(UserActor actor) {
        return new UsersGetQuery(getClient(), actor);
    }

    /**
     * Returns detailed information on users.
     *
     * @param actor vk actor
     * @return query
     */
    public UsersGetQuery get(GroupActor actor) {
        return new UsersGetQuery(getClient(), actor);
    }

    /**
     * Returns detailed information on users.
     *
     * @param actor vk actor
     * @return query
     */
    public UsersGetQuery get(ServiceActor actor) {
        return new UsersGetQuery(getClient(), actor);
    }

    /**
     * Returns a list of IDs of followers of the user in question, sorted by date added, most recent first.
     *
     * @param actor vk actor
     * @return query
     */
    public UsersGetFollowersQuery getFollowers(UserActor actor) {
        return new UsersGetFollowersQuery(getClient(), actor);
    }

    /**
     * Returns a list of IDs of followers of the user in question, sorted by date added, most recent first.
     *
     * @param actor vk actor
     * @return query
     */
    public UsersGetFollowersQuery getFollowers(ServiceActor actor) {
        return new UsersGetFollowersQuery(getClient(), actor);
    }

    /**
     * Returns a list of IDs of followers of the user in question, sorted by date added, most recent first.
     *
     * @param actor vk actor
     * @param fields Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online'.
     * @return query
     */
    public UsersGetFollowersQueryWithFields getFollowersWithFields(UserActor actor,
            Fields... fields) {
        return new UsersGetFollowersQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns a list of IDs of followers of the user in question, sorted by date added, most recent first.
     *
     * @param actor vk actor
     * @param fields Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online'.
     * @return query
     */
    public UsersGetFollowersQueryWithFields getFollowersWithFields(ServiceActor actor,
            Fields... fields) {
        return new UsersGetFollowersQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns a list of IDs of users and communities followed by the user.
     *
     * @param actor vk actor
     * @return query
     */
    public UsersGetSubscriptionsQueryWithExtended getSubscriptionsExtended(UserActor actor) {
        return new UsersGetSubscriptionsQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of IDs of users and communities followed by the user.
     *
     * @param actor vk actor
     * @return query
     */
    public UsersGetSubscriptionsQueryWithExtended getSubscriptionsExtended(ServiceActor actor) {
        return new UsersGetSubscriptionsQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of IDs of users and communities followed by the user.
     *
     * @param actor vk actor
     * @return query
     */
    public UsersGetSubscriptionsQuery getSubscriptions(UserActor actor) {
        return new UsersGetSubscriptionsQuery(getClient(), actor);
    }

    /**
     * Returns a list of IDs of users and communities followed by the user.
     *
     * @param actor vk actor
     * @return query
     */
    public UsersGetSubscriptionsQuery getSubscriptions(ServiceActor actor) {
        return new UsersGetSubscriptionsQuery(getClient(), actor);
    }

    /**
     * Reports (submits a complain about) a user.
     *
     * @param actor vk actor
     * @param userId ID of the user about whom a complaint is being made.
     * @param type Type of complaint: 'porn' – pornography, 'spam' – spamming, 'insult' – abusive behavior, 'advertisement' – disruptive advertisements
     * @return query
     */
    public UsersReportQuery report(UserActor actor, int userId, UsersType type) {
        return new UsersReportQuery(getClient(), actor, userId, type);
    }

    /**
     * Returns a list of users matching the search criteria.
     *
     * @param actor vk actor
     * @return query
     */
    public UsersSearchQuery search(UserActor actor) {
        return new UsersSearchQuery(getClient(), actor);
    }
}

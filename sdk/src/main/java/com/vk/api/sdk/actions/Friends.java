package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.friends.FriendsAddListQuery;
import com.vk.api.sdk.queries.friends.FriendsAddQuery;
import com.vk.api.sdk.queries.friends.FriendsAreFriendsQuery;
import com.vk.api.sdk.queries.friends.FriendsDeleteAllRequestsQuery;
import com.vk.api.sdk.queries.friends.FriendsDeleteListQuery;
import com.vk.api.sdk.queries.friends.FriendsDeleteQuery;
import com.vk.api.sdk.queries.friends.FriendsEditListQuery;
import com.vk.api.sdk.queries.friends.FriendsEditQuery;
import com.vk.api.sdk.queries.friends.FriendsGetAppUsersQuery;
import com.vk.api.sdk.queries.friends.FriendsGetByPhonesQuery;
import com.vk.api.sdk.queries.friends.FriendsGetListsQuery;
import com.vk.api.sdk.queries.friends.FriendsGetMutualQuery;
import com.vk.api.sdk.queries.friends.FriendsGetMutualQueryWithTargetUids;
import com.vk.api.sdk.queries.friends.FriendsGetOnlineQuery;
import com.vk.api.sdk.queries.friends.FriendsGetOnlineQueryWithMobile;
import com.vk.api.sdk.queries.friends.FriendsGetQuery;
import com.vk.api.sdk.queries.friends.FriendsGetQueryWithFields;
import com.vk.api.sdk.queries.friends.FriendsGetRecentQuery;
import com.vk.api.sdk.queries.friends.FriendsGetRequestsQuery;
import com.vk.api.sdk.queries.friends.FriendsGetRequestsQueryWithExtended;
import com.vk.api.sdk.queries.friends.FriendsGetRequestsQueryWithNeedMutual;
import com.vk.api.sdk.queries.friends.FriendsGetSuggestionsQuery;
import com.vk.api.sdk.queries.friends.FriendsSearchQuery;
import com.vk.api.sdk.queries.users.UserField;

import java.util.List;

/**
 * List of Friends methods
 */
public class Friends extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Friends(VkApiClient client) {
        super(client);
    }

    /**
     * Returns a list of user IDs or detailed information about a user's friends.
     */
    public FriendsGetQuery get(ServiceActor actor) {
        return new FriendsGetQuery(getClient(), actor);
    }

    /**
     * Returns a list of user IDs or detailed information about a user's friends.
     */
    public FriendsGetQuery get(UserActor actor) {
        return new FriendsGetQuery(getClient(), actor);
    }

    /**
     * Returns a list of user IDs or detailed information about a user's friends.
     */
    public FriendsGetQueryWithFields get(ServiceActor actor, UserField... fields) {
        return new FriendsGetQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns a list of user IDs or detailed information about a user's friends.
     */
    public FriendsGetQueryWithFields get(ServiceActor actor, List<UserField> fields) {
        return new FriendsGetQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns a list of user IDs or detailed information about a user's friends.
     */
    public FriendsGetQueryWithFields get(UserActor actor, UserField... fields) {
        return new FriendsGetQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns a list of user IDs or detailed information about a user's friends.
     */
    public FriendsGetQueryWithFields get(UserActor actor, List<UserField> fields) {
        return new FriendsGetQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns a list of user IDs of a user's friends who are online.
     */
    public FriendsGetOnlineQuery getOnline(UserActor actor) {
        return new FriendsGetOnlineQuery(getClient(), actor);
    }

    /**
     * Returns a list of user IDs of a user's friends who are online.
     */
    public FriendsGetOnlineQueryWithMobile getOnlineMobile(UserActor actor) {
        return new FriendsGetOnlineQueryWithMobile(getClient(), actor);
    }

    /**
     * Returns a list of user IDs of the mutual friends of two users.
     */
    public FriendsGetMutualQuery getMutual(UserActor actor) {
        return new FriendsGetMutualQuery(getClient(), actor);
    }

    /**
     * Returns a list of user IDs of the mutual friends of two users.
     */
    public FriendsGetMutualQueryWithTargetUids getMutualTargetUids(UserActor actor, List<Integer> targetUids) {
        return new FriendsGetMutualQueryWithTargetUids(getClient(), actor, targetUids);
    }

    /**
     * Returns a list of user IDs of the mutual friends of two users.
     */
    public FriendsGetMutualQueryWithTargetUids getMutualTargetUids(UserActor actor, Integer... targetUids) {
        return new FriendsGetMutualQueryWithTargetUids(getClient(), actor, targetUids);
    }

    /**
     * Returns a list of user IDs of the current user's recently added friends.
     */
    public FriendsGetRecentQuery getRecent(UserActor actor) {
        return new FriendsGetRecentQuery(getClient(), actor);
    }

    /**
     * Returns information about the current user's incoming and outgoing friend requests.
     */
    public FriendsGetRequestsQuery getRequests(UserActor actor) {
        return new FriendsGetRequestsQuery(getClient(), actor);
    }

    /**
     * Returns information about the current user's incoming and outgoing friend requests.
     */
    public FriendsGetRequestsQueryWithNeedMutual getRequests(UserActor actor, Boolean needMutual) {
        return new FriendsGetRequestsQueryWithNeedMutual(getClient(), actor, needMutual);
    }

    /**
     * Returns information about the current user's incoming and outgoing friend requests.
     */
    public FriendsGetRequestsQueryWithExtended getRequestsExtended(UserActor actor) {
        return new FriendsGetRequestsQueryWithExtended(getClient(), actor);
    }

    /**
     * Approves or creates a friend request.
     */
    public FriendsAddQuery add(UserActor actor, int userId) {
        return new FriendsAddQuery(getClient(), actor, userId);
    }

    /**
     * Edits the friend lists of the selected user.
     */
    public FriendsEditQuery edit(UserActor actor, int userId) {
        return new FriendsEditQuery(getClient(), actor, userId);
    }

    /**
     * Declines a friend request or deletes a user from the current user's friend list.
     */
    public FriendsDeleteQuery delete(UserActor actor, int userId) {
        return new FriendsDeleteQuery(getClient(), actor, userId);
    }

    /**
     * Returns a list of the current user's friend lists.
     */
    public FriendsGetListsQuery getLists(UserActor actor) {
        return new FriendsGetListsQuery(getClient(), actor);
    }

    /**
     * Creates a new friend list for the current user.
     */
    public FriendsAddListQuery addList(UserActor actor, String name) {
        return new FriendsAddListQuery(getClient(), actor, name);
    }

    /**
     * Edits a friend list of the current user.
     */
    public FriendsEditListQuery editList(UserActor actor, int listId) {
        return new FriendsEditListQuery(getClient(), actor, listId);
    }

    /**
     * Deletes a friend list of the current user.
     */
    public FriendsDeleteListQuery deleteList(UserActor actor, int listId) {
        return new FriendsDeleteListQuery(getClient(), actor, listId);
    }

    /**
     * Returns a list of IDs of the current user's friends who installed the application.
     */
    public FriendsGetAppUsersQuery getAppUsers(UserActor actor) {
        return new FriendsGetAppUsersQuery(getClient(), actor);
    }

    /**
     * Returns a list of the current user's friends whose phone numbers, validated or specified in a profile, are in a given list.
     */
    public FriendsGetByPhonesQuery getByPhones(UserActor actor) {
        return new FriendsGetByPhonesQuery(getClient(), actor);
    }

    /**
     * Marks all incoming friend requests as viewed.
     */
    public FriendsDeleteAllRequestsQuery deleteAllRequests(UserActor actor) {
        return new FriendsDeleteAllRequestsQuery(getClient(), actor);
    }

    /**
     * Returns a list of profiles of users whom the current user may know.
     */
    public FriendsGetSuggestionsQuery getSuggestions(UserActor actor) {
        return new FriendsGetSuggestionsQuery(getClient(), actor);
    }

    /**
     * Checks the current user's friendship status with other specified users.
     */
    public FriendsAreFriendsQuery areFriends(UserActor actor, int... userIds) {
        return new FriendsAreFriendsQuery(getClient(), actor, userIds);
    }

    /**
     * Checks the current user's friendship status with other specified users.
     */
    public FriendsAreFriendsQuery areFriends(UserActor actor, List<Integer> userIds) {
        return new FriendsAreFriendsQuery(getClient(), actor, userIds);
    }

    /**
     * Returns a list of friends matching the search criteria.
     *
     * @param actor  actor with access token
     * @param userId value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsSearchQuery search(UserActor actor, int userId) {
        return new FriendsSearchQuery(getClient(), actor, userId);
    }
}

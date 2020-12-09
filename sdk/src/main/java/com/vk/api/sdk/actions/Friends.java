package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.users.Fields;
import com.vk.api.sdk.queries.friends.FriendsAddListQuery;
import com.vk.api.sdk.queries.friends.FriendsAddQuery;
import com.vk.api.sdk.queries.friends.FriendsAreFriendsQuery;
import com.vk.api.sdk.queries.friends.FriendsAreFriendsQueryWithExtended;
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
import com.vk.api.sdk.queries.friends.FriendsGetOnlineQueryWithOnlineMobile;
import com.vk.api.sdk.queries.friends.FriendsGetQuery;
import com.vk.api.sdk.queries.friends.FriendsGetQueryWithFields;
import com.vk.api.sdk.queries.friends.FriendsGetRecentQuery;
import com.vk.api.sdk.queries.friends.FriendsGetRequestsQuery;
import com.vk.api.sdk.queries.friends.FriendsGetRequestsQueryWithExtended;
import com.vk.api.sdk.queries.friends.FriendsGetRequestsQueryWithNeedMutual;
import com.vk.api.sdk.queries.friends.FriendsGetSuggestionsQuery;
import com.vk.api.sdk.queries.friends.FriendsSearchQuery;
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
     * Approves or creates a friend request.
     *
     * @param actor vk actor
     * @return query
     */
    public FriendsAddQuery add(UserActor actor) {
        return new FriendsAddQuery(getClient(), actor);
    }

    /**
     * Creates a new friend list for the current user.
     *
     * @param actor vk actor
     * @param name Name of the friend list.
     * @return query
     */
    public FriendsAddListQuery addList(UserActor actor, String name) {
        return new FriendsAddListQuery(getClient(), actor, name);
    }

    /**
     * Checks the current user's friendship status with other specified users.
     *
     * @param actor vk actor
     * @param userIds IDs of the users whose friendship status to check.
     * @return query
     */
    public FriendsAreFriendsQuery areFriends(UserActor actor, Integer... userIds) {
        return new FriendsAreFriendsQuery(getClient(), actor, userIds);
    }

    /**
     * Checks the current user's friendship status with other specified users.
     *
     * @param actor vk actor
     * @param userIds IDs of the users whose friendship status to check.
     * @return query
     */
    public FriendsAreFriendsQuery areFriends(UserActor actor, List<Integer> userIds) {
        return new FriendsAreFriendsQuery(getClient(), actor, userIds);
    }

    /**
     * Checks the current user's friendship status with other specified users.
     *
     * @param actor vk actor
     * @param userIds IDs of the users whose friendship status to check.
     * @return query
     */
    public FriendsAreFriendsQueryWithExtended areFriendsExtended(UserActor actor,
            Integer... userIds) {
        return new FriendsAreFriendsQueryWithExtended(getClient(), actor, userIds);
    }

    /**
     * Checks the current user's friendship status with other specified users.
     *
     * @param actor vk actor
     * @param userIds IDs of the users whose friendship status to check.
     * @return query
     */
    public FriendsAreFriendsQueryWithExtended areFriendsExtended(UserActor actor,
            List<Integer> userIds) {
        return new FriendsAreFriendsQueryWithExtended(getClient(), actor, userIds);
    }

    /**
     * Declines a friend request or deletes a user from the current user's friend list.
     *
     * @param actor vk actor
     * @return query
     */
    public FriendsDeleteQuery delete(UserActor actor) {
        return new FriendsDeleteQuery(getClient(), actor);
    }

    /**
     * Marks all incoming friend requests as viewed.
     *
     * @param actor vk actor
     * @return query
     */
    public FriendsDeleteAllRequestsQuery deleteAllRequests(UserActor actor) {
        return new FriendsDeleteAllRequestsQuery(getClient(), actor);
    }

    /**
     * Deletes a friend list of the current user.
     *
     * @param actor vk actor
     * @param listId ID of the friend list to delete.
     * @return query
     */
    public FriendsDeleteListQuery deleteList(UserActor actor, int listId) {
        return new FriendsDeleteListQuery(getClient(), actor, listId);
    }

    /**
     * Edits the friend lists of the selected user.
     *
     * @param actor vk actor
     * @param userId ID of the user whose friend list is to be edited.
     * @return query
     */
    public FriendsEditQuery edit(UserActor actor, int userId) {
        return new FriendsEditQuery(getClient(), actor, userId);
    }

    /**
     * Edits a friend list of the current user.
     *
     * @param actor vk actor
     * @param listId Friend list ID.
     * @return query
     */
    public FriendsEditListQuery editList(UserActor actor, int listId) {
        return new FriendsEditListQuery(getClient(), actor, listId);
    }

    /**
     * Returns a list of user IDs or detailed information about a user's friends.
     *
     * @param actor vk actor
     * @return query
     */
    public FriendsGetQuery get(UserActor actor) {
        return new FriendsGetQuery(getClient(), actor);
    }

    /**
     * Returns a list of user IDs or detailed information about a user's friends.
     *
     * @param actor vk actor
     * @return query
     */
    public FriendsGetQuery get(ServiceActor actor) {
        return new FriendsGetQuery(getClient(), actor);
    }

    /**
     * Returns a list of user IDs or detailed information about a user's friends.
     *
     * @param actor vk actor
     * @param fields Profile fields to return. Sample values: 'uid', 'first_name', 'last_name', 'nickname', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'domain', 'has_mobile', 'rate', 'contacts', 'education'.
     * @return query
     */
    public FriendsGetQueryWithFields getWithFields(UserActor actor, Fields... fields) {
        return new FriendsGetQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns a list of user IDs or detailed information about a user's friends.
     *
     * @param actor vk actor
     * @param fields Profile fields to return. Sample values: 'uid', 'first_name', 'last_name', 'nickname', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'domain', 'has_mobile', 'rate', 'contacts', 'education'.
     * @return query
     */
    public FriendsGetQueryWithFields getWithFields(ServiceActor actor, Fields... fields) {
        return new FriendsGetQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns a list of IDs of the current user's friends who installed the application.
     *
     * @param actor vk actor
     * @return query
     */
    public FriendsGetAppUsersQuery getAppUsers(UserActor actor) {
        return new FriendsGetAppUsersQuery(getClient(), actor);
    }

    /**
     * Returns a list of the current user's friends whose phone numbers, validated or specified in a profile, are in a given list.
     *
     * @param actor vk actor
     * @return query
     */
    public FriendsGetByPhonesQuery getByPhones(UserActor actor) {
        return new FriendsGetByPhonesQuery(getClient(), actor);
    }

    /**
     * Returns a list of the user's friend lists.
     *
     * @param actor vk actor
     * @return query
     */
    public FriendsGetListsQuery getLists(UserActor actor) {
        return new FriendsGetListsQuery(getClient(), actor);
    }

    /**
     * Returns a list of user IDs of the mutual friends of two users.
     *
     * @param actor vk actor
     * @param targetUids IDs of the users whose friends will be checked against the friends of the user specified in 'source_uid'.
     * @return query
     */
    public FriendsGetMutualQueryWithTargetUids getMutualWithTargetUids(UserActor actor,
            Integer... targetUids) {
        return new FriendsGetMutualQueryWithTargetUids(getClient(), actor, targetUids);
    }

    /**
     * Returns a list of user IDs of the mutual friends of two users.
     *
     * @param actor vk actor
     * @return query
     */
    public FriendsGetMutualQuery getMutual(UserActor actor) {
        return new FriendsGetMutualQuery(getClient(), actor);
    }

    /**
     * Returns a list of user IDs of a user's friends who are online.
     *
     * @param actor vk actor
     * @return query
     */
    public FriendsGetOnlineQuery getOnline(UserActor actor) {
        return new FriendsGetOnlineQuery(getClient(), actor);
    }

    /**
     * Returns a list of user IDs of a user's friends who are online.
     *
     * @param actor vk actor
     * @param onlineMobile '1' — to return an additional 'online_mobile' field, '0' — (default),
     * @return query
     */
    public FriendsGetOnlineQueryWithOnlineMobile getOnlineWithOnlineMobile(UserActor actor,
            Boolean onlineMobile) {
        return new FriendsGetOnlineQueryWithOnlineMobile(getClient(), actor, onlineMobile);
    }

    /**
     * Returns a list of user IDs of the current user's recently added friends.
     *
     * @param actor vk actor
     * @return query
     */
    public FriendsGetRecentQuery getRecent(UserActor actor) {
        return new FriendsGetRecentQuery(getClient(), actor);
    }

    /**
     * Returns information about the current user's incoming and outgoing friend requests.
     *
     * @param actor vk actor
     * @return query
     */
    public FriendsGetRequestsQueryWithExtended getRequestsExtended(UserActor actor) {
        return new FriendsGetRequestsQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns information about the current user's incoming and outgoing friend requests.
     *
     * @param actor vk actor
     * @return query
     */
    public FriendsGetRequestsQuery getRequests(UserActor actor) {
        return new FriendsGetRequestsQuery(getClient(), actor);
    }

    /**
     * Returns information about the current user's incoming and outgoing friend requests.
     *
     * @param actor vk actor
     * @param needMutual '1' — to return a list of mutual friends (up to 20), if any
     * @return query
     */
    public FriendsGetRequestsQueryWithNeedMutual getRequestsWithNeedMutual(UserActor actor,
            Boolean needMutual) {
        return new FriendsGetRequestsQueryWithNeedMutual(getClient(), actor, needMutual);
    }

    /**
     * Returns a list of profiles of users whom the current user may know.
     *
     * @param actor vk actor
     * @return query
     */
    public FriendsGetSuggestionsQuery getSuggestions(UserActor actor) {
        return new FriendsGetSuggestionsQuery(getClient(), actor);
    }

    /**
     * Returns a list of friends matching the search criteria.
     *
     * @param actor vk actor
     * @param userId User ID.
     * @return query
     */
    public FriendsSearchQuery search(UserActor actor, int userId) {
        return new FriendsSearchQuery(getClient(), actor, userId);
    }
}

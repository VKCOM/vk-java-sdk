package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.newsfeed.NewsfeedAddBanQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedDeleteBanQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedDeleteListQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetBannedQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetBannedQueryWithExtended;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetCommentsQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetListsQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetListsQueryWithExtended;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetMentionsQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetRecommendedQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetSuggestedSourcesQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedIgnoreItemQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedItemType;
import com.vk.api.sdk.queries.newsfeed.NewsfeedSaveListQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedSearchQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedSearchQueryWithExtended;
import com.vk.api.sdk.queries.newsfeed.NewsfeedUnignoreItemQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedUnsubscribeQuery;

/**
 * List of Newsfeed methods
 */
public class Newsfeed extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Newsfeed(VkApiClient client) {
        super(client);
    }

    /**
     * Returns data required to show newsfeed for the current user.
     */
    public NewsfeedGetQuery get(UserActor actor) {
        return new NewsfeedGetQuery(getClient(), actor);
    }

    /**
     * Returns a list of newsfeeds recommended to the current user.
     */
    public NewsfeedGetRecommendedQuery getRecommended(UserActor actor) {
        return new NewsfeedGetRecommendedQuery(getClient(), actor);
    }

    /**
     * Returns a list of comments in the current user's newsfeed.
     */
    public NewsfeedGetCommentsQuery getComments(UserActor actor) {
        return new NewsfeedGetCommentsQuery(getClient(), actor);
    }

    /**
     * Returns a list of posts on user walls in which the current user is mentioned.
     */
    public NewsfeedGetMentionsQuery getMentions(UserActor actor) {
        return new NewsfeedGetMentionsQuery(getClient(), actor);
    }

    /**
     * Returns a list of users and communities banned from the current user's newsfeed.
     */
    public NewsfeedGetBannedQuery getBanned(UserActor actor) {
        return new NewsfeedGetBannedQuery(getClient(), actor);
    }

    /**
     * Returns a list of users and communities banned from the current user's newsfeed.
     */
    public NewsfeedGetBannedQueryWithExtended getBannedExtended(UserActor actor) {
        return new NewsfeedGetBannedQueryWithExtended(getClient(), actor);
    }

    /**
     * Prevents news from specified users and communities from appearing in the current user's newsfeed.
     */
    public NewsfeedAddBanQuery addBan(UserActor actor) {
        return new NewsfeedAddBanQuery(getClient(), actor);
    }

    /**
     * Allows news from previously banned users and communities to be shown in the current user's newsfeed.
     */
    public NewsfeedDeleteBanQuery deleteBan(UserActor actor) {
        return new NewsfeedDeleteBanQuery(getClient(), actor);
    }

    /**
     * Hides an item from the newsfeed.
     */
    public NewsfeedIgnoreItemQuery ignoreItem(UserActor actor, NewsfeedItemType type, int ownerId, int itemId) {
        return new NewsfeedIgnoreItemQuery(getClient(), actor, type, ownerId, itemId);
    }

    /**
     * Returns a hidden item to the newsfeed.
     */
    public NewsfeedUnignoreItemQuery unignoreItem(UserActor actor, NewsfeedItemType type, int ownerId, int itemId) {
        return new NewsfeedUnignoreItemQuery(getClient(), actor, type, ownerId, itemId);
    }

    /**
     * Returns search results by statuses.
     */
    public NewsfeedSearchQuery search(ServiceActor actor) {
        return new NewsfeedSearchQuery(getClient(), actor);
    }

    /**
     * Returns search results by statuses.
     */
    public NewsfeedSearchQuery search(UserActor actor) {
        return new NewsfeedSearchQuery(getClient(), actor);
    }

    /**
     * Returns search results by statuses.
     */
    public NewsfeedSearchQueryWithExtended searchExtended(ServiceActor actor) {
        return new NewsfeedSearchQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns search results by statuses.
     */
    public NewsfeedSearchQueryWithExtended searchExtended(UserActor actor) {
        return new NewsfeedSearchQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of newsfeeds followed by the current user.
     */
    public NewsfeedGetListsQuery getLists(UserActor actor) {
        return new NewsfeedGetListsQuery(getClient(), actor);
    }

    /**
     * Returns a list of newsfeeds followed by the current user.
     */
    public NewsfeedGetListsQueryWithExtended getListsExtended(UserActor actor) {
        return new NewsfeedGetListsQueryWithExtended(getClient(), actor);
    }

    /**
     * Creates and edits user newsfeed lists
     */
    public NewsfeedSaveListQuery saveList(UserActor actor, String title) {
        return new NewsfeedSaveListQuery(getClient(), actor, title);
    }

    /**
     * Delete newsfeed list by id
     *
     * @param actor  actor vk actor
     * @param listId list id
     * @return
     */
    public NewsfeedDeleteListQuery deleteList(UserActor actor, int listId) {
        return new NewsfeedDeleteListQuery(getClient(), actor, listId);
    }

    /**
     * Unsubscribes the current user from specified newsfeeds.
     */
    public NewsfeedUnsubscribeQuery unsubscribe(UserActor actor, NewsfeedItemType type, int itemId) {
        return new NewsfeedUnsubscribeQuery(getClient(), actor, type, itemId);
    }

    /**
     * Returns communities and users that current user is suggested to follow.
     */
    public NewsfeedGetSuggestedSourcesQuery getSuggestedSources(UserActor actor) {
        return new NewsfeedGetSuggestedSourcesQuery(getClient(), actor);
    }
}

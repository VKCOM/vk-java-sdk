package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.queries.newsfeed.NewsfeedAddBanQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedDeleteBanQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedDeleteListQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetBannedQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetBannedQueryWithExtended;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetCommentsQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetListsQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetMentionsQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetRecommendedQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedGetSuggestedSourcesQuery;
import com.vk.api.sdk.queries.newsfeed.NewsfeedIgnoreItemQuery;
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
    public NewsfeedGetQuery get(Actor actor) {
        return new NewsfeedGetQuery(getClient(), actor);
    }

    /**
     * Returns a list of newsfeeds recommended to the current user.
     */
    public NewsfeedGetRecommendedQuery getRecommended(Actor actor) {
        return new NewsfeedGetRecommendedQuery(getClient(), actor);
    }

    /**
     * Returns a list of comments in the current user's newsfeed.
     */
    public NewsfeedGetCommentsQuery getComments(Actor actor) {
        return new NewsfeedGetCommentsQuery(getClient(), actor);
    }

    /**
     * Returns a list of posts on user walls in which the current user is mentioned.
     */
    public NewsfeedGetMentionsQuery getMentions(Actor actor) {
        return new NewsfeedGetMentionsQuery(getClient(), actor);
    }

    /**
     * Returns a list of users and communities banned from the current user's newsfeed.
     */
    public NewsfeedGetBannedQuery getBanned(Actor actor) {
        return new NewsfeedGetBannedQuery(getClient(), actor);
    }

    /**
     * Returns a list of users and communities banned from the current user's newsfeed.
     */
    public NewsfeedGetBannedQueryWithExtended getBannedExtended(Actor actor) {
        return new NewsfeedGetBannedQueryWithExtended(getClient(), actor);
    }

    /**
     * Prevents news from specified users and communities from appearing in the current user's newsfeed.
     */
    public NewsfeedAddBanQuery addBan(Actor actor) {
        return new NewsfeedAddBanQuery(getClient(), actor);
    }

    /**
     * Allows news from previously banned users and communities to be shown in the current user's newsfeed.
     */
    public NewsfeedDeleteBanQuery deleteBan(Actor actor) {
        return new NewsfeedDeleteBanQuery(getClient(), actor);
    }

    /**
     * Hides an item from the newsfeed.
     */
    public NewsfeedIgnoreItemQuery ignoreItem(Actor actor, String type, int ownerId, int itemId) {
        return new NewsfeedIgnoreItemQuery(getClient(), actor, type, ownerId, itemId);
    }

    /**
     * Returns a hidden item to the newsfeed.
     */
    public NewsfeedUnignoreItemQuery unignoreItem(Actor actor, String type, int ownerId, int itemId) {
        return new NewsfeedUnignoreItemQuery(getClient(), actor, type, ownerId, itemId);
    }

    /**
     * Returns search results by statuses.
     */
    public NewsfeedSearchQuery search() {
        return new NewsfeedSearchQuery(getClient());
    }

    /**
     * Returns search results by statuses.
     */
    public NewsfeedSearchQuery search(Actor actor) {
        return new NewsfeedSearchQuery(getClient(), actor);
    }

    /**
     * Returns search results by statuses.
     */
    public NewsfeedSearchQueryWithExtended searchExtended() {
        return new NewsfeedSearchQueryWithExtended(getClient());
    }

    /**
     * Returns search results by statuses.
     */
    public NewsfeedSearchQueryWithExtended searchExtended(Actor actor) {
        return new NewsfeedSearchQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of newsfeeds followed by the current user.
     */
    public NewsfeedGetListsQuery getLists(Actor actor) {
        return new NewsfeedGetListsQuery(getClient(), actor);
    }

    /**
     * Creates and edits user newsfeed lists
     */
    public NewsfeedSaveListQuery saveList(Actor actor, String title) {
        return new NewsfeedSaveListQuery(getClient(), actor, title);
    }

    public NewsfeedDeleteListQuery deleteList(Actor actor, int listId) {
        return new NewsfeedDeleteListQuery(getClient(), actor, listId);
    }

    /**
     * Unsubscribes the current user from specified newsfeeds.
     */
    public NewsfeedUnsubscribeQuery unsubscribe(Actor actor, String type, int itemId) {
        return new NewsfeedUnsubscribeQuery(getClient(), actor, type, itemId);
    }

    /**
     * Returns communities and users that current user is suggested to follow.
     */
    public NewsfeedGetSuggestedSourcesQuery getSuggestedSources(Actor actor) {
        return new NewsfeedGetSuggestedSourcesQuery(getClient(), actor);
    }
}

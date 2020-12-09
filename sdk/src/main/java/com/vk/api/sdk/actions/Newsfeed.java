package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.enums.NewsfeedType;
import com.vk.api.sdk.objects.newsfeed.IgnoreItemType;
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
     * Prevents news from specified users and communities from appearing in the current user's newsfeed.
     *
     * @param actor vk actor
     * @return query
     */
    public NewsfeedAddBanQuery addBan(UserActor actor) {
        return new NewsfeedAddBanQuery(getClient(), actor);
    }

    /**
     * Allows news from previously banned users and communities to be shown in the current user's newsfeed.
     *
     * @param actor vk actor
     * @return query
     */
    public NewsfeedDeleteBanQuery deleteBan(UserActor actor) {
        return new NewsfeedDeleteBanQuery(getClient(), actor);
    }

    /**
     * @param actor vk actor
     * @param listId
     * @return query
     */
    public NewsfeedDeleteListQuery deleteList(UserActor actor, int listId) {
        return new NewsfeedDeleteListQuery(getClient(), actor, listId);
    }

    /**
     * Returns data required to show newsfeed for the current user.
     *
     * @param actor vk actor
     * @return query
     */
    public NewsfeedGetQuery get(UserActor actor) {
        return new NewsfeedGetQuery(getClient(), actor);
    }

    /**
     * Returns a list of users and communities banned from the current user's newsfeed.
     *
     * @param actor vk actor
     * @return query
     */
    public NewsfeedGetBannedQuery getBanned(UserActor actor) {
        return new NewsfeedGetBannedQuery(getClient(), actor);
    }

    /**
     * Returns a list of users and communities banned from the current user's newsfeed.
     *
     * @param actor vk actor
     * @return query
     */
    public NewsfeedGetBannedQueryWithExtended getBannedExtended(UserActor actor) {
        return new NewsfeedGetBannedQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of comments in the current user's newsfeed.
     *
     * @param actor vk actor
     * @return query
     */
    public NewsfeedGetCommentsQuery getComments(UserActor actor) {
        return new NewsfeedGetCommentsQuery(getClient(), actor);
    }

    /**
     * Returns a list of newsfeeds followed by the current user.
     *
     * @param actor vk actor
     * @return query
     */
    public NewsfeedGetListsQueryWithExtended getListsExtended(UserActor actor) {
        return new NewsfeedGetListsQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of newsfeeds followed by the current user.
     *
     * @param actor vk actor
     * @return query
     */
    public NewsfeedGetListsQuery getLists(UserActor actor) {
        return new NewsfeedGetListsQuery(getClient(), actor);
    }

    /**
     * Returns a list of posts on user walls in which the current user is mentioned.
     *
     * @param actor vk actor
     * @return query
     */
    public NewsfeedGetMentionsQuery getMentions(UserActor actor) {
        return new NewsfeedGetMentionsQuery(getClient(), actor);
    }

    /**
     * , Returns a list of newsfeeds recommended to the current user.
     *
     * @param actor vk actor
     * @return query
     */
    public NewsfeedGetRecommendedQuery getRecommended(UserActor actor) {
        return new NewsfeedGetRecommendedQuery(getClient(), actor);
    }

    /**
     * Returns communities and users that current user is suggested to follow.
     *
     * @param actor vk actor
     * @return query
     */
    public NewsfeedGetSuggestedSourcesQuery getSuggestedSources(UserActor actor) {
        return new NewsfeedGetSuggestedSourcesQuery(getClient(), actor);
    }

    /**
     * Hides an item from the newsfeed.
     *
     * @param actor vk actor
     * @param type Item type. Possible values: *'wall' – post on the wall,, *'tag' – tag on a photo,, *'profilephoto' – profile photo,, *'video' – video,, *'audio' – audio.
     * @return query
     */
    public NewsfeedIgnoreItemQuery ignoreItem(UserActor actor, IgnoreItemType type) {
        return new NewsfeedIgnoreItemQuery(getClient(), actor, type);
    }

    /**
     * Creates and edits user newsfeed lists
     *
     * @param actor vk actor
     * @param title list name.
     * @return query
     */
    public NewsfeedSaveListQuery saveList(UserActor actor, String title) {
        return new NewsfeedSaveListQuery(getClient(), actor, title);
    }

    /**
     * Returns search results by statuses.
     *
     * @param actor vk actor
     * @return query
     */
    public NewsfeedSearchQuery search(UserActor actor) {
        return new NewsfeedSearchQuery(getClient(), actor);
    }

    /**
     * Returns search results by statuses.
     *
     * @param actor vk actor
     * @return query
     */
    public NewsfeedSearchQuery search(ServiceActor actor) {
        return new NewsfeedSearchQuery(getClient(), actor);
    }

    /**
     * Returns search results by statuses.
     *
     * @param actor vk actor
     * @return query
     */
    public NewsfeedSearchQueryWithExtended searchExtended(UserActor actor) {
        return new NewsfeedSearchQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns search results by statuses.
     *
     * @param actor vk actor
     * @return query
     */
    public NewsfeedSearchQueryWithExtended searchExtended(ServiceActor actor) {
        return new NewsfeedSearchQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a hidden item to the newsfeed.
     *
     * @param actor vk actor
     * @param type Item type. Possible values: *'wall' – post on the wall,, *'tag' – tag on a photo,, *'profilephoto' – profile photo,, *'video' – video,, *'audio' – audio.
     * @param ownerId Item owner's identifier (user or community), "Note that community id must be negative. 'owner_id=1' – user , 'owner_id=-1' – community "
     * @param itemId Item identifier
     * @return query
     */
    public NewsfeedUnignoreItemQuery unignoreItem(UserActor actor, IgnoreItemType type, int ownerId,
            int itemId) {
        return new NewsfeedUnignoreItemQuery(getClient(), actor, type, ownerId, itemId);
    }

    /**
     * Unsubscribes the current user from specified newsfeeds.
     *
     * @param actor vk actor
     * @param type Type of object from which to unsubscribe: 'note' — note, 'photo' — photo, 'post' — post on user wall or community wall, 'topic' — topic, 'video' — video
     * @param itemId Object ID.
     * @return query
     */
    public NewsfeedUnsubscribeQuery unsubscribe(UserActor actor, NewsfeedType type, int itemId) {
        return new NewsfeedUnsubscribeQuery(getClient(), actor, type, itemId);
    }
}

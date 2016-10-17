package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.fave.FaveAddGroupQuery;
import com.vk.api.sdk.queries.fave.FaveAddLinkQuery;
import com.vk.api.sdk.queries.fave.FaveAddUserQuery;
import com.vk.api.sdk.queries.fave.FaveGetLinksQuery;
import com.vk.api.sdk.queries.fave.FaveGetMarketItemsQuery;
import com.vk.api.sdk.queries.fave.FaveGetPhotosQuery;
import com.vk.api.sdk.queries.fave.FaveGetPostsQuery;
import com.vk.api.sdk.queries.fave.FaveGetUsersQuery;
import com.vk.api.sdk.queries.fave.FaveGetVideosQuery;
import com.vk.api.sdk.queries.fave.FaveRemoveGroupQuery;
import com.vk.api.sdk.queries.fave.FaveRemoveLinkQuery;
import com.vk.api.sdk.queries.fave.FaveRemoveUserQuery;

/**
 * List of Fave methods
 */
public class Fave extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Fave(VkApiClient client) {
        super(client);
    }

    /**
     * Returns a list of users whom the current user has bookmarked.
     */
    public FaveGetUsersQuery getUsers(UserActor actor) {
        return new FaveGetUsersQuery(getClient(), actor);
    }

    /**
     * Returns a list of photos that the current user has liked.
     */
    public FaveGetPhotosQuery getPhotos(UserActor actor) {
        return new FaveGetPhotosQuery(getClient(), actor);
    }

    /**
     * Returns a list of wall posts that the current user has liked.
     */
    public FaveGetPostsQuery getPosts(UserActor actor) {
        return new FaveGetPostsQuery(getClient(), actor);
    }

    /**
     * Returns a list of videos that the current user has liked.
     */
    public FaveGetVideosQuery getVideos(UserActor actor) {
        return new FaveGetVideosQuery(getClient(), actor);
    }

    /**
     * Returns a list of links that the current user has bookmarked.
     */
    public FaveGetLinksQuery getLinks(UserActor actor) {
        return new FaveGetLinksQuery(getClient(), actor);
    }

    /**
     * Returns market items bookmarked by current user.
     */
    public FaveGetMarketItemsQuery getMarketItems(UserActor actor) {
        return new FaveGetMarketItemsQuery(getClient(), actor);
    }

    /**
     * Adds a profile to user faves.
     */
    public FaveAddUserQuery addUser(UserActor actor, int userId) {
        return new FaveAddUserQuery(getClient(), actor, userId);
    }

    /**
     * Removes a profile from user faves.
     */
    public FaveRemoveUserQuery removeUser(UserActor actor, int userId) {
        return new FaveRemoveUserQuery(getClient(), actor, userId);
    }

    /**
     * Adds a community to user faves.
     */
    public FaveAddGroupQuery addGroup(UserActor actor, int groupId) {
        return new FaveAddGroupQuery(getClient(), actor, groupId);
    }

    /**
     * Removes a community from user faves.
     */
    public FaveRemoveGroupQuery removeGroup(UserActor actor, int groupId) {
        return new FaveRemoveGroupQuery(getClient(), actor, groupId);
    }

    /**
     * Adds a link to user faves.
     */
    public FaveAddLinkQuery addLink(UserActor actor, String link) {
        return new FaveAddLinkQuery(getClient(), actor, link);
    }

    public FaveRemoveLinkQuery removeLink(UserActor actor, String linkId) {
        return new FaveRemoveLinkQuery(getClient(), actor, linkId);
    }
}

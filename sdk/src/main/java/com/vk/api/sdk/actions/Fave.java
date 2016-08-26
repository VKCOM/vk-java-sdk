package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
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
    public Fave(VkApiClient client) {
        super(client);
    }

    /**
     * Returns a list of users whom the current user has bookmarked.
     */
    public FaveGetUsersQuery getUsers(Actor actor) {
        return new FaveGetUsersQuery(getClient(), actor);
    }

    /**
     * Returns a list of photos that the current user has liked.
     */
    public FaveGetPhotosQuery getPhotos(Actor actor) {
        return new FaveGetPhotosQuery(getClient(), actor);
    }

    /**
     * Returns a list of wall posts that the current user has liked.
     */
    public FaveGetPostsQuery getPosts(Actor actor) {
        return new FaveGetPostsQuery(getClient(), actor);
    }

    /**
     * Returns a list of videos that the current user has liked.
     */
    public FaveGetVideosQuery getVideos(Actor actor) {
        return new FaveGetVideosQuery(getClient(), actor);
    }

    /**
     * Returns a list of links that the current user has bookmarked.
     */
    public FaveGetLinksQuery getLinks(Actor actor) {
        return new FaveGetLinksQuery(getClient(), actor);
    }

    /**
     * Returns market items bookmarked by current user.
     */
    public FaveGetMarketItemsQuery getMarketItems(Actor actor) {
        return new FaveGetMarketItemsQuery(getClient(), actor);
    }

    /**
     * Adds a profile to user faves.
     */
    public FaveAddUserQuery addUser(Actor actor, int userId) {
        return new FaveAddUserQuery(getClient(), actor, userId);
    }

    /**
     * Removes a profile from user faves.
     */
    public FaveRemoveUserQuery removeUser(Actor actor, int userId) {
        return new FaveRemoveUserQuery(getClient(), actor, userId);
    }

    /**
     * Adds a community to user faves.
     */
    public FaveAddGroupQuery addGroup(Actor actor, int groupId) {
        return new FaveAddGroupQuery(getClient(), actor, groupId);
    }

    /**
     * Removes a community from user faves.
     */
    public FaveRemoveGroupQuery removeGroup(Actor actor, int groupId) {
        return new FaveRemoveGroupQuery(getClient(), actor, groupId);
    }

    /**
     * Adds a link to user faves.
     */
    public FaveAddLinkQuery addLink(Actor actor, String link) {
        return new FaveAddLinkQuery(getClient(), actor, link);
    }

    public FaveRemoveLinkQuery removeLink(Actor actor, String linkId) {
        return new FaveRemoveLinkQuery(getClient(), actor, linkId);
    }
}

package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.likes.LikesAddQuery;
import com.vk.api.sdk.queries.likes.LikesDeleteQuery;
import com.vk.api.sdk.queries.likes.LikesGetListQuery;
import com.vk.api.sdk.queries.likes.LikesGetListQueryWithExtended;
import com.vk.api.sdk.queries.likes.LikesIsLikedQuery;
import com.vk.api.sdk.queries.likes.LikesType;

/**
 * List of Likes methods
 */
public class Likes extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Likes(VkApiClient client) {
        super(client);
    }

    /**
     * Returns a list of IDs of users who added the specified object to their "Likes" list.
     */
    public LikesGetListQuery getList(ServiceActor actor, LikesType type) {
        return new LikesGetListQuery(getClient(), actor, type);
    }

    /**
     * Returns a list of IDs of users who added the specified object to their "Likes" list.
     */
    public LikesGetListQuery getList(UserActor actor, LikesType type) {
        return new LikesGetListQuery(getClient(), actor, type);
    }

    /**
     * Returns a list of IDs of users who added the specified object to their "Likes" list.
     */
    public LikesGetListQueryWithExtended getListExtended(ServiceActor actor, LikesType type) {
        return new LikesGetListQueryWithExtended(getClient(), actor, type);
    }

    /**
     * Returns a list of IDs of users who added the specified object to their "Likes" list.
     */
    public LikesGetListQueryWithExtended getListExtended(UserActor actor, LikesType type) {
        return new LikesGetListQueryWithExtended(getClient(), actor, type);
    }

    /**
     * Adds the specified object to the "Likes" list of the current user.
     */
    public LikesAddQuery add(UserActor actor, LikesType type, int itemId) {
        return new LikesAddQuery(getClient(), actor, type, itemId);
    }

    /**
     * Deletes the specified object from the "Likes" list of the current user.
     */
    public LikesDeleteQuery delete(UserActor actor, LikesType type, int itemId) {
        return new LikesDeleteQuery(getClient(), actor, type, itemId);
    }

    /**
     * Checks for the object in the "Likes" list of the specified user.
     */
    public LikesIsLikedQuery isLiked(UserActor actor, LikesType type, int itemId) {
        return new LikesIsLikedQuery(getClient(), actor, type, itemId);
    }
}

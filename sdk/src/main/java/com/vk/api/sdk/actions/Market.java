package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.ReportReason;
import com.vk.api.sdk.queries.market.MarketAddAlbumQuery;
import com.vk.api.sdk.queries.market.MarketAddQuery;
import com.vk.api.sdk.queries.market.MarketAddToAlbumQuery;
import com.vk.api.sdk.queries.market.MarketCreateCommentQuery;
import com.vk.api.sdk.queries.market.MarketDeleteAlbumQuery;
import com.vk.api.sdk.queries.market.MarketDeleteCommentQuery;
import com.vk.api.sdk.queries.market.MarketDeleteQuery;
import com.vk.api.sdk.queries.market.MarketEditAlbumQuery;
import com.vk.api.sdk.queries.market.MarketEditCommentQuery;
import com.vk.api.sdk.queries.market.MarketEditQuery;
import com.vk.api.sdk.queries.market.MarketGetAlbumByIdQuery;
import com.vk.api.sdk.queries.market.MarketGetAlbumsQuery;
import com.vk.api.sdk.queries.market.MarketGetByIdQuery;
import com.vk.api.sdk.queries.market.MarketGetByIdQueryWithExtended;
import com.vk.api.sdk.queries.market.MarketGetCategoriesQuery;
import com.vk.api.sdk.queries.market.MarketGetCommentsQuery;
import com.vk.api.sdk.queries.market.MarketGetQuery;
import com.vk.api.sdk.queries.market.MarketGetQueryWithExtended;
import com.vk.api.sdk.queries.market.MarketRemoveFromAlbumQuery;
import com.vk.api.sdk.queries.market.MarketReorderAlbumsQuery;
import com.vk.api.sdk.queries.market.MarketReorderItemsQuery;
import com.vk.api.sdk.queries.market.MarketReportCommentQuery;
import com.vk.api.sdk.queries.market.MarketReportQuery;
import com.vk.api.sdk.queries.market.MarketRestoreCommentQuery;
import com.vk.api.sdk.queries.market.MarketRestoreQuery;
import com.vk.api.sdk.queries.market.MarketSearchQuery;
import com.vk.api.sdk.queries.market.MarketSearchQueryWithExtended;

import java.util.List;

/**
 * List of Market methods
 */
public class Market extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Market(VkApiClient client) {
        super(client);
    }

    /**
     * Returns items list for a community
     */
    public MarketGetQuery get(UserActor actor, int ownerId) {
        return new MarketGetQuery(getClient(), actor, ownerId);
    }

    /**
     * Returns items list for a community
     */
    public MarketGetQueryWithExtended getExtended(UserActor actor, int ownerId) {
        return new MarketGetQueryWithExtended(getClient(), actor, ownerId);
    }

    /**
     * Returns information about market items by their ids.
     */
    public MarketGetByIdQuery getById(UserActor actor, String... itemIds) {
        return new MarketGetByIdQuery(getClient(), actor, itemIds);
    }

    /**
     * Returns information about market items by their ids.
     */
    public MarketGetByIdQuery getById(UserActor actor, List<String> itemIds) {
        return new MarketGetByIdQuery(getClient(), actor, itemIds);
    }

    /**
     * Returns information about market items by their ids.
     */
    public MarketGetByIdQueryWithExtended getByIdExtended(UserActor actor, String... itemIds) {
        return new MarketGetByIdQueryWithExtended(getClient(), actor, itemIds);
    }

    /**
     * Returns information about market items by their ids.
     */
    public MarketGetByIdQueryWithExtended getByIdExtended(UserActor actor, List<String> itemIds) {
        return new MarketGetByIdQueryWithExtended(getClient(), actor, itemIds);
    }

    /**
     * Searches market items in a community's catalog
     */
    public MarketSearchQuery search(UserActor actor, int ownerId) {
        return new MarketSearchQuery(getClient(), actor, ownerId);
    }

    /**
     * Searches market items in a community's catalog
     */
    public MarketSearchQueryWithExtended searchExtended(UserActor actor, int ownerId) {
        return new MarketSearchQueryWithExtended(getClient(), actor, ownerId);
    }

    /**
     * Returns community's albums list.
     */
    public MarketGetAlbumsQuery getAlbums(UserActor actor, int ownerId) {
        return new MarketGetAlbumsQuery(getClient(), actor, ownerId);
    }

    /**
     * Returns items album's data
     */
    public MarketGetAlbumByIdQuery getAlbumById(UserActor actor, int ownerId, int... albumIds) {
        return new MarketGetAlbumByIdQuery(getClient(), actor, ownerId, albumIds);
    }

    /**
     * Returns items album's data
     */
    public MarketGetAlbumByIdQuery getAlbumById(UserActor actor, int ownerId, List<Integer> albumIds) {
        return new MarketGetAlbumByIdQuery(getClient(), actor, ownerId, albumIds);
    }

    /**
     * Creates a new comment for an item
     */
    public MarketCreateCommentQuery createComment(UserActor actor, int ownerId, int itemId) {
        return new MarketCreateCommentQuery(getClient(), actor, ownerId, itemId);
    }

    /**
     * Returns comments list for an item
     */
    public MarketGetCommentsQuery getComments(UserActor actor, int ownerId, int itemId) {
        return new MarketGetCommentsQuery(getClient(), actor, ownerId, itemId);
    }

    /**
     * Deletes an item's comment
     */
    public MarketDeleteCommentQuery deleteComment(UserActor actor, int ownerId, int commentId) {
        return new MarketDeleteCommentQuery(getClient(), actor, ownerId, commentId);
    }

    /**
     * Restores a recently deleted comment
     */
    public MarketRestoreCommentQuery restoreComment(UserActor actor, int ownerId, int commentId) {
        return new MarketRestoreCommentQuery(getClient(), actor, ownerId, commentId);
    }

    /**
     * Chages item comment's text
     */
    public MarketEditCommentQuery editComment(UserActor actor, int ownerId, int commentId) {
        return new MarketEditCommentQuery(getClient(), actor, ownerId, commentId);
    }

    /**
     * Sends a complaint to the item's comment
     */
    public MarketReportCommentQuery reportComment(UserActor actor, int ownerId, int commentId, ReportReason reason) {
        return new MarketReportCommentQuery(getClient(), actor, ownerId, commentId, reason);
    }

    public MarketGetCategoriesQuery getCategories(UserActor actor) {
        return new MarketGetCategoriesQuery(getClient(), actor);
    }

    /**
     * Sends a complaint to the item
     */
    public MarketReportQuery report(UserActor actor, int ownerId, int itemId, ReportReason reason) {
        return new MarketReportQuery(getClient(), actor, ownerId, itemId, reason);
    }

    /**
     * Ads a new item to the market
     */
    public MarketAddQuery add(UserActor actor, int ownerId, String name, String description, int categoryId,
                              double price, int mainPhotoId) {
        return new MarketAddQuery(getClient(), actor, ownerId, name, description, categoryId, price, mainPhotoId);
    }

    /**
     * Edits an item
     */
    public MarketEditQuery edit(UserActor actor, int ownerId, int itemId, String name, String description,
                                int categoryId, double price, int mainPhotoId) {
        return new MarketEditQuery(getClient(), actor, ownerId, itemId, name, description, categoryId, price, mainPhotoId);
    }

    /**
     * Deletes an item
     */
    public MarketDeleteQuery delete(UserActor actor, int ownerId, int itemId) {
        return new MarketDeleteQuery(getClient(), actor, ownerId, itemId);
    }

    /**
     * Restores recently deleted item
     */
    public MarketRestoreQuery restore(UserActor actor, int ownerId, int itemId) {
        return new MarketRestoreQuery(getClient(), actor, ownerId, itemId);
    }

    /**
     * Changes item place in a collection
     */
    public MarketReorderItemsQuery reorderItems(UserActor actor, int ownerId, int itemId) {
        return new MarketReorderItemsQuery(getClient(), actor, ownerId, itemId);
    }

    /**
     * Reorders the collections list
     */
    public MarketReorderAlbumsQuery reorderAlbums(UserActor actor, int ownerId, int albumId) {
        return new MarketReorderAlbumsQuery(getClient(), actor, ownerId, albumId);
    }

    /**
     * Creates new collection of items
     */
    public MarketAddAlbumQuery addAlbum(UserActor actor, int ownerId, String title) {
        return new MarketAddAlbumQuery(getClient(), actor, ownerId, title);
    }

    /**
     * Edits a collection of items
     */
    public MarketEditAlbumQuery editAlbum(UserActor actor, int ownerId, int albumId, String title) {
        return new MarketEditAlbumQuery(getClient(), actor, ownerId, albumId, title);
    }

    /**
     * Deletes a collection of items
     */
    public MarketDeleteAlbumQuery deleteAlbum(UserActor actor, int ownerId, int albumId) {
        return new MarketDeleteAlbumQuery(getClient(), actor, ownerId, albumId);
    }

    /**
     * Removes an item from one or multiple collections
     */
    public MarketRemoveFromAlbumQuery removeFromAlbum(UserActor actor, int ownerId, int itemId, int... albumIds) {
        return new MarketRemoveFromAlbumQuery(getClient(), actor, ownerId, itemId, albumIds);
    }

    /**
     * Removes an item from one or multiple collections
     */
    public MarketRemoveFromAlbumQuery removeFromAlbum(UserActor actor, int ownerId, int itemId, List<Integer> albumIds) {
        return new MarketRemoveFromAlbumQuery(getClient(), actor, ownerId, itemId, albumIds);
    }

    /**
     * Adds an item to one or multiple collections
     */
    public MarketAddToAlbumQuery addToAlbum(UserActor actor, int ownerId, int itemId, int... albumIds) {
        return new MarketAddToAlbumQuery(getClient(), actor, ownerId, itemId, albumIds);
    }

    /**
     * Adds an item to one or multiple collections
     */
    public MarketAddToAlbumQuery addToAlbum(UserActor actor, int ownerId, int itemId, List<Integer> albumIds) {
        return new MarketAddToAlbumQuery(getClient(), actor, ownerId, itemId, albumIds);
    }
}

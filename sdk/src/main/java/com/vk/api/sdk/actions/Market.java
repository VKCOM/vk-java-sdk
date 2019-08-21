package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
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
     * Ads a new item to the market.
     *
     * @param actor vk actor
     * @param ownerId ID of an item owner community.
     * @param name Item name.
     * @param description Item description.
     * @param categoryId Item category ID.
     * @param mainPhotoId Cover photo ID.
     * @return query
     */
    public MarketAddQuery add(UserActor actor, int ownerId, String name, String description,
            int categoryId, int mainPhotoId) {
        return new MarketAddQuery(getClient(), actor, ownerId, name, description, categoryId, mainPhotoId);
    }

    /**
     * Creates new collection of items
     *
     * @param actor vk actor
     * @param ownerId ID of an item owner community.
     * @param title Collection title.
     * @return query
     */
    public MarketAddAlbumQuery addAlbum(UserActor actor, int ownerId, String title) {
        return new MarketAddAlbumQuery(getClient(), actor, ownerId, title);
    }

    /**
     * Adds an item to one or multiple collections.
     *
     * @param actor vk actor
     * @param ownerId ID of an item owner community.
     * @param itemId Item ID.
     * @param albumIds Collections IDs to add item to.
     * @return query
     */
    public MarketAddToAlbumQuery addToAlbum(UserActor actor, int ownerId, int itemId,
            Integer... albumIds) {
        return new MarketAddToAlbumQuery(getClient(), actor, ownerId, itemId, albumIds);
    }

    /**
     * Adds an item to one or multiple collections.
     *
     * @param actor vk actor
     * @param ownerId ID of an item owner community.
     * @param itemId Item ID.
     * @param albumIds Collections IDs to add item to.
     * @return query
     */
    public MarketAddToAlbumQuery addToAlbum(UserActor actor, int ownerId, int itemId,
            List<Integer> albumIds) {
        return new MarketAddToAlbumQuery(getClient(), actor, ownerId, itemId, albumIds);
    }

    /**
     * Creates a new comment for an item.
     *
     * @param actor vk actor
     * @param ownerId ID of an item owner community.
     * @param itemId Item ID.
     * @return query
     */
    public MarketCreateCommentQuery createComment(UserActor actor, int ownerId, int itemId) {
        return new MarketCreateCommentQuery(getClient(), actor, ownerId, itemId);
    }

    /**
     * Deletes an item.
     *
     * @param actor vk actor
     * @param ownerId ID of an item owner community.
     * @param itemId Item ID.
     * @return query
     */
    public MarketDeleteQuery delete(UserActor actor, int ownerId, int itemId) {
        return new MarketDeleteQuery(getClient(), actor, ownerId, itemId);
    }

    /**
     * Deletes a collection of items.
     *
     * @param actor vk actor
     * @param ownerId ID of an collection owner community.
     * @param albumId Collection ID.
     * @return query
     */
    public MarketDeleteAlbumQuery deleteAlbum(UserActor actor, int ownerId, int albumId) {
        return new MarketDeleteAlbumQuery(getClient(), actor, ownerId, albumId);
    }

    /**
     * Deletes an item's comment
     *
     * @param actor vk actor
     * @param ownerId identifier of an item owner community, "Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community "
     * @param commentId comment id
     * @return query
     */
    public MarketDeleteCommentQuery deleteComment(UserActor actor, int ownerId, int commentId) {
        return new MarketDeleteCommentQuery(getClient(), actor, ownerId, commentId);
    }

    /**
     * Edits an item.
     *
     * @param actor vk actor
     * @param ownerId ID of an item owner community.
     * @param itemId Item ID.
     * @param name Item name.
     * @param description Item description.
     * @param categoryId Item category ID.
     * @param price Item price.
     * @param mainPhotoId Cover photo ID.
     * @return query
     */
    public MarketEditQuery edit(UserActor actor, int ownerId, int itemId, String name,
            String description, int categoryId, double price, int mainPhotoId) {
        return new MarketEditQuery(getClient(), actor, ownerId, itemId, name, description, categoryId, price, mainPhotoId);
    }

    /**
     * Edits a collection of items
     *
     * @param actor vk actor
     * @param ownerId ID of an collection owner community.
     * @param albumId Collection ID.
     * @param title Collection title.
     * @return query
     */
    public MarketEditAlbumQuery editAlbum(UserActor actor, int ownerId, int albumId, String title) {
        return new MarketEditAlbumQuery(getClient(), actor, ownerId, albumId, title);
    }

    /**
     * Chages item comment's text
     *
     * @param actor vk actor
     * @param ownerId ID of an item owner community.
     * @param commentId Comment ID.
     * @return query
     */
    public MarketEditCommentQuery editComment(UserActor actor, int ownerId, int commentId) {
        return new MarketEditCommentQuery(getClient(), actor, ownerId, commentId);
    }

    /**
     * Returns items list for a community.
     *
     * @param actor vk actor
     * @param ownerId ID of an item owner community, "Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community "
     * @return query
     */
    public MarketGetQueryWithExtended getExtended(UserActor actor, int ownerId) {
        return new MarketGetQueryWithExtended(getClient(), actor, ownerId);
    }

    /**
     * Returns items list for a community.
     *
     * @param actor vk actor
     * @param ownerId ID of an item owner community, "Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community "
     * @return query
     */
    public MarketGetQuery get(UserActor actor, int ownerId) {
        return new MarketGetQuery(getClient(), actor, ownerId);
    }

    /**
     * Returns items album's data
     *
     * @param actor vk actor
     * @param ownerId identifier of an album owner community, "Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community "
     * @param albumIds collections identifiers to obtain data from
     * @return query
     */
    public MarketGetAlbumByIdQuery getAlbumById(UserActor actor, int ownerId, Integer... albumIds) {
        return new MarketGetAlbumByIdQuery(getClient(), actor, ownerId, albumIds);
    }

    /**
     * Returns items album's data
     *
     * @param actor vk actor
     * @param ownerId identifier of an album owner community, "Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community "
     * @param albumIds collections identifiers to obtain data from
     * @return query
     */
    public MarketGetAlbumByIdQuery getAlbumById(UserActor actor, int ownerId,
            List<Integer> albumIds) {
        return new MarketGetAlbumByIdQuery(getClient(), actor, ownerId, albumIds);
    }

    /**
     * Returns community's collections list.
     *
     * @param actor vk actor
     * @param ownerId ID of an items owner community.
     * @return query
     */
    public MarketGetAlbumsQuery getAlbums(UserActor actor, int ownerId) {
        return new MarketGetAlbumsQuery(getClient(), actor, ownerId);
    }

    /**
     * Returns information about market items by their ids.
     *
     * @param actor vk actor
     * @param itemIds Comma-separated ids list: {user id}_{item id}. If an item belongs to a community -{community id} is used. " 'Videos' value example: , '-4363_136089719,13245770_137352259'"
     * @return query
     */
    public MarketGetByIdQueryWithExtended getByIdExtended(UserActor actor, String... itemIds) {
        return new MarketGetByIdQueryWithExtended(getClient(), actor, itemIds);
    }

    /**
     * Returns information about market items by their ids.
     *
     * @param actor vk actor
     * @param itemIds Comma-separated ids list: {user id}_{item id}. If an item belongs to a community -{community id} is used. " 'Videos' value example: , '-4363_136089719,13245770_137352259'"
     * @return query
     */
    public MarketGetByIdQueryWithExtended getByIdExtended(UserActor actor, List<String> itemIds) {
        return new MarketGetByIdQueryWithExtended(getClient(), actor, itemIds);
    }

    /**
     * Returns information about market items by their ids.
     *
     * @param actor vk actor
     * @param itemIds Comma-separated ids list: {user id}_{item id}. If an item belongs to a community -{community id} is used. " 'Videos' value example: , '-4363_136089719,13245770_137352259'"
     * @return query
     */
    public MarketGetByIdQuery getById(UserActor actor, String... itemIds) {
        return new MarketGetByIdQuery(getClient(), actor, itemIds);
    }

    /**
     * Returns information about market items by their ids.
     *
     * @param actor vk actor
     * @param itemIds Comma-separated ids list: {user id}_{item id}. If an item belongs to a community -{community id} is used. " 'Videos' value example: , '-4363_136089719,13245770_137352259'"
     * @return query
     */
    public MarketGetByIdQuery getById(UserActor actor, List<String> itemIds) {
        return new MarketGetByIdQuery(getClient(), actor, itemIds);
    }

    /**
     * Returns a list of market categories.
     *
     * @param actor vk actor
     * @return query
     */
    public MarketGetCategoriesQuery getCategories(UserActor actor) {
        return new MarketGetCategoriesQuery(getClient(), actor);
    }

    /**
     * Returns comments list for an item.
     *
     * @param actor vk actor
     * @param ownerId ID of an item owner community
     * @param itemId Item ID.
     * @return query
     */
    public MarketGetCommentsQuery getComments(UserActor actor, int ownerId, int itemId) {
        return new MarketGetCommentsQuery(getClient(), actor, ownerId, itemId);
    }

    /**
     * Removes an item from one or multiple collections.
     *
     * @param actor vk actor
     * @param ownerId ID of an item owner community.
     * @param itemId Item ID.
     * @param albumIds Collections IDs to remove item from.
     * @return query
     */
    public MarketRemoveFromAlbumQuery removeFromAlbum(UserActor actor, int ownerId, int itemId,
            Integer... albumIds) {
        return new MarketRemoveFromAlbumQuery(getClient(), actor, ownerId, itemId, albumIds);
    }

    /**
     * Removes an item from one or multiple collections.
     *
     * @param actor vk actor
     * @param ownerId ID of an item owner community.
     * @param itemId Item ID.
     * @param albumIds Collections IDs to remove item from.
     * @return query
     */
    public MarketRemoveFromAlbumQuery removeFromAlbum(UserActor actor, int ownerId, int itemId,
            List<Integer> albumIds) {
        return new MarketRemoveFromAlbumQuery(getClient(), actor, ownerId, itemId, albumIds);
    }

    /**
     * Reorders the collections list.
     *
     * @param actor vk actor
     * @param ownerId ID of an item owner community.
     * @param albumId Collection ID.
     * @return query
     */
    public MarketReorderAlbumsQuery reorderAlbums(UserActor actor, int ownerId, int albumId) {
        return new MarketReorderAlbumsQuery(getClient(), actor, ownerId, albumId);
    }

    /**
     * Changes item place in a collection.
     *
     * @param actor vk actor
     * @param ownerId ID of an item owner community.
     * @param itemId Item ID.
     * @return query
     */
    public MarketReorderItemsQuery reorderItems(UserActor actor, int ownerId, int itemId) {
        return new MarketReorderItemsQuery(getClient(), actor, ownerId, itemId);
    }

    /**
     * Sends a complaint to the item.
     *
     * @param actor vk actor
     * @param ownerId ID of an item owner community.
     * @param itemId Item ID.
     * @return query
     */
    public MarketReportQuery report(UserActor actor, int ownerId, int itemId) {
        return new MarketReportQuery(getClient(), actor, ownerId, itemId);
    }

    /**
     * Sends a complaint to the item's comment.
     *
     * @param actor vk actor
     * @param ownerId ID of an item owner community.
     * @param commentId Comment ID.
     * @param reason Complaint reason. Possible values: *'0' — spam,, *'1' — child porn,, *'2' — extremism,, *'3' — violence,, *'4' — drugs propaganda,, *'5' — adult materials,, *'6' — insult.
     * @return query
     */
    public MarketReportCommentQuery reportComment(UserActor actor, int ownerId, int commentId,
            int reason) {
        return new MarketReportCommentQuery(getClient(), actor, ownerId, commentId, reason);
    }

    /**
     * Restores recently deleted item
     *
     * @param actor vk actor
     * @param ownerId ID of an item owner community.
     * @param itemId Deleted item ID.
     * @return query
     */
    public MarketRestoreQuery restore(UserActor actor, int ownerId, int itemId) {
        return new MarketRestoreQuery(getClient(), actor, ownerId, itemId);
    }

    /**
     * Restores a recently deleted comment
     *
     * @param actor vk actor
     * @param ownerId identifier of an item owner community, "Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community "
     * @param commentId deleted comment id
     * @return query
     */
    public MarketRestoreCommentQuery restoreComment(UserActor actor, int ownerId, int commentId) {
        return new MarketRestoreCommentQuery(getClient(), actor, ownerId, commentId);
    }

    /**
     * Searches market items in a community's catalog
     *
     * @param actor vk actor
     * @param ownerId ID of an items owner community.
     * @return query
     */
    public MarketSearchQueryWithExtended searchExtended(UserActor actor, int ownerId) {
        return new MarketSearchQueryWithExtended(getClient(), actor, ownerId);
    }

    /**
     * Searches market items in a community's catalog
     *
     * @param actor vk actor
     * @param ownerId ID of an items owner community.
     * @return query
     */
    public MarketSearchQuery search(UserActor actor, int ownerId) {
        return new MarketSearchQuery(getClient(), actor, ownerId);
    }
}

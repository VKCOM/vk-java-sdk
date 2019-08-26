package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.fave.FaveAddArticleQuery;
import com.vk.api.sdk.queries.fave.FaveAddLinkQuery;
import com.vk.api.sdk.queries.fave.FaveAddPageQuery;
import com.vk.api.sdk.queries.fave.FaveAddPostQuery;
import com.vk.api.sdk.queries.fave.FaveAddProductQuery;
import com.vk.api.sdk.queries.fave.FaveAddTagQuery;
import com.vk.api.sdk.queries.fave.FaveAddVideoQuery;
import com.vk.api.sdk.queries.fave.FaveEditTagQuery;
import com.vk.api.sdk.queries.fave.FaveGetPagesQuery;
import com.vk.api.sdk.queries.fave.FaveGetQuery;
import com.vk.api.sdk.queries.fave.FaveGetQueryWithExtended;
import com.vk.api.sdk.queries.fave.FaveGetTagsQuery;
import com.vk.api.sdk.queries.fave.FaveMarkSeenQuery;
import com.vk.api.sdk.queries.fave.FaveRemoveArticleQuery;
import com.vk.api.sdk.queries.fave.FaveRemoveLinkQuery;
import com.vk.api.sdk.queries.fave.FaveRemovePageQuery;
import com.vk.api.sdk.queries.fave.FaveRemovePostQuery;
import com.vk.api.sdk.queries.fave.FaveRemoveProductQuery;
import com.vk.api.sdk.queries.fave.FaveRemoveTagQuery;
import com.vk.api.sdk.queries.fave.FaveReorderTagsQuery;
import com.vk.api.sdk.queries.fave.FaveSetPageTagsQuery;
import com.vk.api.sdk.queries.fave.FaveSetTagsQuery;
import com.vk.api.sdk.queries.fave.FaveTrackPageInteractionQuery;
import java.util.List;

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
     * @param actor vk actor
     * @param url
     * @return query
     */
    public FaveAddArticleQuery addArticle(UserActor actor, String url) {
        return new FaveAddArticleQuery(getClient(), actor, url);
    }

    /**
     * Adds a link to user faves.
     *
     * @param actor vk actor
     * @param link Link URL.
     * @return query
     */
    public FaveAddLinkQuery addLink(UserActor actor, String link) {
        return new FaveAddLinkQuery(getClient(), actor, link);
    }

    /**
     * @param actor vk actor
     * @return query
     */
    public FaveAddPageQuery addPage(UserActor actor) {
        return new FaveAddPageQuery(getClient(), actor);
    }

    /**
     * @param actor vk actor
     * @param ownerId
     * @param id
     * @return query
     */
    public FaveAddPostQuery addPost(UserActor actor, int ownerId, int id) {
        return new FaveAddPostQuery(getClient(), actor, ownerId, id);
    }

    /**
     * @param actor vk actor
     * @param ownerId
     * @param id
     * @return query
     */
    public FaveAddProductQuery addProduct(UserActor actor, int ownerId, int id) {
        return new FaveAddProductQuery(getClient(), actor, ownerId, id);
    }

    /**
     * @param actor vk actor
     * @return query
     */
    public FaveAddTagQuery addTag(UserActor actor) {
        return new FaveAddTagQuery(getClient(), actor);
    }

    /**
     * @param actor vk actor
     * @param ownerId
     * @param id
     * @return query
     */
    public FaveAddVideoQuery addVideo(UserActor actor, int ownerId, int id) {
        return new FaveAddVideoQuery(getClient(), actor, ownerId, id);
    }

    /**
     * @param actor vk actor
     * @param id
     * @param name
     * @return query
     */
    public FaveEditTagQuery editTag(UserActor actor, int id, String name) {
        return new FaveEditTagQuery(getClient(), actor, id, name);
    }

    /**
     * @param actor vk actor
     * @return query
     */
    public FaveGetQueryWithExtended getExtended(UserActor actor) {
        return new FaveGetQueryWithExtended(getClient(), actor);
    }

    /**
     * @param actor vk actor
     * @return query
     */
    public FaveGetQuery get(UserActor actor) {
        return new FaveGetQuery(getClient(), actor);
    }

    /**
     * @param actor vk actor
     * @return query
     */
    public FaveGetPagesQuery getPages(UserActor actor) {
        return new FaveGetPagesQuery(getClient(), actor);
    }

    /**
     * @param actor vk actor
     * @return query
     */
    public FaveGetTagsQuery getTags(UserActor actor) {
        return new FaveGetTagsQuery(getClient(), actor);
    }

    /**
     * @param actor vk actor
     * @return query
     */
    public FaveMarkSeenQuery markSeen(UserActor actor) {
        return new FaveMarkSeenQuery(getClient(), actor);
    }

    /**
     * @param actor vk actor
     * @param ownerId
     * @param articleId
     * @return query
     */
    public FaveRemoveArticleQuery removeArticle(UserActor actor, int ownerId, int articleId) {
        return new FaveRemoveArticleQuery(getClient(), actor, ownerId, articleId);
    }

    /**
     * Removes link from the user's faves.
     *
     * @param actor vk actor
     * @return query
     */
    public FaveRemoveLinkQuery removeLink(UserActor actor) {
        return new FaveRemoveLinkQuery(getClient(), actor);
    }

    /**
     * @param actor vk actor
     * @return query
     */
    public FaveRemovePageQuery removePage(UserActor actor) {
        return new FaveRemovePageQuery(getClient(), actor);
    }

    /**
     * @param actor vk actor
     * @param ownerId
     * @param id
     * @return query
     */
    public FaveRemovePostQuery removePost(UserActor actor, int ownerId, int id) {
        return new FaveRemovePostQuery(getClient(), actor, ownerId, id);
    }

    /**
     * @param actor vk actor
     * @param ownerId
     * @param id
     * @return query
     */
    public FaveRemoveProductQuery removeProduct(UserActor actor, int ownerId, int id) {
        return new FaveRemoveProductQuery(getClient(), actor, ownerId, id);
    }

    /**
     * @param actor vk actor
     * @param id
     * @return query
     */
    public FaveRemoveTagQuery removeTag(UserActor actor, int id) {
        return new FaveRemoveTagQuery(getClient(), actor, id);
    }

    /**
     * @param actor vk actor
     * @param ids
     * @return query
     */
    public FaveReorderTagsQuery reorderTags(UserActor actor, Integer... ids) {
        return new FaveReorderTagsQuery(getClient(), actor, ids);
    }

    /**
     * @param actor vk actor
     * @param ids
     * @return query
     */
    public FaveReorderTagsQuery reorderTags(UserActor actor, List<Integer> ids) {
        return new FaveReorderTagsQuery(getClient(), actor, ids);
    }

    /**
     * @param actor vk actor
     * @return query
     */
    public FaveSetPageTagsQuery setPageTags(UserActor actor) {
        return new FaveSetPageTagsQuery(getClient(), actor);
    }

    /**
     * @param actor vk actor
     * @return query
     */
    public FaveSetTagsQuery setTags(UserActor actor) {
        return new FaveSetTagsQuery(getClient(), actor);
    }

    /**
     * @param actor vk actor
     * @return query
     */
    public FaveTrackPageInteractionQuery trackPageInteraction(UserActor actor) {
        return new FaveTrackPageInteractionQuery(getClient(), actor);
    }
}

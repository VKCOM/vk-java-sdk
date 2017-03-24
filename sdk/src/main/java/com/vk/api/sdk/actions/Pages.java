package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.pages.PagesClearCacheQuery;
import com.vk.api.sdk.queries.pages.PagesGetHistoryQuery;
import com.vk.api.sdk.queries.pages.PagesGetQuery;
import com.vk.api.sdk.queries.pages.PagesGetTitlesQuery;
import com.vk.api.sdk.queries.pages.PagesGetVersionQuery;
import com.vk.api.sdk.queries.pages.PagesParseWikiQuery;
import com.vk.api.sdk.queries.pages.PagesSaveAccessQuery;
import com.vk.api.sdk.queries.pages.PagesSaveQuery;

/**
 * List of Pages methods
 */
public class Pages extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Pages(VkApiClient client) {
        super(client);
    }

    /**
     * Returns information about a wiki page.
     */
    public PagesGetQuery get(UserActor actor) {
        return new PagesGetQuery(getClient(), actor);
    }

    /**
     * Saves the text of a wiki page.
     */
    public PagesSaveQuery save(UserActor actor) {
        return new PagesSaveQuery(getClient(), actor);
    }

    /**
     * Saves modified read and edit access settings for a wiki page.
     */
    public PagesSaveAccessQuery saveAccess(UserActor actor, int pageId) {
        return new PagesSaveAccessQuery(getClient(), actor, pageId);
    }

    /**
     * Returns a list of all previous versions of a wiki page.
     */
    public PagesGetHistoryQuery getHistory(UserActor actor, int pageId) {
        return new PagesGetHistoryQuery(getClient(), actor, pageId);
    }

    /**
     * Returns a list of wiki pages in a group.
     */
    public PagesGetTitlesQuery getTitles(UserActor actor) {
        return new PagesGetTitlesQuery(getClient(), actor);
    }

    /**
     * Returns the text of one of the previous versions of a wiki page.
     */
    public PagesGetVersionQuery getVersion(UserActor actor, int versionId) {
        return new PagesGetVersionQuery(getClient(), actor, versionId);
    }

    /**
     * Returns HTML representation of the wiki markup.
     */
    public PagesParseWikiQuery parseWiki(UserActor actor, String text) {
        return new PagesParseWikiQuery(getClient(), actor, text);
    }

    /**
     * Allows to clear the cache of particular "external" pages which may be attached to VK posts.
     */
    public PagesClearCacheQuery clearCache(ServiceActor actor, String url) {
        return new PagesClearCacheQuery(getClient(), actor, url);
    }

    /**
     * Allows to clear the cache of particular "external" pages which may be attached to VK posts.
     */
    public PagesClearCacheQuery clearCache(UserActor actor, String url) {
        return new PagesClearCacheQuery(getClient(), actor, url);
    }
}

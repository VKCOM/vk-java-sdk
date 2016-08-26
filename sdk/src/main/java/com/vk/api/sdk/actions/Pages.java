package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
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
    public Pages(VkApiClient client) {
        super(client);
    }

    /**
     * Returns information about a wiki page.
     */
    public PagesGetQuery get(Actor actor) {
        return new PagesGetQuery(getClient(), actor);
    }

    /**
     * Saves the text of a wiki page.
     */
    public PagesSaveQuery save(Actor actor) {
        return new PagesSaveQuery(getClient(), actor);
    }

    /**
     * Saves modified read and edit access settings for a wiki page.
     */
    public PagesSaveAccessQuery saveAccess(Actor actor, int pageId) {
        return new PagesSaveAccessQuery(getClient(), actor, pageId);
    }

    /**
     * Returns a list of all previous versions of a wiki page.
     */
    public PagesGetHistoryQuery getHistory(Actor actor, int pageId) {
        return new PagesGetHistoryQuery(getClient(), actor, pageId);
    }

    /**
     * Returns a list of wiki pages in a group.
     */
    public PagesGetTitlesQuery getTitles(Actor actor) {
        return new PagesGetTitlesQuery(getClient(), actor);
    }

    /**
     * Returns the text of one of the previous versions of a wiki page.
     */
    public PagesGetVersionQuery getVersion(Actor actor, int versionId) {
        return new PagesGetVersionQuery(getClient(), actor, versionId);
    }

    /**
     * Returns HTML representation of the wiki markup.
     */
    public PagesParseWikiQuery parseWiki(Actor actor, String text) {
        return new PagesParseWikiQuery(getClient(), actor, text);
    }

    /**
     * Allows to clear the cache of particular "external" pages which may be attached to VK posts.
     */
    public PagesClearCacheQuery clearCache(String url) {
        return new PagesClearCacheQuery(getClient(), url);
    }

    /**
     * Allows to clear the cache of particular "external" pages which may be attached to VK posts.
     */
    public PagesClearCacheQuery clearCache(Actor actor, String url) {
        return new PagesClearCacheQuery(getClient(), actor, url);
    }
}

package com.vk.api.sdk.queries.pages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.pages.WikipageFull;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Pages.get method
 */
public class PagesGetQuery extends AbstractQueryBuilder<PagesGetQuery, WikipageFull> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public PagesGetQuery(VkApiClient client, UserActor actor) {
        super(client, "pages.get", WikipageFull.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Page owner ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PagesGetQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Wiki page ID.
     *
     * @param value value of "page id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PagesGetQuery pageId(Integer value) {
        return unsafeParam("page_id", value);
    }

    /**
     * Return information about a global wiki page
     *
     * @param value value of "global" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PagesGetQuery global(Boolean value) {
        return unsafeParam("global", value);
    }

    /**
     * Resulting wiki page is a preview for the attached link
     *
     * @param value value of "site preview" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PagesGetQuery sitePreview(Boolean value) {
        return unsafeParam("site_preview", value);
    }

    /**
     * Wiki page title.
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PagesGetQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * Set need source
     *
     * @param value value of "need source" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PagesGetQuery needSource(Boolean value) {
        return unsafeParam("need_source", value);
    }

    /**
     * Return the page as HTML
     *
     * @param value value of "need html" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PagesGetQuery needHtml(Boolean value) {
        return unsafeParam("need_html", value);
    }

    @Override
    protected PagesGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

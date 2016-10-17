package com.vk.api.sdk.queries.pages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.pages.WikipageFull;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Pages.getVersion method
 */
public class PagesGetVersionQuery extends AbstractQueryBuilder<PagesGetVersionQuery, WikipageFull> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param versionId value of "version id" parameter.
     */
    public PagesGetVersionQuery(VkApiClient client, UserActor actor, int versionId) {
        super(client, "pages.getVersion", WikipageFull.class);
        accessToken(actor.getAccessToken());
        versionId(versionId);
    }

    /**
     * @param value value of "version id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PagesGetVersionQuery versionId(int value) {
        return unsafeParam("version_id", value);
    }

    /**
     * ID of the community that owns the wiki page.
     *
     * @param value value of "group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PagesGetVersionQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * @param value value of "user id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PagesGetVersionQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Return the page as HTML
     *
     * @param value value of "need html" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PagesGetVersionQuery needHtml(Boolean value) {
        return unsafeParam("need_html", value);
    }

    @Override
    protected PagesGetVersionQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("version_id", "access_token");
    }
}

package com.vk.api.sdk.queries.pages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Pages.save method
 */
public class PagesSaveQuery extends AbstractQueryBuilder<PagesSaveQuery, Integer> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public PagesSaveQuery(VkApiClient client, UserActor actor) {
        super(client, "pages.save", Integer.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Text of the wiki page in wiki-format.
     *
     * @param value value of "text" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PagesSaveQuery text(String value) {
        return unsafeParam("text", value);
    }

    /**
     * Wiki page ID. The "title" parameter can be passed instead of "pid".
     *
     * @param value value of "page id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PagesSaveQuery pageId(Integer value) {
        return unsafeParam("page_id", value);
    }

    /**
     * ID of the community that owns the wiki page.
     *
     * @param value value of "group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PagesSaveQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * @param value value of "user id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PagesSaveQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Wiki page title.
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PagesSaveQuery title(String value) {
        return unsafeParam("title", value);
    }

    @Override
    protected PagesSaveQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

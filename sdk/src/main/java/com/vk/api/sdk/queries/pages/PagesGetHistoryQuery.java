package com.vk.api.sdk.queries.pages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.pages.responses.GetHistoryResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Pages.getHistory method
 */
public class PagesGetHistoryQuery extends AbstractQueryBuilder<PagesGetHistoryQuery, List<GetHistoryResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param pageId value of "page id" parameter.
     */
    public PagesGetHistoryQuery(VkApiClient client, UserActor actor, int pageId) {
        super(client, "pages.getHistory", Utils.buildParametrizedType(List.class, GetHistoryResponse.class));
        accessToken(actor.getAccessToken());
        pageId(pageId);
    }

    /**
     * Wiki page ID.
     *
     * @param value value of "page id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PagesGetHistoryQuery pageId(int value) {
        return unsafeParam("page_id", value);
    }

    /**
     * ID of the community that owns the wiki page.
     *
     * @param value value of "group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PagesGetHistoryQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PagesGetHistoryQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    @Override
    protected PagesGetHistoryQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token", "page_id");
    }
}

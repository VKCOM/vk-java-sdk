package com.vk.api.sdk.queries.widgets;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.widgets.responses.GetPagesResponse;

import java.util.Collections;
import java.util.List;

/**
 * Query for Widgets.getPages method
 */
public class WidgetsGetPagesQuery extends AbstractQueryBuilder<WidgetsGetPagesQuery, GetPagesResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public WidgetsGetPagesQuery(VkApiClient client, UserActor actor) {
        super(client, "widgets.getPages", GetPagesResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public WidgetsGetPagesQuery(VkApiClient client) {
        super(client, "widgets.getPages", GetPagesResponse.class);
    }

    /**
     * Set widget api id
     *
     * @param value value of "widget api id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WidgetsGetPagesQuery widgetApiId(Integer value) {
        return unsafeParam("widget_api_id", value);
    }

    /**
     * Set order
     *
     * @param value value of "order" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WidgetsGetPagesQuery order(String value) {
        return unsafeParam("order", value);
    }

    /**
     * Set period
     *
     * @param value value of "period" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WidgetsGetPagesQuery period(String value) {
        return unsafeParam("period", value);
    }

    /**
     * Set count
     *
     * @param value value of "count" parameter. Maximum is 200. Minimum is 10. By default 10.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WidgetsGetPagesQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected WidgetsGetPagesQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}

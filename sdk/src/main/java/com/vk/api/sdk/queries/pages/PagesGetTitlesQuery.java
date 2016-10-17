package com.vk.api.sdk.queries.pages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.pages.Wikipage;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Pages.getTitles method
 */
public class PagesGetTitlesQuery extends AbstractQueryBuilder<PagesGetTitlesQuery, List<Wikipage>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public PagesGetTitlesQuery(VkApiClient client, UserActor actor) {
        super(client, "pages.getTitles", Utils.buildParametrizedType(List.class, Wikipage.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of the community that owns the wiki page.
     *
     * @param value value of "group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PagesGetTitlesQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected PagesGetTitlesQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

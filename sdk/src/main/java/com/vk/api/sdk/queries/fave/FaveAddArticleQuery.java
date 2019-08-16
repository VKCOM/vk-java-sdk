package com.vk.api.sdk.queries.fave;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Fave.addArticle method
 */
public class FaveAddArticleQuery extends AbstractQueryBuilder<FaveAddArticleQuery, BoolInt> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param url value of "url" parameter.
     */
    public FaveAddArticleQuery(VkApiClient client, UserActor actor, String url) {
        super(client, "fave.addArticle", BoolInt.class);
        accessToken(actor.getAccessToken());
        url(url);
    }

    /**
     * Set url
     *
     * @param value value of "url" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FaveAddArticleQuery url(String value) {
        return unsafeParam("url", value);
    }

    @Override
    protected FaveAddArticleQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("url", "access_token");
    }
}

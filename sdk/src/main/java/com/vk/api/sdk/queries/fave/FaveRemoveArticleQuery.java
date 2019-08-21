package com.vk.api.sdk.queries.fave;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Fave.removeArticle method
 */
public class FaveRemoveArticleQuery extends AbstractQueryBuilder<FaveRemoveArticleQuery, BoolInt> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param articleId value of "article id" parameter. Minimum is 0.
     */
    public FaveRemoveArticleQuery(VkApiClient client, UserActor actor, int ownerId, int articleId) {
        super(client, "fave.removeArticle", BoolInt.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        articleId(articleId);
    }

    /**
     * Set owner id
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FaveRemoveArticleQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Set article id
     *
     * @param value value of "article id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FaveRemoveArticleQuery articleId(int value) {
        return unsafeParam("article_id", value);
    }

    @Override
    protected FaveRemoveArticleQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("owner_id", "article_id", "access_token");
    }
}

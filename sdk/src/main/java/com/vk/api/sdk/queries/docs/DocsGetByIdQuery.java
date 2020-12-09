package com.vk.api.sdk.queries.docs;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.docs.responses.GetByIdResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Docs.getById method
 */
public class DocsGetByIdQuery extends AbstractQueryBuilder<DocsGetByIdQuery, List<GetByIdResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param docs value of "docs" parameter.
     */
    public DocsGetByIdQuery(VkApiClient client, UserActor actor, String... docs) {
        super(client, "docs.getById", Utils.buildParametrizedType(List.class, GetByIdResponse.class));
        accessToken(actor.getAccessToken());
        docs(docs);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param docs value of "docs" parameter.
     */
    public DocsGetByIdQuery(VkApiClient client, UserActor actor, List<String> docs) {
        super(client, "docs.getById", Utils.buildParametrizedType(List.class, GetByIdResponse.class));
        accessToken(actor.getAccessToken());
        docs(docs);
    }

    /**
     * Set return tags
     *
     * @param value value of "return tags" parameter. By default false.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DocsGetByIdQuery returnTags(Boolean value) {
        return unsafeParam("return_tags", value);
    }

    /**
     * docs
     * Document IDs. Example: , "66748_91488,66748_91455",
     *
     * @param value value of "docs" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected DocsGetByIdQuery docs(String... value) {
        return unsafeParam("docs", value);
    }

    /**
     * Document IDs. Example: , "66748_91488,66748_91455",
     *
     * @param value value of "docs" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected DocsGetByIdQuery docs(List<String> value) {
        return unsafeParam("docs", value);
    }

    @Override
    protected DocsGetByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("docs", "access_token");
    }
}

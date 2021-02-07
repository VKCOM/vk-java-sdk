package com.vk.api.sdk.queries.docs;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.docs.responses.GetResponse;
import com.vk.api.sdk.objects.enums.DocsType;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Docs.get method
 */
public class DocsGetQuery extends AbstractQueryBuilder<DocsGetQuery, GetResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public DocsGetQuery(VkApiClient client, UserActor actor) {
        super(client, "docs.get", GetResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Number of documents to return. By default, all documents.
     *
     * @param value value of "count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DocsGetQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Offset needed to return a specific subset of documents.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DocsGetQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Set type
     *
     * @param value value of "type" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DocsGetQuery type(DocsType value) {
        return unsafeParam("type", value);
    }

    /**
     * ID of the user or community that owns the documents. Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DocsGetQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Set return tags
     *
     * @param value value of "return tags" parameter. By default false.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DocsGetQuery returnTags(Boolean value) {
        return unsafeParam("return_tags", value);
    }

    @Override
    protected DocsGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

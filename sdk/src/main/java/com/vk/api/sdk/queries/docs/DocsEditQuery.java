package com.vk.api.sdk.queries.docs;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Docs.edit method
 */
public class DocsEditQuery extends AbstractQueryBuilder<DocsEditQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param docId   value of "doc id" parameter. Minimum is 0.
     */
    public DocsEditQuery(VkApiClient client, UserActor actor, int ownerId, int docId) {
        super(client, "docs.edit", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        docId(docId);
    }

    /**
     * User ID or community ID. Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected DocsEditQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Document ID.
     *
     * @param value value of "doc id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected DocsEditQuery docId(int value) {
        return unsafeParam("doc_id", value);
    }

    /**
     * Document title.
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DocsEditQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * Document tags.
     *
     * @param value value of "tags" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DocsEditQuery tags(String... value) {
        return unsafeParam("tags", value);
    }

    /**
     * Document tags.
     *
     * @param value value of "tags" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DocsEditQuery tags(List<String> value) {
        return unsafeParam("tags", value);
    }

    @Override
    protected DocsEditQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("owner_id", "doc_id", "access_token");
    }
}

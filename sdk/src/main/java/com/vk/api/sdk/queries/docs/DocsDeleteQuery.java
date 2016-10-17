package com.vk.api.sdk.queries.docs;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Docs.delete method
 */
public class DocsDeleteQuery extends AbstractQueryBuilder<DocsDeleteQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param docId   value of "doc id" parameter. Minimum is 0.
     */
    public DocsDeleteQuery(VkApiClient client, UserActor actor, int ownerId, int docId) {
        super(client, "docs.delete", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        docId(docId);
    }

    /**
     * Set owner id
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected DocsDeleteQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Set doc id
     *
     * @param value value of "doc id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected DocsDeleteQuery docId(int value) {
        return unsafeParam("doc_id", value);
    }

    @Override
    protected DocsDeleteQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("owner_id", "doc_id", "access_token");
    }
}

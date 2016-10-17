package com.vk.api.sdk.queries.docs;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.docs.responses.AddResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Docs.add method
 */
public class DocsAddQuery extends AbstractQueryBuilder<DocsAddQuery, AddResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param docId   value of "doc id" parameter. Minimum is 0.
     */
    public DocsAddQuery(VkApiClient client, UserActor actor, int ownerId, int docId) {
        super(client, "docs.add", AddResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        docId(docId);
    }

    /**
     * ID of the user or community that owns the document. Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected DocsAddQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Document ID.
     *
     * @param value value of "doc id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected DocsAddQuery docId(int value) {
        return unsafeParam("doc_id", value);
    }

    /**
     * Access key. This parameter is required if "access_key" was returned with the document's data.
     *
     * @param value value of "access key" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DocsAddQuery accessKey(String value) {
        return unsafeParam("access_key", value);
    }

    @Override
    protected DocsAddQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("owner_id", "doc_id", "access_token");
    }
}

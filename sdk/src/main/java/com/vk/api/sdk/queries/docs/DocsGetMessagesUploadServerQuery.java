package com.vk.api.sdk.queries.docs;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.docs.responses.GetUploadServerResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for docs.getMessagesUploadServer method
 */
public class DocsGetMessagesUploadServerQuery extends AbstractQueryBuilder<DocsGetMessagesUploadServerQuery, GetUploadServerResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public DocsGetMessagesUploadServerQuery(VkApiClient client, UserActor actor) {
        super(client, "docs.getMessagesUploadServer", GetUploadServerResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public DocsGetMessagesUploadServerQuery(VkApiClient client, GroupActor actor) {
        super(client, "docs.getMessagesUploadServer", GetUploadServerResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set peer id
     *
     * @param value value of "peer id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DocsGetMessagesUploadServerQuery peerId(Integer value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * Set document type
     *
     * @param value value of "type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DocsGetMessagesUploadServerQuery type(DocsGetMessagesUploadServerType value) {
        return unsafeParam("type", value);
    }

    @Override
    protected DocsGetMessagesUploadServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

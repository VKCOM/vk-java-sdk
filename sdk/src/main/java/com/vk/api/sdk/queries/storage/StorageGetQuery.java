package com.vk.api.sdk.queries.storage;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.storage.responses.GetResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Storage.get method
 */
public class StorageGetQuery extends AbstractQueryBuilder<StorageGetQuery, List<GetResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StorageGetQuery(VkApiClient client, UserActor actor) {
        super(client, "storage.get", Utils.buildParametrizedType(List.class, GetResponse.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StorageGetQuery(VkApiClient client, GroupActor actor) {
        super(client, "storage.get", Utils.buildParametrizedType(List.class, GetResponse.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StorageGetQuery(VkApiClient client, ServiceActor actor) {
        super(client, "storage.get", Utils.buildParametrizedType(List.class, GetResponse.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Set key
     *
     * @param value value of "key" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StorageGetQuery key(String value) {
        return unsafeParam("key", value);
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StorageGetQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * keys
     * Set keys
     *
     * @param value value of "keys" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StorageGetQuery keys(String... value) {
        return unsafeParam("keys", value);
    }

    /**
     * Set keys
     *
     * @param value value of "keys" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StorageGetQuery keys(List<String> value) {
        return unsafeParam("keys", value);
    }

    @Override
    protected StorageGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

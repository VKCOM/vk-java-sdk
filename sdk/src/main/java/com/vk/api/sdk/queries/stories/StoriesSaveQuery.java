package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.stories.responses.SaveResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Stories.save method
 */
public class StoriesSaveQuery extends AbstractQueryBuilder<StoriesSaveQuery, SaveResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param uploadResults value of "upload results" parameter.
     */
    public StoriesSaveQuery(VkApiClient client, UserActor actor, String... uploadResults) {
        super(client, "stories.save", SaveResponse.class);
        accessToken(actor.getAccessToken());
        uploadResults(uploadResults);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param uploadResults value of "upload results" parameter.
     */
    public StoriesSaveQuery(VkApiClient client, UserActor actor, List<String> uploadResults) {
        super(client, "stories.save", SaveResponse.class);
        accessToken(actor.getAccessToken());
        uploadResults(uploadResults);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param uploadResults value of "upload results" parameter.
     */
    public StoriesSaveQuery(VkApiClient client, GroupActor actor, String... uploadResults) {
        super(client, "stories.save", SaveResponse.class);
        accessToken(actor.getAccessToken());
        uploadResults(uploadResults);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param uploadResults value of "upload results" parameter.
     */
    public StoriesSaveQuery(VkApiClient client, GroupActor actor, List<String> uploadResults) {
        super(client, "stories.save", SaveResponse.class);
        accessToken(actor.getAccessToken());
        uploadResults(uploadResults);
    }

    /**
     * upload_results
     * Set upload results
     *
     * @param value value of "upload results" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected StoriesSaveQuery uploadResults(String... value) {
        return unsafeParam("upload_results", value);
    }

    /**
     * Set upload results
     *
     * @param value value of "upload results" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected StoriesSaveQuery uploadResults(List<String> value) {
        return unsafeParam("upload_results", value);
    }

    @Override
    protected StoriesSaveQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("upload_results", "access_token");
    }
}

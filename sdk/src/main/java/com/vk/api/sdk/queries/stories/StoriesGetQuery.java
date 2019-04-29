package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.stories.responses.GetResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Stories.get method
 */
public class StoriesGetQuery extends AbstractQueryBuilder<StoriesGetQuery, GetResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StoriesGetQuery(VkApiClient client, UserActor actor) {
        super(client, "stories.get", GetResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StoriesGetQuery(VkApiClient client, GroupActor actor) {
        super(client, "stories.get", GetResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Owner ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesGetQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * '1' — to return additional fields for users and communities. Default value is 0.
     *
     * @param value value of "extended" parameter. By default false.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesGetQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    @Override
    protected StoriesGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

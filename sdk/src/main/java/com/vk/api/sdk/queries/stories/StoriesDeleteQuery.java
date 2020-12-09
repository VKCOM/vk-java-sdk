package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Stories.delete method
 */
public class StoriesDeleteQuery extends AbstractQueryBuilder<StoriesDeleteQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StoriesDeleteQuery(VkApiClient client, UserActor actor) {
        super(client, "stories.delete", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StoriesDeleteQuery(VkApiClient client, GroupActor actor) {
        super(client, "stories.delete", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Story owner's ID. Current user id is used by default.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesDeleteQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Story ID.
     *
     * @param value value of "story id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesDeleteQuery storyId(Integer value) {
        return unsafeParam("story_id", value);
    }

    /**
     * stories
     * Set stories
     *
     * @param value value of "stories" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesDeleteQuery stories(String... value) {
        return unsafeParam("stories", value);
    }

    /**
     * Set stories
     *
     * @param value value of "stories" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesDeleteQuery stories(List<String> value) {
        return unsafeParam("stories", value);
    }

    @Override
    protected StoriesDeleteQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

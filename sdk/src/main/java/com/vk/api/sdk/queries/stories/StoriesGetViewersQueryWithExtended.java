package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.stories.responses.GetViewersExtendedResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Stories.getViewers method
 */
public class StoriesGetViewersQueryWithExtended extends AbstractQueryBuilder<StoriesGetViewersQueryWithExtended, GetViewersExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param storyId value of "story id" parameter. Minimum is 0.
     */
    public StoriesGetViewersQueryWithExtended(VkApiClient client, UserActor actor, int ownerId,
            int storyId) {
        super(client, "stories.getViewers", GetViewersExtendedResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        storyId(storyId);
        extended(true);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param storyId value of "story id" parameter. Minimum is 0.
     */
    public StoriesGetViewersQueryWithExtended(VkApiClient client, GroupActor actor, int ownerId,
            int storyId) {
        super(client, "stories.getViewers", GetViewersExtendedResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        storyId(storyId);
        extended(true);
    }

    /**
     * Story owner ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected StoriesGetViewersQueryWithExtended ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Story ID.
     *
     * @param value value of "story id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected StoriesGetViewersQueryWithExtended storyId(int value) {
        return unsafeParam("story_id", value);
    }

    /**
     * Maximum number of results.
     *
     * @param value value of "count" parameter. Minimum is 0. By default 100.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesGetViewersQueryWithExtended count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Offset needed to return a specific subset of results.
     *
     * @param value value of "offset" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesGetViewersQueryWithExtended offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * '1' — to return detailed information about photos
     *
     * @param value value of "extended" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected StoriesGetViewersQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    @Override
    protected StoriesGetViewersQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("story_id", "owner_id", "access_token");
    }
}

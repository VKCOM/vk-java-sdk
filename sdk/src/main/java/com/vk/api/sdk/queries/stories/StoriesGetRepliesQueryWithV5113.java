package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.UserGroupFields;
import com.vk.api.sdk.objects.stories.responses.GetV5113Response;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Stories.getReplies method
 */
public class StoriesGetRepliesQueryWithV5113 extends AbstractQueryBuilder<StoriesGetRepliesQueryWithV5113, GetV5113Response> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param storyId value of "story id" parameter. Minimum is 0.
     */
    public StoriesGetRepliesQueryWithV5113(VkApiClient client, UserActor actor, int ownerId,
            int storyId) {
        super(client, "stories.getReplies", GetV5113Response.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        storyId(storyId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param storyId value of "story id" parameter. Minimum is 0.
     */
    public StoriesGetRepliesQueryWithV5113(VkApiClient client, GroupActor actor, int ownerId,
            int storyId) {
        super(client, "stories.getReplies", GetV5113Response.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        storyId(storyId);
    }

    /**
     * Story owner ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected StoriesGetRepliesQueryWithV5113 ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Story ID.
     *
     * @param value value of "story id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected StoriesGetRepliesQueryWithV5113 storyId(int value) {
        return unsafeParam("story_id", value);
    }

    /**
     * Access key for the private object.
     *
     * @param value value of "access key" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesGetRepliesQueryWithV5113 accessKey(String value) {
        return unsafeParam("access_key", value);
    }

    /**
     * '1' — to return additional fields for users and communities. Default value is 0.
     *
     * @param value value of "extended" parameter. By default false.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesGetRepliesQueryWithV5113 extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * fields
     * Additional fields to return
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesGetRepliesQueryWithV5113 fields(UserGroupFields... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Additional fields to return
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesGetRepliesQueryWithV5113 fields(List<UserGroupFields> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected StoriesGetRepliesQueryWithV5113 getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("story_id", "owner_id", "access_token");
    }
}

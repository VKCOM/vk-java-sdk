package com.vk.api.sdk.queries.fave;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Fave.setPageTags method
 */
public class FaveSetPageTagsQuery extends AbstractQueryBuilder<FaveSetPageTagsQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public FaveSetPageTagsQuery(VkApiClient client, UserActor actor) {
        super(client, "fave.setPageTags", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveSetPageTagsQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveSetPageTagsQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * tag_ids
     * Set tag ids
     *
     * @param value value of "tag ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveSetPageTagsQuery tagIds(Integer... value) {
        return unsafeParam("tag_ids", value);
    }

    /**
     * Set tag ids
     *
     * @param value value of "tag ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveSetPageTagsQuery tagIds(List<Integer> value) {
        return unsafeParam("tag_ids", value);
    }

    @Override
    protected FaveSetPageTagsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

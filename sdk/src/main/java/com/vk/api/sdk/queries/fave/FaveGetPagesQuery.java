package com.vk.api.sdk.queries.fave;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.UserGroupFields;
import com.vk.api.sdk.objects.enums.FaveType;
import com.vk.api.sdk.objects.fave.responses.GetPagesResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Fave.getPages method
 */
public class FaveGetPagesQuery extends AbstractQueryBuilder<FaveGetPagesQuery, GetPagesResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public FaveGetPagesQuery(VkApiClient client, UserActor actor) {
        super(client, "fave.getPages", GetPagesResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set offset
     *
     * @param value value of "offset" parameter. Maximum is 10000. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetPagesQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Set count
     *
     * @param value value of "count" parameter. Maximum is 500. Minimum is 1. By default 50.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetPagesQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Set type
     *
     * @param value value of "type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetPagesQuery type(FaveType value) {
        return unsafeParam("type", value);
    }

    /**
     * Set tag id
     *
     * @param value value of "tag id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetPagesQuery tagId(Integer value) {
        return unsafeParam("tag_id", value);
    }

    /**
     * fields
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetPagesQuery fields(UserGroupFields... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetPagesQuery fields(List<UserGroupFields> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected FaveGetPagesQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

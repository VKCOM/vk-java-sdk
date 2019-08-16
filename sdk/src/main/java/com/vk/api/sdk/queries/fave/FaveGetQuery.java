package com.vk.api.sdk.queries.fave;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.enums.FaveItemType;
import com.vk.api.sdk.objects.fave.responses.GetResponse;
import com.vk.api.sdk.objects.users.Fields;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Fave.get method
 */
public class FaveGetQuery extends AbstractQueryBuilder<FaveGetQuery, GetResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public FaveGetQuery(VkApiClient client, UserActor actor) {
        super(client, "fave.get", GetResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * '1' — to return additional 'wall', 'profiles', and 'groups' fields. By default: '0'.
     *
     * @param value value of "extended" parameter. By default false.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Set item type
     *
     * @param value value of "item type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetQuery itemType(FaveItemType value) {
        return unsafeParam("item_type", value);
    }

    /**
     * Tag ID.
     *
     * @param value value of "tag id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetQuery tagId(Integer value) {
        return unsafeParam("tag_id", value);
    }

    /**
     * Offset needed to return a specific subset of users.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of users to return.
     *
     * @param value value of "count" parameter. Maximum is 100. Minimum is 1. By default 50.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetQuery fields(Fields value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set is from snackbar
     *
     * @param value value of "is from snackbar" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetQuery isFromSnackbar(Boolean value) {
        return unsafeParam("is_from_snackbar", value);
    }

    @Override
    protected FaveGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

package com.vk.api.sdk.queries.fave;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import com.vk.api.sdk.objects.enums.FaveItemType;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Fave.setTags method
 */
public class FaveSetTagsQuery extends AbstractQueryBuilder<FaveSetTagsQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public FaveSetTagsQuery(VkApiClient client, UserActor actor) {
        super(client, "fave.setTags", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set item type
     *
     * @param value value of "item type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveSetTagsQuery itemType(FaveItemType value) {
        return unsafeParam("item_type", value);
    }

    /**
     * Set item owner id
     *
     * @param value value of "item owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveSetTagsQuery itemOwnerId(Integer value) {
        return unsafeParam("item_owner_id", value);
    }

    /**
     * Set item id
     *
     * @param value value of "item id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveSetTagsQuery itemId(Integer value) {
        return unsafeParam("item_id", value);
    }

    /**
     * Set link id
     *
     * @param value value of "link id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveSetTagsQuery linkId(String value) {
        return unsafeParam("link_id", value);
    }

    /**
     * Set link url
     *
     * @param value value of "link url" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveSetTagsQuery linkUrl(String value) {
        return unsafeParam("link_url", value);
    }

    /**
     * tag_ids
     * Set tag ids
     *
     * @param value value of "tag ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveSetTagsQuery tagIds(Integer... value) {
        return unsafeParam("tag_ids", value);
    }

    /**
     * Set tag ids
     *
     * @param value value of "tag ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveSetTagsQuery tagIds(List<Integer> value) {
        return unsafeParam("tag_ids", value);
    }

    @Override
    protected FaveSetTagsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

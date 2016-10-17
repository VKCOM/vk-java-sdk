package com.vk.api.sdk.queries.newsfeed;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Newsfeed.saveList method
 */
public class NewsfeedSaveListQuery extends AbstractQueryBuilder<NewsfeedSaveListQuery, Integer> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param title  value of "title" parameter.
     */
    public NewsfeedSaveListQuery(VkApiClient client, UserActor actor, String title) {
        super(client, "newsfeed.saveList", Integer.class);
        accessToken(actor.getAccessToken());
        title(title);
    }

    /**
     * Numeric list identifier (if not sent, will be set automatically).
     *
     * @param value value of "list id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedSaveListQuery listId(Integer value) {
        return unsafeParam("list_id", value);
    }

    /**
     * List name.
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected NewsfeedSaveListQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * Users and communities identifiers to be added to the list. Community identifiers must be negative numbers.
     *
     * @param value value of "source ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedSaveListQuery sourceIds(Integer... value) {
        return unsafeParam("source_ids", value);
    }

    /**
     * Users and communities identifiers to be added to the list. Community identifiers must be negative numbers.
     *
     * @param value value of "source ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedSaveListQuery sourceIds(List<Integer> value) {
        return unsafeParam("source_ids", value);
    }

    /**
     * Reposts display on and off ("true" is for off).
     *
     * @param value value of "no reposts" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedSaveListQuery noReposts(Boolean value) {
        return unsafeParam("no_reposts", value);
    }

    @Override
    protected NewsfeedSaveListQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("title", "access_token");
    }
}

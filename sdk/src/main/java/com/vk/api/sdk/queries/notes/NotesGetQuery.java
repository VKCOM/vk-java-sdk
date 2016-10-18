package com.vk.api.sdk.queries.notes;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.notes.responses.GetResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Notes.get method
 */
public class NotesGetQuery extends AbstractQueryBuilder<NotesGetQuery, GetResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public NotesGetQuery(VkApiClient client, UserActor actor) {
        super(client, "notes.get", GetResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Note IDs.
     *
     * @param value value of "note ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotesGetQuery noteIds(Integer... value) {
        return unsafeParam("note_ids", value);
    }

    /**
     * Note IDs.
     *
     * @param value value of "note ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotesGetQuery noteIds(List<Integer> value) {
        return unsafeParam("note_ids", value);
    }

    /**
     * Note owner ID.
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotesGetQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Number of notes to return.
     *
     * @param value value of "count" parameter. Maximum is 100. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotesGetQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Offset needed to return a specific subset of notes.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotesGetQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Sort
     *
     * @param value value of "price to" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotesGetQuery sort(NotesGetSort value) {
        return unsafeParam("sort", value);
    }

    @Override
    protected NotesGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

package com.vk.api.sdk.queries.notes;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.notes.responses.GetCommentsResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Notes.getComments method
 */
public class NotesGetCommentsQuery extends AbstractQueryBuilder<NotesGetCommentsQuery, GetCommentsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param noteId value of "note id" parameter. Minimum is 0.
     */
    public NotesGetCommentsQuery(VkApiClient client, UserActor actor, int noteId) {
        super(client, "notes.getComments", GetCommentsResponse.class);
        accessToken(actor.getAccessToken());
        noteId(noteId);
    }

    /**
     * Note ID.
     *
     * @param value value of "note id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected NotesGetCommentsQuery noteId(int value) {
        return unsafeParam("note_id", value);
    }

    /**
     * Note owner ID.
     *
     * @param value value of "owner id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotesGetCommentsQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Number of comments to return.
     *
     * @param value value of "count" parameter. Maximum is 100. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotesGetCommentsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Offset needed to return a specific subset of comments.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotesGetCommentsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    @Override
    protected NotesGetCommentsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("note_id", "access_token");
    }
}

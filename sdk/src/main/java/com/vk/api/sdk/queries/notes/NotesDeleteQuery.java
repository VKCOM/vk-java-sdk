package com.vk.api.sdk.queries.notes;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Notes.delete method
 */
public class NotesDeleteQuery extends AbstractQueryBuilder<NotesDeleteQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param noteId value of "note id" parameter. Minimum is 0.
     */
    public NotesDeleteQuery(VkApiClient client, UserActor actor, int noteId) {
        super(client, "notes.delete", OkResponse.class);
        accessToken(actor.getAccessToken());
        noteId(noteId);
    }

    /**
     * Note ID.
     *
     * @param value value of "note id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected NotesDeleteQuery noteId(int value) {
        return unsafeParam("note_id", value);
    }

    @Override
    protected NotesDeleteQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("note_id", "access_token");
    }
}

package com.vk.api.sdk.queries.notes;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Notes.edit method
 */
public class NotesEditQuery extends AbstractQueryBuilder<NotesEditQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param noteId value of "note id" parameter. Minimum is 0.
     * @param title  value of "title" parameter.
     * @param text   value of "text" parameter.
     */
    public NotesEditQuery(VkApiClient client, UserActor actor, int noteId, String title, String text) {
        super(client, "notes.edit", OkResponse.class);
        accessToken(actor.getAccessToken());
        noteId(noteId);
        title(title);
        text(text);
    }

    /**
     * Note ID.
     *
     * @param value value of "note id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected NotesEditQuery noteId(int value) {
        return unsafeParam("note_id", value);
    }

    /**
     * Note title.
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected NotesEditQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * Note text.
     *
     * @param value value of "text" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected NotesEditQuery text(String value) {
        return unsafeParam("text", value);
    }

    /**
     * Set privacy view
     *
     * @param value value of "privacy view" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotesEditQuery privacyView(String... value) {
        return unsafeParam("privacy_view", value);
    }

    /**
     * Set privacy view
     *
     * @param value value of "privacy view" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotesEditQuery privacyView(List<String> value) {
        return unsafeParam("privacy_view", value);
    }

    /**
     * Set privacy comment
     *
     * @param value value of "privacy comment" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotesEditQuery privacyComment(String... value) {
        return unsafeParam("privacy_comment", value);
    }

    /**
     * Set privacy comment
     *
     * @param value value of "privacy comment" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotesEditQuery privacyComment(List<String> value) {
        return unsafeParam("privacy_comment", value);
    }

    @Override
    protected NotesEditQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("text", "note_id", "title", "access_token");
    }
}

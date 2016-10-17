package com.vk.api.sdk.queries.notes;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Notes.createComment method
 */
public class NotesCreateCommentQuery extends AbstractQueryBuilder<NotesCreateCommentQuery, Integer> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param noteId  value of "note id" parameter. Minimum is 0.
     * @param message value of "message" parameter.
     */
    public NotesCreateCommentQuery(VkApiClient client, UserActor actor, int noteId, String message) {
        super(client, "notes.createComment", Integer.class);
        accessToken(actor.getAccessToken());
        noteId(noteId);
        message(message);
    }

    /**
     * Note ID.
     *
     * @param value value of "note id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected NotesCreateCommentQuery noteId(int value) {
        return unsafeParam("note_id", value);
    }

    /**
     * Note owner ID.
     *
     * @param value value of "owner id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotesCreateCommentQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * ID of the user to whom the reply is addressed (if the comment is a reply to another comment).
     *
     * @param value value of "reply to" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotesCreateCommentQuery replyTo(Integer value) {
        return unsafeParam("reply_to", value);
    }

    /**
     * Comment text.
     *
     * @param value value of "message" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected NotesCreateCommentQuery message(String value) {
        return unsafeParam("message", value);
    }

    /**
     * Set guid
     *
     * @param value value of "guid" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotesCreateCommentQuery guid(String value) {
        return unsafeParam("guid", value);
    }

    @Override
    protected NotesCreateCommentQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("note_id", "message", "access_token");
    }
}

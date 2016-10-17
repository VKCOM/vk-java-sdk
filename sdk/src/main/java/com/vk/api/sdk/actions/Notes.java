package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.notes.NotesAddQuery;
import com.vk.api.sdk.queries.notes.NotesCreateCommentQuery;
import com.vk.api.sdk.queries.notes.NotesDeleteCommentQuery;
import com.vk.api.sdk.queries.notes.NotesDeleteQuery;
import com.vk.api.sdk.queries.notes.NotesEditCommentQuery;
import com.vk.api.sdk.queries.notes.NotesEditQuery;
import com.vk.api.sdk.queries.notes.NotesGetByIdQuery;
import com.vk.api.sdk.queries.notes.NotesGetCommentsQuery;
import com.vk.api.sdk.queries.notes.NotesGetQuery;
import com.vk.api.sdk.queries.notes.NotesRestoreCommentQuery;

/**
 * List of Notes methods
 */
public class Notes extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Notes(VkApiClient client) {
        super(client);
    }

    /**
     * Returns a list of notes created by a user.
     */
    public NotesGetQuery get(UserActor actor) {
        return new NotesGetQuery(getClient(), actor);
    }

    /**
     * Returns a note by its ID.
     */
    public NotesGetByIdQuery getById(UserActor actor, int noteId) {
        return new NotesGetByIdQuery(getClient(), actor, noteId);
    }

    /**
     * Creates a new note for the current user.
     */
    public NotesAddQuery add(UserActor actor, String title, String text) {
        return new NotesAddQuery(getClient(), actor, title, text);
    }

    /**
     * Edits a note of the current user.
     */
    public NotesEditQuery edit(UserActor actor, int noteId, String title, String text) {
        return new NotesEditQuery(getClient(), actor, noteId, title, text);
    }

    /**
     * Deletes a note of the current user.
     */
    public NotesDeleteQuery delete(UserActor actor, int noteId) {
        return new NotesDeleteQuery(getClient(), actor, noteId);
    }

    /**
     * Returns a list of comments on a note.
     */
    public NotesGetCommentsQuery getComments(UserActor actor, int noteId) {
        return new NotesGetCommentsQuery(getClient(), actor, noteId);
    }

    /**
     * Adds a new comment on a note.
     */
    public NotesCreateCommentQuery createComment(UserActor actor, int noteId, String message) {
        return new NotesCreateCommentQuery(getClient(), actor, noteId, message);
    }

    /**
     * Edits a comment on a note.
     */
    public NotesEditCommentQuery editComment(UserActor actor, int commentId) {
        return new NotesEditCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Deletes a comment on a note.
     */
    public NotesDeleteCommentQuery deleteComment(UserActor actor, int commentId) {
        return new NotesDeleteCommentQuery(getClient(), actor, commentId);
    }

    /**
     * Restores a deleted comment on a note.
     */
    public NotesRestoreCommentQuery restoreComment(UserActor actor, int commentId) {
        return new NotesRestoreCommentQuery(getClient(), actor, commentId);
    }
}

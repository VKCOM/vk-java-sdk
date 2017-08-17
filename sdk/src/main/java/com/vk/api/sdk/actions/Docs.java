package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.docs.DocsAddQuery;
import com.vk.api.sdk.queries.docs.DocsDeleteQuery;
import com.vk.api.sdk.queries.docs.DocsEditQuery;
import com.vk.api.sdk.queries.docs.DocsGetByIdQuery;
import com.vk.api.sdk.queries.docs.DocsGetMessagesUploadServerQuery;
import com.vk.api.sdk.queries.docs.DocsGetQuery;
import com.vk.api.sdk.queries.docs.DocsGetTypesQuery;
import com.vk.api.sdk.queries.docs.DocsGetUploadServerQuery;
import com.vk.api.sdk.queries.docs.DocsGetWallUploadServerQuery;
import com.vk.api.sdk.queries.docs.DocsSaveQuery;
import com.vk.api.sdk.queries.docs.DocsSearchQuery;

import java.util.List;

/**
 * List of Docs methods
 */
public class Docs extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Docs(VkApiClient client) {
        super(client);
    }

    /**
     * Returns detailed information about user or community documents.
     */
    public DocsGetQuery get(UserActor actor) {
        return new DocsGetQuery(getClient(), actor);
    }

    /**
     * Returns information about documents by their IDs.
     */
    public DocsGetByIdQuery getById(UserActor actor, String... docs) {
        return new DocsGetByIdQuery(getClient(), actor, docs);
    }

    /**
     * Returns information about documents by their IDs.
     */
    public DocsGetByIdQuery getById(UserActor actor, List<String> docs) {
        return new DocsGetByIdQuery(getClient(), actor, docs);
    }

    /**
     * Returns the server address for document upload.
     */
    public DocsGetUploadServerQuery getUploadServer(UserActor actor) {
        return new DocsGetUploadServerQuery(getClient(), actor);
    }

    /**
     * Returns the server address for document upload onto a user's or community's wall.
     */
    public DocsGetWallUploadServerQuery getWallUploadServer(UserActor actor) {
        return new DocsGetWallUploadServerQuery(getClient(), actor);
    }

    /**
     * Returns the server address for document upload onto a user's or community's wall.
     */
    public DocsGetWallUploadServerQuery getWallUploadServer(GroupActor actor) {
        return new DocsGetWallUploadServerQuery(getClient(), actor);
    }

    /**
     * Returns the server address for document upload onto messages.
     */
    public DocsGetMessagesUploadServerQuery getMessagesUploadServer(UserActor actor) {
        return new DocsGetMessagesUploadServerQuery(getClient(), actor);
    }

    /**
     * Returns the server address for document upload onto messages.
     */
    public DocsGetMessagesUploadServerQuery getMessagesUploadServer(GroupActor actor) {
        return new DocsGetMessagesUploadServerQuery(getClient(), actor);
    }

    /**
     * Saves a document after uploading it to a server.
     */
    public DocsSaveQuery save(UserActor actor, String file) {
        return new DocsSaveQuery(getClient(), actor, file);
    }

    /**
     * Saves a document after uploading it to a server.
     */
    public DocsSaveQuery save(GroupActor actor, String file) {
        return new DocsSaveQuery(getClient(), actor, file);
    }

    /**
     * Deletes a user or community document.
     */
    public DocsDeleteQuery delete(UserActor actor, int ownerId, int docId) {
        return new DocsDeleteQuery(getClient(), actor, ownerId, docId);
    }

    /**
     * Copies a document to a user's or community's document list.
     */
    public DocsAddQuery add(UserActor actor, int ownerId, int docId) {
        return new DocsAddQuery(getClient(), actor, ownerId, docId);
    }

    /**
     * Returns documents types available for current user.
     */
    public DocsGetTypesQuery getTypes(UserActor actor, int ownerId) {
        return new DocsGetTypesQuery(getClient(), actor, ownerId);
    }

    /**
     * Returns a list of documents matching the search criteria.
     */
    public DocsSearchQuery search(UserActor actor, String q) {
        return new DocsSearchQuery(getClient(), actor, q);
    }

    /**
     * Edits a document.
     */
    public DocsEditQuery edit(UserActor actor, int ownerId, int docId) {
        return new DocsEditQuery(getClient(), actor, ownerId, docId);
    }
}

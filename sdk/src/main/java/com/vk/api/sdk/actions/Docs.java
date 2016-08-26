package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.queries.docs.DocsAddQuery;
import com.vk.api.sdk.queries.docs.DocsDeleteQuery;
import com.vk.api.sdk.queries.docs.DocsEditQuery;
import com.vk.api.sdk.queries.docs.DocsGetByIdQuery;
import com.vk.api.sdk.queries.docs.DocsGetQuery;
import com.vk.api.sdk.queries.docs.DocsGetTypesQuery;
import com.vk.api.sdk.queries.docs.DocsGetUploadServerQuery;
import com.vk.api.sdk.queries.docs.DocsGetWallUploadServerQuery;
import com.vk.api.sdk.queries.docs.DocsSaveQuery;
import com.vk.api.sdk.queries.docs.DocsSearchQuery;

/**
 * List of Docs methods
 */
public class Docs extends AbstractAction {
    public Docs(VkApiClient client) {
        super(client);
    }

    /**
     * Returns detailed information about user or community documents.
     */
    public DocsGetQuery get(Actor actor) {
        return new DocsGetQuery(getClient(), actor);
    }

    /**
     * Returns information about documents by their IDs.
     */
    public DocsGetByIdQuery getById(Actor actor, String... docs) {
        return new DocsGetByIdQuery(getClient(), actor, docs);
    }

    /**
     * Returns the server address for document upload.
     */
    public DocsGetUploadServerQuery getUploadServer(Actor actor) {
        return new DocsGetUploadServerQuery(getClient(), actor);
    }

    /**
     * Returns the server address for document upload onto a user's or community's wall.
     */
    public DocsGetWallUploadServerQuery getWallUploadServer(Actor actor) {
        return new DocsGetWallUploadServerQuery(getClient(), actor);
    }

    /**
     * Saves a document after uploading it to a server.
     */
    public DocsSaveQuery save(Actor actor, String file) {
        return new DocsSaveQuery(getClient(), actor, file);
    }

    /**
     * Deletes a user or community document.
     */
    public DocsDeleteQuery delete(Actor actor, int ownerId, int docId) {
        return new DocsDeleteQuery(getClient(), actor, ownerId, docId);
    }

    /**
     * Copies a document to a user's or community's document list.
     */
    public DocsAddQuery add(Actor actor, int ownerId, int docId) {
        return new DocsAddQuery(getClient(), actor, ownerId, docId);
    }

    /**
     * Returns documents types available for current user.
     */
    public DocsGetTypesQuery getTypes(Actor actor, int ownerId) {
        return new DocsGetTypesQuery(getClient(), actor, ownerId);
    }

    /**
     * Returns a list of documents matching the search criteria.
     */
    public DocsSearchQuery search(Actor actor, String q) {
        return new DocsSearchQuery(getClient(), actor, q);
    }

    /**
     * Edits a document.
     */
    public DocsEditQuery edit(Actor actor, int ownerId, int docId) {
        return new DocsEditQuery(getClient(), actor, ownerId, docId);
    }
}

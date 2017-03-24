package com.vk.api.sdk.queries.docs;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.docs.Doc;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Docs.save method
 */
public class DocsSaveQuery extends AbstractQueryBuilder<DocsSaveQuery, List<Doc>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param file   value of "file" parameter.
     */
    public DocsSaveQuery(VkApiClient client, UserActor actor, String file) {
        super(client, "docs.save", Utils.buildParametrizedType(List.class, Doc.class));
        accessToken(actor.getAccessToken());
        file(file);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param file   value of "file" parameter.
     */
    public DocsSaveQuery(VkApiClient client, GroupActor actor, String file) {
        super(client, "docs.save", Utils.buildParametrizedType(List.class, Doc.class));
        accessToken(actor.getAccessToken());
        file(file);
    }

    /**
     * This parameter is returned when the file is uploaded to the server.
     *
     * @param value value of "file" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected DocsSaveQuery file(String value) {
        return unsafeParam("file", value);
    }

    /**
     * Document title.
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DocsSaveQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * Document tags.
     *
     * @param value value of "tags" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DocsSaveQuery tags(String value) {
        return unsafeParam("tags", value);
    }

    @Override
    protected DocsSaveQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("file", "access_token");
    }
}

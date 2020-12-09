package com.vk.api.sdk.queries.docs;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.docs.responses.SaveResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Docs.save method
 */
public class DocsSaveQuery extends AbstractQueryBuilder<DocsSaveQuery, SaveResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param file value of "file" parameter.
     */
    public DocsSaveQuery(VkApiClient client, UserActor actor, String file) {
        super(client, "docs.save", SaveResponse.class);
        accessToken(actor.getAccessToken());
        file(file);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param file value of "file" parameter.
     */
    public DocsSaveQuery(VkApiClient client, GroupActor actor, String file) {
        super(client, "docs.save", SaveResponse.class);
        accessToken(actor.getAccessToken());
        file(file);
    }

    /**
     * This parameter is returned when the file is [vk.com/dev/upload_files_2|uploaded to the server].
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

    /**
     * Set return tags
     *
     * @param value value of "return tags" parameter. By default false.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DocsSaveQuery returnTags(Boolean value) {
        return unsafeParam("return_tags", value);
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

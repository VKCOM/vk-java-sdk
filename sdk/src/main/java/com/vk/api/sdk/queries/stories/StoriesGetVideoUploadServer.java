package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.stories.responses.GetVideoUploadServerResponse;
import java.util.Arrays;
import java.util.List;

public class StoriesGetVideoUploadServer extends AbstractQueryBuilder<StoriesGetVideoUploadServer, GetVideoUploadServerResponse> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   user actor with access token
     */
    public StoriesGetVideoUploadServer(VkApiClient client, UserActor actor) {
        super(client, "stories.getVideoUploadServer", GetVideoUploadServerResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   group actor with access token
     */
    public StoriesGetVideoUploadServer(VkApiClient client, GroupActor actor) {
        super(client, "stories.getVideoUploadServer", GetVideoUploadServerResponse.class);
        accessToken(actor.getAccessToken());
    }

    public StoriesGetVideoUploadServer addToNews(Boolean value) {
        return unsafeParam("add_to_news", value);
    }

    public StoriesGetVideoUploadServer userIds(List<Integer> value) {
        return unsafeParam("user_ids", value);
    }

    public StoriesGetVideoUploadServer reply_to_story(String value) {
        return unsafeParam("reply_to_story", value);
    }

    public StoriesGetVideoUploadServer linkText(String value) {
        return unsafeParam("link_text", value);
    }

    public StoriesGetVideoUploadServer linkUrl(String value) {
        return unsafeParam("link_url", value);
    }

    public StoriesGetVideoUploadServer group_id(Integer value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected StoriesGetVideoUploadServer getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

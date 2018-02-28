package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.stories.LinkText;
import com.vk.api.sdk.objects.stories.responses.GetPhotoUploadServerResponse;
import java.util.Arrays;
import java.util.List;

public class StoriesGetPhotoUploadServer extends AbstractQueryBuilder<StoriesGetPhotoUploadServer, GetPhotoUploadServerResponse> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   user actor with access token
     */
    public StoriesGetPhotoUploadServer(VkApiClient client, UserActor actor) {
        super(client, "stories.getPhotoUploadServer", GetPhotoUploadServerResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   group actor with access token
     */
    public StoriesGetPhotoUploadServer(VkApiClient client, GroupActor actor) {
        super(client, "stories.getPhotoUploadServer", GetPhotoUploadServerResponse.class);
        accessToken(actor.getAccessToken());
    }

    public StoriesGetPhotoUploadServer addToNews(Boolean value) {
        return unsafeParam("add_to_news", value);
    }

    public StoriesGetPhotoUploadServer userIds(List<Integer> value) {
        return unsafeParam("user_ids", value);
    }

    public StoriesGetPhotoUploadServer replyToStory(String value) {
        return unsafeParam("reply_to_story", value);
    }

    public StoriesGetPhotoUploadServer linkText(LinkText value) {
        return unsafeParam("link_text", value);
    }

    public StoriesGetPhotoUploadServer linkUrl(String value) {
        return unsafeParam("link_url", value);
    }

    public StoriesGetPhotoUploadServer groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected StoriesGetPhotoUploadServer getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

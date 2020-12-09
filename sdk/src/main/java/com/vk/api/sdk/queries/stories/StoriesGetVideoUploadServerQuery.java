package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.stories.UploadLinkText;
import com.vk.api.sdk.objects.stories.responses.GetVideoUploadServerResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Stories.getVideoUploadServer method
 */
public class StoriesGetVideoUploadServerQuery extends AbstractQueryBuilder<StoriesGetVideoUploadServerQuery, GetVideoUploadServerResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StoriesGetVideoUploadServerQuery(VkApiClient client, UserActor actor) {
        super(client, "stories.getVideoUploadServer", GetVideoUploadServerResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StoriesGetVideoUploadServerQuery(VkApiClient client, GroupActor actor) {
        super(client, "stories.getVideoUploadServer", GetVideoUploadServerResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
    }

    /**
     * 1 — to add the story to friend's feed.
     *
     * @param value value of "add to news" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesGetVideoUploadServerQuery addToNews(Boolean value) {
        return unsafeParam("add_to_news", value);
    }

    /**
     * ID of the story to reply with the current.
     *
     * @param value value of "reply to story" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesGetVideoUploadServerQuery replyToStory(String value) {
        return unsafeParam("reply_to_story", value);
    }

    /**
     * Link text (for community's stories only).
     *
     * @param value value of "link text" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesGetVideoUploadServerQuery linkText(UploadLinkText value) {
        return unsafeParam("link_text", value);
    }

    /**
     * Link URL. Internal links on https://vk.com only.
     *
     * @param value value of "link url" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesGetVideoUploadServerQuery linkUrl(String value) {
        return unsafeParam("link_url", value);
    }

    /**
     * ID of the community to upload the story (should be verified or with the "fire" icon).
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesGetVideoUploadServerQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set clickable stickers
     *
     * @param value value of "clickable stickers" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesGetVideoUploadServerQuery clickableStickers(String value) {
        return unsafeParam("clickable_stickers", value);
    }

    /**
     * user_ids
     * List of users IDs who can see the story.
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesGetVideoUploadServerQuery userIds(Integer... value) {
        return unsafeParam("user_ids", value);
    }

    /**
     * List of users IDs who can see the story.
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesGetVideoUploadServerQuery userIds(List<Integer> value) {
        return unsafeParam("user_ids", value);
    }

    @Override
    protected StoriesGetVideoUploadServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

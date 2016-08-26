package com.vk.api.sdk.queries.likes;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.likes.responses.AddResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Likes.add method
 */
public class LikesAddQuery extends AbstractQueryBuilder<LikesAddQuery, AddResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param type   value of "type" parameter.
     * @param itemId value of "item id" parameter. Minimum is 0.
     */
    public LikesAddQuery(VkApiClient client, Actor actor, String type, int itemId) {
        super(client, "likes.add", AddResponse.class);
        accessToken(actor.getAccessToken());
        type(type);
        itemId(itemId);
    }

    /**
     * &lt;&#33;-- MIKHAIL (1 of 2): Original Russian has additional types--
     * photo_comment - ÐºÐ¾Ð¼Ð¼ÐµÐ½Ñ�Ð°Ñ�Ð¸Ð¹ Ðº Ñ�Ð¾Ñ�Ð¾Ð³Ñ�Ð°Ñ�Ð¸Ð¸;
     * video_comment - ÐºÐ¾Ð¼Ð¼ÐµÐ½Ñ�Ð°Ñ�Ð¸Ð¹ Ðº Ð²Ð¸Ð´ÐµÐ¾Ð·Ð°Ð¿Ð¸Ñ�Ð¸;
     * topic_comment - ÐºÐ¾Ð¼Ð¼ÐµÐ½Ñ�Ð°Ñ�Ð¸Ð¹ Ð² Ð¾Ð±Ñ�Ñ�Ð¶Ð´ÐµÐ½Ð¸Ð¸;
     * Jeff added them in here using Google Translate. Are they OK? --&gt;Object type:
     * ''post'' - post on user or community wall
     * ''comment'' - comment on a wall post
     * ''photo'' - photo
     * ''audio'' - audio
     * ''video'' - video
     * ''note'' - note
     * ''photo_comment'' - comment on the photo
     * ''video_comment'' - comment on the video
     * ''topic_comment'' - comment in the discussion
     * ''sitepage'' - page of the site where the Like widget is installed
     *
     * @param value value of "type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected LikesAddQuery type(String value) {
        return unsafeParam("type", value);
    }

    /**
     * ID of the user or community that owns the object.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LikesAddQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Object ID.
     *
     * @param value value of "item id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected LikesAddQuery itemId(int value) {
        return unsafeParam("item_id", value);
    }

    /**
     * Access key required for an object owned by a private entity.
     *
     * @param value value of "access key" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LikesAddQuery accessKey(String value) {
        return unsafeParam("access_key", value);
    }

    @Override
    protected LikesAddQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("item_id", "type", "access_token");
    }
}

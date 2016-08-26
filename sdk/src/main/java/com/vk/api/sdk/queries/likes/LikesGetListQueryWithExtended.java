package com.vk.api.sdk.queries.likes;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.likes.responses.GetListExtendedResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Likes.getList method
 */
public class LikesGetListQueryWithExtended extends AbstractQueryBuilder<LikesGetListQueryWithExtended, GetListExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param type   value of "type" parameter.
     */
    public LikesGetListQueryWithExtended(VkApiClient client, Actor actor, String type) {
        super(client, "likes.getList", GetListExtendedResponse.class);
        accessToken(actor.getAccessToken());
        type(type);
        extended(true);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param type   value of "type" parameter.
     */
    public LikesGetListQueryWithExtended(VkApiClient client, String type) {
        super(client, "likes.getList", GetListExtendedResponse.class);
        type(type);
        extended(true);
    }

    /**
     * &lt;&#33;-- MIKHAIL (1 of 6): Original Russian has additional types--
     * photo_comment - ÐºÐ¾Ð¼Ð¼ÐµÐ½Ñ�Ð°Ñ�Ð¸Ð¹ Ðº Ñ�Ð¾Ñ�Ð¾Ð³Ñ�Ð°Ñ�Ð¸Ð¸;
     * video_comment - ÐºÐ¾Ð¼Ð¼ÐµÐ½Ñ�Ð°Ñ�Ð¸Ð¹ Ðº Ð²Ð¸Ð´ÐµÐ¾Ð·Ð°Ð¿Ð¸Ñ�Ð¸;
     * topic_comment - ÐºÐ¾Ð¼Ð¼ÐµÐ½Ñ�Ð°Ñ�Ð¸Ð¹ Ð² Ð¾Ð±Ñ�Ñ�Ð¶Ð´ÐµÐ½Ð¸Ð¸;
     * Jeff added them in here using Google Translate. Are they OK? --&gt;
     * Object type:
     * ''post'' - post on user or community wall
     * ''comment'' - comment on a wall post
     * ''photo'' - photo
     * ''audio'' - audio
     * ''video'' - video
     * ''note'' - note
     * ''photo_comment'' - comment on the photo
     * ''video_comment'' - comment on the video
     * ''topic_comment'' - comment in the discussion
     * ''sitepage'' - page of the site where the Like widget is installed
     *
     * @param value value of "type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected LikesGetListQueryWithExtended type(String value) {
        return unsafeParam("type", value);
    }

    /**
     * ID of the user, community, or application that owns the object. If the "type" parameter is set as ''sitepage'', the application ID is passed as "owner_id". Use negative value for a community id. If the "type" parameter is not set, the "owner_id" is assumed to be either the current user or the same application ID as if the "type" parameter was set to ''sitepage''.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LikesGetListQueryWithExtended ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Object ID. If "type" is set as ''sitepage'', "item_id" can include the "page_id" parameter value used during initialization of the Like widget.
     *
     * @param value value of "item id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LikesGetListQueryWithExtended itemId(Integer value) {
        return unsafeParam("item_id", value);
    }

    /**
     * URL of the page where the Like widget is installed. Used instead of the "item_id" parameter.
     *
     * @param value value of "page url" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LikesGetListQueryWithExtended pageUrl(String value) {
        return unsafeParam("page_url", value);
    }

    /**
     * Filters to apply:
     * ''likes'' - returns information about all users who liked the object (default)
     * ''copies'' - returns information only about users who told their friends about the object
     *
     * @param value value of "filter" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LikesGetListQueryWithExtended filter(String value) {
        return unsafeParam("filter", value);
    }

    /**
     * Specifies which users are returned:
     * ''1'' - to return only the current user's friends
     * ''0'' - to return all users (default)
     *
     * @param value value of "friends only" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LikesGetListQueryWithExtended friendsOnly(Boolean value) {
        return unsafeParam("friends_only", value);
    }

    /**
     * Specifies whether extended information will be returned.
     * ''1'' - to return extended information about users and communities from the "Likes" list
     * ''0'' - to return no additional information (default)
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected LikesGetListQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Offset needed to select a specific subset of users.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LikesGetListQueryWithExtended offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of user IDs to return (maximum ''1000'').
     * Default is ''100'' if "friends_only" is set to  ''0''; otherwise, the default is ''10'' if "friends_only" is set to ''1''.
     *
     * @param value value of "count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LikesGetListQueryWithExtended count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Set skip own
     *
     * @param value value of "skip own" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LikesGetListQueryWithExtended skipOwn(Boolean value) {
        return unsafeParam("skip_own", value);
    }

    @Override
    protected LikesGetListQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("type");
    }
}

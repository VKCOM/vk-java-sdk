package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.setCallbackSettings method
 */
public class GroupsSetCallbackSettingsQuery extends AbstractQueryBuilder<GroupsSetCallbackSettingsQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public GroupsSetCallbackSettingsQuery(VkApiClient client, Actor actor, int groupId) {
        super(client, "groups.setCallbackSettings", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsSetCallbackSettingsQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * New messages notificaitions (''0'' - disabled, ''1'' - enabled).
     *
     * @param value value of "message new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery messageNew(Boolean value) {
        return unsafeParam("message_new", value);
    }

    /**
     * New photos notificaitions (''0'' - disabled, ''1'' - enabled).
     *
     * @param value value of "photo new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery photoNew(Boolean value) {
        return unsafeParam("photo_new", value);
    }

    /**
     * New audios notificaitions (''0'' - disabled, ''1'' - enabled).
     *
     * @param value value of "audio new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery audioNew(Boolean value) {
        return unsafeParam("audio_new", value);
    }

    /**
     * New videos notificaitions (''0'' - disabled, ''1'' - enabled).
     *
     * @param value value of "video new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery videoNew(Boolean value) {
        return unsafeParam("video_new", value);
    }

    /**
     * New wall replies notificaitions (''0'' - disabled, ''1'' - enabled).
     *
     * @param value value of "wall reply new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery wallReplyNew(Boolean value) {
        return unsafeParam("wall_reply_new", value);
    }

    /**
     * Wall replies edited notificaitions (''0'' - disabled, ''1'' - enabled).
     *
     * @param value value of "wall reply edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery wallReplyEdit(Boolean value) {
        return unsafeParam("wall_reply_edit", value);
    }

    /**
     * New wall posts notificaitions (''0'' - disabled, ''1'' - enabled).
     *
     * @param value value of "wall post new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery wallPostNew(Boolean value) {
        return unsafeParam("wall_post_new", value);
    }

    /**
     * New board posts notificaitions (''0'' - disabled, ''1'' - enabled).
     *
     * @param value value of "board post new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery boardPostNew(Boolean value) {
        return unsafeParam("board_post_new", value);
    }

    /**
     * Board posts edited notificaitions (''0'' - disabled, ''1'' - enabled).
     *
     * @param value value of "board post edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery boardPostEdit(Boolean value) {
        return unsafeParam("board_post_edit", value);
    }

    /**
     * Board posts restored notificaitions (''0'' - disabled, ''1'' - enabled).
     *
     * @param value value of "board post restore" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery boardPostRestore(Boolean value) {
        return unsafeParam("board_post_restore", value);
    }

    /**
     * Board posts deleted notificaitions (''0'' - disabled, ''1'' - enabled).
     *
     * @param value value of "board post delete" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery boardPostDelete(Boolean value) {
        return unsafeParam("board_post_delete", value);
    }

    /**
     * New comment to photo notificaitions (''0'' - disabled, ''1'' - enabled).
     *
     * @param value value of "photo comment new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery photoCommentNew(Boolean value) {
        return unsafeParam("photo_comment_new", value);
    }

    /**
     * New comment to video notificaitions (''0'' - disabled, ''1'' - enabled).
     *
     * @param value value of "video comment new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery videoCommentNew(Boolean value) {
        return unsafeParam("video_comment_new", value);
    }

    /**
     * New comment to market item notificaitions (''0'' - disabled, ''1'' - enabled).
     *
     * @param value value of "market comment new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery marketCommentNew(Boolean value) {
        return unsafeParam("market_comment_new", value);
    }

    /**
     * Joined community notificaitions (''0'' - disabled, ''1'' - enabled).
     *
     * @param value value of "group join" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery groupJoin(Boolean value) {
        return unsafeParam("group_join", value);
    }

    /**
     * Left community notificaitions (''0'' - disabled, ''1'' - enabled).
     *
     * @param value value of "group leave" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery groupLeave(Boolean value) {
        return unsafeParam("group_leave", value);
    }

    @Override
    protected GroupsSetCallbackSettingsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}

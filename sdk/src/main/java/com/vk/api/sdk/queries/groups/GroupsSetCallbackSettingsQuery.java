package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Query for {@link com.vk.api.sdk.actions.Groups#setCallbackSettings} method
 */
public class GroupsSetCallbackSettingsQuery extends AbstractQueryBuilder<GroupsSetCallbackSettingsQuery, OkResponse> {
    /**
     * {@code HasSet} of {@code CallbackFlag}s representing all events for which Callback should be sent.
     */
    private Set<CallbackFlag> flags = new HashSet<>();

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public GroupsSetCallbackSettingsQuery(VkApiClient client, UserActor actor, int groupId, int serverId) {
        super(client, "groups.setCallbackSettings", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        serverId(serverId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     * @param flags flags which should be added (set to {@code true})
     */
    public GroupsSetCallbackSettingsQuery(VkApiClient client, UserActor actor, int groupId, int serverId, CallbackFlag... flags) {
        super(client, "groups.setCallbackSettings", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        serverId(serverId);
        setFlags(flags);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public GroupsSetCallbackSettingsQuery(VkApiClient client, GroupActor actor, int serverId) {
        super(client, "groups.setCallbackSettings", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        serverId(serverId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param flags flags which should be added (set to {@code true})
     */
    public GroupsSetCallbackSettingsQuery(VkApiClient client, GroupActor actor, int serverId, CallbackFlag... flags) {
        super(client, "groups.setCallbackSettings", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        serverId(serverId);
        setFlags(flags);
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
     * Server ID.
     *
     * @param value value of "server id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsSetCallbackSettingsQuery serverId(int value) {
        return unsafeParam("server_id", value);
    }

    /**
     * New messages notifications.
     *
     * @param value value of "message new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery messageNew(Boolean value) {
        return setFlag(CallbackFlag.MESSAGE_NEW, value);
    }

    /**
     * Reply messages notifications.
     *
     * @param value value of "message new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery messageReply(Boolean value) {
        return setFlag(CallbackFlag.MESSAGE_REPLY, value);
    }

    /**
     * Allow messages notifications.
     *
     * @param value value of "message new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery messageAllow(Boolean value) {
        return setFlag(CallbackFlag.MESSAGE_ALLOW, value);
    }

    /**
     * Deny messages notifications.
     *
     * @param value value of "message new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery messageDeny(Boolean value) {
        return setFlag(CallbackFlag.MESSAGE_DENY, value);
    }

    /**
     * New photos notifications.
     *
     * @param value value of "photo new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery photoNew(Boolean value) {
        return setFlag(CallbackFlag.PHOTO_NEW, value);
    }

    /**
     * New audios notifications.
     *
     * @param value value of "audio new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery audioNew(Boolean value) {
        return setFlag(CallbackFlag.AUDIO_NEW, value);
    }

    /**
     * New videos notifications.
     *
     * @param value value of "video new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery videoNew(Boolean value) {
        return setFlag(CallbackFlag.VIDEO_NEW, value);
    }

    /**
     * New wall replies notifications.
     *
     * @param value value of "wall reply new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery wallReplyNew(Boolean value) {
        return setFlag(CallbackFlag.WALL_REPLY_NEW, value);
    }

    /**
     * Wall replies edited notifications.
     *
     * @param value value of "wall reply edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery wallReplyEdit(Boolean value) {
        return setFlag(CallbackFlag.WALL_REPLY_EDIT, value);
    }

    /**
     * Wall replies deleted notifications.
     *
     * @param value value of "wall reply delete" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery wallReplyDelete(Boolean value) {
        return setFlag(CallbackFlag.WALL_REPLY_DELETE, value);
    }

    /**
     * Wall replies restored notifications.
     *
     * @param value value of "wall reply restore" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery wallReplyRestore(Boolean value) {
        return setFlag(CallbackFlag.WALL_REPLY_RESTORE, value);
    }

    /**
     * New wall posts notifications.
     *
     * @param value value of "wall post new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery wallPostNew(Boolean value) {
        return setFlag(CallbackFlag.WALL_POST_NEW, value);
    }

    /**
     * Wall repost notifications.
     *
     * @param value value of "wall post new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery wallRepost(Boolean value) {
        return setFlag(CallbackFlag.WALL_REPOST, value);
    }

    /**
     * New board posts notifications.
     *
     * @param value value of "board post new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery boardPostNew(Boolean value) {
        return setFlag(CallbackFlag.BOARD_POST_NEW, value);
    }

    /**
     * Board posts edited notifications.
     *
     * @param value value of "board post edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery boardPostEdit(Boolean value) {
        return setFlag(CallbackFlag.BOARD_POST_EDIT, value);
    }

    /**
     * Board posts restored notifications.
     *
     * @param value value of "board post restore" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery boardPostRestore(Boolean value) {
        return setFlag(CallbackFlag.BOARD_POST_RESTORE, value);
    }

    /**
     * Board posts deleted notifications.
     *
     * @param value value of "board post delete" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery boardPostDelete(Boolean value) {
        return setFlag(CallbackFlag.BOARD_POST_DELETE, value);
    }

    /**
     * New comment to photo notifications.
     *
     * @param value value of "photo comment new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery photoCommentNew(Boolean value) {
        return setFlag(CallbackFlag.PHOTO_COMMENT_NEW, value);
    }

    /**
     * Photo comments edited notifications.
     *
     * @param value value of "photo comment edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery photoCommentEdit(Boolean value) {
        return setFlag(CallbackFlag.PHOTO_COMMENT_EDIT, value);
    }

    /**
     * Photo comments deleted notifications.
     *
     * @param value value of "photo comment delete" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery photoCommentDelete(Boolean value) {
        return setFlag(CallbackFlag.PHOTO_COMMENT_DELETE, value);
    }

    /**
     * Photo comments restored notifications.
     *
     * @param value value of "photo comment restore" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery photoCommentRestore(Boolean value) {
        return setFlag(CallbackFlag.PHOTO_COMMENT_RESTORE, value);
    }

    /**
     * New comment to video notifications.
     *
     * @param value value of "video comment new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery videoCommentNew(Boolean value) {
        return setFlag(CallbackFlag.VIDEO_COMMENT_NEW, value);
    }

    /**
     * Video comments edited notifications.
     *
     * @param value value of "video comment edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery videoCommentEdit(Boolean value) {
        return setFlag(CallbackFlag.VIDEO_COMMENT_EDIT, value);
    }

    /**
     * Video comments deleted notifications.
     *
     * @param value value of "video comment delete" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery videoCommentDelete(Boolean value) {
        return setFlag(CallbackFlag.VIDEO_COMMENT_DELETE, value);
    }

    /**
     * Video comments restored notifications.
     *
     * @param value value of "video comment restore" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery videoCommentRestore(Boolean value) {
        return setFlag(CallbackFlag.VIDEO_COMMENT_RESTORE, value);
    }

    /**
     * New comment to market item notifications.
     *
     * @param value value of "market comment new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery marketCommentNew(Boolean value) {
        return setFlag(CallbackFlag.MARKET_COMMENT_NEW, value);
    }

    /**
     * Market comments edited notifications.
     *
     * @param value value of "market comment edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery marketCommentEdit(Boolean value) {
        return setFlag(CallbackFlag.MARKET_COMMENT_EDIT, value);
    }

    /**
     * Market comments deleted notifications.
     *
     * @param value value of "market comment delete" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery marketCommentDelete(Boolean value) {
        return setFlag(CallbackFlag.MARKET_COMMENT_DELETE, value);
    }

    /**
     * Market comments restored notifications.
     *
     * @param value value of "market comment restore" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery marketCommentRestore(Boolean value) {
        return setFlag(CallbackFlag.MARKET_COMMENT_RESTORE, value);
    }

    /**
     * New poll vote notifications.
     *
     * @param value value of "poll vote new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery pollVoteNew(Boolean value) {
        return setFlag(CallbackFlag.POLL_VOTE_NEW, value);
    }

    /**
     * Joined community notifications.
     *
     * @param value value of "group join" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery groupJoin(Boolean value) {
        return setFlag(CallbackFlag.GROUP_JOIN, value);
    }

    /**
     * Left community notifications.
     *
     * @param value value of "group leave" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery groupLeave(Boolean value) {
        return setFlag(CallbackFlag.GROUP_LEAVE, value);
    }

    /**
     * Group settings changed notifications.
     *
     * @param value value of "group change settings" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery groupChangeSettings(Boolean value) {
        return setFlag(CallbackFlag.GROUP_CHANGE_SETTINGS, value);
    }

    /**
     * Group photo changed notifications.
     *
     * @param value value of "group change photo" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery groupChangePhoto(Boolean value) {
        return setFlag(CallbackFlag.GROUP_CHANGE_PHOTO, value);
    }

    /**
     * Group officers edited notifications.
     *
     * @param value value of "group officers edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @Deprecated
    public GroupsSetCallbackSettingsQuery groupOfficersEdit(Boolean value) {
        return setFlag(CallbackFlag.GROUP_OFFICERS_EDIT, value);
    }

    /**
     * Adds all given {@code CallbackFlag}s to the Set of this {@code GroupsSetCallbackSettingsQuery}`s flags
     *
     * @param flags flags which should be added (set to {@code true})
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery addFlags(CallbackFlag... flags) {
        this.flags.addAll(Arrays.asList(flags));
        return updateUnsafeParamsWithFlags();
    }

    /**
     * Removes all given {@code CallbackFlag}s from Set of this {@code GroupsSetCallbackSettingsQuery}`s flags
     *
     * @param flags flags which should be removed (set to {@code false})
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery removeFlags(CallbackFlag... flags) {
        this.flags.removeAll(Arrays.asList(flags));
        return updateUnsafeParamsWithFlags();
    }

    /**
     * Sets the given {@code CallbackFlag} to the {@code Boolean} value given
     *
     * @param flag flag to be updated
     * @param value value to which update the flag
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery setFlag(CallbackFlag flag, Boolean value) {
        if (value) flags.add(flag);
        else flags.remove(flag);
        return unsafeParam(flag.unsafeKey, value);
    }

    /**
     * Clears the Set of {@code CallBackFlag}s and adds all flags given
     *
     * @param flags flags which should be added (set to {@code true})
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery setFlags(CallbackFlag... flags) {
        this.flags = new HashSet<>(Arrays.asList(flags));
        return updateUnsafeParamsWithFlags();
    }

    /**
     * Clears the Set of {@code CallBackFlag}s which is similar to setting all flags to {@code false}
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery clearFlags() {
        this.flags.clear();
        return updateUnsafeParamsWithFlags();
    }

    /**
     * Gets the Set of all flags set to {@code true} for this {@code GroupsSetCallbackSettingsQuery}
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public Set<CallbackFlag> getFlags() {
        return flags;
    }

    /**
     * Updates unsafe params for all existing flags
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    private GroupsSetCallbackSettingsQuery updateUnsafeParamsWithFlags() {
        for (CallbackFlag flag : CallbackFlag.values()) unsafeParam(flag.unsafeKey, flags.contains(flag));
        return getThis();
    }

    enum CallbackFlag {
        MESSAGE_NEW("message_new"),
        MESSAGE_REPLY("message_reply"),
        MESSAGE_ALLOW("message_allow"),
        MESSAGE_DENY("message_deny"),
        PHOTO_NEW("photo_new"),
        AUDIO_NEW("audio_new"),
        VIDEO_NEW("video_new"),
        WALL_REPLY_NEW("wall_reply_new"),
        WALL_REPLY_EDIT("wall_reply_edit"),
        WALL_REPLY_DELETE("wall_reply_delete"),
        WALL_REPLY_RESTORE("wall_reply_restore"),
        WALL_POST_NEW("wall_post_new"),
        WALL_REPOST("wall_repost"),
        BOARD_POST_NEW("board_post_new"),
        BOARD_POST_EDIT("board_post_edit"),
        BOARD_POST_RESTORE("board_post_restore"),
        BOARD_POST_DELETE("board_post_delete"),
        PHOTO_COMMENT_NEW("photo_comment_new"),
        PHOTO_COMMENT_EDIT("photo_comment_edit"),
        PHOTO_COMMENT_DELETE("photo_comment_delete"),
        PHOTO_COMMENT_RESTORE("photo_comment_restore"),
        VIDEO_COMMENT_NEW("video_comment_new"),
        VIDEO_COMMENT_EDIT("video_comment_edit"),
        VIDEO_COMMENT_DELETE("video_comment_delete"),
        VIDEO_COMMENT_RESTORE("video_comment_restore"),
        MARKET_COMMENT_NEW("market_comment_new"),
        MARKET_COMMENT_EDIT("market_comment_edit"),
        MARKET_COMMENT_DELETE("market_comment_delete"),
        MARKET_COMMENT_RESTORE("market_comment_restore"),
        POLL_VOTE_NEW("poll_vote_new"),
        GROUP_JOIN("group_join"),
        GROUP_LEAVE("group_leave"),
        GROUP_CHANGE_SETTINGS("group_change_settings"),
        GROUP_CHANGE_PHOTO("group_change_photo"),
        GROUP_OFFICERS_EDIT("group_officers_edit");

        private String unsafeKey;

        CallbackFlag(String unsafeKey) {
            this.unsafeKey = unsafeKey;
        }

        public String getUnsafeKey() {
            return unsafeKey;
        }
    }


    @Override
    protected GroupsSetCallbackSettingsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "server_id", "access_token");
    }
}

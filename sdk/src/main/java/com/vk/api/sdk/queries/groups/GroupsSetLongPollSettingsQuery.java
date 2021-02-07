package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.setLongPollSettings method
 */
public class GroupsSetLongPollSettingsQuery extends AbstractQueryBuilder<GroupsSetLongPollSettingsQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public GroupsSetLongPollSettingsQuery(VkApiClient client, UserActor actor, int groupId) {
        super(client, "groups.setLongPollSettings", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public GroupsSetLongPollSettingsQuery(VkApiClient client, GroupActor actor, int groupId) {
        super(client, "groups.setLongPollSettings", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        groupId(groupId);
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsSetLongPollSettingsQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Sets whether Long Poll is enabled ('0' — disabled, '1' — enabled).
     *
     * @param value value of "enabled" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery enabled(Boolean value) {
        return unsafeParam("enabled", value);
    }

    /**
     * Set api version
     *
     * @param value value of "api version" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery apiVersion(String value) {
        return unsafeParam("api_version", value);
    }

    /**
     * A new incoming message has been received ('0' — disabled, '1' — enabled).
     *
     * @param value value of "message new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery messageNew(Boolean value) {
        return unsafeParam("message_new", value);
    }

    /**
     * A new outcoming message has been received ('0' — disabled, '1' — enabled).
     *
     * @param value value of "message reply" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery messageReply(Boolean value) {
        return unsafeParam("message_reply", value);
    }

    /**
     * Allowed messages notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "message allow" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery messageAllow(Boolean value) {
        return unsafeParam("message_allow", value);
    }

    /**
     * Denied messages notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "message deny" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery messageDeny(Boolean value) {
        return unsafeParam("message_deny", value);
    }

    /**
     * A message has been edited ('0' — disabled, '1' — enabled).
     *
     * @param value value of "message edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery messageEdit(Boolean value) {
        return unsafeParam("message_edit", value);
    }

    /**
     * Set message typing state
     *
     * @param value value of "message typing state" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery messageTypingState(Boolean value) {
        return unsafeParam("message_typing_state", value);
    }

    /**
     * New photos notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "photo new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery photoNew(Boolean value) {
        return unsafeParam("photo_new", value);
    }

    /**
     * New audios notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "audio new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery audioNew(Boolean value) {
        return unsafeParam("audio_new", value);
    }

    /**
     * New videos notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "video new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery videoNew(Boolean value) {
        return unsafeParam("video_new", value);
    }

    /**
     * New wall replies notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "wall reply new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery wallReplyNew(Boolean value) {
        return unsafeParam("wall_reply_new", value);
    }

    /**
     * Wall replies edited notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "wall reply edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery wallReplyEdit(Boolean value) {
        return unsafeParam("wall_reply_edit", value);
    }

    /**
     * A wall comment has been deleted ('0' — disabled, '1' — enabled).
     *
     * @param value value of "wall reply delete" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery wallReplyDelete(Boolean value) {
        return unsafeParam("wall_reply_delete", value);
    }

    /**
     * A wall comment has been restored ('0' — disabled, '1' — enabled).
     *
     * @param value value of "wall reply restore" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery wallReplyRestore(Boolean value) {
        return unsafeParam("wall_reply_restore", value);
    }

    /**
     * New wall posts notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "wall post new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery wallPostNew(Boolean value) {
        return unsafeParam("wall_post_new", value);
    }

    /**
     * New wall posts notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "wall repost" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery wallRepost(Boolean value) {
        return unsafeParam("wall_repost", value);
    }

    /**
     * New board posts notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "board post new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery boardPostNew(Boolean value) {
        return unsafeParam("board_post_new", value);
    }

    /**
     * Board posts edited notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "board post edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery boardPostEdit(Boolean value) {
        return unsafeParam("board_post_edit", value);
    }

    /**
     * Board posts restored notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "board post restore" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery boardPostRestore(Boolean value) {
        return unsafeParam("board_post_restore", value);
    }

    /**
     * Board posts deleted notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "board post delete" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery boardPostDelete(Boolean value) {
        return unsafeParam("board_post_delete", value);
    }

    /**
     * New comment to photo notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "photo comment new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery photoCommentNew(Boolean value) {
        return unsafeParam("photo_comment_new", value);
    }

    /**
     * A photo comment has been edited ('0' — disabled, '1' — enabled).
     *
     * @param value value of "photo comment edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery photoCommentEdit(Boolean value) {
        return unsafeParam("photo_comment_edit", value);
    }

    /**
     * A photo comment has been deleted ('0' — disabled, '1' — enabled).
     *
     * @param value value of "photo comment delete" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery photoCommentDelete(Boolean value) {
        return unsafeParam("photo_comment_delete", value);
    }

    /**
     * A photo comment has been restored ('0' — disabled, '1' — enabled).
     *
     * @param value value of "photo comment restore" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery photoCommentRestore(Boolean value) {
        return unsafeParam("photo_comment_restore", value);
    }

    /**
     * New comment to video notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "video comment new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery videoCommentNew(Boolean value) {
        return unsafeParam("video_comment_new", value);
    }

    /**
     * A video comment has been edited ('0' — disabled, '1' — enabled).
     *
     * @param value value of "video comment edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery videoCommentEdit(Boolean value) {
        return unsafeParam("video_comment_edit", value);
    }

    /**
     * A video comment has been deleted ('0' — disabled, '1' — enabled).
     *
     * @param value value of "video comment delete" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery videoCommentDelete(Boolean value) {
        return unsafeParam("video_comment_delete", value);
    }

    /**
     * A video comment has been restored ('0' — disabled, '1' — enabled).
     *
     * @param value value of "video comment restore" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery videoCommentRestore(Boolean value) {
        return unsafeParam("video_comment_restore", value);
    }

    /**
     * New comment to market item notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "market comment new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery marketCommentNew(Boolean value) {
        return unsafeParam("market_comment_new", value);
    }

    /**
     * A market comment has been edited ('0' — disabled, '1' — enabled).
     *
     * @param value value of "market comment edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery marketCommentEdit(Boolean value) {
        return unsafeParam("market_comment_edit", value);
    }

    /**
     * A market comment has been deleted ('0' — disabled, '1' — enabled).
     *
     * @param value value of "market comment delete" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery marketCommentDelete(Boolean value) {
        return unsafeParam("market_comment_delete", value);
    }

    /**
     * A market comment has been restored ('0' — disabled, '1' — enabled).
     *
     * @param value value of "market comment restore" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery marketCommentRestore(Boolean value) {
        return unsafeParam("market_comment_restore", value);
    }

    /**
     * A vote in a public poll has been added ('0' — disabled, '1' — enabled).
     *
     * @param value value of "poll vote new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery pollVoteNew(Boolean value) {
        return unsafeParam("poll_vote_new", value);
    }

    /**
     * Joined community notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "group join" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery groupJoin(Boolean value) {
        return unsafeParam("group_join", value);
    }

    /**
     * Left community notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "group leave" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery groupLeave(Boolean value) {
        return unsafeParam("group_leave", value);
    }

    /**
     * Set group change settings
     *
     * @param value value of "group change settings" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery groupChangeSettings(Boolean value) {
        return unsafeParam("group_change_settings", value);
    }

    /**
     * Set group change photo
     *
     * @param value value of "group change photo" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery groupChangePhoto(Boolean value) {
        return unsafeParam("group_change_photo", value);
    }

    /**
     * Set group officers edit
     *
     * @param value value of "group officers edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery groupOfficersEdit(Boolean value) {
        return unsafeParam("group_officers_edit", value);
    }

    /**
     * User added to community blacklist
     *
     * @param value value of "user block" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery userBlock(Boolean value) {
        return unsafeParam("user_block", value);
    }

    /**
     * User removed from community blacklist
     *
     * @param value value of "user unblock" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery userUnblock(Boolean value) {
        return unsafeParam("user_unblock", value);
    }

    /**
     * Set like add
     *
     * @param value value of "like add" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery likeAdd(Boolean value) {
        return unsafeParam("like_add", value);
    }

    /**
     * Set like remove
     *
     * @param value value of "like remove" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery likeRemove(Boolean value) {
        return unsafeParam("like_remove", value);
    }

    /**
     * Set message event
     *
     * @param value value of "message event" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery messageEvent(Boolean value) {
        return unsafeParam("message_event", value);
    }

    /**
     * Set donut subscription create
     *
     * @param value value of "donut subscription create" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery donutSubscriptionCreate(Boolean value) {
        return unsafeParam("donut_subscription_create", value);
    }

    /**
     * Set donut subscription prolonged
     *
     * @param value value of "donut subscription prolonged" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery donutSubscriptionProlonged(Boolean value) {
        return unsafeParam("donut_subscription_prolonged", value);
    }

    /**
     * Set donut subscription cancelled
     *
     * @param value value of "donut subscription cancelled" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery donutSubscriptionCancelled(Boolean value) {
        return unsafeParam("donut_subscription_cancelled", value);
    }

    /**
     * Set donut subscription price changed
     *
     * @param value value of "donut subscription price changed" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery donutSubscriptionPriceChanged(Boolean value) {
        return unsafeParam("donut_subscription_price_changed", value);
    }

    /**
     * Set donut subscription expired
     *
     * @param value value of "donut subscription expired" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery donutSubscriptionExpired(Boolean value) {
        return unsafeParam("donut_subscription_expired", value);
    }

    /**
     * Set donut money withdraw
     *
     * @param value value of "donut money withdraw" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery donutMoneyWithdraw(Boolean value) {
        return unsafeParam("donut_money_withdraw", value);
    }

    /**
     * Set donut money withdraw error
     *
     * @param value value of "donut money withdraw error" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetLongPollSettingsQuery donutMoneyWithdrawError(Boolean value) {
        return unsafeParam("donut_money_withdraw_error", value);
    }

    @Override
    protected GroupsSetLongPollSettingsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}

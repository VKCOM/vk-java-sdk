package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
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
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public GroupsSetCallbackSettingsQuery(VkApiClient client, UserActor actor, int groupId) {
        super(client, "groups.setCallbackSettings", OkResponse.class);
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
    public GroupsSetCallbackSettingsQuery(VkApiClient client, GroupActor actor, int groupId) {
        super(client, "groups.setCallbackSettings", OkResponse.class);
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
    protected GroupsSetCallbackSettingsQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Server ID.
     *
     * @param value value of "server id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery serverId(Integer value) {
        return unsafeParam("server_id", value);
    }

    /**
     * Set api version
     *
     * @param value value of "api version" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery apiVersion(String value) {
        return unsafeParam("api_version", value);
    }

    /**
     * A new incoming message has been received ('0' — disabled, '1' — enabled).
     *
     * @param value value of "message new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery messageNew(Boolean value) {
        return unsafeParam("message_new", value);
    }

    /**
     * A new outcoming message has been received ('0' — disabled, '1' — enabled).
     *
     * @param value value of "message reply" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery messageReply(Boolean value) {
        return unsafeParam("message_reply", value);
    }

    /**
     * Allowed messages notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "message allow" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery messageAllow(Boolean value) {
        return unsafeParam("message_allow", value);
    }

    /**
     * Set message edit
     *
     * @param value value of "message edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery messageEdit(Boolean value) {
        return unsafeParam("message_edit", value);
    }

    /**
     * Denied messages notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "message deny" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery messageDeny(Boolean value) {
        return unsafeParam("message_deny", value);
    }

    /**
     * Set message typing state
     *
     * @param value value of "message typing state" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery messageTypingState(Boolean value) {
        return unsafeParam("message_typing_state", value);
    }

    /**
     * New photos notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "photo new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery photoNew(Boolean value) {
        return unsafeParam("photo_new", value);
    }

    /**
     * New audios notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "audio new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery audioNew(Boolean value) {
        return unsafeParam("audio_new", value);
    }

    /**
     * New videos notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "video new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery videoNew(Boolean value) {
        return unsafeParam("video_new", value);
    }

    /**
     * New wall replies notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "wall reply new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery wallReplyNew(Boolean value) {
        return unsafeParam("wall_reply_new", value);
    }

    /**
     * Wall replies edited notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "wall reply edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery wallReplyEdit(Boolean value) {
        return unsafeParam("wall_reply_edit", value);
    }

    /**
     * A wall comment has been deleted ('0' — disabled, '1' — enabled).
     *
     * @param value value of "wall reply delete" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery wallReplyDelete(Boolean value) {
        return unsafeParam("wall_reply_delete", value);
    }

    /**
     * A wall comment has been restored ('0' — disabled, '1' — enabled).
     *
     * @param value value of "wall reply restore" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery wallReplyRestore(Boolean value) {
        return unsafeParam("wall_reply_restore", value);
    }

    /**
     * New wall posts notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "wall post new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery wallPostNew(Boolean value) {
        return unsafeParam("wall_post_new", value);
    }

    /**
     * New wall posts notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "wall repost" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery wallRepost(Boolean value) {
        return unsafeParam("wall_repost", value);
    }

    /**
     * New board posts notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "board post new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery boardPostNew(Boolean value) {
        return unsafeParam("board_post_new", value);
    }

    /**
     * Board posts edited notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "board post edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery boardPostEdit(Boolean value) {
        return unsafeParam("board_post_edit", value);
    }

    /**
     * Board posts restored notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "board post restore" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery boardPostRestore(Boolean value) {
        return unsafeParam("board_post_restore", value);
    }

    /**
     * Board posts deleted notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "board post delete" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery boardPostDelete(Boolean value) {
        return unsafeParam("board_post_delete", value);
    }

    /**
     * New comment to photo notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "photo comment new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery photoCommentNew(Boolean value) {
        return unsafeParam("photo_comment_new", value);
    }

    /**
     * A photo comment has been edited ('0' — disabled, '1' — enabled).
     *
     * @param value value of "photo comment edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery photoCommentEdit(Boolean value) {
        return unsafeParam("photo_comment_edit", value);
    }

    /**
     * A photo comment has been deleted ('0' — disabled, '1' — enabled).
     *
     * @param value value of "photo comment delete" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery photoCommentDelete(Boolean value) {
        return unsafeParam("photo_comment_delete", value);
    }

    /**
     * A photo comment has been restored ('0' — disabled, '1' — enabled).
     *
     * @param value value of "photo comment restore" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery photoCommentRestore(Boolean value) {
        return unsafeParam("photo_comment_restore", value);
    }

    /**
     * New comment to video notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "video comment new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery videoCommentNew(Boolean value) {
        return unsafeParam("video_comment_new", value);
    }

    /**
     * A video comment has been edited ('0' — disabled, '1' — enabled).
     *
     * @param value value of "video comment edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery videoCommentEdit(Boolean value) {
        return unsafeParam("video_comment_edit", value);
    }

    /**
     * A video comment has been deleted ('0' — disabled, '1' — enabled).
     *
     * @param value value of "video comment delete" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery videoCommentDelete(Boolean value) {
        return unsafeParam("video_comment_delete", value);
    }

    /**
     * A video comment has been restored ('0' — disabled, '1' — enabled).
     *
     * @param value value of "video comment restore" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery videoCommentRestore(Boolean value) {
        return unsafeParam("video_comment_restore", value);
    }

    /**
     * New comment to market item notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "market comment new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery marketCommentNew(Boolean value) {
        return unsafeParam("market_comment_new", value);
    }

    /**
     * A market comment has been edited ('0' — disabled, '1' — enabled).
     *
     * @param value value of "market comment edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery marketCommentEdit(Boolean value) {
        return unsafeParam("market_comment_edit", value);
    }

    /**
     * A market comment has been deleted ('0' — disabled, '1' — enabled).
     *
     * @param value value of "market comment delete" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery marketCommentDelete(Boolean value) {
        return unsafeParam("market_comment_delete", value);
    }

    /**
     * A market comment has been restored ('0' — disabled, '1' — enabled).
     *
     * @param value value of "market comment restore" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery marketCommentRestore(Boolean value) {
        return unsafeParam("market_comment_restore", value);
    }

    /**
     * Set market order new
     *
     * @param value value of "market order new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery marketOrderNew(Boolean value) {
        return unsafeParam("market_order_new", value);
    }

    /**
     * Set market order edit
     *
     * @param value value of "market order edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery marketOrderEdit(Boolean value) {
        return unsafeParam("market_order_edit", value);
    }

    /**
     * A vote in a public poll has been added ('0' — disabled, '1' — enabled).
     *
     * @param value value of "poll vote new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery pollVoteNew(Boolean value) {
        return unsafeParam("poll_vote_new", value);
    }

    /**
     * Joined community notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "group join" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery groupJoin(Boolean value) {
        return unsafeParam("group_join", value);
    }

    /**
     * Left community notifications ('0' — disabled, '1' — enabled).
     *
     * @param value value of "group leave" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery groupLeave(Boolean value) {
        return unsafeParam("group_leave", value);
    }

    /**
     * Set group change settings
     *
     * @param value value of "group change settings" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery groupChangeSettings(Boolean value) {
        return unsafeParam("group_change_settings", value);
    }

    /**
     * Set group change photo
     *
     * @param value value of "group change photo" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery groupChangePhoto(Boolean value) {
        return unsafeParam("group_change_photo", value);
    }

    /**
     * Set group officers edit
     *
     * @param value value of "group officers edit" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery groupOfficersEdit(Boolean value) {
        return unsafeParam("group_officers_edit", value);
    }

    /**
     * User added to community blacklist
     *
     * @param value value of "user block" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery userBlock(Boolean value) {
        return unsafeParam("user_block", value);
    }

    /**
     * User removed from community blacklist
     *
     * @param value value of "user unblock" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery userUnblock(Boolean value) {
        return unsafeParam("user_unblock", value);
    }

    /**
     * New form in lead forms
     *
     * @param value value of "lead forms new" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery leadFormsNew(Boolean value) {
        return unsafeParam("lead_forms_new", value);
    }

    /**
     * Set like add
     *
     * @param value value of "like add" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery likeAdd(Boolean value) {
        return unsafeParam("like_add", value);
    }

    /**
     * Set like remove
     *
     * @param value value of "like remove" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery likeRemove(Boolean value) {
        return unsafeParam("like_remove", value);
    }

    /**
     * Set message event
     *
     * @param value value of "message event" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery messageEvent(Boolean value) {
        return unsafeParam("message_event", value);
    }

    /**
     * Set donut subscription create
     *
     * @param value value of "donut subscription create" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery donutSubscriptionCreate(Boolean value) {
        return unsafeParam("donut_subscription_create", value);
    }

    /**
     * Set donut subscription prolonged
     *
     * @param value value of "donut subscription prolonged" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery donutSubscriptionProlonged(Boolean value) {
        return unsafeParam("donut_subscription_prolonged", value);
    }

    /**
     * Set donut subscription cancelled
     *
     * @param value value of "donut subscription cancelled" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery donutSubscriptionCancelled(Boolean value) {
        return unsafeParam("donut_subscription_cancelled", value);
    }

    /**
     * Set donut subscription price changed
     *
     * @param value value of "donut subscription price changed" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery donutSubscriptionPriceChanged(Boolean value) {
        return unsafeParam("donut_subscription_price_changed", value);
    }

    /**
     * Set donut subscription expired
     *
     * @param value value of "donut subscription expired" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery donutSubscriptionExpired(Boolean value) {
        return unsafeParam("donut_subscription_expired", value);
    }

    /**
     * Set donut money withdraw
     *
     * @param value value of "donut money withdraw" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery donutMoneyWithdraw(Boolean value) {
        return unsafeParam("donut_money_withdraw", value);
    }

    /**
     * Set donut money withdraw error
     *
     * @param value value of "donut money withdraw error" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetCallbackSettingsQuery donutMoneyWithdrawError(Boolean value) {
        return unsafeParam("donut_money_withdraw_error", value);
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

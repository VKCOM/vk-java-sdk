package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.messages.MessagesAddChatUserQuery;
import com.vk.api.sdk.queries.messages.MessagesAllowMessagesFromGroupQuery;
import com.vk.api.sdk.queries.messages.MessagesCreateChatQuery;
import com.vk.api.sdk.queries.messages.MessagesDeleteChatPhotoQuery;
import com.vk.api.sdk.queries.messages.MessagesDeleteConversationQuery;
import com.vk.api.sdk.queries.messages.MessagesDeleteQuery;
import com.vk.api.sdk.queries.messages.MessagesDenyMessagesFromGroupQuery;
import com.vk.api.sdk.queries.messages.MessagesEditChatQuery;
import com.vk.api.sdk.queries.messages.MessagesEditQuery;
import com.vk.api.sdk.queries.messages.MessagesGetByConversationMessageIdQuery;
import com.vk.api.sdk.queries.messages.MessagesGetByIdQuery;
import com.vk.api.sdk.queries.messages.MessagesGetByIdQueryWithExtended;
import com.vk.api.sdk.queries.messages.MessagesGetChatPreviewQuery;
import com.vk.api.sdk.queries.messages.MessagesGetConversationMembersQuery;
import com.vk.api.sdk.queries.messages.MessagesGetConversationsByIdQuery;
import com.vk.api.sdk.queries.messages.MessagesGetConversationsByIdQueryWithExtended;
import com.vk.api.sdk.queries.messages.MessagesGetConversationsQuery;
import com.vk.api.sdk.queries.messages.MessagesGetHistoryAttachmentsQuery;
import com.vk.api.sdk.queries.messages.MessagesGetHistoryQuery;
import com.vk.api.sdk.queries.messages.MessagesGetInviteLinkQuery;
import com.vk.api.sdk.queries.messages.MessagesGetLastActivityQuery;
import com.vk.api.sdk.queries.messages.MessagesGetLongPollHistoryQuery;
import com.vk.api.sdk.queries.messages.MessagesGetLongPollServerQuery;
import com.vk.api.sdk.queries.messages.MessagesIsMessagesFromGroupAllowedQuery;
import com.vk.api.sdk.queries.messages.MessagesJoinChatByInviteLinkQuery;
import com.vk.api.sdk.queries.messages.MessagesMarkAsAnsweredConversationQuery;
import com.vk.api.sdk.queries.messages.MessagesMarkAsImportantConversationQuery;
import com.vk.api.sdk.queries.messages.MessagesMarkAsImportantQuery;
import com.vk.api.sdk.queries.messages.MessagesMarkAsReadQuery;
import com.vk.api.sdk.queries.messages.MessagesPinQuery;
import com.vk.api.sdk.queries.messages.MessagesRemoveChatUserQuery;
import com.vk.api.sdk.queries.messages.MessagesRestoreQuery;
import com.vk.api.sdk.queries.messages.MessagesSearchConversationsQuery;
import com.vk.api.sdk.queries.messages.MessagesSearchQuery;
import com.vk.api.sdk.queries.messages.MessagesSendQuery;
import com.vk.api.sdk.queries.messages.MessagesSendQueryWithUserIds;
import com.vk.api.sdk.queries.messages.MessagesSetActivityQuery;
import com.vk.api.sdk.queries.messages.MessagesSetChatPhotoQuery;
import com.vk.api.sdk.queries.messages.MessagesUnpinQuery;
import java.util.List;

/**
 * List of Messages methods
 */
public class Messages extends AbstractAction {
    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Messages(VkApiClient client) {
        super(client);
    }

    /**
     * Adds a new user to a chat.
     *
     * @param actor vk actor
     * @param chatId Chat ID.
     * @return query
     */
    public MessagesAddChatUserQuery addChatUser(UserActor actor, int chatId) {
        return new MessagesAddChatUserQuery(getClient(), actor, chatId);
    }

    /**
     * Allows sending messages from community to the current user.
     *
     * @param actor vk actor
     * @param groupId Group ID.
     * @return query
     */
    public MessagesAllowMessagesFromGroupQuery allowMessagesFromGroup(UserActor actor,
            int groupId) {
        return new MessagesAllowMessagesFromGroupQuery(getClient(), actor, groupId);
    }

    /**
     * Creates a chat with several participants.
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesCreateChatQuery createChat(UserActor actor) {
        return new MessagesCreateChatQuery(getClient(), actor);
    }

    /**
     * Deletes one or more messages.
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesDeleteQuery delete(UserActor actor) {
        return new MessagesDeleteQuery(getClient(), actor);
    }

    /**
     * Deletes one or more messages.
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesDeleteQuery delete(GroupActor actor) {
        return new MessagesDeleteQuery(getClient(), actor);
    }

    /**
     * Deletes a chat's cover picture.
     *
     * @param actor vk actor
     * @param chatId Chat ID.
     * @return query
     */
    public MessagesDeleteChatPhotoQuery deleteChatPhoto(UserActor actor, int chatId) {
        return new MessagesDeleteChatPhotoQuery(getClient(), actor, chatId);
    }

    /**
     * Deletes a chat's cover picture.
     *
     * @param actor vk actor
     * @param chatId Chat ID.
     * @return query
     */
    public MessagesDeleteChatPhotoQuery deleteChatPhoto(GroupActor actor, int chatId) {
        return new MessagesDeleteChatPhotoQuery(getClient(), actor, chatId);
    }

    /**
     * Deletes all private messages in a conversation.
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesDeleteConversationQuery deleteConversation(UserActor actor) {
        return new MessagesDeleteConversationQuery(getClient(), actor);
    }

    /**
     * Deletes all private messages in a conversation.
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesDeleteConversationQuery deleteConversation(GroupActor actor) {
        return new MessagesDeleteConversationQuery(getClient(), actor);
    }

    /**
     * Denies sending message from community to the current user.
     *
     * @param actor vk actor
     * @param groupId Group ID.
     * @return query
     */
    public MessagesDenyMessagesFromGroupQuery denyMessagesFromGroup(UserActor actor, int groupId) {
        return new MessagesDenyMessagesFromGroupQuery(getClient(), actor, groupId);
    }

    /**
     * Edits the message.
     *
     * @param actor vk actor
     * @param peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
     * @param messageId
     * @return query
     */
    public MessagesEditQuery edit(UserActor actor, int peerId, int messageId) {
        return new MessagesEditQuery(getClient(), actor, peerId, messageId);
    }

    /**
     * Edits the message.
     *
     * @param actor vk actor
     * @param peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
     * @param messageId
     * @return query
     */
    public MessagesEditQuery edit(GroupActor actor, int peerId, int messageId) {
        return new MessagesEditQuery(getClient(), actor, peerId, messageId);
    }

    /**
     * Edits the title of a chat.
     *
     * @param actor vk actor
     * @param chatId Chat ID.
     * @param title New title of the chat.
     * @return query
     */
    public MessagesEditChatQuery editChat(UserActor actor, int chatId, String title) {
        return new MessagesEditChatQuery(getClient(), actor, chatId, title);
    }

    /**
     * Edits the title of a chat.
     *
     * @param actor vk actor
     * @param chatId Chat ID.
     * @param title New title of the chat.
     * @return query
     */
    public MessagesEditChatQuery editChat(GroupActor actor, int chatId, String title) {
        return new MessagesEditChatQuery(getClient(), actor, chatId, title);
    }

    /**
     * Returns messages by their IDs within the conversation.
     *
     * @param actor vk actor
     * @param peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
     * @param conversationMessageIds Conversation message IDs.
     * @return query
     */
    public MessagesGetByConversationMessageIdQuery getByConversationMessageId(UserActor actor,
            int peerId, Integer... conversationMessageIds) {
        return new MessagesGetByConversationMessageIdQuery(getClient(), actor, peerId, conversationMessageIds);
    }

    /**
     * Returns messages by their IDs within the conversation.
     *
     * @param actor vk actor
     * @param peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
     * @param conversationMessageIds Conversation message IDs.
     * @return query
     */
    public MessagesGetByConversationMessageIdQuery getByConversationMessageId(UserActor actor,
            int peerId, List<Integer> conversationMessageIds) {
        return new MessagesGetByConversationMessageIdQuery(getClient(), actor, peerId, conversationMessageIds);
    }

    /**
     * Returns messages by their IDs within the conversation.
     *
     * @param actor vk actor
     * @param peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
     * @param conversationMessageIds Conversation message IDs.
     * @return query
     */
    public MessagesGetByConversationMessageIdQuery getByConversationMessageId(GroupActor actor,
            int peerId, Integer... conversationMessageIds) {
        return new MessagesGetByConversationMessageIdQuery(getClient(), actor, peerId, conversationMessageIds);
    }

    /**
     * Returns messages by their IDs within the conversation.
     *
     * @param actor vk actor
     * @param peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
     * @param conversationMessageIds Conversation message IDs.
     * @return query
     */
    public MessagesGetByConversationMessageIdQuery getByConversationMessageId(GroupActor actor,
            int peerId, List<Integer> conversationMessageIds) {
        return new MessagesGetByConversationMessageIdQuery(getClient(), actor, peerId, conversationMessageIds);
    }

    /**
     * Returns messages by their IDs.
     *
     * @param actor vk actor
     * @param messageIds Message IDs.
     * @return query
     */
    public MessagesGetByIdQueryWithExtended getByIdExtended(UserActor actor,
            Integer... messageIds) {
        return new MessagesGetByIdQueryWithExtended(getClient(), actor, messageIds);
    }

    /**
     * Returns messages by their IDs.
     *
     * @param actor vk actor
     * @param messageIds Message IDs.
     * @return query
     */
    public MessagesGetByIdQueryWithExtended getByIdExtended(UserActor actor,
            List<Integer> messageIds) {
        return new MessagesGetByIdQueryWithExtended(getClient(), actor, messageIds);
    }

    /**
     * Returns messages by their IDs.
     *
     * @param actor vk actor
     * @param messageIds Message IDs.
     * @return query
     */
    public MessagesGetByIdQueryWithExtended getByIdExtended(GroupActor actor,
            Integer... messageIds) {
        return new MessagesGetByIdQueryWithExtended(getClient(), actor, messageIds);
    }

    /**
     * Returns messages by their IDs.
     *
     * @param actor vk actor
     * @param messageIds Message IDs.
     * @return query
     */
    public MessagesGetByIdQueryWithExtended getByIdExtended(GroupActor actor,
            List<Integer> messageIds) {
        return new MessagesGetByIdQueryWithExtended(getClient(), actor, messageIds);
    }

    /**
     * Returns messages by their IDs.
     *
     * @param actor vk actor
     * @param messageIds Message IDs.
     * @return query
     */
    public MessagesGetByIdQuery getById(UserActor actor, Integer... messageIds) {
        return new MessagesGetByIdQuery(getClient(), actor, messageIds);
    }

    /**
     * Returns messages by their IDs.
     *
     * @param actor vk actor
     * @param messageIds Message IDs.
     * @return query
     */
    public MessagesGetByIdQuery getById(UserActor actor, List<Integer> messageIds) {
        return new MessagesGetByIdQuery(getClient(), actor, messageIds);
    }

    /**
     * Returns messages by their IDs.
     *
     * @param actor vk actor
     * @param messageIds Message IDs.
     * @return query
     */
    public MessagesGetByIdQuery getById(GroupActor actor, Integer... messageIds) {
        return new MessagesGetByIdQuery(getClient(), actor, messageIds);
    }

    /**
     * Returns messages by their IDs.
     *
     * @param actor vk actor
     * @param messageIds Message IDs.
     * @return query
     */
    public MessagesGetByIdQuery getById(GroupActor actor, List<Integer> messageIds) {
        return new MessagesGetByIdQuery(getClient(), actor, messageIds);
    }

    /**
     * @param actor vk actor
     * @return query
     */
    public MessagesGetChatPreviewQuery getChatPreview(UserActor actor) {
        return new MessagesGetChatPreviewQuery(getClient(), actor);
    }

    /**
     * Returns a list of IDs of users participating in a chat.
     *
     * @param actor vk actor
     * @param peerId Peer ID.
     * @return query
     */
    public MessagesGetConversationMembersQuery getConversationMembers(UserActor actor, int peerId) {
        return new MessagesGetConversationMembersQuery(getClient(), actor, peerId);
    }

    /**
     * Returns a list of IDs of users participating in a chat.
     *
     * @param actor vk actor
     * @param peerId Peer ID.
     * @return query
     */
    public MessagesGetConversationMembersQuery getConversationMembers(GroupActor actor,
            int peerId) {
        return new MessagesGetConversationMembersQuery(getClient(), actor, peerId);
    }

    /**
     * Returns a list of the current user's conversations.
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesGetConversationsQuery getConversations(UserActor actor) {
        return new MessagesGetConversationsQuery(getClient(), actor);
    }

    /**
     * Returns a list of the current user's conversations.
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesGetConversationsQuery getConversations(GroupActor actor) {
        return new MessagesGetConversationsQuery(getClient(), actor);
    }

    /**
     * Returns conversations by their IDs
     *
     * @param actor vk actor
     * @param peerIds Destination IDs. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
     * @return query
     */
    public MessagesGetConversationsByIdQueryWithExtended getConversationsByIdExtended(
            UserActor actor, Integer... peerIds) {
        return new MessagesGetConversationsByIdQueryWithExtended(getClient(), actor, peerIds);
    }

    /**
     * Returns conversations by their IDs
     *
     * @param actor vk actor
     * @param peerIds Destination IDs. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
     * @return query
     */
    public MessagesGetConversationsByIdQueryWithExtended getConversationsByIdExtended(
            UserActor actor, List<Integer> peerIds) {
        return new MessagesGetConversationsByIdQueryWithExtended(getClient(), actor, peerIds);
    }

    /**
     * Returns conversations by their IDs
     *
     * @param actor vk actor
     * @param peerIds Destination IDs. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
     * @return query
     */
    public MessagesGetConversationsByIdQueryWithExtended getConversationsByIdExtended(
            GroupActor actor, Integer... peerIds) {
        return new MessagesGetConversationsByIdQueryWithExtended(getClient(), actor, peerIds);
    }

    /**
     * Returns conversations by their IDs
     *
     * @param actor vk actor
     * @param peerIds Destination IDs. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
     * @return query
     */
    public MessagesGetConversationsByIdQueryWithExtended getConversationsByIdExtended(
            GroupActor actor, List<Integer> peerIds) {
        return new MessagesGetConversationsByIdQueryWithExtended(getClient(), actor, peerIds);
    }

    /**
     * Returns conversations by their IDs
     *
     * @param actor vk actor
     * @param peerIds Destination IDs. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
     * @return query
     */
    public MessagesGetConversationsByIdQuery getConversationsById(UserActor actor,
            Integer... peerIds) {
        return new MessagesGetConversationsByIdQuery(getClient(), actor, peerIds);
    }

    /**
     * Returns conversations by their IDs
     *
     * @param actor vk actor
     * @param peerIds Destination IDs. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
     * @return query
     */
    public MessagesGetConversationsByIdQuery getConversationsById(UserActor actor,
            List<Integer> peerIds) {
        return new MessagesGetConversationsByIdQuery(getClient(), actor, peerIds);
    }

    /**
     * Returns conversations by their IDs
     *
     * @param actor vk actor
     * @param peerIds Destination IDs. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
     * @return query
     */
    public MessagesGetConversationsByIdQuery getConversationsById(GroupActor actor,
            Integer... peerIds) {
        return new MessagesGetConversationsByIdQuery(getClient(), actor, peerIds);
    }

    /**
     * Returns conversations by their IDs
     *
     * @param actor vk actor
     * @param peerIds Destination IDs. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
     * @return query
     */
    public MessagesGetConversationsByIdQuery getConversationsById(GroupActor actor,
            List<Integer> peerIds) {
        return new MessagesGetConversationsByIdQuery(getClient(), actor, peerIds);
    }

    /**
     * Returns message history for the specified user or group chat.
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesGetHistoryQuery getHistory(UserActor actor) {
        return new MessagesGetHistoryQuery(getClient(), actor);
    }

    /**
     * Returns message history for the specified user or group chat.
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesGetHistoryQuery getHistory(GroupActor actor) {
        return new MessagesGetHistoryQuery(getClient(), actor);
    }

    /**
     * Returns media files from the dialog or group chat.
     *
     * @param actor vk actor
     * @param peerId Peer ID. ", For group chat: '2000000000 + chat ID' , , For community: '-community ID'"
     * @return query
     */
    public MessagesGetHistoryAttachmentsQuery getHistoryAttachments(UserActor actor, int peerId) {
        return new MessagesGetHistoryAttachmentsQuery(getClient(), actor, peerId);
    }

    /**
     * Returns media files from the dialog or group chat.
     *
     * @param actor vk actor
     * @param peerId Peer ID. ", For group chat: '2000000000 + chat ID' , , For community: '-community ID'"
     * @return query
     */
    public MessagesGetHistoryAttachmentsQuery getHistoryAttachments(GroupActor actor, int peerId) {
        return new MessagesGetHistoryAttachmentsQuery(getClient(), actor, peerId);
    }

    /**
     * @param actor vk actor
     * @param peerId Destination ID.
     * @return query
     */
    public MessagesGetInviteLinkQuery getInviteLink(UserActor actor, int peerId) {
        return new MessagesGetInviteLinkQuery(getClient(), actor, peerId);
    }

    /**
     * @param actor vk actor
     * @param peerId Destination ID.
     * @return query
     */
    public MessagesGetInviteLinkQuery getInviteLink(GroupActor actor, int peerId) {
        return new MessagesGetInviteLinkQuery(getClient(), actor, peerId);
    }

    /**
     * Returns a user's current status and date of last activity.
     *
     * @param actor vk actor
     * @param userId User ID.
     * @return query
     */
    public MessagesGetLastActivityQuery getLastActivity(UserActor actor, int userId) {
        return new MessagesGetLastActivityQuery(getClient(), actor, userId);
    }

    /**
     * Returns updates in user's private messages.
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesGetLongPollHistoryQuery getLongPollHistory(UserActor actor) {
        return new MessagesGetLongPollHistoryQuery(getClient(), actor);
    }

    /**
     * Returns updates in user's private messages.
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesGetLongPollHistoryQuery getLongPollHistory(GroupActor actor) {
        return new MessagesGetLongPollHistoryQuery(getClient(), actor);
    }

    /**
     * Returns data required for connection to a Long Poll server.
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesGetLongPollServerQuery getLongPollServer(UserActor actor) {
        return new MessagesGetLongPollServerQuery(getClient(), actor);
    }

    /**
     * Returns data required for connection to a Long Poll server.
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesGetLongPollServerQuery getLongPollServer(GroupActor actor) {
        return new MessagesGetLongPollServerQuery(getClient(), actor);
    }

    /**
     * Returns information whether sending messages from the community to current user is allowed.
     *
     * @param actor vk actor
     * @param groupId Group ID.
     * @param userId User ID.
     * @return query
     */
    public MessagesIsMessagesFromGroupAllowedQuery isMessagesFromGroupAllowed(UserActor actor,
            int groupId, int userId) {
        return new MessagesIsMessagesFromGroupAllowedQuery(getClient(), actor, groupId, userId);
    }

    /**
     * Returns information whether sending messages from the community to current user is allowed.
     *
     * @param actor vk actor
     * @param groupId Group ID.
     * @param userId User ID.
     * @return query
     */
    public MessagesIsMessagesFromGroupAllowedQuery isMessagesFromGroupAllowed(GroupActor actor,
            int groupId, int userId) {
        return new MessagesIsMessagesFromGroupAllowedQuery(getClient(), actor, groupId, userId);
    }

    /**
     * @param actor vk actor
     * @param link Invitation link.
     * @return query
     */
    public MessagesJoinChatByInviteLinkQuery joinChatByInviteLink(UserActor actor, String link) {
        return new MessagesJoinChatByInviteLinkQuery(getClient(), actor, link);
    }

    /**
     * Marks and unmarks conversations as unanswered.
     *
     * @param actor vk actor
     * @param peerId ID of conversation to mark as important.
     * @return query
     */
    public MessagesMarkAsAnsweredConversationQuery markAsAnsweredConversation(UserActor actor,
            int peerId) {
        return new MessagesMarkAsAnsweredConversationQuery(getClient(), actor, peerId);
    }

    /**
     * Marks and unmarks conversations as unanswered.
     *
     * @param actor vk actor
     * @param peerId ID of conversation to mark as important.
     * @return query
     */
    public MessagesMarkAsAnsweredConversationQuery markAsAnsweredConversation(GroupActor actor,
            int peerId) {
        return new MessagesMarkAsAnsweredConversationQuery(getClient(), actor, peerId);
    }

    /**
     * Marks and unmarks messages as important (starred).
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesMarkAsImportantQuery markAsImportant(UserActor actor) {
        return new MessagesMarkAsImportantQuery(getClient(), actor);
    }

    /**
     * Marks and unmarks conversations as important.
     *
     * @param actor vk actor
     * @param peerId ID of conversation to mark as important.
     * @return query
     */
    public MessagesMarkAsImportantConversationQuery markAsImportantConversation(UserActor actor,
            int peerId) {
        return new MessagesMarkAsImportantConversationQuery(getClient(), actor, peerId);
    }

    /**
     * Marks and unmarks conversations as important.
     *
     * @param actor vk actor
     * @param peerId ID of conversation to mark as important.
     * @return query
     */
    public MessagesMarkAsImportantConversationQuery markAsImportantConversation(GroupActor actor,
            int peerId) {
        return new MessagesMarkAsImportantConversationQuery(getClient(), actor, peerId);
    }

    /**
     * Marks messages as read.
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesMarkAsReadQuery markAsRead(UserActor actor) {
        return new MessagesMarkAsReadQuery(getClient(), actor);
    }

    /**
     * Marks messages as read.
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesMarkAsReadQuery markAsRead(GroupActor actor) {
        return new MessagesMarkAsReadQuery(getClient(), actor);
    }

    /**
     * Pin a message.
     *
     * @param actor vk actor
     * @param peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'Chat ID', e.g. '2000000001'. For community: '- Community ID', e.g. '-12345'. "
     * @return query
     */
    public MessagesPinQuery pin(UserActor actor, int peerId) {
        return new MessagesPinQuery(getClient(), actor, peerId);
    }

    /**
     * Pin a message.
     *
     * @param actor vk actor
     * @param peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'Chat ID', e.g. '2000000001'. For community: '- Community ID', e.g. '-12345'. "
     * @return query
     */
    public MessagesPinQuery pin(GroupActor actor, int peerId) {
        return new MessagesPinQuery(getClient(), actor, peerId);
    }

    /**
     * Allows the current user to leave a chat or, if the current user started the chat, allows the user to remove another user from the chat.
     *
     * @param actor vk actor
     * @param chatId Chat ID.
     * @return query
     */
    public MessagesRemoveChatUserQuery removeChatUser(UserActor actor, int chatId) {
        return new MessagesRemoveChatUserQuery(getClient(), actor, chatId);
    }

    /**
     * Allows the current user to leave a chat or, if the current user started the chat, allows the user to remove another user from the chat.
     *
     * @param actor vk actor
     * @param chatId Chat ID.
     * @return query
     */
    public MessagesRemoveChatUserQuery removeChatUser(GroupActor actor, int chatId) {
        return new MessagesRemoveChatUserQuery(getClient(), actor, chatId);
    }

    /**
     * Restores a deleted message.
     *
     * @param actor vk actor
     * @param messageId ID of a previously-deleted message to restore.
     * @return query
     */
    public MessagesRestoreQuery restore(UserActor actor, int messageId) {
        return new MessagesRestoreQuery(getClient(), actor, messageId);
    }

    /**
     * Restores a deleted message.
     *
     * @param actor vk actor
     * @param messageId ID of a previously-deleted message to restore.
     * @return query
     */
    public MessagesRestoreQuery restore(GroupActor actor, int messageId) {
        return new MessagesRestoreQuery(getClient(), actor, messageId);
    }

    /**
     * Returns a list of the current user's private messages that match search criteria.
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesSearchQuery search(UserActor actor) {
        return new MessagesSearchQuery(getClient(), actor);
    }

    /**
     * Returns a list of the current user's private messages that match search criteria.
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesSearchQuery search(GroupActor actor) {
        return new MessagesSearchQuery(getClient(), actor);
    }

    /**
     * Returns a list of the current user's conversations that match search criteria.
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesSearchConversationsQuery searchConversations(UserActor actor) {
        return new MessagesSearchConversationsQuery(getClient(), actor);
    }

    /**
     * Returns a list of the current user's conversations that match search criteria.
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesSearchConversationsQuery searchConversations(GroupActor actor) {
        return new MessagesSearchConversationsQuery(getClient(), actor);
    }

    /**
     * Sends a message.
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesSendQuery send(UserActor actor) {
        return new MessagesSendQuery(getClient(), actor);
    }

    /**
     * Sends a message.
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesSendQuery send(GroupActor actor) {
        return new MessagesSendQuery(getClient(), actor);
    }

    /**
     * Sends a message.
     *
     * @param actor vk actor
     * @param userIds IDs of message recipients (if new conversation shall be started).
     * @return query
     */
    public MessagesSendQueryWithUserIds sendWithUserIds(UserActor actor, Integer[] userIds) {
        return new MessagesSendQueryWithUserIds(getClient(), actor, userIds);
    }

    /**
     * Sends a message.
     *
     * @param actor vk actor
     * @param userIds IDs of message recipients (if new conversation shall be started).
     * @return query
     */
    public MessagesSendQueryWithUserIds sendWithUserIds(GroupActor actor, Integer[] userIds) {
        return new MessagesSendQueryWithUserIds(getClient(), actor, userIds);
    }

    /**
     * Changes the status of a user as typing in a conversation.
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesSetActivityQuery setActivity(UserActor actor) {
        return new MessagesSetActivityQuery(getClient(), actor);
    }

    /**
     * Changes the status of a user as typing in a conversation.
     *
     * @param actor vk actor
     * @return query
     */
    public MessagesSetActivityQuery setActivity(GroupActor actor) {
        return new MessagesSetActivityQuery(getClient(), actor);
    }

    /**
     * Sets a previously-uploaded picture as the cover picture of a chat.
     *
     * @param actor vk actor
     * @param file Upload URL from the 'response' field returned by the [vk.com/dev/photos.getChatUploadServer|photos.getChatUploadServer] method upon successfully uploading an image.
     * @return query
     */
    public MessagesSetChatPhotoQuery setChatPhoto(UserActor actor, String file) {
        return new MessagesSetChatPhotoQuery(getClient(), actor, file);
    }

    /**
     * Sets a previously-uploaded picture as the cover picture of a chat.
     *
     * @param actor vk actor
     * @param file Upload URL from the 'response' field returned by the [vk.com/dev/photos.getChatUploadServer|photos.getChatUploadServer] method upon successfully uploading an image.
     * @return query
     */
    public MessagesSetChatPhotoQuery setChatPhoto(GroupActor actor, String file) {
        return new MessagesSetChatPhotoQuery(getClient(), actor, file);
    }

    /**
     * @param actor vk actor
     * @param peerId
     * @return query
     */
    public MessagesUnpinQuery unpin(UserActor actor, int peerId) {
        return new MessagesUnpinQuery(getClient(), actor, peerId);
    }

    /**
     * @param actor vk actor
     * @param peerId
     * @return query
     */
    public MessagesUnpinQuery unpin(GroupActor actor, int peerId) {
        return new MessagesUnpinQuery(getClient(), actor, peerId);
    }
}

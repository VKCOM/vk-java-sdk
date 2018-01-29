package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.groups.GroupsAddCallbackServerQuery;
import com.vk.api.sdk.queries.groups.GroupsAddLinkQuery;
import com.vk.api.sdk.queries.groups.GroupsApproveRequestQuery;
import com.vk.api.sdk.queries.groups.GroupsBanUserQuery;
import com.vk.api.sdk.queries.groups.GroupsCreateQuery;
import com.vk.api.sdk.queries.groups.GroupsDeleteCallbackServerQuery;
import com.vk.api.sdk.queries.groups.GroupsDeleteLinkQuery;
import com.vk.api.sdk.queries.groups.GroupsEditCallbackServerQuery;
import com.vk.api.sdk.queries.groups.GroupsEditLinkQuery;
import com.vk.api.sdk.queries.groups.GroupsEditManagerQuery;
import com.vk.api.sdk.queries.groups.GroupsEditPlaceQuery;
import com.vk.api.sdk.queries.groups.GroupsEditQuery;
import com.vk.api.sdk.queries.groups.GroupsGetBannedQuery;
import com.vk.api.sdk.queries.groups.GroupsGetByIdQuery;
import com.vk.api.sdk.queries.groups.GroupsGetCallbackConfirmationCodeQuery;
import com.vk.api.sdk.queries.groups.GroupsGetCallbackServersQuery;
import com.vk.api.sdk.queries.groups.GroupsGetCallbackSettingsQuery;
import com.vk.api.sdk.queries.groups.GroupsGetCatalogInfoQuery;
import com.vk.api.sdk.queries.groups.GroupsGetCatalogQuery;
import com.vk.api.sdk.queries.groups.GroupsGetInvitedUsersQuery;
import com.vk.api.sdk.queries.groups.GroupsGetInvitesQuery;
import com.vk.api.sdk.queries.groups.GroupsGetInvitesQueryWithExtended;
import com.vk.api.sdk.queries.groups.GroupsGetMembersFilter;
import com.vk.api.sdk.queries.groups.GroupsGetMembersQuery;
import com.vk.api.sdk.queries.groups.GroupsGetMembersQueryWithFields;
import com.vk.api.sdk.queries.groups.GroupsGetMembersQueryWithFilter;
import com.vk.api.sdk.queries.groups.GroupsGetQuery;
import com.vk.api.sdk.queries.groups.GroupsGetQueryWithExtended;
import com.vk.api.sdk.queries.groups.GroupsGetRequestsQuery;
import com.vk.api.sdk.queries.groups.GroupsGetRequestsQueryWithFields;
import com.vk.api.sdk.queries.groups.GroupsGetSettingsQuery;
import com.vk.api.sdk.queries.groups.GroupsInviteQuery;
import com.vk.api.sdk.queries.groups.GroupsIsMemberQuery;
import com.vk.api.sdk.queries.groups.GroupsIsMemberQueryWithExtended;
import com.vk.api.sdk.queries.groups.GroupsIsMemberQueryWithUserIds;
import com.vk.api.sdk.queries.groups.GroupsIsMemberQueryWithUserIdsExtended;
import com.vk.api.sdk.queries.groups.GroupsJoinQuery;
import com.vk.api.sdk.queries.groups.GroupsLeaveQuery;
import com.vk.api.sdk.queries.groups.GroupsRemoveUserQuery;
import com.vk.api.sdk.queries.groups.GroupsReorderLinkQuery;
import com.vk.api.sdk.queries.groups.GroupsSearchQuery;
import com.vk.api.sdk.queries.groups.GroupsSetCallbackSettingsQuery;
import com.vk.api.sdk.queries.groups.GroupsUnbanUserQuery;
import com.vk.api.sdk.queries.groups.GroupsGetLongPollServerQuery;
import com.vk.api.sdk.queries.groups.GroupsGetLongPollSettingsQuery;
import com.vk.api.sdk.queries.groups.GroupsSetLongPollSettingsQuery;
import com.vk.api.sdk.queries.users.UserField;

import java.util.List;

/**
 * List of Groups methods
 */
public class Groups extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Groups(VkApiClient client) {
        super(client);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQuery isMember(UserActor actor, String groupId) {
        return new GroupsIsMemberQuery(getClient(), actor, groupId);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQuery isMember(GroupActor actor, String groupId) {
        return new GroupsIsMemberQuery(getClient(), actor, groupId);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQuery isMember(ServiceActor actor, String groupId) {
        return new GroupsIsMemberQuery(getClient(), actor, groupId);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQueryWithUserIds isMember(UserActor actor, String groupId, Integer... userIds) {
        return new GroupsIsMemberQueryWithUserIds(getClient(), actor, groupId, userIds);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQueryWithUserIds isMember(GroupActor actor, String groupId, Integer... userIds) {
        return new GroupsIsMemberQueryWithUserIds(getClient(), actor, groupId, userIds);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQueryWithUserIds isMember(ServiceActor actor, String groupId, Integer... userIds) {
        return new GroupsIsMemberQueryWithUserIds(getClient(), actor, groupId, userIds);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQueryWithUserIds isMember(UserActor actor, String groupId, List<Integer> userIds) {
        return new GroupsIsMemberQueryWithUserIds(getClient(), actor, groupId, userIds);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQueryWithUserIds isMember(GroupActor actor, String groupId, List<Integer> userIds) {
        return new GroupsIsMemberQueryWithUserIds(getClient(), actor, groupId, userIds);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQueryWithUserIds isMember(ServiceActor actor, String groupId, List<Integer> userIds) {
        return new GroupsIsMemberQueryWithUserIds(getClient(), actor, groupId, userIds);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQueryWithExtended isMemberExtended(UserActor actor, String groupId) {
        return new GroupsIsMemberQueryWithExtended(getClient(), actor, groupId);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQueryWithExtended isMemberExtended(GroupActor actor, String groupId) {
        return new GroupsIsMemberQueryWithExtended(getClient(), actor, groupId);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQueryWithExtended isMemberExtended(ServiceActor actor, String groupId) {
        return new GroupsIsMemberQueryWithExtended(getClient(), actor, groupId);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQueryWithUserIdsExtended isMemberExtended(UserActor actor, String groupId, Integer... userIds) {
        return new GroupsIsMemberQueryWithUserIdsExtended(getClient(), actor, groupId, userIds);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQueryWithUserIdsExtended isMemberExtended(GroupActor actor, String groupId, Integer... userIds) {
        return new GroupsIsMemberQueryWithUserIdsExtended(getClient(), actor, groupId, userIds);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQueryWithUserIdsExtended isMemberExtended(ServiceActor actor, String groupId, Integer... userIds) {
        return new GroupsIsMemberQueryWithUserIdsExtended(getClient(), actor, groupId, userIds);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQueryWithUserIdsExtended isMemberExtended(UserActor actor, String groupId, List<Integer> userIds) {
        return new GroupsIsMemberQueryWithUserIdsExtended(getClient(), actor, groupId, userIds);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQueryWithUserIdsExtended isMemberExtended(GroupActor actor, String groupId, List<Integer> userIds) {
        return new GroupsIsMemberQueryWithUserIdsExtended(getClient(), actor, groupId, userIds);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQueryWithUserIdsExtended isMemberExtended(ServiceActor actor, String groupId, List<Integer> userIds) {
        return new GroupsIsMemberQueryWithUserIdsExtended(getClient(), actor, groupId, userIds);
    }

    /**
     * Returns information about communities by their IDs.
     */
    public GroupsGetByIdQuery getById(UserActor actor) {
        return new GroupsGetByIdQuery(getClient(), actor);
    }

    /**
     * Returns information about communities by their IDs.
     */
    public GroupsGetByIdQuery getById(GroupActor actor) {
        return new GroupsGetByIdQuery(getClient(), actor);
    }

    /**
     * Returns information about communities by their IDs.
     */
    public GroupsGetByIdQuery getById(ServiceActor actor) {
        return new GroupsGetByIdQuery(getClient(), actor);
    }

    /**
     * Returns a list of the communities to which a user belongs.
     */
    public GroupsGetQuery get(UserActor actor) {
        return new GroupsGetQuery(getClient(), actor);
    }

    /**
     * Returns a list of the communities to which a user belongs.
     */
    public GroupsGetQueryWithExtended getExtended(UserActor actor) {
        return new GroupsGetQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of community members.
     */
    public GroupsGetMembersQuery getMembers(UserActor actor) {
        return new GroupsGetMembersQuery(getClient(), actor);
    }

    /**
     * Returns a list of community members.
     */
    public GroupsGetMembersQuery getMembers(GroupActor actor) {
        return new GroupsGetMembersQuery(getClient(), actor);
    }

    /**
     * Returns a list of community members.
     */
    public GroupsGetMembersQuery getMembers(ServiceActor actor) {
        return new GroupsGetMembersQuery(getClient(), actor);
    }

    /**
     * Returns a list of community members.
     */
    public GroupsGetMembersQueryWithFields getMembers(ServiceActor actor, UserField... fields) {
        return new GroupsGetMembersQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns a list of community members.
     */
    public GroupsGetMembersQueryWithFields getMembers(ServiceActor actor, List<UserField> fields) {
        return new GroupsGetMembersQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns a list of community members.
     */
    public GroupsGetMembersQueryWithFields getMembers(UserActor actor, UserField... fields) {
        return new GroupsGetMembersQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns a list of community members.
     */
    public GroupsGetMembersQueryWithFields getMembers(GroupActor actor, UserField... fields) {
        return new GroupsGetMembersQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns a list of community members.
     */
    public GroupsGetMembersQueryWithFields getMembers(UserActor actor, List<UserField> fields) {
        return new GroupsGetMembersQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns a list of community members.
     */
    public GroupsGetMembersQueryWithFields getMembers(GroupActor actor, List<UserField> fields) {
        return new GroupsGetMembersQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns a list of community members.
     */
    public GroupsGetMembersQueryWithFilter getMembers(ServiceActor actor, GroupsGetMembersFilter filter) {
        return new GroupsGetMembersQueryWithFilter(getClient(), actor, filter);
    }

    /**
     * Returns a list of community members.
     */
    public GroupsGetMembersQueryWithFilter getMembers(UserActor actor, GroupsGetMembersFilter filter) {
        return new GroupsGetMembersQueryWithFilter(getClient(), actor, filter);
    }

    /**
     * Returns a list of community members.
     */
    public GroupsGetMembersQueryWithFilter getMembers(GroupActor actor, GroupsGetMembersFilter filter) {
        return new GroupsGetMembersQueryWithFilter(getClient(), actor, filter);
    }

    /**
     * With this method you can join the group or public page, and also confirm your participation in an event.
     */
    public GroupsJoinQuery join(UserActor actor) {
        return new GroupsJoinQuery(getClient(), actor);
    }

    /**
     * With this method you can leave a group, public page, or event.
     */
    public GroupsLeaveQuery leave(UserActor actor, int groupId) {
        return new GroupsLeaveQuery(getClient(), actor, groupId);
    }

    /**
     * Searches for communities by substring.
     */
    public GroupsSearchQuery search(UserActor actor, String q) {
        return new GroupsSearchQuery(getClient(), actor, q);
    }

    /**
     * Returns communities list for a catalog category.
     */
    public GroupsGetCatalogQuery getCatalog(UserActor actor) {
        return new GroupsGetCatalogQuery(getClient(), actor);
    }

    /**
     * Returns categories list for communities catalog
     */
    public GroupsGetCatalogInfoQuery getCatalogInfo(UserActor actor) {
        return new GroupsGetCatalogInfoQuery(getClient(), actor);
    }

    /**
     * Returns a list of invitations to join communities and events.
     */
    public GroupsGetInvitesQuery getInvites(UserActor actor) {
        return new GroupsGetInvitesQuery(getClient(), actor);
    }

    /**
     * Returns a list of invitations to join communities and events.
     */
    public GroupsGetInvitesQueryWithExtended getInvitesExtended(UserActor actor) {
        return new GroupsGetInvitesQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns invited users list of a community
     */
    public GroupsGetInvitedUsersQuery getInvitedUsers(UserActor actor, int groupId) {
        return new GroupsGetInvitedUsersQuery(getClient(), actor, groupId);
    }

    /**
     * Adds a user to a community blacklist.
     */
    public GroupsBanUserQuery banUser(UserActor actor, int groupId, int userId) {
        return new GroupsBanUserQuery(getClient(), actor, groupId, userId);
    }

    /**
     * Deletes a user from a community blacklist.
     */
    public GroupsUnbanUserQuery unbanUser(UserActor actor, int groupId, int userId) {
        return new GroupsUnbanUserQuery(getClient(), actor, groupId, userId);
    }

    /**
     * Returns a list of users on a community blacklist.
     */
    public GroupsGetBannedQuery getBanned(UserActor actor, int groupId) {
        return new GroupsGetBannedQuery(getClient(), actor, groupId);
    }

    /**
     * Creates a new community
     */
    public GroupsCreateQuery create(UserActor actor, String title) {
        return new GroupsCreateQuery(getClient(), actor, title);
    }

    /**
     * Edits a community
     */
    public GroupsEditQuery edit(UserActor actor, int groupId) {
        return new GroupsEditQuery(getClient(), actor, groupId);
    }

    /**
     * Edits the place in community.
     */
    public GroupsEditPlaceQuery editPlace(UserActor actor, int groupId) {
        return new GroupsEditPlaceQuery(getClient(), actor, groupId);
    }

    /**
     * Returns community settings.
     */
    public GroupsGetSettingsQuery getSettings(UserActor actor, int groupId) {
        return new GroupsGetSettingsQuery(getClient(), actor, groupId);
    }

    /**
     * Returns a list of requests to the community.
     */
    public GroupsGetRequestsQuery getRequests(UserActor actor, int groupId) {
        return new GroupsGetRequestsQuery(getClient(), actor, groupId);
    }

    /**
     * Returns a list of requests to the community.
     */
    public GroupsGetRequestsQueryWithFields getRequests(UserActor actor, int groupId, UserField... fields) {
        return new GroupsGetRequestsQueryWithFields(getClient(), actor, groupId, fields);
    }

    /**
     * Returns a list of requests to the community.
     */
    public GroupsGetRequestsQueryWithFields getRequests(UserActor actor, int groupId, List<UserField> fields) {
        return new GroupsGetRequestsQueryWithFields(getClient(), actor, groupId, fields);
    }

    /**
     * Allows to add, remove or edit the community manager .
     */
    public GroupsEditManagerQuery editManager(UserActor actor, int groupId, int userId) {
        return new GroupsEditManagerQuery(getClient(), actor, groupId, userId);
    }

    /**
     * Allows to invite friends to the community.
     */
    public GroupsInviteQuery invite(UserActor actor, int groupId, int userId) {
        return new GroupsInviteQuery(getClient(), actor, groupId, userId);
    }

    /**
     * Allows to add a link to the community.
     */
    public GroupsAddLinkQuery addLink(UserActor actor, int groupId, String link) {
        return new GroupsAddLinkQuery(getClient(), actor, groupId, link);
    }

    /**
     * Allows to delete a link from the community.
     */
    public GroupsDeleteLinkQuery deleteLink(UserActor actor, int groupId, int linkId) {
        return new GroupsDeleteLinkQuery(getClient(), actor, groupId, linkId);
    }

    /**
     * Allows to edit a link in the community.
     */
    public GroupsEditLinkQuery editLink(UserActor actor, int groupId, int linkId) {
        return new GroupsEditLinkQuery(getClient(), actor, groupId, linkId);
    }

    /**
     * Allows to reorder links in the community.
     */
    public GroupsReorderLinkQuery reorderLink(UserActor actor, int groupId, int linkId) {
        return new GroupsReorderLinkQuery(getClient(), actor, groupId, linkId);
    }

    /**
     * Removes a user from the community.
     */
    public GroupsRemoveUserQuery removeUser(UserActor actor, int groupId, int userId) {
        return new GroupsRemoveUserQuery(getClient(), actor, groupId, userId);
    }

    /**
     * Allows to approve join request to the community.
     */
    public GroupsApproveRequestQuery approveRequest(UserActor actor, int groupId, int userId) {
        return new GroupsApproveRequestQuery(getClient(), actor, groupId, userId);
    }

    /**
     * Returns Callback API confirmation code for the community.
     */
    public GroupsGetCallbackConfirmationCodeQuery getCallbackConfirmationCode(UserActor actor, int groupId) {
        return new GroupsGetCallbackConfirmationCodeQuery(getClient(), actor, groupId);
    }

    /**
     * Returns Callback API confirmation code for the community.
     */
    public GroupsGetCallbackConfirmationCodeQuery getCallbackConfirmationCode(GroupActor actor) {
        return new GroupsGetCallbackConfirmationCodeQuery(getClient(), actor);
    }

    /**
     * Returns Callback API notifications settings.
     */
    public GroupsGetCallbackSettingsQuery getCallbackSettings(UserActor actor, int groupId, int serverId) {
        return new GroupsGetCallbackSettingsQuery(getClient(), actor, groupId, serverId);
    }

    /**
     * Returns Callback API notifications settings.
     */
    public GroupsGetCallbackSettingsQuery getCallbackSettings(GroupActor actor, int serverId) {
        return new GroupsGetCallbackSettingsQuery(getClient(), actor, serverId);
    }

    /**
     * Allow to set notifications settings for Callback API.
     */
    public GroupsSetCallbackSettingsQuery setCallbackSettings(UserActor actor, int groupId, int serverId) {
        return new GroupsSetCallbackSettingsQuery(getClient(), actor, groupId, serverId);
    }

    /**
     * Allow to set notifications settings for Callback API.
     */
    public GroupsSetCallbackSettingsQuery setCallbackSettings(GroupActor actor, int serverId) {
        return new GroupsSetCallbackSettingsQuery(getClient(), actor, serverId);
    }

    /**
     * Receives a list of Callback API servers from the community.
     */
    public GroupsGetCallbackServersQuery getCallbackServers(UserActor actor, int groupId) {
        return new GroupsGetCallbackServersQuery(getClient(), actor, groupId);
    }

    /**
     * Receives a list of Callback API servers from the community.
     */
    public GroupsGetCallbackServersQuery getCallbackServers(GroupActor actor) {
        return new GroupsGetCallbackServersQuery(getClient(), actor);
    }

    /**
     * Adds Callback API server to the community.
     */
    public GroupsAddCallbackServerQuery addCallbackServer(UserActor actor, int groupId, String url, String title) {
        return new GroupsAddCallbackServerQuery(getClient(), actor, groupId, url, title);
    }

    /**
     * Adds Callback API server to the community.
     */
    public GroupsAddCallbackServerQuery addCallbackServer(GroupActor actor, String url, String title) {
        return new GroupsAddCallbackServerQuery(getClient(), actor, url, title);
    }

    /**
     * Edits Callback API server in the community.
     */
    public GroupsEditCallbackServerQuery editCallbackServer(UserActor actor, int groupId, int serverId, String url, String title) {
        return new GroupsEditCallbackServerQuery(getClient(), actor, groupId, serverId, url, title);
    }

    /**
     * Edits Callback API server in the community.
     */
    public GroupsEditCallbackServerQuery editCallbackServer(GroupActor actor, int serverId, String url, String title) {
        return new GroupsEditCallbackServerQuery(getClient(), actor, serverId, url, title);
    }

    /**
     * Deletes Callback API server from the community.
     */
    public GroupsDeleteCallbackServerQuery deleteCallbackServer(UserActor actor, int groupId, int serverId) {
        return new GroupsDeleteCallbackServerQuery(getClient(), actor, groupId, serverId);
    }

    /**
     * Deletes Callback API server from the community.
     */
    public GroupsDeleteCallbackServerQuery deleteCallbackServer(GroupActor actor, int serverId) {
        return new GroupsDeleteCallbackServerQuery(getClient(), actor, serverId);
    }

    /**
     * Retrieves server info needed to use long polling.
     */
    public GroupsGetLongPollServerQuery getLongPollServer(UserActor actor, int groupId) {
        return new GroupsGetLongPollServerQuery(getClient(), actor, groupId);
    }

    /**
     * Retrieves server info needed to use long polling.
     */
    public GroupsGetLongPollServerQuery getLongPollServer(GroupActor actor) {
        return new GroupsGetLongPollServerQuery(getClient(), actor);
    }

    /**
     * Retrieves group longpoll settings
     */
    public GroupsGetLongPollSettingsQuery getLongPollSettings(UserActor actor, int groupId) {
        return new GroupsGetLongPollSettingsQuery(getClient(), actor, groupId);
    }

    /**
     * Retrieves group longpoll settings
     */
    public GroupsGetLongPollSettingsQuery getLongPollSettings(GroupActor actor) {
        return new GroupsGetLongPollSettingsQuery(getClient(), actor);
    }

    /**
     * Sets group longpoll settings
     */
    public GroupsSetLongPollSettingsQuery setLongPollSettings(UserActor actor, int groupId) {
        return new GroupsSetLongPollSettingsQuery(getClient(), actor, groupId);
    }

    /**
     * Sets group longpoll settings
     */
    public GroupsSetLongPollSettingsQuery setLongPollSettings(GroupActor actor) {
        return new GroupsSetLongPollSettingsQuery(getClient(), actor);
    }
}

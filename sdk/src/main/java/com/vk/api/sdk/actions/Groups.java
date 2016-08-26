package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.queries.Field;
import com.vk.api.sdk.queries.groups.GroupsAddLinkQuery;
import com.vk.api.sdk.queries.groups.GroupsApproveRequestQuery;
import com.vk.api.sdk.queries.groups.GroupsBanUserQuery;
import com.vk.api.sdk.queries.groups.GroupsCreateQuery;
import com.vk.api.sdk.queries.groups.GroupsDeleteLinkQuery;
import com.vk.api.sdk.queries.groups.GroupsEditLinkQuery;
import com.vk.api.sdk.queries.groups.GroupsEditManagerQuery;
import com.vk.api.sdk.queries.groups.GroupsEditPlaceQuery;
import com.vk.api.sdk.queries.groups.GroupsEditQuery;
import com.vk.api.sdk.queries.groups.GroupsGetBannedQuery;
import com.vk.api.sdk.queries.groups.GroupsGetByIdQuery;
import com.vk.api.sdk.queries.groups.GroupsGetCallbackConfirmationCodeQuery;
import com.vk.api.sdk.queries.groups.GroupsGetCallbackServerSettingsQuery;
import com.vk.api.sdk.queries.groups.GroupsGetCallbackSettingsQuery;
import com.vk.api.sdk.queries.groups.GroupsGetCatalogInfoQuery;
import com.vk.api.sdk.queries.groups.GroupsGetCatalogQuery;
import com.vk.api.sdk.queries.groups.GroupsGetInvitedUsersQuery;
import com.vk.api.sdk.queries.groups.GroupsGetInvitesQuery;
import com.vk.api.sdk.queries.groups.GroupsGetInvitesQueryWithExtended;
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
import com.vk.api.sdk.queries.groups.GroupsSetCallbackServerQuery;
import com.vk.api.sdk.queries.groups.GroupsSetCallbackServerSettingsQuery;
import com.vk.api.sdk.queries.groups.GroupsSetCallbackSettingsQuery;
import com.vk.api.sdk.queries.groups.GroupsUnbanUserQuery;

/**
 * List of Groups methods
 */
public class Groups extends AbstractAction {
    public Groups(VkApiClient client) {
        super(client);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQuery isMember(String groupId) {
        return new GroupsIsMemberQuery(getClient(), groupId);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQuery isMember(Actor actor, String groupId) {
        return new GroupsIsMemberQuery(getClient(), actor, groupId);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQueryWithUserIds isMember(String groupId, Integer... userIds) {
        return new GroupsIsMemberQueryWithUserIds(getClient(), groupId, userIds);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQueryWithUserIds isMember(Actor actor, String groupId, Integer... userIds) {
        return new GroupsIsMemberQueryWithUserIds(getClient(), actor, groupId, userIds);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQueryWithExtended isMemberExtended(String groupId) {
        return new GroupsIsMemberQueryWithExtended(getClient(), groupId);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQueryWithExtended isMemberExtended(Actor actor, String groupId) {
        return new GroupsIsMemberQueryWithExtended(getClient(), actor, groupId);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQueryWithUserIdsExtended isMemberExtended(String groupId, Integer... userIds) {
        return new GroupsIsMemberQueryWithUserIdsExtended(getClient(), groupId, userIds);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     */
    public GroupsIsMemberQueryWithUserIdsExtended isMemberExtended(Actor actor, String groupId, Integer... userIds) {
        return new GroupsIsMemberQueryWithUserIdsExtended(getClient(), actor, groupId, userIds);
    }

    /**
     * Returns information about communities by their IDs.
     */
    public GroupsGetByIdQuery getById() {
        return new GroupsGetByIdQuery(getClient());
    }

    /**
     * Returns information about communities by their IDs.
     */
    public GroupsGetByIdQuery getById(Actor actor) {
        return new GroupsGetByIdQuery(getClient(), actor);
    }

    /**
     * Returns a list of the communities to which a user belongs.
     */
    public GroupsGetQuery get(Actor actor) {
        return new GroupsGetQuery(getClient(), actor);
    }

    /**
     * Returns a list of the communities to which a user belongs.
     */
    public GroupsGetQueryWithExtended getExtended(Actor actor) {
        return new GroupsGetQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of community members.
     */
    public GroupsGetMembersQuery getMembers() {
        return new GroupsGetMembersQuery(getClient());
    }

    /**
     * Returns a list of community members.
     */
    public GroupsGetMembersQuery getMembers(Actor actor) {
        return new GroupsGetMembersQuery(getClient(), actor);
    }

    /**
     * Returns a list of community members.
     */
    public GroupsGetMembersQueryWithFields getMembers(Field... fields) {
        return new GroupsGetMembersQueryWithFields(getClient(), fields);
    }

    /**
     * Returns a list of community members.
     */
    public GroupsGetMembersQueryWithFields getMembers(Actor actor, Field... fields) {
        return new GroupsGetMembersQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns a list of community members.
     */
    public GroupsGetMembersQueryWithFilter getMembers(String filter) {
        return new GroupsGetMembersQueryWithFilter(getClient(), filter);
    }

    /**
     * Returns a list of community members.
     */
    public GroupsGetMembersQueryWithFilter getMembers(Actor actor, String filter) {
        return new GroupsGetMembersQueryWithFilter(getClient(), actor, filter);
    }

    /**
     * With this method you can join the group or public page, and also confirm your participation in an event.
     */
    public GroupsJoinQuery join(Actor actor) {
        return new GroupsJoinQuery(getClient(), actor);
    }

    /**
     * With this method you can leave a group, public page, or event.
     */
    public GroupsLeaveQuery leave(Actor actor, int groupId) {
        return new GroupsLeaveQuery(getClient(), actor, groupId);
    }

    /**
     * Searches for communities by substring.
     */
    public GroupsSearchQuery search(Actor actor, String q) {
        return new GroupsSearchQuery(getClient(), actor, q);
    }

    /**
     * Returns communities list for a catalog category.
     */
    public GroupsGetCatalogQuery getCatalog(Actor actor) {
        return new GroupsGetCatalogQuery(getClient(), actor);
    }

    /**
     * Returns categories list for communities catalog
     */
    public GroupsGetCatalogInfoQuery getCatalogInfo(Actor actor) {
        return new GroupsGetCatalogInfoQuery(getClient(), actor);
    }

    /**
     * Returns a list of invitations to join communities and events.
     */
    public GroupsGetInvitesQuery getInvites(Actor actor) {
        return new GroupsGetInvitesQuery(getClient(), actor);
    }

    /**
     * Returns a list of invitations to join communities and events.
     */
    public GroupsGetInvitesQueryWithExtended getInvitesExtended(Actor actor) {
        return new GroupsGetInvitesQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns invited users list of a community
     */
    public GroupsGetInvitedUsersQuery getInvitedUsers(Actor actor, int groupId) {
        return new GroupsGetInvitedUsersQuery(getClient(), actor, groupId);
    }

    /**
     * Adds a user to a community blacklist.
     */
    public GroupsBanUserQuery banUser(Actor actor, int groupId, int userId) {
        return new GroupsBanUserQuery(getClient(), actor, groupId, userId);
    }

    /**
     * Deletes a user from a community blacklist.
     */
    public GroupsUnbanUserQuery unbanUser(Actor actor, int groupId, int userId) {
        return new GroupsUnbanUserQuery(getClient(), actor, groupId, userId);
    }

    /**
     * Returns a list of users on a community blacklist.
     */
    public GroupsGetBannedQuery getBanned(Actor actor, int groupId) {
        return new GroupsGetBannedQuery(getClient(), actor, groupId);
    }

    /**
     * Creates a new community
     */
    public GroupsCreateQuery create(Actor actor, String title) {
        return new GroupsCreateQuery(getClient(), actor, title);
    }

    /**
     * Edits a community
     */
    public GroupsEditQuery edit(Actor actor, int groupId) {
        return new GroupsEditQuery(getClient(), actor, groupId);
    }

    /**
     * Edits the place in community.
     */
    public GroupsEditPlaceQuery editPlace(Actor actor, int groupId) {
        return new GroupsEditPlaceQuery(getClient(), actor, groupId);
    }

    /**
     * Returns community settings.
     */
    public GroupsGetSettingsQuery getSettings(Actor actor, int groupId) {
        return new GroupsGetSettingsQuery(getClient(), actor, groupId);
    }

    /**
     * Returns a list of requests to the community.
     */
    public GroupsGetRequestsQuery getRequests(Actor actor, int groupId) {
        return new GroupsGetRequestsQuery(getClient(), actor, groupId);
    }

    /**
     * Returns a list of requests to the community.
     */
    public GroupsGetRequestsQueryWithFields getRequests(Actor actor, int groupId, Field... fields) {
        return new GroupsGetRequestsQueryWithFields(getClient(), actor, groupId, fields);
    }

    /**
     * Allows to add, remove or edit the community manager .
     */
    public GroupsEditManagerQuery editManager(Actor actor, int groupId, int userId) {
        return new GroupsEditManagerQuery(getClient(), actor, groupId, userId);
    }

    /**
     * Allows to invite friends to the community.
     */
    public GroupsInviteQuery invite(Actor actor, int groupId, int userId) {
        return new GroupsInviteQuery(getClient(), actor, groupId, userId);
    }

    /**
     * Allows to add a link to the community.
     */
    public GroupsAddLinkQuery addLink(Actor actor, int groupId, String link) {
        return new GroupsAddLinkQuery(getClient(), actor, groupId, link);
    }

    /**
     * Allows to delete a link from the community.
     */
    public GroupsDeleteLinkQuery deleteLink(Actor actor, int groupId, int linkId) {
        return new GroupsDeleteLinkQuery(getClient(), actor, groupId, linkId);
    }

    /**
     * Allows to edit a link in the community.
     */
    public GroupsEditLinkQuery editLink(Actor actor, int groupId, int linkId) {
        return new GroupsEditLinkQuery(getClient(), actor, groupId, linkId);
    }

    /**
     * Allows to reorder links in the community.
     */
    public GroupsReorderLinkQuery reorderLink(Actor actor, int groupId, int linkId) {
        return new GroupsReorderLinkQuery(getClient(), actor, groupId, linkId);
    }

    /**
     * Removes a user from the community.
     */
    public GroupsRemoveUserQuery removeUser(Actor actor, int groupId, int userId) {
        return new GroupsRemoveUserQuery(getClient(), actor, groupId, userId);
    }

    /**
     * Allows to approve join request to the community.
     */
    public GroupsApproveRequestQuery approveRequest(Actor actor, int groupId, int userId) {
        return new GroupsApproveRequestQuery(getClient(), actor, groupId, userId);
    }

    /**
     * Returns Callback API confirmation code for the community.
     */
    public GroupsGetCallbackConfirmationCodeQuery getCallbackConfirmationCode(Actor actor, int groupId) {
        return new GroupsGetCallbackConfirmationCodeQuery(getClient(), actor, groupId);
    }

    /**
     * Returns Callback API server settings for the community.
     */
    public GroupsGetCallbackServerSettingsQuery getCallbackServerSettings(Actor actor, int groupId) {
        return new GroupsGetCallbackServerSettingsQuery(getClient(), actor, groupId);
    }

    /**
     * Returns Callback API notifications settings.
     */
    public GroupsGetCallbackSettingsQuery getCallbackSettings(Actor actor, int groupId) {
        return new GroupsGetCallbackSettingsQuery(getClient(), actor, groupId);
    }

    /**
     * Allow to set Callback API server URL for the community.
     */
    public GroupsSetCallbackServerQuery setCallbackServer(Actor actor, int groupId) {
        return new GroupsSetCallbackServerQuery(getClient(), actor, groupId);
    }

    /**
     * Allow to set Callback API server settings.
     */
    public GroupsSetCallbackServerSettingsQuery setCallbackServerSettings(Actor actor, int groupId) {
        return new GroupsSetCallbackServerSettingsQuery(getClient(), actor, groupId);
    }

    /**
     * Allow to set notifications settings for Callback API.
     */
    public GroupsSetCallbackSettingsQuery setCallbackSettings(Actor actor, int groupId) {
        return new GroupsSetCallbackSettingsQuery(getClient(), actor, groupId);
    }
}

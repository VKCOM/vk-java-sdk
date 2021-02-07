package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.enums.GroupsAct;
import com.vk.api.sdk.objects.enums.GroupsFilter;
import com.vk.api.sdk.objects.enums.GroupsState;
import com.vk.api.sdk.objects.users.Fields;
import com.vk.api.sdk.queries.groups.GroupsAddAddressQuery;
import com.vk.api.sdk.queries.groups.GroupsAddCallbackServerQuery;
import com.vk.api.sdk.queries.groups.GroupsAddLinkQuery;
import com.vk.api.sdk.queries.groups.GroupsApproveRequestQuery;
import com.vk.api.sdk.queries.groups.GroupsBanQuery;
import com.vk.api.sdk.queries.groups.GroupsCreateQuery;
import com.vk.api.sdk.queries.groups.GroupsDeleteAddressQuery;
import com.vk.api.sdk.queries.groups.GroupsDeleteCallbackServerQuery;
import com.vk.api.sdk.queries.groups.GroupsDeleteLinkQuery;
import com.vk.api.sdk.queries.groups.GroupsDisableOnlineQuery;
import com.vk.api.sdk.queries.groups.GroupsEditAddressQuery;
import com.vk.api.sdk.queries.groups.GroupsEditCallbackServerQuery;
import com.vk.api.sdk.queries.groups.GroupsEditLinkQuery;
import com.vk.api.sdk.queries.groups.GroupsEditManagerQuery;
import com.vk.api.sdk.queries.groups.GroupsEditQuery;
import com.vk.api.sdk.queries.groups.GroupsEnableOnlineQuery;
import com.vk.api.sdk.queries.groups.GroupsGetAddressesQuery;
import com.vk.api.sdk.queries.groups.GroupsGetBannedQuery;
import com.vk.api.sdk.queries.groups.GroupsGetByIdQueryWithLegacy;
import com.vk.api.sdk.queries.groups.GroupsGetCallbackConfirmationCodeQuery;
import com.vk.api.sdk.queries.groups.GroupsGetCallbackServersQuery;
import com.vk.api.sdk.queries.groups.GroupsGetCallbackSettingsQuery;
import com.vk.api.sdk.queries.groups.GroupsGetCatalogInfoQuery;
import com.vk.api.sdk.queries.groups.GroupsGetCatalogInfoQueryWithExtended;
import com.vk.api.sdk.queries.groups.GroupsGetCatalogQuery;
import com.vk.api.sdk.queries.groups.GroupsGetInvitedUsersQuery;
import com.vk.api.sdk.queries.groups.GroupsGetInvitesQuery;
import com.vk.api.sdk.queries.groups.GroupsGetInvitesQueryWithExtended;
import com.vk.api.sdk.queries.groups.GroupsGetLongPollServerQuery;
import com.vk.api.sdk.queries.groups.GroupsGetLongPollSettingsQuery;
import com.vk.api.sdk.queries.groups.GroupsGetMembersQuery;
import com.vk.api.sdk.queries.groups.GroupsGetMembersQueryWithFields;
import com.vk.api.sdk.queries.groups.GroupsGetMembersQueryWithFilter;
import com.vk.api.sdk.queries.groups.GroupsGetQuery;
import com.vk.api.sdk.queries.groups.GroupsGetQueryWithExtended;
import com.vk.api.sdk.queries.groups.GroupsGetRequestsQuery;
import com.vk.api.sdk.queries.groups.GroupsGetRequestsQueryWithFields;
import com.vk.api.sdk.queries.groups.GroupsGetSettingsQuery;
import com.vk.api.sdk.queries.groups.GroupsGetTagListQuery;
import com.vk.api.sdk.queries.groups.GroupsGetTokenPermissionsQuery;
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
import com.vk.api.sdk.queries.groups.GroupsSetLongPollSettingsQuery;
import com.vk.api.sdk.queries.groups.GroupsSetSettingsQuery;
import com.vk.api.sdk.queries.groups.GroupsSetUserNoteQuery;
import com.vk.api.sdk.queries.groups.GroupsTagAddQuery;
import com.vk.api.sdk.queries.groups.GroupsTagBindQuery;
import com.vk.api.sdk.queries.groups.GroupsTagDeleteQuery;
import com.vk.api.sdk.queries.groups.GroupsTagUpdateQuery;
import com.vk.api.sdk.queries.groups.GroupsToggleMarketQuery;
import com.vk.api.sdk.queries.groups.GroupsUnbanQuery;

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
     * @param actor vk actor
     * @param groupId
     * @param title
     * @param address
     * @param countryId
     * @param cityId
     * @param latitude
     * @param longitude
     * @return query
     */
    public GroupsAddAddressQuery addAddress(UserActor actor, int groupId, String title,
            String address, int countryId, int cityId, double latitude, double longitude) {
        return new GroupsAddAddressQuery(getClient(), actor, groupId, title, address, countryId, cityId, latitude, longitude);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @param title
     * @param address
     * @param countryId
     * @param cityId
     * @param latitude
     * @param longitude
     * @return query
     */
    public GroupsAddAddressQuery addAddress(GroupActor actor, int groupId, String title,
            String address, int countryId, int cityId, double latitude, double longitude) {
        return new GroupsAddAddressQuery(getClient(), actor, groupId, title, address, countryId, cityId, latitude, longitude);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @param url
     * @param title
     * @return query
     */
    public GroupsAddCallbackServerQuery addCallbackServer(UserActor actor, int groupId, String url,
            String title) {
        return new GroupsAddCallbackServerQuery(getClient(), actor, groupId, url, title);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @param url
     * @param title
     * @return query
     */
    public GroupsAddCallbackServerQuery addCallbackServer(GroupActor actor, int groupId, String url,
            String title) {
        return new GroupsAddCallbackServerQuery(getClient(), actor, groupId, url, title);
    }

    /**
     * Allows to add a link to the community.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @param link Link URL.
     * @return query
     */
    public GroupsAddLinkQuery addLink(UserActor actor, int groupId, String link) {
        return new GroupsAddLinkQuery(getClient(), actor, groupId, link);
    }

    /**
     * Allows to approve join request to the community.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @param userId User ID.
     * @return query
     */
    public GroupsApproveRequestQuery approveRequest(UserActor actor, int groupId, int userId) {
        return new GroupsApproveRequestQuery(getClient(), actor, groupId, userId);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @return query
     */
    public GroupsBanQuery ban(UserActor actor, int groupId) {
        return new GroupsBanQuery(getClient(), actor, groupId);
    }

    /**
     * Creates a new community.
     *
     * @param actor vk actor
     * @param title Community title.
     * @return query
     */
    public GroupsCreateQuery create(UserActor actor, String title) {
        return new GroupsCreateQuery(getClient(), actor, title);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @param addressId
     * @return query
     */
    public GroupsDeleteAddressQuery deleteAddress(UserActor actor, int groupId, int addressId) {
        return new GroupsDeleteAddressQuery(getClient(), actor, groupId, addressId);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @param addressId
     * @return query
     */
    public GroupsDeleteAddressQuery deleteAddress(GroupActor actor, int groupId, int addressId) {
        return new GroupsDeleteAddressQuery(getClient(), actor, groupId, addressId);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @param serverId
     * @return query
     */
    public GroupsDeleteCallbackServerQuery deleteCallbackServer(UserActor actor, int groupId,
            int serverId) {
        return new GroupsDeleteCallbackServerQuery(getClient(), actor, groupId, serverId);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @param serverId
     * @return query
     */
    public GroupsDeleteCallbackServerQuery deleteCallbackServer(GroupActor actor, int groupId,
            int serverId) {
        return new GroupsDeleteCallbackServerQuery(getClient(), actor, groupId, serverId);
    }

    /**
     * Allows to delete a link from the community.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @param linkId Link ID.
     * @return query
     */
    public GroupsDeleteLinkQuery deleteLink(UserActor actor, int groupId, int linkId) {
        return new GroupsDeleteLinkQuery(getClient(), actor, groupId, linkId);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @return query
     */
    public GroupsDisableOnlineQuery disableOnline(UserActor actor, int groupId) {
        return new GroupsDisableOnlineQuery(getClient(), actor, groupId);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @return query
     */
    public GroupsDisableOnlineQuery disableOnline(GroupActor actor, int groupId) {
        return new GroupsDisableOnlineQuery(getClient(), actor, groupId);
    }

    /**
     * Edits a community.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @return query
     */
    public GroupsEditQuery edit(UserActor actor, int groupId) {
        return new GroupsEditQuery(getClient(), actor, groupId);
    }

    /**
     * Edits a community.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @return query
     */
    public GroupsEditQuery edit(GroupActor actor, int groupId) {
        return new GroupsEditQuery(getClient(), actor, groupId);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @param addressId
     * @return query
     */
    public GroupsEditAddressQuery editAddress(UserActor actor, int groupId, int addressId) {
        return new GroupsEditAddressQuery(getClient(), actor, groupId, addressId);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @param addressId
     * @return query
     */
    public GroupsEditAddressQuery editAddress(GroupActor actor, int groupId, int addressId) {
        return new GroupsEditAddressQuery(getClient(), actor, groupId, addressId);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @param serverId
     * @param url
     * @param title
     * @return query
     */
    public GroupsEditCallbackServerQuery editCallbackServer(UserActor actor, int groupId,
            int serverId, String url, String title) {
        return new GroupsEditCallbackServerQuery(getClient(), actor, groupId, serverId, url, title);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @param serverId
     * @param url
     * @param title
     * @return query
     */
    public GroupsEditCallbackServerQuery editCallbackServer(GroupActor actor, int groupId,
            int serverId, String url, String title) {
        return new GroupsEditCallbackServerQuery(getClient(), actor, groupId, serverId, url, title);
    }

    /**
     * Allows to edit a link in the community.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @param linkId Link ID.
     * @return query
     */
    public GroupsEditLinkQuery editLink(UserActor actor, int groupId, int linkId) {
        return new GroupsEditLinkQuery(getClient(), actor, groupId, linkId);
    }

    /**
     * Allows to add, remove or edit the community manager.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @param userId User ID.
     * @return query
     */
    public GroupsEditManagerQuery editManager(UserActor actor, int groupId, int userId) {
        return new GroupsEditManagerQuery(getClient(), actor, groupId, userId);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @return query
     */
    public GroupsEnableOnlineQuery enableOnline(UserActor actor, int groupId) {
        return new GroupsEnableOnlineQuery(getClient(), actor, groupId);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @return query
     */
    public GroupsEnableOnlineQuery enableOnline(GroupActor actor, int groupId) {
        return new GroupsEnableOnlineQuery(getClient(), actor, groupId);
    }

    /**
     * Returns a list of the communities to which a user belongs.
     *
     * @param actor vk actor
     * @return query
     */
    public GroupsGetQuery get(UserActor actor) {
        return new GroupsGetQuery(getClient(), actor);
    }

    /**
     * Returns a list of the communities to which a user belongs.
     *
     * @param actor vk actor
     * @return query
     */
    public GroupsGetQueryWithExtended getExtended(UserActor actor) {
        return new GroupsGetQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns a list of community addresses.
     *
     * @param actor vk actor
     * @param groupId ID or screen name of the community.
     * @return query
     */
    public GroupsGetAddressesQuery getAddresses(UserActor actor, int groupId) {
        return new GroupsGetAddressesQuery(getClient(), actor, groupId);
    }

    /**
     * Returns a list of community addresses.
     *
     * @param actor vk actor
     * @param groupId ID or screen name of the community.
     * @return query
     */
    public GroupsGetAddressesQuery getAddresses(ServiceActor actor, int groupId) {
        return new GroupsGetAddressesQuery(getClient(), actor, groupId);
    }

    /**
     * Returns a list of users on a community blacklist.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @return query
     */
    public GroupsGetBannedQuery getBanned(UserActor actor, int groupId) {
        return new GroupsGetBannedQuery(getClient(), actor, groupId);
    }

    /**
     * Returns a list of users on a community blacklist.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @return query
     */
    public GroupsGetBannedQuery getBanned(GroupActor actor, int groupId) {
        return new GroupsGetBannedQuery(getClient(), actor, groupId);
    }

    /**
     * Returns information about communities by their IDs.
     *
     * @param actor vk actor
     * @return query
     */
    public GroupsGetByIdQueryWithLegacy getByIdLegacy(UserActor actor) {
        return new GroupsGetByIdQueryWithLegacy(getClient(), actor);
    }

    /**
     * Returns information about communities by their IDs.
     *
     * @param actor vk actor
     * @return query
     */
    public GroupsGetByIdQueryWithLegacy getByIdLegacy(GroupActor actor) {
        return new GroupsGetByIdQueryWithLegacy(getClient(), actor);
    }

    /**
     * Returns information about communities by their IDs.
     *
     * @param actor vk actor
     * @return query
     */
    public GroupsGetByIdQueryWithLegacy getByIdLegacy(ServiceActor actor) {
        return new GroupsGetByIdQueryWithLegacy(getClient(), actor);
    }

    /**
     * Returns Callback API confirmation code for the community.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @return query
     */
    public GroupsGetCallbackConfirmationCodeQuery getCallbackConfirmationCode(UserActor actor,
            int groupId) {
        return new GroupsGetCallbackConfirmationCodeQuery(getClient(), actor, groupId);
    }

    /**
     * Returns Callback API confirmation code for the community.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @return query
     */
    public GroupsGetCallbackConfirmationCodeQuery getCallbackConfirmationCode(GroupActor actor,
            int groupId) {
        return new GroupsGetCallbackConfirmationCodeQuery(getClient(), actor, groupId);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @return query
     */
    public GroupsGetCallbackServersQuery getCallbackServers(UserActor actor, int groupId) {
        return new GroupsGetCallbackServersQuery(getClient(), actor, groupId);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @return query
     */
    public GroupsGetCallbackServersQuery getCallbackServers(GroupActor actor, int groupId) {
        return new GroupsGetCallbackServersQuery(getClient(), actor, groupId);
    }

    /**
     * Returns [vk.com/dev/callback_api|Callback API] notifications settings.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @return query
     */
    public GroupsGetCallbackSettingsQuery getCallbackSettings(UserActor actor, int groupId) {
        return new GroupsGetCallbackSettingsQuery(getClient(), actor, groupId);
    }

    /**
     * Returns [vk.com/dev/callback_api|Callback API] notifications settings.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @return query
     */
    public GroupsGetCallbackSettingsQuery getCallbackSettings(GroupActor actor, int groupId) {
        return new GroupsGetCallbackSettingsQuery(getClient(), actor, groupId);
    }

    /**
     * Returns communities list for a catalog category.
     *
     * @param actor vk actor
     * @return query
     */
    public GroupsGetCatalogQuery getCatalog(UserActor actor) {
        return new GroupsGetCatalogQuery(getClient(), actor);
    }

    /**
     * Returns categories list for communities catalog
     *
     * @param actor vk actor
     * @return query
     */
    public GroupsGetCatalogInfoQueryWithExtended getCatalogInfoExtended(UserActor actor) {
        return new GroupsGetCatalogInfoQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns categories list for communities catalog
     *
     * @param actor vk actor
     * @return query
     */
    public GroupsGetCatalogInfoQuery getCatalogInfo(UserActor actor) {
        return new GroupsGetCatalogInfoQuery(getClient(), actor);
    }

    /**
     * Returns invited users list of a community
     *
     * @param actor vk actor
     * @param groupId Group ID to return invited users for.
     * @return query
     */
    public GroupsGetInvitedUsersQuery getInvitedUsers(UserActor actor, int groupId) {
        return new GroupsGetInvitedUsersQuery(getClient(), actor, groupId);
    }

    /**
     * Returns a list of invitations to join communities and events.
     *
     * @param actor vk actor
     * @return query
     */
    public GroupsGetInvitesQuery getInvites(UserActor actor) {
        return new GroupsGetInvitesQuery(getClient(), actor);
    }

    /**
     * Returns a list of invitations to join communities and events.
     *
     * @param actor vk actor
     * @return query
     */
    public GroupsGetInvitesQueryWithExtended getInvitesExtended(UserActor actor) {
        return new GroupsGetInvitesQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns the data needed to query a Long Poll server for events
     *
     * @param actor vk actor
     * @param groupId Community ID
     * @return query
     */
    public GroupsGetLongPollServerQuery getLongPollServer(UserActor actor, int groupId) {
        return new GroupsGetLongPollServerQuery(getClient(), actor, groupId);
    }

    /**
     * Returns the data needed to query a Long Poll server for events
     *
     * @param actor vk actor
     * @param groupId Community ID
     * @return query
     */
    public GroupsGetLongPollServerQuery getLongPollServer(GroupActor actor, int groupId) {
        return new GroupsGetLongPollServerQuery(getClient(), actor, groupId);
    }

    /**
     * Returns Long Poll notification settings
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @return query
     */
    public GroupsGetLongPollSettingsQuery getLongPollSettings(UserActor actor, int groupId) {
        return new GroupsGetLongPollSettingsQuery(getClient(), actor, groupId);
    }

    /**
     * Returns Long Poll notification settings
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @return query
     */
    public GroupsGetLongPollSettingsQuery getLongPollSettings(GroupActor actor, int groupId) {
        return new GroupsGetLongPollSettingsQuery(getClient(), actor, groupId);
    }

    /**
     * Returns a list of community members.
     *
     * @param actor vk actor
     * @return query
     */
    public GroupsGetMembersQuery getMembers(UserActor actor) {
        return new GroupsGetMembersQuery(getClient(), actor);
    }

    /**
     * Returns a list of community members.
     *
     * @param actor vk actor
     * @return query
     */
    public GroupsGetMembersQuery getMembers(GroupActor actor) {
        return new GroupsGetMembersQuery(getClient(), actor);
    }

    /**
     * Returns a list of community members.
     *
     * @param actor vk actor
     * @return query
     */
    public GroupsGetMembersQuery getMembers(ServiceActor actor) {
        return new GroupsGetMembersQuery(getClient(), actor);
    }

    /**
     * Returns a list of community members.
     *
     * @param actor vk actor
     * @param fields List of additional fields to be returned. Available values: 'sex, bdate, city, country, photo_50, photo_100, photo_200_orig, photo_200, photo_400_orig, photo_max, photo_max_orig, online, online_mobile, lists, domain, has_mobile, contacts, connections, site, education, universities, schools, can_post, can_see_all_posts, can_see_audio, can_write_private_message, status, last_seen, common_count, relation, relatives, counters'.
     * @return query
     */
    public GroupsGetMembersQueryWithFields getMembersWithFields(UserActor actor, Fields... fields) {
        return new GroupsGetMembersQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns a list of community members.
     *
     * @param actor vk actor
     * @param fields List of additional fields to be returned. Available values: 'sex, bdate, city, country, photo_50, photo_100, photo_200_orig, photo_200, photo_400_orig, photo_max, photo_max_orig, online, online_mobile, lists, domain, has_mobile, contacts, connections, site, education, universities, schools, can_post, can_see_all_posts, can_see_audio, can_write_private_message, status, last_seen, common_count, relation, relatives, counters'.
     * @return query
     */
    public GroupsGetMembersQueryWithFields getMembersWithFields(GroupActor actor,
            Fields... fields) {
        return new GroupsGetMembersQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns a list of community members.
     *
     * @param actor vk actor
     * @param fields List of additional fields to be returned. Available values: 'sex, bdate, city, country, photo_50, photo_100, photo_200_orig, photo_200, photo_400_orig, photo_max, photo_max_orig, online, online_mobile, lists, domain, has_mobile, contacts, connections, site, education, universities, schools, can_post, can_see_all_posts, can_see_audio, can_write_private_message, status, last_seen, common_count, relation, relatives, counters'.
     * @return query
     */
    public GroupsGetMembersQueryWithFields getMembersWithFields(ServiceActor actor,
            Fields... fields) {
        return new GroupsGetMembersQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns a list of community members.
     *
     * @param actor vk actor
     * @param filter *'friends' – only friends in this community will be returned,, *'unsure' – only those who pressed 'I may attend' will be returned (if it's an event).
     * @return query
     */
    public GroupsGetMembersQueryWithFilter getMembersWithFilter(UserActor actor,
            GroupsFilter filter) {
        return new GroupsGetMembersQueryWithFilter(getClient(), actor, filter);
    }

    /**
     * Returns a list of community members.
     *
     * @param actor vk actor
     * @param filter *'friends' – only friends in this community will be returned,, *'unsure' – only those who pressed 'I may attend' will be returned (if it's an event).
     * @return query
     */
    public GroupsGetMembersQueryWithFilter getMembersWithFilter(GroupActor actor,
            GroupsFilter filter) {
        return new GroupsGetMembersQueryWithFilter(getClient(), actor, filter);
    }

    /**
     * Returns a list of community members.
     *
     * @param actor vk actor
     * @param filter *'friends' – only friends in this community will be returned,, *'unsure' – only those who pressed 'I may attend' will be returned (if it's an event).
     * @return query
     */
    public GroupsGetMembersQueryWithFilter getMembersWithFilter(ServiceActor actor,
            GroupsFilter filter) {
        return new GroupsGetMembersQueryWithFilter(getClient(), actor, filter);
    }

    /**
     * Returns a list of requests to the community.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @param fields Profile fields to return.
     * @return query
     */
    public GroupsGetRequestsQueryWithFields getRequestsWithFields(UserActor actor, int groupId,
            Fields... fields) {
        return new GroupsGetRequestsQueryWithFields(getClient(), actor, groupId, fields);
    }

    /**
     * Returns a list of requests to the community.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @return query
     */
    public GroupsGetRequestsQuery getRequests(UserActor actor, int groupId) {
        return new GroupsGetRequestsQuery(getClient(), actor, groupId);
    }

    /**
     * Returns community settings.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @return query
     */
    public GroupsGetSettingsQuery getSettings(UserActor actor, int groupId) {
        return new GroupsGetSettingsQuery(getClient(), actor, groupId);
    }

    /**
     * List of group's tags
     *
     * @param actor vk actor
     * @param groupId
     * @return query
     */
    public GroupsGetTagListQuery getTagList(UserActor actor, int groupId) {
        return new GroupsGetTagListQuery(getClient(), actor, groupId);
    }

    /**
     * @param actor vk actor
     * @return query
     */
    public GroupsGetTokenPermissionsQuery getTokenPermissions(GroupActor actor) {
        return new GroupsGetTokenPermissionsQuery(getClient(), actor);
    }

    /**
     * Allows to invite friends to the community.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @param userId User ID.
     * @return query
     */
    public GroupsInviteQuery invite(UserActor actor, int groupId, int userId) {
        return new GroupsInviteQuery(getClient(), actor, groupId, userId);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     *
     * @param actor vk actor
     * @param groupId ID or screen name of the community.
     * @return query
     */
    public GroupsIsMemberQueryWithExtended isMemberExtended(UserActor actor, String groupId) {
        return new GroupsIsMemberQueryWithExtended(getClient(), actor, groupId);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     *
     * @param actor vk actor
     * @param groupId ID or screen name of the community.
     * @return query
     */
    public GroupsIsMemberQueryWithExtended isMemberExtended(GroupActor actor, String groupId) {
        return new GroupsIsMemberQueryWithExtended(getClient(), actor, groupId);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     *
     * @param actor vk actor
     * @param groupId ID or screen name of the community.
     * @return query
     */
    public GroupsIsMemberQueryWithExtended isMemberExtended(ServiceActor actor, String groupId) {
        return new GroupsIsMemberQueryWithExtended(getClient(), actor, groupId);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     *
     * @param actor vk actor
     * @param groupId ID or screen name of the community.
     * @return query
     */
    public GroupsIsMemberQueryWithUserIdsExtended isMemberUserIdsExtended(UserActor actor,
            String groupId) {
        return new GroupsIsMemberQueryWithUserIdsExtended(getClient(), actor, groupId);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     *
     * @param actor vk actor
     * @param groupId ID or screen name of the community.
     * @return query
     */
    public GroupsIsMemberQueryWithUserIdsExtended isMemberUserIdsExtended(GroupActor actor,
            String groupId) {
        return new GroupsIsMemberQueryWithUserIdsExtended(getClient(), actor, groupId);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     *
     * @param actor vk actor
     * @param groupId ID or screen name of the community.
     * @return query
     */
    public GroupsIsMemberQueryWithUserIdsExtended isMemberUserIdsExtended(ServiceActor actor,
            String groupId) {
        return new GroupsIsMemberQueryWithUserIdsExtended(getClient(), actor, groupId);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     *
     * @param actor vk actor
     * @param groupId ID or screen name of the community.
     * @param userIds User IDs.
     * @return query
     */
    public GroupsIsMemberQueryWithUserIds isMemberWithUserIds(UserActor actor, String groupId,
            Integer... userIds) {
        return new GroupsIsMemberQueryWithUserIds(getClient(), actor, groupId, userIds);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     *
     * @param actor vk actor
     * @param groupId ID or screen name of the community.
     * @param userIds User IDs.
     * @return query
     */
    public GroupsIsMemberQueryWithUserIds isMemberWithUserIds(GroupActor actor, String groupId,
            Integer... userIds) {
        return new GroupsIsMemberQueryWithUserIds(getClient(), actor, groupId, userIds);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     *
     * @param actor vk actor
     * @param groupId ID or screen name of the community.
     * @param userIds User IDs.
     * @return query
     */
    public GroupsIsMemberQueryWithUserIds isMemberWithUserIds(ServiceActor actor, String groupId,
            Integer... userIds) {
        return new GroupsIsMemberQueryWithUserIds(getClient(), actor, groupId, userIds);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     *
     * @param actor vk actor
     * @param groupId ID or screen name of the community.
     * @return query
     */
    public GroupsIsMemberQuery isMember(UserActor actor, String groupId) {
        return new GroupsIsMemberQuery(getClient(), actor, groupId);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     *
     * @param actor vk actor
     * @param groupId ID or screen name of the community.
     * @return query
     */
    public GroupsIsMemberQuery isMember(GroupActor actor, String groupId) {
        return new GroupsIsMemberQuery(getClient(), actor, groupId);
    }

    /**
     * Returns information specifying whether a user is a member of a community.
     *
     * @param actor vk actor
     * @param groupId ID or screen name of the community.
     * @return query
     */
    public GroupsIsMemberQuery isMember(ServiceActor actor, String groupId) {
        return new GroupsIsMemberQuery(getClient(), actor, groupId);
    }

    /**
     * With this method you can join the group or public page, and also confirm your participation in an event.
     *
     * @param actor vk actor
     * @return query
     */
    public GroupsJoinQuery join(UserActor actor) {
        return new GroupsJoinQuery(getClient(), actor);
    }

    /**
     * With this method you can leave a group, public page, or event.
     *
     * @param actor vk actor
     * @param groupId ID or screen name of the community.
     * @return query
     */
    public GroupsLeaveQuery leave(UserActor actor, int groupId) {
        return new GroupsLeaveQuery(getClient(), actor, groupId);
    }

    /**
     * Removes a user from the community.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @param userId User ID.
     * @return query
     */
    public GroupsRemoveUserQuery removeUser(UserActor actor, int groupId, int userId) {
        return new GroupsRemoveUserQuery(getClient(), actor, groupId, userId);
    }

    /**
     * Allows to reorder links in the community.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @param linkId Link ID.
     * @return query
     */
    public GroupsReorderLinkQuery reorderLink(UserActor actor, int groupId, int linkId) {
        return new GroupsReorderLinkQuery(getClient(), actor, groupId, linkId);
    }

    /**
     * Returns a list of communities matching the search criteria.
     *
     * @param actor vk actor
     * @param q Search query string.
     * @return query
     */
    public GroupsSearchQuery search(UserActor actor, String q) {
        return new GroupsSearchQuery(getClient(), actor, q);
    }

    /**
     * Allow to set notifications settings for group.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @return query
     */
    public GroupsSetCallbackSettingsQuery setCallbackSettings(UserActor actor, int groupId) {
        return new GroupsSetCallbackSettingsQuery(getClient(), actor, groupId);
    }

    /**
     * Allow to set notifications settings for group.
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @return query
     */
    public GroupsSetCallbackSettingsQuery setCallbackSettings(GroupActor actor, int groupId) {
        return new GroupsSetCallbackSettingsQuery(getClient(), actor, groupId);
    }

    /**
     * Sets Long Poll notification settings
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @return query
     */
    public GroupsSetLongPollSettingsQuery setLongPollSettings(UserActor actor, int groupId) {
        return new GroupsSetLongPollSettingsQuery(getClient(), actor, groupId);
    }

    /**
     * Sets Long Poll notification settings
     *
     * @param actor vk actor
     * @param groupId Community ID.
     * @return query
     */
    public GroupsSetLongPollSettingsQuery setLongPollSettings(GroupActor actor, int groupId) {
        return new GroupsSetLongPollSettingsQuery(getClient(), actor, groupId);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @return query
     */
    public GroupsSetSettingsQuery setSettings(UserActor actor, int groupId) {
        return new GroupsSetSettingsQuery(getClient(), actor, groupId);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @return query
     */
    public GroupsSetSettingsQuery setSettings(GroupActor actor, int groupId) {
        return new GroupsSetSettingsQuery(getClient(), actor, groupId);
    }

    /**
     * In order to save note about group participant
     *
     * @param actor vk actor
     * @param groupId
     * @param userId
     * @return query
     */
    public GroupsSetUserNoteQuery setUserNote(UserActor actor, int groupId, int userId) {
        return new GroupsSetUserNoteQuery(getClient(), actor, groupId, userId);
    }

    /**
     * Add new group's tag
     *
     * @param actor vk actor
     * @param groupId
     * @param tagName
     * @return query
     */
    public GroupsTagAddQuery tagAdd(UserActor actor, int groupId, String tagName) {
        return new GroupsTagAddQuery(getClient(), actor, groupId, tagName);
    }

    /**
     * Bind or unbind group's tag to user
     *
     * @param actor vk actor
     * @param groupId
     * @param tagId
     * @param userId
     * @param act Describe the action
     * @return query
     */
    public GroupsTagBindQuery tagBind(UserActor actor, int groupId, int tagId, int userId,
            GroupsAct act) {
        return new GroupsTagBindQuery(getClient(), actor, groupId, tagId, userId, act);
    }

    /**
     * Delete group's tag
     *
     * @param actor vk actor
     * @param groupId
     * @param tagId
     * @return query
     */
    public GroupsTagDeleteQuery tagDelete(UserActor actor, int groupId, int tagId) {
        return new GroupsTagDeleteQuery(getClient(), actor, groupId, tagId);
    }

    /**
     * Update group's tag
     *
     * @param actor vk actor
     * @param groupId
     * @param tagId
     * @param tagName
     * @return query
     */
    public GroupsTagUpdateQuery tagUpdate(UserActor actor, int groupId, int tagId, String tagName) {
        return new GroupsTagUpdateQuery(getClient(), actor, groupId, tagId, tagName);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @param state
     * @return query
     */
    public GroupsToggleMarketQuery toggleMarket(UserActor actor, int groupId, GroupsState state) {
        return new GroupsToggleMarketQuery(getClient(), actor, groupId, state);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @return query
     */
    public GroupsUnbanQuery unban(UserActor actor, int groupId) {
        return new GroupsUnbanQuery(getClient(), actor, groupId);
    }
}

package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.account.AccountBanUserQuery;
import com.vk.api.sdk.queries.account.AccountChangePasswordQuery;
import com.vk.api.sdk.queries.account.AccountGetActiveOffersQuery;
import com.vk.api.sdk.queries.account.AccountGetAppPermissionsQuery;
import com.vk.api.sdk.queries.account.AccountGetBannedQuery;
import com.vk.api.sdk.queries.account.AccountGetCountersQuery;
import com.vk.api.sdk.queries.account.AccountGetInfoQuery;
import com.vk.api.sdk.queries.account.AccountGetProfileInfoQuery;
import com.vk.api.sdk.queries.account.AccountGetPushSettingsQuery;
import com.vk.api.sdk.queries.account.AccountLookupContactsQuery;
import com.vk.api.sdk.queries.account.AccountLookupContactsService;
import com.vk.api.sdk.queries.account.AccountRegisterDeviceQuery;
import com.vk.api.sdk.queries.account.AccountSaveProfileInfoQuery;
import com.vk.api.sdk.queries.account.AccountSetInfoQuery;
import com.vk.api.sdk.queries.account.AccountSetNameInMenuQuery;
import com.vk.api.sdk.queries.account.AccountSetOfflineQuery;
import com.vk.api.sdk.queries.account.AccountSetOnlineQuery;
import com.vk.api.sdk.queries.account.AccountSetPushSettingsQuery;
import com.vk.api.sdk.queries.account.AccountSetSilenceModeQuery;
import com.vk.api.sdk.queries.account.AccountUnbanUserQuery;
import com.vk.api.sdk.queries.account.AccountUnregisterDeviceQuery;

/**
 * List of Account methods
 */
public class Account extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Account(VkApiClient client) {
        super(client);
    }

    /**
     * Returns non-null values of user counters.
     *
     * @param actor vk actor
     * @return query
     */
    public AccountGetCountersQuery getCounters(UserActor actor) {
        return new AccountGetCountersQuery(getClient(), actor);
    }

    /**
     * Sets an application screen name (up to 17 characters), that is shown to the user in the left menu.
     *
     * @param actor  vk actor
     * @param userId user id
     * @return query
     */
    public AccountSetNameInMenuQuery setNameInMenu(UserActor actor, int userId) {
        return new AccountSetNameInMenuQuery(getClient(), actor, userId);
    }

    /**
     * Marks the current user as online for 15 minutes.
     *
     * @param actor vk actor
     * @return query
     */
    public AccountSetOnlineQuery setOnline(UserActor actor) {
        return new AccountSetOnlineQuery(getClient(), actor);
    }

    /**
     * Marks a current user as offline.
     *
     * @param actor vk actor
     * @return query
     */
    public AccountSetOfflineQuery setOffline(UserActor actor) {
        return new AccountSetOfflineQuery(getClient(), actor);
    }

    /**
     * Allows to search the VK users using phone numbers, e-mail addresses and user IDs on other services.
     *
     * @param actor vk actor
     * @return query
     */
    public AccountLookupContactsQuery lookupContacts(UserActor actor, AccountLookupContactsService service) {
        return new AccountLookupContactsQuery(getClient(), actor, service);
    }

    /**
     * Subscribes an iOS/Android-based device to receive push notifications
     *
     * @param actor    vk actor
     * @param token    device token
     * @param deviceId device id
     * @return query
     */
    public AccountRegisterDeviceQuery registerDevice(UserActor actor, String token, String deviceId) {
        return new AccountRegisterDeviceQuery(getClient(), actor, token, deviceId);
    }

    /**
     * Unsubscribes a device from push notifications.
     *
     * @param actor vk actor
     * @return query
     */
    public AccountUnregisterDeviceQuery unregisterDevice(UserActor actor) {
        return new AccountUnregisterDeviceQuery(getClient(), actor);
    }

    /**
     * Mutes in parameters of sent push notifications for the set period of time.
     *
     * @param actor vk actor
     * @return query
     */
    public AccountSetSilenceModeQuery setSilenceMode(UserActor actor) {
        return new AccountSetSilenceModeQuery(getClient(), actor);
    }

    /**
     * Gets settings of push notifications.
     *
     * @param actor vk actor
     * @return query
     */
    public AccountGetPushSettingsQuery getPushSettings(UserActor actor) {
        return new AccountGetPushSettingsQuery(getClient(), actor);
    }

    /**
     * Set push of push notifications
     *
     * @param actor    vk actor
     * @param deviceId device id
     * @return query
     */
    public AccountSetPushSettingsQuery setPushSettings(UserActor actor, String deviceId) {
        return new AccountSetPushSettingsQuery(getClient(), actor, deviceId);
    }

    /**
     * Gets settings of the current user in this application.
     *
     * @param actor  vk actor
     * @param userId user id
     * @return query
     */
    public AccountGetAppPermissionsQuery getAppPermissions(UserActor actor, int userId) {
        return new AccountGetAppPermissionsQuery(getClient(), actor, userId);
    }

    /**
     * Returns a list of active ads (offers) which executed by the user will bring him/her respective number of votes
     * to his balance in the application.
     *
     * @param actor vk actor
     * @return query
     */
    public AccountGetActiveOffersQuery getActiveOffers(UserActor actor) {
        return new AccountGetActiveOffersQuery(getClient(), actor);
    }

    /**
     * Adds user to the banlist.
     *
     * @param actor  vk actor
     * @param userId user id
     * @return query
     */
    public AccountBanUserQuery banUser(UserActor actor, int userId) {
        return new AccountBanUserQuery(getClient(), actor, userId);
    }

    /**
     * Deletes user from the banlist.
     *
     * @param actor  vk actor
     * @param userId user id
     * @return query
     */
    public AccountUnbanUserQuery unbanUser(UserActor actor, int userId) {
        return new AccountUnbanUserQuery(getClient(), actor, userId);
    }

    /**
     * Returns a user's blacklist.
     *
     * @param actor vk actor
     * @return query
     */
    public AccountGetBannedQuery getBanned(UserActor actor) {
        return new AccountGetBannedQuery(getClient(), actor);
    }

    /**
     * Returns current account info.
     *
     * @param actor vk actor
     * @return query
     */
    public AccountGetInfoQuery getInfo(UserActor actor) {
        return new AccountGetInfoQuery(getClient(), actor);
    }

    /**
     * Allows to edit the current account info.
     *
     * @param actor vk actor
     * @return query
     */
    public AccountSetInfoQuery setInfo(UserActor actor) {
        return new AccountSetInfoQuery(getClient(), actor);
    }

    /**
     * Changes a user password after access is successfully restored with the auth.restore method.
     *
     * @param actor       vk actor
     * @param newPassword new password
     * @return query
     */
    public AccountChangePasswordQuery changePassword(UserActor actor, String newPassword) {
        return new AccountChangePasswordQuery(getClient(), actor, newPassword);
    }

    /**
     * Returns the current account info
     *
     * @param actor vk actor
     * @return query
     */
    public AccountGetProfileInfoQuery getProfileInfo(UserActor actor) {
        return new AccountGetProfileInfoQuery(getClient(), actor);
    }

    /**
     * Edits current profile info.
     *
     * @param actor vk actor
     * @return query
     */
    public AccountSaveProfileInfoQuery saveProfileInfo(UserActor actor) {
        return new AccountSaveProfileInfoQuery(getClient(), actor);
    }
}

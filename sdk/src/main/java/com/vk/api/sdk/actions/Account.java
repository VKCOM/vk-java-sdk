package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
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
    public Account(VkApiClient client) {
        super(client);
    }

    /**
     * Returns non-null values of user counters.
     */
    public AccountGetCountersQuery getCounters(Actor actor) {
        return new AccountGetCountersQuery(getClient(), actor);
    }

    /**
     * Sets an application screen name (up to 17 characters), that is shown to the user in the left menu.
     */
    public AccountSetNameInMenuQuery setNameInMenu(Actor actor, int userId) {
        return new AccountSetNameInMenuQuery(getClient(), actor, userId);
    }

    /**
     * Marks the current user as online for 15 minutes.
     */
    public AccountSetOnlineQuery setOnline(Actor actor) {
        return new AccountSetOnlineQuery(getClient(), actor);
    }

    /**
     * Marks a current user as Offline.
     */
    public AccountSetOfflineQuery setOffline(Actor actor) {
        return new AccountSetOfflineQuery(getClient(), actor);
    }

    /**
     * Allows to search the VK users using phone nubmers, e-mail addresses and user IDs on other services.
     */
    public AccountLookupContactsQuery lookupContacts(Actor actor, String service) {
        return new AccountLookupContactsQuery(getClient(), actor, service);
    }

    /**
     * Subscribes an iOS/Android-based device to receive push notifications
     */
    public AccountRegisterDeviceQuery registerDevice(Actor actor, String token, String deviceId) {
        return new AccountRegisterDeviceQuery(getClient(), actor, token, deviceId);
    }

    /**
     * Unsubscribes a device from push notifications.
     */
    public AccountUnregisterDeviceQuery unregisterDevice(Actor actor) {
        return new AccountUnregisterDeviceQuery(getClient(), actor);
    }

    /**
     * Mutes in parameters of sent push notifications for the set period of time.
     */
    public AccountSetSilenceModeQuery setSilenceMode(Actor actor) {
        return new AccountSetSilenceModeQuery(getClient(), actor);
    }

    /**
     * Gets settings of push notifications.
     */
    public AccountGetPushSettingsQuery getPushSettings(Actor actor) {
        return new AccountGetPushSettingsQuery(getClient(), actor);
    }

    public AccountSetPushSettingsQuery setPushSettings(Actor actor, String deviceId) {
        return new AccountSetPushSettingsQuery(getClient(), actor, deviceId);
    }

    /**
     * Gets settings of the current user in this application.
     */
    public AccountGetAppPermissionsQuery getAppPermissions(Actor actor, int userId) {
        return new AccountGetAppPermissionsQuery(getClient(), actor, userId);
    }

    /**
     * Returns a list of active ads (offers) which executed by the user will bring him/her respective number of votes to his balance in the application.
     */
    public AccountGetActiveOffersQuery getActiveOffers(Actor actor) {
        return new AccountGetActiveOffersQuery(getClient(), actor);
    }

    /**
     * Adds user to the banlist.
     */
    public AccountBanUserQuery banUser(Actor actor, int userId) {
        return new AccountBanUserQuery(getClient(), actor, userId);
    }

    /**
     * Deletes user from the banlist.
     */
    public AccountUnbanUserQuery unbanUser(Actor actor, int userId) {
        return new AccountUnbanUserQuery(getClient(), actor, userId);
    }

    /**
     * Returns a user's blacklist.
     */
    public AccountGetBannedQuery getBanned(Actor actor) {
        return new AccountGetBannedQuery(getClient(), actor);
    }

    /**
     * Returns current account info.
     */
    public AccountGetInfoQuery getInfo(Actor actor) {
        return new AccountGetInfoQuery(getClient(), actor);
    }

    /**
     * Allows to edit the current account info.
     */
    public AccountSetInfoQuery setInfo(Actor actor) {
        return new AccountSetInfoQuery(getClient(), actor);
    }

    /**
     * Changes a user password after access is successfully restored with the auth.restore method.
     */
    public AccountChangePasswordQuery changePassword(Actor actor, String newPassword) {
        return new AccountChangePasswordQuery(getClient(), actor, newPassword);
    }

    /**
     * Returns the current account info
     */
    public AccountGetProfileInfoQuery getProfileInfo(Actor actor) {
        return new AccountGetProfileInfoQuery(getClient(), actor);
    }

    /**
     * Edits current profile info.
     */
    public AccountSaveProfileInfoQuery saveProfileInfo(Actor actor) {
        return new AccountSaveProfileInfoQuery(getClient(), actor);
    }
}

package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.queries.auth.AuthCheckPhoneQuery;
import com.vk.api.sdk.queries.auth.AuthConfirmQuery;
import com.vk.api.sdk.queries.auth.AuthRestoreQuery;
import com.vk.api.sdk.queries.auth.AuthSignupQuery;

/**
 * List of Auth methods
 */
public class Auth extends AbstractAction {
    public Auth(VkApiClient client) {
        super(client);
    }

    /**
     * Checks a user's phone number for correctness.
     */
    public AuthCheckPhoneQuery checkPhone(String phone, String clientSecret) {
        return new AuthCheckPhoneQuery(getClient(), phone, clientSecret);
    }

    /**
     * Checks a user's phone number for correctness.
     */
    public AuthCheckPhoneQuery checkPhone(Actor actor, String phone, String clientSecret) {
        return new AuthCheckPhoneQuery(getClient(), actor, phone, clientSecret);
    }

    /**
     * Registers a new user by phone number.
     */
    public AuthSignupQuery signup(String firstName, String lastName, int clientId, String clientSecret, String phone) {
        return new AuthSignupQuery(getClient(), firstName, lastName, clientId, clientSecret, phone);
    }

    /**
     * Registers a new user by phone number.
     */
    public AuthSignupQuery signup(Actor actor, String firstName, String lastName, int clientId, String clientSecret, String phone) {
        return new AuthSignupQuery(getClient(), actor, firstName, lastName, clientId, clientSecret, phone);
    }

    /**
     * Completes a user's registration (begun with the auth.signup method) using an authorization code.
     */
    public AuthConfirmQuery confirm(int clientId, String clientSecret, String phone, String code) {
        return new AuthConfirmQuery(getClient(), clientId, clientSecret, phone, code);
    }

    /**
     * Completes a user's registration (begun with the auth.signup method) using an authorization code.
     */
    public AuthConfirmQuery confirm(Actor actor, int clientId, String clientSecret, String phone, String code) {
        return new AuthConfirmQuery(getClient(), actor, clientId, clientSecret, phone, code);
    }

    /**
     * Allows to restore account access using a code received via SMS.
     */
    public AuthRestoreQuery restore(String phone) {
        return new AuthRestoreQuery(getClient(), phone);
    }

    /**
     * Allows to restore account access using a code received via SMS.;
     */
    public AuthRestoreQuery restore(Actor actor, String phone) {
        return new AuthRestoreQuery(getClient(), actor, phone);
    }
}

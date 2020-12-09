package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.auth.AuthRestoreQuery;

/**
 * List of Auth methods
 */
public class Auth extends AbstractAction {
    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Auth(VkApiClient client) {
        super(client);
    }

    /**
     * Allows to restore account access using a code received via SMS. " This method is only available for apps with [vk.com/dev/auth_direct|Direct authorization] access. "
     *
     * @param actor vk actor
     * @param phone User phone number.
     * @param lastName User last name.
     * @return query
     */
    public AuthRestoreQuery restore(UserActor actor, String phone, String lastName) {
        return new AuthRestoreQuery(getClient(), actor, phone, lastName);
    }

    /**
     * Allows to restore account access using a code received via SMS. " This method is only available for apps with [vk.com/dev/auth_direct|Direct authorization] access. "
     *
     * @param phone User phone number.
     * @param lastName User last name.
     * @return query
     */
    public AuthRestoreQuery restore(String phone, String lastName) {
        return new AuthRestoreQuery(getClient(), phone, lastName);
    }
}

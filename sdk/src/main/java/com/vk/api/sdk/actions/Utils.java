package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.utils.UtilsCheckLinkQuery;
import com.vk.api.sdk.queries.utils.UtilsGetServerTimeQuery;
import com.vk.api.sdk.queries.utils.UtilsResolveScreenNameQuery;

/**
 * List of Utils methods
 */
public class Utils extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Utils(VkApiClient client) {
        super(client);
    }

    /**
     * Checks whether a link is blocked in VK.
     */
    public UtilsCheckLinkQuery checkLink(ServiceActor actor, String url) {
        return new UtilsCheckLinkQuery(getClient(), actor, url);
    }

    /**
     * Checks whether a link is blocked in VK.
     */
    public UtilsCheckLinkQuery checkLink(UserActor actor, String url) {
        return new UtilsCheckLinkQuery(getClient(), actor, url);
    }

    /**
     * Detects a type of object (e.g., user, community, application) and its ID by screen name.
     */
    public UtilsResolveScreenNameQuery resolveScreenName(ServiceActor actor, String screenName) {
        return new UtilsResolveScreenNameQuery(getClient(), actor, screenName);
    }

    /**
     * Detects a type of object (e.g., user, community, application) and its ID by screen name.
     */
    public UtilsResolveScreenNameQuery resolveScreenName(UserActor actor, String screenName) {
        return new UtilsResolveScreenNameQuery(getClient(), actor, screenName);
    }

    /**
     * Returns the current time of the VK server.
     */
    public UtilsGetServerTimeQuery getServerTime(ServiceActor actor) {
        return new UtilsGetServerTimeQuery(getClient(), actor);
    }

    /**
     * Returns the current time of the VK server.
     */
    public UtilsGetServerTimeQuery getServerTime(UserActor actor) {
        return new UtilsGetServerTimeQuery(getClient(), actor);
    }
}

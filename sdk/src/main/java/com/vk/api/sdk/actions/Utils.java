package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
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
    public UtilsCheckLinkQuery checkLink(String url) {
        return new UtilsCheckLinkQuery(getClient(), url);
    }

    /**
     * Checks whether a link is blocked in VK.
     */
    public UtilsCheckLinkQuery checkLink(Actor actor, String url) {
        return new UtilsCheckLinkQuery(getClient(), actor, url);
    }

    /**
     * Detects a type of object (e.g., user, community, application) and its ID by screen name.
     */
    public UtilsResolveScreenNameQuery resolveScreenName(String screenName) {
        return new UtilsResolveScreenNameQuery(getClient(), screenName);
    }

    /**
     * Detects a type of object (e.g., user, community, application) and its ID by screen name.
     */
    public UtilsResolveScreenNameQuery resolveScreenName(Actor actor, String screenName) {
        return new UtilsResolveScreenNameQuery(getClient(), actor, screenName);
    }

    /**
     * Returns the current time of the VK server.
     */
    public UtilsGetServerTimeQuery getServerTime() {
        return new UtilsGetServerTimeQuery(getClient());
    }

    /**
     * Returns the current time of the VK server.
     */
    public UtilsGetServerTimeQuery getServerTime(Actor actor) {
        return new UtilsGetServerTimeQuery(getClient(), actor);
    }
}

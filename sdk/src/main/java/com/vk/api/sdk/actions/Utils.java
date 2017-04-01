package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.utils.*;

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
    public UtilsCheckLinkQuery checkLink(UserActor actor, String url) {
        return new UtilsCheckLinkQuery(getClient(), actor, url);
    }

    /**
     * Deletes shortened link from user's list.
     */
    public UtilsDeleteFromLastShortenedQuery deleteFromLastShortened(UserActor actor, String key) {
        return new UtilsDeleteFromLastShortenedQuery(getClient(), actor, key);
    }

    /**
     * Returns a list of user's shortened links.
     */
    public UtilsGetLastShortenedLinksQuery getLastShortenedLinks(UserActor actor) {
        return new UtilsGetLastShortenedLinksQuery(getClient(), actor);
    }

    /**
     * Returns stats data for shortened link.
     */
    public UtilsGetLinkStatsQuery getLinkStats(UserActor actor, String key) {
        return new UtilsGetLinkStatsQuery(getClient(), actor, key);
    }

    /**
     * Returns stats data for shortened link.
     */
    public UtilsGetLinkStatsQueryWithExtended getLinkStatsExtended(UserActor actor, String key) {
        return new UtilsGetLinkStatsQueryWithExtended(getClient(), actor, key);
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
    public UtilsGetServerTimeQuery getServerTime(UserActor actor) {
        return new UtilsGetServerTimeQuery(getClient(), actor);
    }

    /**
     * Allows to receive a link shortened via vk.cc.
     */
    public UtilsGetShortLinkQuery getShortLink(UserActor actor, String url) {
        return new UtilsGetShortLinkQuery(getClient(), actor, url);
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
    public UtilsResolveScreenNameQuery resolveScreenName(UserActor actor, String screenName) {
        return new UtilsResolveScreenNameQuery(getClient(), actor, screenName);
    }
}

package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.utils.UtilsCheckLinkQuery;
import com.vk.api.sdk.queries.utils.UtilsDeleteFromLastShortenedQuery;
import com.vk.api.sdk.queries.utils.UtilsGetLastShortenedLinksQuery;
import com.vk.api.sdk.queries.utils.UtilsGetLinkStatsQuery;
import com.vk.api.sdk.queries.utils.UtilsGetLinkStatsQueryWithExtended;
import com.vk.api.sdk.queries.utils.UtilsGetServerTimeQuery;
import com.vk.api.sdk.queries.utils.UtilsGetShortLinkQuery;
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
    public UtilsCheckLinkQuery checkLink(GroupActor actor, String url) {
        return new UtilsCheckLinkQuery(getClient(), actor, url);
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
    public UtilsGetLinkStatsQuery getLinkStats(GroupActor actor, String key) {
        return new UtilsGetLinkStatsQuery(getClient(), actor, key);
    }

    /**
     * Returns stats data for shortened link.
     */
    public UtilsGetLinkStatsQuery getLinkStats(ServiceActor actor, String key) {
        return new UtilsGetLinkStatsQuery(getClient(), actor, key);
    }

    /**
     * Returns stats data for shortened link.
     */
    public UtilsGetLinkStatsQueryWithExtended getLinkStatsExtended(UserActor actor, String key) {
        return new UtilsGetLinkStatsQueryWithExtended(getClient(), actor, key);
    }

    /**
     * Returns stats data for shortened link.
     */
    public UtilsGetLinkStatsQueryWithExtended getLinkStatsExtended(GroupActor actor, String key) {
        return new UtilsGetLinkStatsQueryWithExtended(getClient(), actor, key);
    }

    /**
     * Returns stats data for shortened link.
     */
    public UtilsGetLinkStatsQueryWithExtended getLinkStatsExtended(ServiceActor actor, String key) {
        return new UtilsGetLinkStatsQueryWithExtended(getClient(), actor, key);
    }

    /**
     * Returns the current time of the VK server.
     */
    public UtilsGetServerTimeQuery getServerTime(UserActor actor) {
        return new UtilsGetServerTimeQuery(getClient(), actor);
    }

    /**
     * Returns the current time of the VK server.
     */
    public UtilsGetServerTimeQuery getServerTime(GroupActor actor) {
        return new UtilsGetServerTimeQuery(getClient(), actor);
    }

    /**
     * Returns the current time of the VK server.
     */
    public UtilsGetServerTimeQuery getServerTime(ServiceActor actor) {
        return new UtilsGetServerTimeQuery(getClient(), actor);
    }

    /**
     * Allows to receive a link shortened via vk.cc.
     */
    public UtilsGetShortLinkQuery getShortLink(UserActor actor, String url) {
        return new UtilsGetShortLinkQuery(getClient(), actor, url);
    }

    /**
     * Allows to receive a link shortened via vk.cc.
     */
    public UtilsGetShortLinkQuery getShortLink(GroupActor actor, String url) {
        return new UtilsGetShortLinkQuery(getClient(), actor, url);
    }

    /**
     * Allows to receive a link shortened via vk.cc.
     */
    public UtilsGetShortLinkQuery getShortLink(ServiceActor actor, String url) {
        return new UtilsGetShortLinkQuery(getClient(), actor, url);
    }

    /**
     * Detects a type of object (e.g., user, community, application) and its ID by screen name.
     */
    public UtilsResolveScreenNameQuery resolveScreenName(UserActor actor, String screenName) {
        return new UtilsResolveScreenNameQuery(getClient(), actor, screenName);
    }

    /**
     * Detects a type of object (e.g., user, community, application) and its ID by screen name.
     */
    public UtilsResolveScreenNameQuery resolveScreenName(GroupActor actor, String screenName) {
        return new UtilsResolveScreenNameQuery(getClient(), actor, screenName);
    }

    /**
     * Detects a type of object (e.g., user, community, application) and its ID by screen name.
     */
    public UtilsResolveScreenNameQuery resolveScreenName(ServiceActor actor, String screenName) {
        return new UtilsResolveScreenNameQuery(getClient(), actor, screenName);
    }

}

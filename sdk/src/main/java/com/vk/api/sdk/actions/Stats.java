package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.stats.StatsGetPostReachQuery;
import com.vk.api.sdk.queries.stats.StatsGetQuery;
import com.vk.api.sdk.queries.stats.StatsTrackVisitorQuery;

/**
 * List of Stats methods
 */
public class Stats extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Stats(VkApiClient client) {
        super(client);
    }

    /**
     * Returns statistics of a community or an application.
     */
    public StatsGetQuery get(UserActor actor) {
        return new StatsGetQuery(getClient(), actor);
    }

    public StatsTrackVisitorQuery trackVisitor(UserActor actor) {
        return new StatsTrackVisitorQuery(getClient(), actor);
    }

    /**
     * Returns stats for a wall post.
     */
    public StatsGetPostReachQuery getPostReach(UserActor actor, int ownerId, int postId) {
        return new StatsGetPostReachQuery(getClient(), actor, ownerId, postId);
    }
}

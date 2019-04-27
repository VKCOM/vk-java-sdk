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
     *
     * @param actor vk actor
     * @return query
     */
    public StatsGetQuery get(UserActor actor) {
        return new StatsGetQuery(getClient(), actor);
    }

    /**
     * Returns stats for a wall post.
     *
     * @param actor vk actor
     * @param ownerId post owner community id. Specify with "-" sign.
     * @param postId wall post id. Note that stats are available only for '300' last (newest) posts on a community wall.
     * @return query
     */
    public StatsGetPostReachQuery getPostReach(UserActor actor, String ownerId, int postId) {
        return new StatsGetPostReachQuery(getClient(), actor, ownerId, postId);
    }

    /**
     * @param actor vk actor
     * @param id
     * @return query
     */
    public StatsTrackVisitorQuery trackVisitor(UserActor actor, String id) {
        return new StatsTrackVisitorQuery(getClient(), actor, id);
    }
}

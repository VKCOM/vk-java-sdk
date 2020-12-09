package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.stats.StatsGetPostReachQuery;
import com.vk.api.sdk.queries.stats.StatsGetQuery;
import com.vk.api.sdk.queries.stats.StatsTrackVisitorQuery;
import java.util.List;

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
     * @param postIds wall posts id
     * @return query
     */
    public StatsGetPostReachQuery getPostReach(UserActor actor, String ownerId,
            Integer... postIds) {
        return new StatsGetPostReachQuery(getClient(), actor, ownerId, postIds);
    }

    /**
     * Returns stats for a wall post.
     *
     * @param actor vk actor
     * @param ownerId post owner community id. Specify with "-" sign.
     * @param postIds wall posts id
     * @return query
     */
    public StatsGetPostReachQuery getPostReach(UserActor actor, String ownerId,
            List<Integer> postIds) {
        return new StatsGetPostReachQuery(getClient(), actor, ownerId, postIds);
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

package com.vk.api.sdk.queries.stats;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.stats.WallpostStat;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Stats.getPostReach method
 */
public class StatsGetPostReachQuery extends AbstractQueryBuilder<StatsGetPostReachQuery, List<WallpostStat>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param postId  value of "post id" parameter. Minimum is 0.
     */
    public StatsGetPostReachQuery(VkApiClient client, UserActor actor, int ownerId, int postId) {
        super(client, "stats.getPostReach", Utils.buildParametrizedType(List.class, WallpostStat.class));
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        postId(postId);
    }

    /**
     * Post owner community id. Specify with "-" sign.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected StatsGetPostReachQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Wall post id. Note that stats are available only for "300" last (newest) posts on a community wall.
     *
     * @param value value of "post id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected StatsGetPostReachQuery postId(int value) {
        return unsafeParam("post_id", value);
    }

    @Override
    protected StatsGetPostReachQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("post_id", "owner_id", "access_token");
    }
}

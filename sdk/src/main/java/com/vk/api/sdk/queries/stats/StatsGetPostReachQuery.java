package com.vk.api.sdk.queries.stats;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.stats.responses.GetPostReachResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Stats.getPostReach method
 */
public class StatsGetPostReachQuery extends AbstractQueryBuilder<StatsGetPostReachQuery, List<GetPostReachResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param postIds value of "post ids" parameter.
     */
    public StatsGetPostReachQuery(VkApiClient client, UserActor actor, String ownerId,
            Integer... postIds) {
        super(client, "stats.getPostReach", Utils.buildParametrizedType(List.class, GetPostReachResponse.class));
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        postIds(postIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param postIds value of "post ids" parameter.
     */
    public StatsGetPostReachQuery(VkApiClient client, UserActor actor, String ownerId,
            List<Integer> postIds) {
        super(client, "stats.getPostReach", Utils.buildParametrizedType(List.class, GetPostReachResponse.class));
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        postIds(postIds);
    }

    /**
     * Post owner community id. Specify with "-" sign.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected StatsGetPostReachQuery ownerId(String value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * post_ids
     * Wall posts id
     *
     * @param value value of "post ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected StatsGetPostReachQuery postIds(Integer... value) {
        return unsafeParam("post_ids", value);
    }

    /**
     * Wall posts id
     *
     * @param value value of "post ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected StatsGetPostReachQuery postIds(List<Integer> value) {
        return unsafeParam("post_ids", value);
    }

    @Override
    protected StatsGetPostReachQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("post_ids", "owner_id", "access_token");
    }
}

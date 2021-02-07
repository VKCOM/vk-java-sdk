package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.market.responses.RestoreCommentResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.restoreComment method
 */
public class MarketRestoreCommentQuery extends AbstractQueryBuilder<MarketRestoreCommentQuery, RestoreCommentResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param commentId value of "comment id" parameter. Minimum is 0.
     */
    public MarketRestoreCommentQuery(VkApiClient client, UserActor actor, int ownerId,
            int commentId) {
        super(client, "market.restoreComment", RestoreCommentResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        commentId(commentId);
    }

    /**
     * Identifier of an item owner community, "Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community "
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketRestoreCommentQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Deleted comment id
     *
     * @param value value of "comment id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketRestoreCommentQuery commentId(int value) {
        return unsafeParam("comment_id", value);
    }

    @Override
    protected MarketRestoreCommentQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("owner_id", "comment_id", "access_token");
    }
}

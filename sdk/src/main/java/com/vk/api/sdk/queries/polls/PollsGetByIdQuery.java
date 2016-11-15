package com.vk.api.sdk.queries.polls;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.polls.Poll;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Polls.getById method
 */
public class PollsGetByIdQuery extends AbstractQueryBuilder<PollsGetByIdQuery, Poll> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param pollId value of "poll id" parameter. Minimum is 0.
     */
    public PollsGetByIdQuery(VkApiClient client, UserActor actor, int pollId) {
        super(client, "polls.getById", Poll.class);
        accessToken(actor.getAccessToken());
        pollId(pollId);
    }

    /**
     * ID of the user or community that owns the poll. Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsGetByIdQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * "true" - poll is in a board,
     * "false" - poll is on a wall (by default).
     *
     * @param value value of "is board" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsGetByIdQuery isBoard(Boolean value) {
        return unsafeParam("is_board", value);
    }

    /**
     * Poll ID.
     *
     * @param value value of "poll id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PollsGetByIdQuery pollId(int value) {
        return unsafeParam("poll_id", value);
    }

    @Override
    protected PollsGetByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("poll_id", "access_token");
    }
}

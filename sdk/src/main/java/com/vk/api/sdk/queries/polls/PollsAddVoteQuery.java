package com.vk.api.sdk.queries.polls;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Polls.addVote method
 */
public class PollsAddVoteQuery extends AbstractQueryBuilder<PollsAddVoteQuery, BoolInt> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   VK API client
     * @param actor    actor with access token
     * @param pollId   value of "poll id" parameter. Minimum is 0.
     * @param answerId value of "answer id" parameter. Minimum is 0.
     */
    public PollsAddVoteQuery(VkApiClient client, UserActor actor, int pollId, int answerId) {
        super(client, "polls.addVote", BoolInt.class);
        accessToken(actor.getAccessToken());
        pollId(pollId);
        answerId(answerId);
    }

    /**
     * ID of the user or community that owns the poll.  Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsAddVoteQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Poll ID.
     *
     * @param value value of "poll id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PollsAddVoteQuery pollId(int value) {
        return unsafeParam("poll_id", value);
    }

    /**
     * Answer ID.
     *
     * @param value value of "answer id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PollsAddVoteQuery answerId(int value) {
        return unsafeParam("answer_id", value);
    }

    /**
     * Set is board
     *
     * @param value value of "is board" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsAddVoteQuery isBoard(Boolean value) {
        return unsafeParam("is_board", value);
    }

    @Override
    protected PollsAddVoteQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("poll_id", "answer_id", "access_token");
    }
}

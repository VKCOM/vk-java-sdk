package com.vk.api.sdk.queries.polls;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.polls.responses.AddVoteResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Polls.addVote method
 */
public class PollsAddVoteQuery extends AbstractQueryBuilder<PollsAddVoteQuery, AddVoteResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param pollId value of "poll id" parameter. Minimum is 0.
     * @param answerIds value of "answer ids" parameter.
     */
    public PollsAddVoteQuery(VkApiClient client, UserActor actor, int pollId,
            Integer... answerIds) {
        super(client, "polls.addVote", AddVoteResponse.class);
        accessToken(actor.getAccessToken());
        pollId(pollId);
        answerIds(answerIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param pollId value of "poll id" parameter. Minimum is 0.
     * @param answerIds value of "answer ids" parameter.
     */
    public PollsAddVoteQuery(VkApiClient client, UserActor actor, int pollId,
            List<Integer> answerIds) {
        super(client, "polls.addVote", AddVoteResponse.class);
        accessToken(actor.getAccessToken());
        pollId(pollId);
        answerIds(answerIds);
    }

    /**
     * ID of the user or community that owns the poll. Use a negative value to designate a community ID.
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
     * Set is board
     *
     * @param value value of "is board" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsAddVoteQuery isBoard(Boolean value) {
        return unsafeParam("is_board", value);
    }

    /**
     * answer_ids
     * Set answer ids
     *
     * @param value value of "answer ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PollsAddVoteQuery answerIds(Integer... value) {
        return unsafeParam("answer_ids", value);
    }

    /**
     * Set answer ids
     *
     * @param value value of "answer ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PollsAddVoteQuery answerIds(List<Integer> value) {
        return unsafeParam("answer_ids", value);
    }

    @Override
    protected PollsAddVoteQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("poll_id", "answer_ids", "access_token");
    }
}

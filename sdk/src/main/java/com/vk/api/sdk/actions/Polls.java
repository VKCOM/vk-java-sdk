package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.polls.PollsAddVoteQuery;
import com.vk.api.sdk.queries.polls.PollsCreateQuery;
import com.vk.api.sdk.queries.polls.PollsDeleteVoteQuery;
import com.vk.api.sdk.queries.polls.PollsEditQuery;
import com.vk.api.sdk.queries.polls.PollsGetByIdQuery;
import com.vk.api.sdk.queries.polls.PollsGetVotersQuery;

import java.util.List;

/**
 * List of Polls methods
 */
public class Polls extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Polls(VkApiClient client) {
        super(client);
    }

    /**
     * Returns detailed information about a poll by its ID.
     */
    public PollsGetByIdQuery getById(UserActor actor, int pollId) {
        return new PollsGetByIdQuery(getClient(), actor, pollId);
    }

    /**
     * Adds the current user's vote to the selected answer in the poll.
     */
    public PollsAddVoteQuery addVote(UserActor actor, int pollId, int answerId) {
        return new PollsAddVoteQuery(getClient(), actor, pollId, answerId);
    }

    /**
     * Deletes the current user's vote from the selected answer in the poll.
     */
    public PollsDeleteVoteQuery deleteVote(UserActor actor, int pollId, int answerId) {
        return new PollsDeleteVoteQuery(getClient(), actor, pollId, answerId);
    }

    /**
     * Returns a list of IDs of users who selected specific answers in the poll.
     */
    public PollsGetVotersQuery getVoters(UserActor actor, int pollId, int... answerIds) {
        return new PollsGetVotersQuery(getClient(), actor, pollId, answerIds);
    }

    /**
     * Returns a list of IDs of users who selected specific answers in the poll.
     */
    public PollsGetVotersQuery getVoters(UserActor actor, int pollId, List<Integer> answerIds) {
        return new PollsGetVotersQuery(getClient(), actor, pollId, answerIds);
    }

    /**
     * Creates polls that can be attached to the users' or communities' posts.
     */
    public PollsCreateQuery create(UserActor actor) {
        return new PollsCreateQuery(getClient(), actor);
    }

    /**
     * Edits created polls
     */
    public PollsEditQuery edit(UserActor actor, int ownerId, int pollId) {
        return new PollsEditQuery(getClient(), actor, ownerId, pollId);
    }
}

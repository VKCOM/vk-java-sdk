package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.polls.PollsAddVoteQuery;
import com.vk.api.sdk.queries.polls.PollsCreateQuery;
import com.vk.api.sdk.queries.polls.PollsDeleteVoteQuery;
import com.vk.api.sdk.queries.polls.PollsEditQuery;
import com.vk.api.sdk.queries.polls.PollsGetBackgroundsQuery;
import com.vk.api.sdk.queries.polls.PollsGetByIdQuery;
import com.vk.api.sdk.queries.polls.PollsGetPhotoUploadServerQuery;
import com.vk.api.sdk.queries.polls.PollsGetVotersQuery;
import com.vk.api.sdk.queries.polls.PollsSavePhotoQuery;
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
     * Adds the current user's vote to the selected answer in the poll.
     *
     * @param actor vk actor
     * @param pollId Poll ID.
     * @param answerIds
     * @return query
     */
    public PollsAddVoteQuery addVote(UserActor actor, int pollId, Integer... answerIds) {
        return new PollsAddVoteQuery(getClient(), actor, pollId, answerIds);
    }

    /**
     * Adds the current user's vote to the selected answer in the poll.
     *
     * @param actor vk actor
     * @param pollId Poll ID.
     * @param answerIds
     * @return query
     */
    public PollsAddVoteQuery addVote(UserActor actor, int pollId, List<Integer> answerIds) {
        return new PollsAddVoteQuery(getClient(), actor, pollId, answerIds);
    }

    /**
     * Creates polls that can be attached to the users' or communities' posts.
     *
     * @param actor vk actor
     * @return query
     */
    public PollsCreateQuery create(UserActor actor) {
        return new PollsCreateQuery(getClient(), actor);
    }

    /**
     * Deletes the current user's vote from the selected answer in the poll.
     *
     * @param actor vk actor
     * @param pollId Poll ID.
     * @param answerId Answer ID.
     * @return query
     */
    public PollsDeleteVoteQuery deleteVote(UserActor actor, int pollId, int answerId) {
        return new PollsDeleteVoteQuery(getClient(), actor, pollId, answerId);
    }

    /**
     * Edits created polls
     *
     * @param actor vk actor
     * @param pollId edited poll's id
     * @return query
     */
    public PollsEditQuery edit(UserActor actor, int pollId) {
        return new PollsEditQuery(getClient(), actor, pollId);
    }

    /**
     * @param actor vk actor
     * @return query
     */
    public PollsGetBackgroundsQuery getBackgrounds(UserActor actor) {
        return new PollsGetBackgroundsQuery(getClient(), actor);
    }

    /**
     * Returns detailed information about a poll by its ID.
     *
     * @param actor vk actor
     * @param pollId Poll ID.
     * @return query
     */
    public PollsGetByIdQuery getById(UserActor actor, int pollId) {
        return new PollsGetByIdQuery(getClient(), actor, pollId);
    }

    /**
     * @param actor vk actor
     * @return query
     */
    public PollsGetPhotoUploadServerQuery getPhotoUploadServer(UserActor actor) {
        return new PollsGetPhotoUploadServerQuery(getClient(), actor);
    }

    /**
     * Returns a list of IDs of users who selected specific answers in the poll.
     *
     * @param actor vk actor
     * @param pollId Poll ID.
     * @param answerIds Answer IDs.
     * @return query
     */
    public PollsGetVotersQuery getVoters(UserActor actor, int pollId, Integer... answerIds) {
        return new PollsGetVotersQuery(getClient(), actor, pollId, answerIds);
    }

    /**
     * Returns a list of IDs of users who selected specific answers in the poll.
     *
     * @param actor vk actor
     * @param pollId Poll ID.
     * @param answerIds Answer IDs.
     * @return query
     */
    public PollsGetVotersQuery getVoters(UserActor actor, int pollId, List<Integer> answerIds) {
        return new PollsGetVotersQuery(getClient(), actor, pollId, answerIds);
    }

    /**
     * @param actor vk actor
     * @param photo
     * @param hash
     * @return query
     */
    public PollsSavePhotoQuery savePhoto(UserActor actor, String photo, String hash) {
        return new PollsSavePhotoQuery(getClient(), actor, photo, hash);
    }
}

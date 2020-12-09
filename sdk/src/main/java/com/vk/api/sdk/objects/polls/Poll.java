package com.vk.api.sdk.objects.polls;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.List;
import java.util.Objects;

/**
 * Poll object
 */
public class Poll implements Validable {
    @SerializedName("anonymous")
    @Required
    private Boolean anonymous;

    @SerializedName("friends")
    private List<Friend> friends;

    /**
     * Information whether the poll with multiple choices
     */
    @SerializedName("multiple")
    @Required
    private Boolean multiple;

    /**
     * Current user's answer ID
     */
    @SerializedName("answer_id")
    private Integer answerId;

    @SerializedName("end_date")
    private Integer endDate;

    /**
     * Current user's answer IDs
     */
    @SerializedName("answer_ids")
    private List<Integer> answerIds;

    @SerializedName("closed")
    @Required
    private Boolean closed;

    @SerializedName("is_board")
    private Boolean isBoard;

    @SerializedName("can_edit")
    private Boolean canEdit;

    @SerializedName("can_vote")
    private Boolean canVote;

    @SerializedName("can_report")
    private Boolean canReport;

    @SerializedName("can_share")
    private Boolean canShare;

    @SerializedName("photo")
    private Background photo;

    @SerializedName("answers")
    @Required
    private List<Answer> answers;

    /**
     * Date when poll has been created in Unixtime
     */
    @SerializedName("created")
    @Required
    private Integer created;

    /**
     * Poll ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Poll owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Poll author's ID
     */
    @SerializedName("author_id")
    private Integer authorId;

    /**
     * Poll question
     */
    @SerializedName("question")
    @Required
    private String question;

    @SerializedName("background")
    private Background background;

    /**
     * Votes number
     */
    @SerializedName("votes")
    @Required
    private Integer votes;

    @SerializedName("disable_unvote")
    private Boolean disableUnvote;

    public Boolean getAnonymous() {
        return anonymous;
    }

    public Poll setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
        return this;
    }

    public List<Friend> getFriends() {
        return friends;
    }

    public Poll setFriends(List<Friend> friends) {
        this.friends = friends;
        return this;
    }

    public Boolean getMultiple() {
        return multiple;
    }

    public Poll setMultiple(Boolean multiple) {
        this.multiple = multiple;
        return this;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public Poll setAnswerId(Integer answerId) {
        this.answerId = answerId;
        return this;
    }

    public Integer getEndDate() {
        return endDate;
    }

    public Poll setEndDate(Integer endDate) {
        this.endDate = endDate;
        return this;
    }

    public List<Integer> getAnswerIds() {
        return answerIds;
    }

    public Poll setAnswerIds(List<Integer> answerIds) {
        this.answerIds = answerIds;
        return this;
    }

    public Boolean getClosed() {
        return closed;
    }

    public Poll setClosed(Boolean closed) {
        this.closed = closed;
        return this;
    }

    public Boolean getIsBoard() {
        return isBoard;
    }

    public Poll setIsBoard(Boolean isBoard) {
        this.isBoard = isBoard;
        return this;
    }

    public Boolean getCanEdit() {
        return canEdit;
    }

    public Poll setCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
        return this;
    }

    public Boolean getCanVote() {
        return canVote;
    }

    public Poll setCanVote(Boolean canVote) {
        this.canVote = canVote;
        return this;
    }

    public Boolean getCanReport() {
        return canReport;
    }

    public Poll setCanReport(Boolean canReport) {
        this.canReport = canReport;
        return this;
    }

    public Boolean getCanShare() {
        return canShare;
    }

    public Poll setCanShare(Boolean canShare) {
        this.canShare = canShare;
        return this;
    }

    public Background getPhoto() {
        return photo;
    }

    public Poll setPhoto(Background photo) {
        this.photo = photo;
        return this;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public Poll setAnswers(List<Answer> answers) {
        this.answers = answers;
        return this;
    }

    public Integer getCreated() {
        return created;
    }

    public Poll setCreated(Integer created) {
        this.created = created;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Poll setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Poll setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public Poll setAuthorId(Integer authorId) {
        this.authorId = authorId;
        return this;
    }

    public String getQuestion() {
        return question;
    }

    public Poll setQuestion(String question) {
        this.question = question;
        return this;
    }

    public Background getBackground() {
        return background;
    }

    public Poll setBackground(Background background) {
        this.background = background;
        return this;
    }

    public Integer getVotes() {
        return votes;
    }

    public Poll setVotes(Integer votes) {
        this.votes = votes;
        return this;
    }

    public Boolean getDisableUnvote() {
        return disableUnvote;
    }

    public Poll setDisableUnvote(Boolean disableUnvote) {
        this.disableUnvote = disableUnvote;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(answerId, canReport, question, endDate, created, canShare, canEdit, multiple, answers, photo, answerIds, ownerId, authorId, friends, background, disableUnvote, anonymous, closed, votes, id, isBoard, canVote);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poll poll = (Poll) o;
        return Objects.equals(endDate, poll.endDate) &&
                Objects.equals(answerIds, poll.answerIds) &&
                Objects.equals(question, poll.question) &&
                Objects.equals(created, poll.created) &&
                Objects.equals(ownerId, poll.ownerId) &&
                Objects.equals(multiple, poll.multiple) &&
                Objects.equals(canShare, poll.canShare) &&
                Objects.equals(answers, poll.answers) &&
                Objects.equals(canEdit, poll.canEdit) &&
                Objects.equals(photo, poll.photo) &&
                Objects.equals(isBoard, poll.isBoard) &&
                Objects.equals(answerId, poll.answerId) &&
                Objects.equals(friends, poll.friends) &&
                Objects.equals(canVote, poll.canVote) &&
                Objects.equals(canReport, poll.canReport) &&
                Objects.equals(background, poll.background) &&
                Objects.equals(anonymous, poll.anonymous) &&
                Objects.equals(closed, poll.closed) &&
                Objects.equals(votes, poll.votes) &&
                Objects.equals(id, poll.id) &&
                Objects.equals(authorId, poll.authorId) &&
                Objects.equals(disableUnvote, poll.disableUnvote);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Poll{");
        sb.append("endDate=").append(endDate);
        sb.append(", answerIds=").append(answerIds);
        sb.append(", question='").append(question).append("'");
        sb.append(", created=").append(created);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", multiple=").append(multiple);
        sb.append(", canShare=").append(canShare);
        sb.append(", answers=").append(answers);
        sb.append(", canEdit=").append(canEdit);
        sb.append(", photo=").append(photo);
        sb.append(", isBoard=").append(isBoard);
        sb.append(", answerId=").append(answerId);
        sb.append(", friends=").append(friends);
        sb.append(", canVote=").append(canVote);
        sb.append(", canReport=").append(canReport);
        sb.append(", background=").append(background);
        sb.append(", anonymous=").append(anonymous);
        sb.append(", closed=").append(closed);
        sb.append(", votes=").append(votes);
        sb.append(", id=").append(id);
        sb.append(", authorId=").append(authorId);
        sb.append(", disableUnvote=").append(disableUnvote);
        sb.append('}');
        return sb.toString();
    }
}

package com.vk.api.sdk.objects.polls.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.polls.Answer;
import com.vk.api.sdk.objects.polls.Background;
import com.vk.api.sdk.objects.polls.Friend;
import java.util.List;
import java.util.Objects;

/**
 * GetByIdResponse object
 */
public class GetByIdResponse implements Validable {
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

    public GetByIdResponse setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
        return this;
    }

    public List<Friend> getFriends() {
        return friends;
    }

    public GetByIdResponse setFriends(List<Friend> friends) {
        this.friends = friends;
        return this;
    }

    public Boolean getMultiple() {
        return multiple;
    }

    public GetByIdResponse setMultiple(Boolean multiple) {
        this.multiple = multiple;
        return this;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public GetByIdResponse setAnswerId(Integer answerId) {
        this.answerId = answerId;
        return this;
    }

    public Integer getEndDate() {
        return endDate;
    }

    public GetByIdResponse setEndDate(Integer endDate) {
        this.endDate = endDate;
        return this;
    }

    public List<Integer> getAnswerIds() {
        return answerIds;
    }

    public GetByIdResponse setAnswerIds(List<Integer> answerIds) {
        this.answerIds = answerIds;
        return this;
    }

    public Boolean getClosed() {
        return closed;
    }

    public GetByIdResponse setClosed(Boolean closed) {
        this.closed = closed;
        return this;
    }

    public Boolean getIsBoard() {
        return isBoard;
    }

    public GetByIdResponse setIsBoard(Boolean isBoard) {
        this.isBoard = isBoard;
        return this;
    }

    public Boolean getCanEdit() {
        return canEdit;
    }

    public GetByIdResponse setCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
        return this;
    }

    public Boolean getCanVote() {
        return canVote;
    }

    public GetByIdResponse setCanVote(Boolean canVote) {
        this.canVote = canVote;
        return this;
    }

    public Boolean getCanReport() {
        return canReport;
    }

    public GetByIdResponse setCanReport(Boolean canReport) {
        this.canReport = canReport;
        return this;
    }

    public Boolean getCanShare() {
        return canShare;
    }

    public GetByIdResponse setCanShare(Boolean canShare) {
        this.canShare = canShare;
        return this;
    }

    public Background getPhoto() {
        return photo;
    }

    public GetByIdResponse setPhoto(Background photo) {
        this.photo = photo;
        return this;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public GetByIdResponse setAnswers(List<Answer> answers) {
        this.answers = answers;
        return this;
    }

    public Integer getCreated() {
        return created;
    }

    public GetByIdResponse setCreated(Integer created) {
        this.created = created;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GetByIdResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public GetByIdResponse setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public GetByIdResponse setAuthorId(Integer authorId) {
        this.authorId = authorId;
        return this;
    }

    public String getQuestion() {
        return question;
    }

    public GetByIdResponse setQuestion(String question) {
        this.question = question;
        return this;
    }

    public Background getBackground() {
        return background;
    }

    public GetByIdResponse setBackground(Background background) {
        this.background = background;
        return this;
    }

    public Integer getVotes() {
        return votes;
    }

    public GetByIdResponse setVotes(Integer votes) {
        this.votes = votes;
        return this;
    }

    public Boolean getDisableUnvote() {
        return disableUnvote;
    }

    public GetByIdResponse setDisableUnvote(Boolean disableUnvote) {
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
        GetByIdResponse getByIdResponse = (GetByIdResponse) o;
        return Objects.equals(endDate, getByIdResponse.endDate) &&
                Objects.equals(answerIds, getByIdResponse.answerIds) &&
                Objects.equals(question, getByIdResponse.question) &&
                Objects.equals(created, getByIdResponse.created) &&
                Objects.equals(ownerId, getByIdResponse.ownerId) &&
                Objects.equals(multiple, getByIdResponse.multiple) &&
                Objects.equals(canShare, getByIdResponse.canShare) &&
                Objects.equals(answers, getByIdResponse.answers) &&
                Objects.equals(canEdit, getByIdResponse.canEdit) &&
                Objects.equals(photo, getByIdResponse.photo) &&
                Objects.equals(isBoard, getByIdResponse.isBoard) &&
                Objects.equals(answerId, getByIdResponse.answerId) &&
                Objects.equals(friends, getByIdResponse.friends) &&
                Objects.equals(canVote, getByIdResponse.canVote) &&
                Objects.equals(canReport, getByIdResponse.canReport) &&
                Objects.equals(background, getByIdResponse.background) &&
                Objects.equals(anonymous, getByIdResponse.anonymous) &&
                Objects.equals(closed, getByIdResponse.closed) &&
                Objects.equals(votes, getByIdResponse.votes) &&
                Objects.equals(id, getByIdResponse.id) &&
                Objects.equals(authorId, getByIdResponse.authorId) &&
                Objects.equals(disableUnvote, getByIdResponse.disableUnvote);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetByIdResponse{");
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

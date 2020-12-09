package com.vk.api.sdk.objects.secure.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * GetTransactionsHistoryResponse object
 */
public class GetTransactionsHistoryResponse implements Validable {
    /**
     * Transaction date in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Transaction ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * From ID
     */
    @SerializedName("uid_from")
    private Integer uidFrom;

    /**
     * To ID
     */
    @SerializedName("uid_to")
    private Integer uidTo;

    /**
     * Votes number
     */
    @SerializedName("votes")
    private Integer votes;

    public Integer getDate() {
        return date;
    }

    public GetTransactionsHistoryResponse setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GetTransactionsHistoryResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getUidFrom() {
        return uidFrom;
    }

    public GetTransactionsHistoryResponse setUidFrom(Integer uidFrom) {
        this.uidFrom = uidFrom;
        return this;
    }

    public Integer getUidTo() {
        return uidTo;
    }

    public GetTransactionsHistoryResponse setUidTo(Integer uidTo) {
        this.uidTo = uidTo;
        return this;
    }

    public Integer getVotes() {
        return votes;
    }

    public GetTransactionsHistoryResponse setVotes(Integer votes) {
        this.votes = votes;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, uidFrom, uidTo, votes, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTransactionsHistoryResponse getTransactionsHistoryResponse = (GetTransactionsHistoryResponse) o;
        return Objects.equals(date, getTransactionsHistoryResponse.date) &&
                Objects.equals(uidTo, getTransactionsHistoryResponse.uidTo) &&
                Objects.equals(votes, getTransactionsHistoryResponse.votes) &&
                Objects.equals(id, getTransactionsHistoryResponse.id) &&
                Objects.equals(uidFrom, getTransactionsHistoryResponse.uidFrom);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetTransactionsHistoryResponse{");
        sb.append("date=").append(date);
        sb.append(", uidTo=").append(uidTo);
        sb.append(", votes=").append(votes);
        sb.append(", id=").append(id);
        sb.append(", uidFrom=").append(uidFrom);
        sb.append('}');
        return sb.toString();
    }
}

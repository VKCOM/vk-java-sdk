package com.vk.api.sdk.objects.secure;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Transaction object
 */
public class Transaction {
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

    /**
     * Transaction date in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    public Integer getId() {
        return id;
    }

    public Integer getUidFrom() {
        return uidFrom;
    }

    public Integer getUidTo() {
        return uidTo;
    }

    public Integer getVotes() {
        return votes;
    }

    public Integer getDate() {
        return date;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, uidFrom, uidTo, votes, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction transaction = (Transaction) o;
        return Objects.equals(id, transaction.id) &&
                Objects.equals(uidFrom, transaction.uidFrom) &&
                Objects.equals(uidTo, transaction.uidTo) &&
                Objects.equals(votes, transaction.votes) &&
                Objects.equals(date, transaction.date);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Transaction{");
        sb.append("id=").append(id);
        sb.append(", uidFrom=").append(uidFrom);
        sb.append(", uidTo=").append(uidTo);
        sb.append(", votes=").append(votes);
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }
}

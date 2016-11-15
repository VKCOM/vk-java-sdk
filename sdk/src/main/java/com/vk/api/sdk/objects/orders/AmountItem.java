package com.vk.api.sdk.objects.orders;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * AmountItem object
 */
public class AmountItem {

    @SerializedName("votes")
    private String votes;

    @SerializedName("amount")
    private Integer amount;

    @SerializedName("description")
    private String description;

    public String getVotes() {
        return votes;
    }

    public Integer getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AmountItem that = (AmountItem) o;
        return Objects.equals(votes, that.votes) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(votes, amount, description);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AmountItem{");
        sb.append("votes='").append(votes).append('\'');
        sb.append(", amount=").append(amount);
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

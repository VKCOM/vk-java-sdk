package com.vk.api.sdk.objects.orders;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * AmountItem object
 */
public class AmountItem {

    @SerializedName("votes")
    private String votes;

    @SerializedName("ammount")
    private Integer ammount;

    @SerializedName("description")
    private String description;

    public String getVotes() {
        return votes;
    }

    public Integer getAmmount() {
        return ammount;
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
                Objects.equals(ammount, that.ammount) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(votes, ammount, description);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AmountItem{");
        sb.append("votes='").append(votes).append('\'');
        sb.append(", ammount=").append(ammount);
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

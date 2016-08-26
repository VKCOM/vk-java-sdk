package com.vk.api.sdk.objects.orders;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * Amount object
 */
public class Amount {
    @SerializedName("amounts")
    private List<JsonObject> amounts;

    public List<JsonObject> getAmounts() {
        return amounts;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amounts);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amount amount = (Amount) o;
        return Objects.equals(amounts, amount.amounts);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Amount{");
        sb.append("amounts=").append(amounts);
        sb.append('}');
        return sb.toString();
    }
}

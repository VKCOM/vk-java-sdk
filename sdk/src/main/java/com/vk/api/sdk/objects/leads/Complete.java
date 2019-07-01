package com.vk.api.sdk.objects.leads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Objects;

/**
 * Complete object
 */
public class Complete implements Validable {
    /**
     * Offer cost
     */
    @SerializedName("cost")
    private Integer cost;

    /**
     * Offer limit
     */
    @SerializedName("limit")
    private Integer limit;

    /**
     * Amount of spent votes
     */
    @SerializedName("spent")
    private Integer spent;

    @SerializedName("success")
    private OkResponse success;

    /**
     * Information whether test mode is enabled
     */
    @SerializedName("test_mode")
    private BoolInt testMode;

    public Integer getCost() {
        return cost;
    }

    public Complete setCost(Integer cost) {
        this.cost = cost;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public Complete setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public Integer getSpent() {
        return spent;
    }

    public Complete setSpent(Integer spent) {
        this.spent = spent;
        return this;
    }

    public OkResponse getSuccess() {
        return success;
    }

    public Complete setSuccess(OkResponse success) {
        this.success = success;
        return this;
    }

    public boolean isTestMode() {
        return testMode == BoolInt.YES;
    }

    public BoolInt getTestMode() {
        return testMode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, success, testMode, spent, limit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complete complete = (Complete) o;
        return Objects.equals(cost, complete.cost) &&
                Objects.equals(testMode, complete.testMode) &&
                Objects.equals(success, complete.success) &&
                Objects.equals(spent, complete.spent) &&
                Objects.equals(limit, complete.limit);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Complete{");
        sb.append("cost=").append(cost);
        sb.append(", testMode=").append(testMode);
        sb.append(", success=").append(success);
        sb.append(", spent=").append(spent);
        sb.append(", limit=").append(limit);
        sb.append('}');
        return sb.toString();
    }
}

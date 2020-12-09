package com.vk.api.sdk.objects.orders.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * GetUserSubscriptionByIdResponse object
 */
public class GetUserSubscriptionByIdResponse implements Validable {
    /**
     * Cancel reason
     */
    @SerializedName("cancel_reason")
    private String cancelReason;

    /**
     * Date of creation in Unixtime
     */
    @SerializedName("create_time")
    private Integer createTime;

    /**
     * Subscription ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Subscription order item
     */
    @SerializedName("item_id")
    private String itemId;

    /**
     * Date of next bill in Unixtime
     */
    @SerializedName("next_bill_time")
    private Integer nextBillTime;

    /**
     * Pending cancel state
     */
    @SerializedName("pending_cancel")
    private Boolean pendingCancel;

    /**
     * Subscription period
     */
    @SerializedName("period")
    @Required
    private Integer period;

    /**
     * Date of last period start in Unixtime
     */
    @SerializedName("period_start_time")
    private Integer periodStartTime;

    /**
     * Subscription price
     */
    @SerializedName("price")
    @Required
    private Integer price;

    /**
     * Subscription status
     */
    @SerializedName("status")
    @Required
    private String status;

    /**
     * Is test subscription
     */
    @SerializedName("test_mode")
    private Boolean testMode;

    /**
     * Date of trial expire in Unixtime
     */
    @SerializedName("trial_expire_time")
    private Integer trialExpireTime;

    /**
     * Date of last change in Unixtime
     */
    @SerializedName("update_time")
    private Integer updateTime;

    public String getCancelReason() {
        return cancelReason;
    }

    public GetUserSubscriptionByIdResponse setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
        return this;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public GetUserSubscriptionByIdResponse setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GetUserSubscriptionByIdResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getItemId() {
        return itemId;
    }

    public GetUserSubscriptionByIdResponse setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    public Integer getNextBillTime() {
        return nextBillTime;
    }

    public GetUserSubscriptionByIdResponse setNextBillTime(Integer nextBillTime) {
        this.nextBillTime = nextBillTime;
        return this;
    }

    public Boolean getPendingCancel() {
        return pendingCancel;
    }

    public GetUserSubscriptionByIdResponse setPendingCancel(Boolean pendingCancel) {
        this.pendingCancel = pendingCancel;
        return this;
    }

    public Integer getPeriod() {
        return period;
    }

    public GetUserSubscriptionByIdResponse setPeriod(Integer period) {
        this.period = period;
        return this;
    }

    public Integer getPeriodStartTime() {
        return periodStartTime;
    }

    public GetUserSubscriptionByIdResponse setPeriodStartTime(Integer periodStartTime) {
        this.periodStartTime = periodStartTime;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public GetUserSubscriptionByIdResponse setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GetUserSubscriptionByIdResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public Boolean getTestMode() {
        return testMode;
    }

    public GetUserSubscriptionByIdResponse setTestMode(Boolean testMode) {
        this.testMode = testMode;
        return this;
    }

    public Integer getTrialExpireTime() {
        return trialExpireTime;
    }

    public GetUserSubscriptionByIdResponse setTrialExpireTime(Integer trialExpireTime) {
        this.trialExpireTime = trialExpireTime;
        return this;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public GetUserSubscriptionByIdResponse setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pendingCancel, period, updateTime, trialExpireTime, itemId, createTime, price, testMode, nextBillTime, periodStartTime, id, cancelReason, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetUserSubscriptionByIdResponse getUserSubscriptionByIdResponse = (GetUserSubscriptionByIdResponse) o;
        return Objects.equals(period, getUserSubscriptionByIdResponse.period) &&
                Objects.equals(createTime, getUserSubscriptionByIdResponse.createTime) &&
                Objects.equals(itemId, getUserSubscriptionByIdResponse.itemId) &&
                Objects.equals(nextBillTime, getUserSubscriptionByIdResponse.nextBillTime) &&
                Objects.equals(trialExpireTime, getUserSubscriptionByIdResponse.trialExpireTime) &&
                Objects.equals(pendingCancel, getUserSubscriptionByIdResponse.pendingCancel) &&
                Objects.equals(periodStartTime, getUserSubscriptionByIdResponse.periodStartTime) &&
                Objects.equals(cancelReason, getUserSubscriptionByIdResponse.cancelReason) &&
                Objects.equals(updateTime, getUserSubscriptionByIdResponse.updateTime) &&
                Objects.equals(testMode, getUserSubscriptionByIdResponse.testMode) &&
                Objects.equals(price, getUserSubscriptionByIdResponse.price) &&
                Objects.equals(id, getUserSubscriptionByIdResponse.id) &&
                Objects.equals(status, getUserSubscriptionByIdResponse.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetUserSubscriptionByIdResponse{");
        sb.append("period=").append(period);
        sb.append(", createTime=").append(createTime);
        sb.append(", itemId='").append(itemId).append("'");
        sb.append(", nextBillTime=").append(nextBillTime);
        sb.append(", trialExpireTime=").append(trialExpireTime);
        sb.append(", pendingCancel=").append(pendingCancel);
        sb.append(", periodStartTime=").append(periodStartTime);
        sb.append(", cancelReason='").append(cancelReason).append("'");
        sb.append(", updateTime=").append(updateTime);
        sb.append(", testMode=").append(testMode);
        sb.append(", price=").append(price);
        sb.append(", id=").append(id);
        sb.append(", status='").append(status).append("'");
        sb.append('}');
        return sb.toString();
    }
}

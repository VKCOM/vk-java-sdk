package com.vk.api.sdk.objects.orders.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * GetByIdResponse object
 */
public class GetByIdResponse implements Validable {
    /**
     * Amount
     */
    @SerializedName("amount")
    private Integer amount;

    /**
     * App order ID
     */
    @SerializedName("app_order_id")
    private Integer appOrderId;

    /**
     * Cancel transaction ID
     */
    @SerializedName("cancel_transaction_id")
    private Integer cancelTransactionId;

    /**
     * Date of creation in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Order ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Order item
     */
    @SerializedName("item")
    private String item;

    /**
     * Receiver ID
     */
    @SerializedName("receiver_id")
    private Integer receiverId;

    /**
     * Order status
     */
    @SerializedName("status")
    private String status;

    /**
     * Transaction ID
     */
    @SerializedName("transaction_id")
    private Integer transactionId;

    /**
     * User ID
     */
    @SerializedName("user_id")
    private Integer userId;

    public Integer getAmount() {
        return amount;
    }

    public GetByIdResponse setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    public Integer getAppOrderId() {
        return appOrderId;
    }

    public GetByIdResponse setAppOrderId(Integer appOrderId) {
        this.appOrderId = appOrderId;
        return this;
    }

    public Integer getCancelTransactionId() {
        return cancelTransactionId;
    }

    public GetByIdResponse setCancelTransactionId(Integer cancelTransactionId) {
        this.cancelTransactionId = cancelTransactionId;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public GetByIdResponse setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GetByIdResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getItem() {
        return item;
    }

    public GetByIdResponse setItem(String item) {
        this.item = item;
        return this;
    }

    public Integer getReceiverId() {
        return receiverId;
    }

    public GetByIdResponse setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GetByIdResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public GetByIdResponse setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public GetByIdResponse setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, amount, item, receiverId, appOrderId, cancelTransactionId, id, userId, transactionId, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetByIdResponse getByIdResponse = (GetByIdResponse) o;
        return Objects.equals(date, getByIdResponse.date) &&
                Objects.equals(transactionId, getByIdResponse.transactionId) &&
                Objects.equals(cancelTransactionId, getByIdResponse.cancelTransactionId) &&
                Objects.equals(amount, getByIdResponse.amount) &&
                Objects.equals(item, getByIdResponse.item) &&
                Objects.equals(userId, getByIdResponse.userId) &&
                Objects.equals(receiverId, getByIdResponse.receiverId) &&
                Objects.equals(id, getByIdResponse.id) &&
                Objects.equals(appOrderId, getByIdResponse.appOrderId) &&
                Objects.equals(status, getByIdResponse.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetByIdResponse{");
        sb.append("date=").append(date);
        sb.append(", transactionId=").append(transactionId);
        sb.append(", cancelTransactionId=").append(cancelTransactionId);
        sb.append(", amount=").append(amount);
        sb.append(", item='").append(item).append("'");
        sb.append(", userId=").append(userId);
        sb.append(", receiverId=").append(receiverId);
        sb.append(", id=").append(id);
        sb.append(", appOrderId=").append(appOrderId);
        sb.append(", status='").append(status).append("'");
        sb.append('}');
        return sb.toString();
    }
}

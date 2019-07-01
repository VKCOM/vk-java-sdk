package com.vk.api.sdk.objects.orders;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * Order object
 */
public class Order implements Validable {
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

    public Order setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    public Integer getAppOrderId() {
        return appOrderId;
    }

    public Order setAppOrderId(Integer appOrderId) {
        this.appOrderId = appOrderId;
        return this;
    }

    public Integer getCancelTransactionId() {
        return cancelTransactionId;
    }

    public Order setCancelTransactionId(Integer cancelTransactionId) {
        this.cancelTransactionId = cancelTransactionId;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public Order setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Order setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getItem() {
        return item;
    }

    public Order setItem(String item) {
        this.item = item;
        return this;
    }

    public Integer getReceiverId() {
        return receiverId;
    }

    public Order setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Order setStatus(String status) {
        this.status = status;
        return this;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public Order setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public Order setUserId(Integer userId) {
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
        Order order = (Order) o;
        return Objects.equals(date, order.date) &&
                Objects.equals(transactionId, order.transactionId) &&
                Objects.equals(cancelTransactionId, order.cancelTransactionId) &&
                Objects.equals(amount, order.amount) &&
                Objects.equals(item, order.item) &&
                Objects.equals(userId, order.userId) &&
                Objects.equals(receiverId, order.receiverId) &&
                Objects.equals(id, order.id) &&
                Objects.equals(appOrderId, order.appOrderId) &&
                Objects.equals(status, order.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Order{");
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

package com.vk.api.sdk.objects.orders;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Order object
 */
public class Order {
    /**
     * Order ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * App order ID
     */
    @SerializedName("app_order_id")
    private Integer appOrderId;

    /**
     * Order status
     */
    @SerializedName("status")
    private String status;

    /**
     * User ID
     */
    @SerializedName("user_id")
    private Integer userId;

    /**
     * Receiver ID
     */
    @SerializedName("receiver_id")
    private Integer receiverId;

    /**
     * Order item
     */
    @SerializedName("item")
    private String item;

    /**
     * Amount
     */
    @SerializedName("amount")
    private Integer amount;

    /**
     * Date of creation in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Transaction ID
     */
    @SerializedName("transaction_id")
    private Integer transactionId;

    /**
     * Cancel transaction ID
     */
    @SerializedName("cancel_transaction_id")
    private Integer cancelTransactionId;

    public Integer getId() {
        return id;
    }

    public Integer getAppOrderId() {
        return appOrderId;
    }

    public String getStatus() {
        return status;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getReceiverId() {
        return receiverId;
    }

    public String getItem() {
        return item;
    }

    public Integer getAmount() {
        return amount;
    }

    public Integer getDate() {
        return date;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public Integer getCancelTransactionId() {
        return cancelTransactionId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, item, amount, receiverId, appOrderId, cancelTransactionId, id, userId, transactionId, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) &&
                Objects.equals(appOrderId, order.appOrderId) &&
                Objects.equals(status, order.status) &&
                Objects.equals(userId, order.userId) &&
                Objects.equals(receiverId, order.receiverId) &&
                Objects.equals(item, order.item) &&
                Objects.equals(amount, order.amount) &&
                Objects.equals(date, order.date) &&
                Objects.equals(transactionId, order.transactionId) &&
                Objects.equals(cancelTransactionId, order.cancelTransactionId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order{");
        sb.append("id=").append(id);
        sb.append(", appOrderId=").append(appOrderId);
        sb.append(", status='").append(status).append("'");
        sb.append(", userId=").append(userId);
        sb.append(", receiverId=").append(receiverId);
        sb.append(", item='").append(item).append("'");
        sb.append(", amount=").append(amount);
        sb.append(", date=").append(date);
        sb.append(", transactionId=").append(transactionId);
        sb.append(", cancelTransactionId=").append(cancelTransactionId);
        sb.append('}');
        return sb.toString();
    }
}

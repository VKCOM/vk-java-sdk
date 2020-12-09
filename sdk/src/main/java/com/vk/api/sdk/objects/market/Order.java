package com.vk.api.sdk.objects.market;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.Link;
import java.util.List;
import java.util.Objects;

/**
 * Order object
 */
public class Order implements Validable {
    @SerializedName("id")
    @Required
    private Integer id;

    @SerializedName("group_id")
    private Integer groupId;

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("display_order_id")
    private String displayOrderId;

    @SerializedName("date")
    @Required
    private Integer date;

    @SerializedName("status")
    @Required
    private Integer status;

    @SerializedName("items_count")
    private Integer itemsCount;

    @SerializedName("track_number")
    private String trackNumber;

    @SerializedName("track_link")
    private String trackLink;

    @SerializedName("comment")
    private String comment;

    @SerializedName("address")
    private String address;

    @SerializedName("merchant_comment")
    private String merchantComment;

    @SerializedName("weight")
    private Integer weight;

    @SerializedName("total_price")
    private Price totalPrice;

    /**
     * Several order items for preview
     */
    @SerializedName("preview_order_items")
    private List<OrderItem> previewOrderItems;

    /**
     * Information for cancel and revert order
     */
    @SerializedName("cancel_info")
    private Link cancelInfo;

    public Integer getId() {
        return id;
    }

    public Order setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public Order setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public Order setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public String getDisplayOrderId() {
        return displayOrderId;
    }

    public Order setDisplayOrderId(String displayOrderId) {
        this.displayOrderId = displayOrderId;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public Order setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public Order setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getItemsCount() {
        return itemsCount;
    }

    public Order setItemsCount(Integer itemsCount) {
        this.itemsCount = itemsCount;
        return this;
    }

    public String getTrackNumber() {
        return trackNumber;
    }

    public Order setTrackNumber(String trackNumber) {
        this.trackNumber = trackNumber;
        return this;
    }

    public String getTrackLink() {
        return trackLink;
    }

    public Order setTrackLink(String trackLink) {
        this.trackLink = trackLink;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public Order setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Order setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getMerchantComment() {
        return merchantComment;
    }

    public Order setMerchantComment(String merchantComment) {
        this.merchantComment = merchantComment;
        return this;
    }

    public Integer getWeight() {
        return weight;
    }

    public Order setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    public Price getTotalPrice() {
        return totalPrice;
    }

    public Order setTotalPrice(Price totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public List<OrderItem> getPreviewOrderItems() {
        return previewOrderItems;
    }

    public Order setPreviewOrderItems(List<OrderItem> previewOrderItems) {
        this.previewOrderItems = previewOrderItems;
        return this;
    }

    public Link getCancelInfo() {
        return cancelInfo;
    }

    public Order setCancelInfo(Link cancelInfo) {
        this.cancelInfo = cancelInfo;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, address, trackNumber, totalPrice, cancelInfo, groupId, weight, userId, itemsCount, merchantComment, trackLink, comment, id, previewOrderItems, displayOrderId, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(date, order.date) &&
                Objects.equals(address, order.address) &&
                Objects.equals(totalPrice, order.totalPrice) &&
                Objects.equals(weight, order.weight) &&
                Objects.equals(trackLink, order.trackLink) &&
                Objects.equals(itemsCount, order.itemsCount) &&
                Objects.equals(groupId, order.groupId) &&
                Objects.equals(userId, order.userId) &&
                Objects.equals(trackNumber, order.trackNumber) &&
                Objects.equals(comment, order.comment) &&
                Objects.equals(id, order.id) &&
                Objects.equals(displayOrderId, order.displayOrderId) &&
                Objects.equals(merchantComment, order.merchantComment) &&
                Objects.equals(previewOrderItems, order.previewOrderItems) &&
                Objects.equals(cancelInfo, order.cancelInfo) &&
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
        sb.append(", address='").append(address).append("'");
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", weight=").append(weight);
        sb.append(", trackLink='").append(trackLink).append("'");
        sb.append(", itemsCount=").append(itemsCount);
        sb.append(", groupId=").append(groupId);
        sb.append(", userId=").append(userId);
        sb.append(", trackNumber='").append(trackNumber).append("'");
        sb.append(", comment='").append(comment).append("'");
        sb.append(", id=").append(id);
        sb.append(", displayOrderId='").append(displayOrderId).append("'");
        sb.append(", merchantComment='").append(merchantComment).append("'");
        sb.append(", previewOrderItems=").append(previewOrderItems);
        sb.append(", cancelInfo=").append(cancelInfo);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}

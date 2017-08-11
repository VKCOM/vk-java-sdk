package com.vk.api.sdk.callback.objects.market;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 10.09.16.
 */
public class CallbackMarketComment {

    /**
     * Comment ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Author ID
     */
    @SerializedName("from_id")
    private Integer fromId;

    /**
     * Date when the comment has been added in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Comment text
     */
    @SerializedName("text")
    private String text;

    /**
     * Photo owner ID
     */
    @SerializedName("market_owner_od")
    private Integer marketOwnerId;

    /**
     * Photo ID
     */
    @SerializedName("photo_id")
    private Integer photoId;

    public Integer getId() {
        return id;
    }

    public Integer getFromId() {
        return fromId;
    }

    public Integer getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public Integer getMarketOwnerId() {
        return marketOwnerId;
    }

    public Integer getPhotoId() {
        return photoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallbackMarketComment that = (CallbackMarketComment) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(fromId, that.fromId) &&
                Objects.equals(date, that.date) &&
                Objects.equals(text, that.text) &&
                Objects.equals(marketOwnerId, that.marketOwnerId) &&
                Objects.equals(photoId, that.photoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fromId, date, text, marketOwnerId, photoId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackMarketComment{");
        sb.append("id=").append(id);
        sb.append(", fromId=").append(fromId);
        sb.append(", date=").append(date);
        sb.append(", text='").append(text).append('\'');
        sb.append(", marketOwnerId=").append(marketOwnerId);
        sb.append(", photoId=").append(photoId);
        sb.append('}');
        return sb.toString();
    }
}

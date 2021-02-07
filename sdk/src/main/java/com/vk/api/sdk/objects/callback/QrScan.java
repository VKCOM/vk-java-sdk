package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * QrScan object
 */
public class QrScan implements Validable {
    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("data")
    @Required
    private String data;

    @SerializedName("type")
    @Required
    private String type;

    @SerializedName("subtype")
    @Required
    private String subtype;

    @SerializedName("reread")
    @Required
    private Boolean reread;

    public Integer getUserId() {
        return userId;
    }

    public QrScan setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public String getData() {
        return data;
    }

    public QrScan setData(String data) {
        this.data = data;
        return this;
    }

    public String getType() {
        return type;
    }

    public QrScan setType(String type) {
        this.type = type;
        return this;
    }

    public String getSubtype() {
        return subtype;
    }

    public QrScan setSubtype(String subtype) {
        this.subtype = subtype;
        return this;
    }

    public Boolean getReread() {
        return reread;
    }

    public QrScan setReread(Boolean reread) {
        this.reread = reread;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, reread, subtype, type, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QrScan qrScan = (QrScan) o;
        return Objects.equals(data, qrScan.data) &&
                Objects.equals(reread, qrScan.reread) &&
                Objects.equals(userId, qrScan.userId) &&
                Objects.equals(subtype, qrScan.subtype) &&
                Objects.equals(type, qrScan.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("QrScan{");
        sb.append("data='").append(data).append("'");
        sb.append(", reread=").append(reread);
        sb.append(", userId=").append(userId);
        sb.append(", subtype='").append(subtype).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}

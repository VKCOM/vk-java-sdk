package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * CropPhotoCrop object
 */
public class CropPhotoCrop implements Validable {
    /**
     * Coordinate X of the left upper corner
     */
    @SerializedName("x")
    @Required
    private Float x;

    /**
     * Coordinate Y of the left upper corner
     */
    @SerializedName("y")
    @Required
    private Float y;

    /**
     * Coordinate X of the right lower corner
     */
    @SerializedName("x2")
    @Required
    private Float x2;

    /**
     * Coordinate Y of the right lower corner
     */
    @SerializedName("y2")
    @Required
    private Float y2;

    public Float getX() {
        return x;
    }

    public CropPhotoCrop setX(Float x) {
        this.x = x;
        return this;
    }

    public Float getY() {
        return y;
    }

    public CropPhotoCrop setY(Float y) {
        this.y = y;
        return this;
    }

    public Float getX2() {
        return x2;
    }

    public CropPhotoCrop setX2(Float x2) {
        this.x2 = x2;
        return this;
    }

    public Float getY2() {
        return y2;
    }

    public CropPhotoCrop setY2(Float y2) {
        this.y2 = y2;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, y2, x2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CropPhotoCrop cropPhotoCrop = (CropPhotoCrop) o;
        return Objects.equals(x, cropPhotoCrop.x) &&
                Objects.equals(y, cropPhotoCrop.y) &&
                Objects.equals(y2, cropPhotoCrop.y2) &&
                Objects.equals(x2, cropPhotoCrop.x2);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CropPhotoCrop{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", y2=").append(y2);
        sb.append(", x2=").append(x2);
        sb.append('}');
        return sb.toString();
    }
}

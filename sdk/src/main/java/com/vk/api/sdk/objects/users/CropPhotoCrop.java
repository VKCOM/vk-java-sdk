package com.vk.api.sdk.objects.users;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * CropPhotoCrop object
 */
public class CropPhotoCrop {

    /**
     * Coordinate X of the left upper corner
     */
    @SerializedName("x")
    private Float x;

    /**
     * Coordinate Y of the left upper corner
     */
    @SerializedName("y")
    private Float y;

    /**
     * Coordinate X of the right lower corner
     */
    @SerializedName("x2")
    private Float x2;

    /**
     * Coordinate Y of the right lower corner
     */
    @SerializedName("y2")
    private Float y2;

    public Float getX() {
        return x;
    }

    public Float getY() {
        return y;
    }

    public Float getX2() {
        return x2;
    }

    public Float getY2() {
        return y2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CropPhotoCrop that = (CropPhotoCrop) o;
        return Objects.equals(x, that.x) &&
                Objects.equals(y, that.y) &&
                Objects.equals(x2, that.x2) &&
                Objects.equals(y2, that.y2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, x2, y2);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CropPhotoCrop{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", x2=").append(x2);
        sb.append(", y2=").append(y2);
        sb.append('}');
        return sb.toString();
    }
}

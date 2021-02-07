package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * GradientPoint object
 */
public class GradientPoint implements Validable {
    /**
     * Hex color code without #
     */
    @SerializedName("color")
    @Required
    private String color;

    /**
     * Point position
     */
    @SerializedName("position")
    @Required
    private Float position;

    public String getColor() {
        return color;
    }

    public GradientPoint setColor(String color) {
        this.color = color;
        return this;
    }

    public Float getPosition() {
        return position;
    }

    public GradientPoint setPosition(Float position) {
        this.position = position;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, position);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GradientPoint gradientPoint = (GradientPoint) o;
        return Objects.equals(color, gradientPoint.color) &&
                Objects.equals(position, gradientPoint.position);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GradientPoint{");
        sb.append("color='").append(color).append("'");
        sb.append(", position=").append(position);
        sb.append('}');
        return sb.toString();
    }
}

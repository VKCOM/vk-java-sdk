package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * CarouselBase object
 */
public class CarouselBase implements Validable {
    /**
     * Index of current carousel element
     */
    @SerializedName("carousel_offset")
    private Integer carouselOffset;

    public Integer getCarouselOffset() {
        return carouselOffset;
    }

    public CarouselBase setCarouselOffset(Integer carouselOffset) {
        this.carouselOffset = carouselOffset;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carouselOffset);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarouselBase carouselBase = (CarouselBase) o;
        return Objects.equals(carouselOffset, carouselBase.carouselOffset);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CarouselBase{");
        sb.append("carouselOffset=").append(carouselOffset);
        sb.append('}');
        return sb.toString();
    }
}

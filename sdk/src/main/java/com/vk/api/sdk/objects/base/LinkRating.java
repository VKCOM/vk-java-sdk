package com.vk.api.sdk.objects.base;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * LinkRating object
 */
public class LinkRating {
    /**
     * Count of stars
     */
    @SerializedName("stars")
    private Float stars;

    /**
     * Count of reviews
     */
    @SerializedName("reviews_count")
    private Integer reviewsCount;

    public Float getStars() {
        return stars;
    }

    public Integer getReviewsCount() {
        return reviewsCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stars, reviewsCount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkRating linkRating = (LinkRating) o;
        return Objects.equals(stars, linkRating.stars) &&
                Objects.equals(reviewsCount, linkRating.reviewsCount);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LinkRating{");
        sb.append("stars=").append(stars);
        sb.append(", reviewsCount=").append(reviewsCount);
        sb.append('}');
        return sb.toString();
    }
}

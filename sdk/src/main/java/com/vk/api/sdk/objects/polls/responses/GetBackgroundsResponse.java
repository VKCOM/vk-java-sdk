package com.vk.api.sdk.objects.polls.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.GradientPoint;
import com.vk.api.sdk.objects.base.Image;
import java.util.List;
import java.util.Objects;

/**
 * GetBackgroundsResponse object
 */
public class GetBackgroundsResponse implements Validable {
    /**
     * Gradient angle with 0 on positive X axis
     */
    @SerializedName("angle")
    private Integer angle;

    /**
     * Hex color code without #
     */
    @SerializedName("color")
    private String color;

    /**
     * Original height of pattern tile
     */
    @SerializedName("height")
    private Integer height;

    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    /**
     * Pattern tiles
     */
    @SerializedName("images")
    private List<Image> images;

    /**
     * Gradient points
     */
    @SerializedName("points")
    private List<GradientPoint> points;

    @SerializedName("type")
    private GetBackgroundsResponseType type;

    /**
     * Original with of pattern tile
     */
    @SerializedName("width")
    private Integer width;

    public Integer getAngle() {
        return angle;
    }

    public GetBackgroundsResponse setAngle(Integer angle) {
        this.angle = angle;
        return this;
    }

    public String getColor() {
        return color;
    }

    public GetBackgroundsResponse setColor(String color) {
        this.color = color;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public GetBackgroundsResponse setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GetBackgroundsResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetBackgroundsResponse setName(String name) {
        this.name = name;
        return this;
    }

    public List<Image> getImages() {
        return images;
    }

    public GetBackgroundsResponse setImages(List<Image> images) {
        this.images = images;
        return this;
    }

    public List<GradientPoint> getPoints() {
        return points;
    }

    public GetBackgroundsResponse setPoints(List<GradientPoint> points) {
        this.points = points;
        return this;
    }

    public GetBackgroundsResponseType getType() {
        return type;
    }

    public GetBackgroundsResponse setType(GetBackgroundsResponseType type) {
        this.type = type;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public GetBackgroundsResponse setWidth(Integer width) {
        this.width = width;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(images, color, name, width, angle, id, type, height, points);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetBackgroundsResponse getBackgroundsResponse = (GetBackgroundsResponse) o;
        return Objects.equals(images, getBackgroundsResponse.images) &&
                Objects.equals(color, getBackgroundsResponse.color) &&
                Objects.equals(name, getBackgroundsResponse.name) &&
                Objects.equals(width, getBackgroundsResponse.width) &&
                Objects.equals(angle, getBackgroundsResponse.angle) &&
                Objects.equals(id, getBackgroundsResponse.id) &&
                Objects.equals(type, getBackgroundsResponse.type) &&
                Objects.equals(height, getBackgroundsResponse.height) &&
                Objects.equals(points, getBackgroundsResponse.points);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetBackgroundsResponse{");
        sb.append("images=").append(images);
        sb.append(", color='").append(color).append("'");
        sb.append(", name='").append(name).append("'");
        sb.append(", width=").append(width);
        sb.append(", angle=").append(angle);
        sb.append(", id=").append(id);
        sb.append(", type='").append(type).append("'");
        sb.append(", height=").append(height);
        sb.append(", points=").append(points);
        sb.append('}');
        return sb.toString();
    }
}

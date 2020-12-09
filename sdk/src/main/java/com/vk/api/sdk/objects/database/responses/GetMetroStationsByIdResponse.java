package com.vk.api.sdk.objects.database.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * GetMetroStationsByIdResponse object
 */
public class GetMetroStationsByIdResponse implements Validable {
    /**
     * City ID
     */
    @SerializedName("city_id")
    private Integer cityId;

    /**
     * Hex color code without #
     */
    @SerializedName("color")
    private String color;

    /**
     * Station ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Station name
     */
    @SerializedName("name")
    @Required
    private String name;

    public Integer getCityId() {
        return cityId;
    }

    public GetMetroStationsByIdResponse setCityId(Integer cityId) {
        this.cityId = cityId;
        return this;
    }

    public String getColor() {
        return color;
    }

    public GetMetroStationsByIdResponse setColor(String color) {
        this.color = color;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GetMetroStationsByIdResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetMetroStationsByIdResponse setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, name, id, cityId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetMetroStationsByIdResponse getMetroStationsByIdResponse = (GetMetroStationsByIdResponse) o;
        return Objects.equals(color, getMetroStationsByIdResponse.color) &&
                Objects.equals(name, getMetroStationsByIdResponse.name) &&
                Objects.equals(id, getMetroStationsByIdResponse.id) &&
                Objects.equals(cityId, getMetroStationsByIdResponse.cityId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetMetroStationsByIdResponse{");
        sb.append("color='").append(color).append("'");
        sb.append(", name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append(", cityId=").append(cityId);
        sb.append('}');
        return sb.toString();
    }
}

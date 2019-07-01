package com.vk.api.sdk.objects.docs.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * AddResponse object
 */
public class AddResponse implements Validable {
    /**
     * Doc ID
     */
    @SerializedName("id")
    private Integer id;

    public Integer getId() {
        return id;
    }

    public AddResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddResponse addResponse = (AddResponse) o;
        return Objects.equals(id, addResponse.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("AddResponse{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}

package com.vk.api.sdk.objects.calls;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.List;
import java.util.Objects;

/**
 * Participants object
 */
public class Participants implements Validable {
    @SerializedName("list")
    private List<Integer> list;

    /**
     * Participants count
     */
    @SerializedName("count")
    private Integer count;

    public List<Integer> getList() {
        return list;
    }

    public Participants setList(List<Integer> list) {
        this.list = list;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public Participants setCount(Integer count) {
        this.count = count;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, list);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participants participants = (Participants) o;
        return Objects.equals(count, participants.count) &&
                Objects.equals(list, participants.list);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Participants{");
        sb.append("count=").append(count);
        sb.append(", list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}

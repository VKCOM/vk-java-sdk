package com.vk.api.sdk.objects.stories;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * StatLine object
 */
public class StatLine implements Validable {
    @SerializedName("name")
    @Required
    private String name;

    @SerializedName("counter")
    private Integer counter;

    @SerializedName("is_unavailable")
    private Boolean isUnavailable;

    public String getName() {
        return name;
    }

    public StatLine setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getCounter() {
        return counter;
    }

    public StatLine setCounter(Integer counter) {
        this.counter = counter;
        return this;
    }

    public Boolean getIsUnavailable() {
        return isUnavailable;
    }

    public StatLine setIsUnavailable(Boolean isUnavailable) {
        this.isUnavailable = isUnavailable;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, counter, isUnavailable);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatLine statLine = (StatLine) o;
        return Objects.equals(name, statLine.name) &&
                Objects.equals(counter, statLine.counter) &&
                Objects.equals(isUnavailable, statLine.isUnavailable);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("StatLine{");
        sb.append("name='").append(name).append("'");
        sb.append(", counter=").append(counter);
        sb.append(", isUnavailable=").append(isUnavailable);
        sb.append('}');
        return sb.toString();
    }
}

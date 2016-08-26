package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Client object
 */
public class Client {
    /**
     * Client ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Client name
     */
    @SerializedName("name")
    private String name;

    /**
     * Client's day limit, rubles
     */
    @SerializedName("day_limit")
    private String dayLimit;

    /**
     * Client's total limit, rubles
     */
    @SerializedName("all_limit")
    private String allLimit;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDayLimit() {
        return dayLimit;
    }

    public String getAllLimit() {
        return allLimit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dayLimit, allLimit, name, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) &&
                Objects.equals(name, client.name) &&
                Objects.equals(dayLimit, client.dayLimit) &&
                Objects.equals(allLimit, client.allLimit);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append("'");
        sb.append(", dayLimit='").append(dayLimit).append("'");
        sb.append(", allLimit='").append(allLimit).append("'");
        sb.append('}');
        return sb.toString();
    }
}

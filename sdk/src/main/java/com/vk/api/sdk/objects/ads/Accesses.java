package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Accesses object
 */
public class Accesses {
    /**
     * Client ID
     */
    @SerializedName("client_id")
    private String clientId;

    @SerializedName("role")
    private AccessRole role;

    public String getClientId() {
        return clientId;
    }

    public AccessRole getRole() {
        return role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, role);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accesses accesses = (Accesses) o;
        return Objects.equals(clientId, accesses.clientId) &&
                Objects.equals(role, accesses.role);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Accesses{");
        sb.append("clientId='").append(clientId).append("'");
        sb.append(", role=").append(role);
        sb.append('}');
        return sb.toString();
    }
}

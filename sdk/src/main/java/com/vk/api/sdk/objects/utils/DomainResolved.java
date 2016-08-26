package com.vk.api.sdk.objects.utils;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * DomainResolved object
 */
public class DomainResolved {
    /**
     * Object type
     */
    @SerializedName("type")
    private DomainResolvedType type;

    /**
     * Object ID
     */
    @SerializedName("object_id")
    private Integer objectId;

    public DomainResolvedType getType() {
        return type;
    }

    public Integer getObjectId() {
        return objectId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, objectId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DomainResolved domainResolved = (DomainResolved) o;
        return Objects.equals(type, domainResolved.type) &&
                Objects.equals(objectId, domainResolved.objectId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DomainResolved{");
        sb.append("type='").append(type).append("'");
        sb.append(", objectId=").append(objectId);
        sb.append('}');
        return sb.toString();
    }
}

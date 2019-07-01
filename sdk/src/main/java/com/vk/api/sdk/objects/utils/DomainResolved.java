package com.vk.api.sdk.objects.utils;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * DomainResolved object
 */
public class DomainResolved implements Validable {
    /**
     * Object ID
     */
    @SerializedName("object_id")
    private Integer objectId;

    @SerializedName("type")
    private DomainResolvedType type;

    public Integer getObjectId() {
        return objectId;
    }

    public DomainResolved setObjectId(Integer objectId) {
        this.objectId = objectId;
        return this;
    }

    public DomainResolvedType getType() {
        return type;
    }

    public DomainResolved setType(DomainResolvedType type) {
        this.type = type;
        return this;
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
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("DomainResolved{");
        sb.append("type=").append(type);
        sb.append(", objectId=").append(objectId);
        sb.append('}');
        return sb.toString();
    }
}

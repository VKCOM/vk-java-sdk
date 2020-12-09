package com.vk.api.sdk.objects.utils.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.utils.DomainResolvedType;
import java.util.Objects;

/**
 * ResolveScreenNameResponse object
 */
public class ResolveScreenNameResponse implements Validable {
    /**
     * Object ID
     */
    @SerializedName("object_id")
    private Integer objectId;

    /**
     * Group ID
     */
    @SerializedName("group_id")
    private Integer groupId;

    @SerializedName("type")
    private DomainResolvedType type;

    public Integer getObjectId() {
        return objectId;
    }

    public ResolveScreenNameResponse setObjectId(Integer objectId) {
        this.objectId = objectId;
        return this;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public ResolveScreenNameResponse setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    public DomainResolvedType getType() {
        return type;
    }

    public ResolveScreenNameResponse setType(DomainResolvedType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, type, objectId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResolveScreenNameResponse resolveScreenNameResponse = (ResolveScreenNameResponse) o;
        return Objects.equals(groupId, resolveScreenNameResponse.groupId) &&
                Objects.equals(type, resolveScreenNameResponse.type) &&
                Objects.equals(objectId, resolveScreenNameResponse.objectId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ResolveScreenNameResponse{");
        sb.append("groupId=").append(groupId);
        sb.append(", type=").append(type);
        sb.append(", objectId=").append(objectId);
        sb.append('}');
        return sb.toString();
    }
}

package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.List;
import java.util.Objects;

/**
 * LookalikeRequest object
 */
public class LookalikeRequest implements Validable {
    /**
     * Lookalike request ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Lookalike request create time, as Unixtime
     */
    @SerializedName("create_time")
    private Integer createTime;

    /**
     * Lookalike request update time, as Unixtime
     */
    @SerializedName("update_time")
    private Integer updateTime;

    /**
     * Time by which lookalike request would be deleted, as Unixtime
     */
    @SerializedName("scheduled_delete_time")
    private Integer scheduledDeleteTime;

    /**
     * Lookalike request status
     */
    @SerializedName("status")
    @Required
    private LookalikeRequestStatus status;

    /**
     * Lookalike request source type
     */
    @SerializedName("source_type")
    private LookalikeRequestSourceType sourceType;

    /**
     * Retargeting group id, which was used as lookalike seed
     */
    @SerializedName("source_retargeting_group_id")
    private Integer sourceRetargetingGroupId;

    /**
     * Lookalike request seed name (retargeting group name)
     */
    @SerializedName("source_name")
    private String sourceName;

    /**
     * Lookalike request seed audience size
     */
    @SerializedName("audience_count")
    private Integer audienceCount;

    @SerializedName("save_audience_levels")
    private List<LookalikeRequestSaveAudienceLevel> saveAudienceLevels;

    public Integer getId() {
        return id;
    }

    public LookalikeRequest setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public LookalikeRequest setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public LookalikeRequest setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Integer getScheduledDeleteTime() {
        return scheduledDeleteTime;
    }

    public LookalikeRequest setScheduledDeleteTime(Integer scheduledDeleteTime) {
        this.scheduledDeleteTime = scheduledDeleteTime;
        return this;
    }

    public LookalikeRequestStatus getStatus() {
        return status;
    }

    public LookalikeRequest setStatus(LookalikeRequestStatus status) {
        this.status = status;
        return this;
    }

    public LookalikeRequestSourceType getSourceType() {
        return sourceType;
    }

    public LookalikeRequest setSourceType(LookalikeRequestSourceType sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    public Integer getSourceRetargetingGroupId() {
        return sourceRetargetingGroupId;
    }

    public LookalikeRequest setSourceRetargetingGroupId(Integer sourceRetargetingGroupId) {
        this.sourceRetargetingGroupId = sourceRetargetingGroupId;
        return this;
    }

    public String getSourceName() {
        return sourceName;
    }

    public LookalikeRequest setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    public Integer getAudienceCount() {
        return audienceCount;
    }

    public LookalikeRequest setAudienceCount(Integer audienceCount) {
        this.audienceCount = audienceCount;
        return this;
    }

    public List<LookalikeRequestSaveAudienceLevel> getSaveAudienceLevels() {
        return saveAudienceLevels;
    }

    public LookalikeRequest setSaveAudienceLevels(
            List<LookalikeRequestSaveAudienceLevel> saveAudienceLevels) {
        this.saveAudienceLevels = saveAudienceLevels;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduledDeleteTime, createTime, sourceType, sourceRetargetingGroupId, saveAudienceLevels, audienceCount, updateTime, id, sourceName, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LookalikeRequest lookalikeRequest = (LookalikeRequest) o;
        return Objects.equals(updateTime, lookalikeRequest.updateTime) &&
                Objects.equals(saveAudienceLevels, lookalikeRequest.saveAudienceLevels) &&
                Objects.equals(createTime, lookalikeRequest.createTime) &&
                Objects.equals(audienceCount, lookalikeRequest.audienceCount) &&
                Objects.equals(scheduledDeleteTime, lookalikeRequest.scheduledDeleteTime) &&
                Objects.equals(sourceType, lookalikeRequest.sourceType) &&
                Objects.equals(id, lookalikeRequest.id) &&
                Objects.equals(sourceRetargetingGroupId, lookalikeRequest.sourceRetargetingGroupId) &&
                Objects.equals(sourceName, lookalikeRequest.sourceName) &&
                Objects.equals(status, lookalikeRequest.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("LookalikeRequest{");
        sb.append("updateTime=").append(updateTime);
        sb.append(", saveAudienceLevels=").append(saveAudienceLevels);
        sb.append(", createTime=").append(createTime);
        sb.append(", audienceCount=").append(audienceCount);
        sb.append(", scheduledDeleteTime=").append(scheduledDeleteTime);
        sb.append(", sourceType='").append(sourceType).append("'");
        sb.append(", id=").append(id);
        sb.append(", sourceRetargetingGroupId=").append(sourceRetargetingGroupId);
        sb.append(", sourceName='").append(sourceName).append("'");
        sb.append(", status='").append(status).append("'");
        sb.append('}');
        return sb.toString();
    }
}

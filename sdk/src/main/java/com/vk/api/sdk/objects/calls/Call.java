package com.vk.api.sdk.objects.calls;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * Call object
 */
public class Call implements Validable {
    /**
     * Call duration
     */
    @SerializedName("duration")
    private Integer duration;

    /**
     * Caller initiator
     */
    @SerializedName("initiator_id")
    private Integer initiatorId;

    /**
     * Caller receiver
     */
    @SerializedName("receiver_id")
    private Integer receiverId;

    @SerializedName("state")
    @Required
    private EndState state;

    /**
     * Timestamp for call
     */
    @SerializedName("time")
    @Required
    private Integer time;

    /**
     * Was this call initiated as video call
     */
    @SerializedName("video")
    private Boolean video;

    public Integer getDuration() {
        return duration;
    }

    public Call setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getInitiatorId() {
        return initiatorId;
    }

    public Call setInitiatorId(Integer initiatorId) {
        this.initiatorId = initiatorId;
        return this;
    }

    public Integer getReceiverId() {
        return receiverId;
    }

    public Call setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
        return this;
    }

    public EndState getState() {
        return state;
    }

    public Call setState(EndState state) {
        this.state = state;
        return this;
    }

    public Integer getTime() {
        return time;
    }

    public Call setTime(Integer time) {
        this.time = time;
        return this;
    }

    public Boolean getVideo() {
        return video;
    }

    public Call setVideo(Boolean video) {
        this.video = video;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration, receiverId, initiatorId, state, time, video);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Call call = (Call) o;
        return Objects.equals(duration, call.duration) &&
                Objects.equals(initiatorId, call.initiatorId) &&
                Objects.equals(receiverId, call.receiverId) &&
                Objects.equals(state, call.state) &&
                Objects.equals(time, call.time) &&
                Objects.equals(video, call.video);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Call{");
        sb.append("duration=").append(duration);
        sb.append(", initiatorId=").append(initiatorId);
        sb.append(", receiverId=").append(receiverId);
        sb.append(", state=").append(state);
        sb.append(", time=").append(time);
        sb.append(", video=").append(video);
        sb.append('}');
        return sb.toString();
    }
}

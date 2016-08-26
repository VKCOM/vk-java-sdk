package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * SetCallbackServerResponse object
 */
public class SetCallbackServerResponse {
    /**
     * State code
     */
    @SerializedName("state_code")
    private SetCallbackServerResponseStateCode stateCode;

    /**
     * State
     */
    @SerializedName("state")
    private String state;

    public SetCallbackServerResponseStateCode getStateCode() {
        return stateCode;
    }

    public String getState() {
        return state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stateCode, state);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetCallbackServerResponse setCallbackServerResponse = (SetCallbackServerResponse) o;
        return Objects.equals(stateCode, setCallbackServerResponse.stateCode) &&
                Objects.equals(state, setCallbackServerResponse.state);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SetCallbackServerResponse{");
        sb.append("stateCode=").append(stateCode);
        sb.append(", state='").append(state).append("'");
        sb.append('}');
        return sb.toString();
    }
}

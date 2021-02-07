package com.vk.api.sdk.objects.owner;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * State object
 */
public class State implements Validable {
    @SerializedName("state")
    private StateState state;

    /**
     * wiki text to describe user state
     */
    @SerializedName("description")
    private String description;

    public StateState getState() {
        return state;
    }

    public State setState(StateState state) {
        this.state = state;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public State setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, state);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return Objects.equals(description, state.description) &&
                Objects.equals(state, state.state);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("State{");
        sb.append("description='").append(description).append("'");
        sb.append(", state=").append(state);
        sb.append('}');
        return sb.toString();
    }
}

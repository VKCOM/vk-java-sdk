package com.vk.api.sdk.objects.callback.groups;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 11.08.17.
 */
public class CallbackGroupSettingsChange<T> {

    @SerializedName("old_value")
    private T oldValue;

    @SerializedName("new_value")
    private T newValue;

    public T getOldValue() {
        return oldValue;
    }

    public T getNewValue() {
        return newValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallbackGroupSettingsChange<?> that = (CallbackGroupSettingsChange<?>) o;
        return Objects.equals(oldValue, that.oldValue) &&
                Objects.equals(newValue, that.newValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldValue, newValue);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackGroupSettingsChange{");
        sb.append("newValue=").append(newValue);
        sb.append(", oldValue=").append(oldValue);
        sb.append('}');
        return sb.toString();
    }
}

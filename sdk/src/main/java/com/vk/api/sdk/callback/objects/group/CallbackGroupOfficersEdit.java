package com.vk.api.sdk.callback.objects.group;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 11.08.17.
 */
public class CallbackGroupOfficersEdit {

    @SerializedName("admin_id")
    private Integer admin_id;

    @SerializedName("user_id")
    private Integer user_id;

    @SerializedName("level_old")
    private CallbackGroupOfficerRole levelOld;

    @SerializedName("level_new")
    private CallbackGroupOfficerRole levelNew;

    public Integer getAdmin_id() {
        return admin_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public CallbackGroupOfficerRole getLevelOld() {
        return levelOld;
    }

    public CallbackGroupOfficerRole getLevelNew() {
        return levelNew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallbackGroupOfficersEdit that = (CallbackGroupOfficersEdit) o;
        return Objects.equals(admin_id, that.admin_id) &&
                Objects.equals(user_id, that.user_id) &&
                levelOld == that.levelOld &&
                levelNew == that.levelNew;
    }

    @Override
    public int hashCode() {
        return Objects.hash(admin_id, user_id, levelOld, levelNew);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackGroupOfficersEdit{");
        sb.append("admin_id=").append(admin_id);
        sb.append(", levelNew=").append(levelNew);
        sb.append(", levelOld=").append(levelOld);
        sb.append(", user_id=").append(user_id);
        sb.append('}');
        return sb.toString();
    }
}

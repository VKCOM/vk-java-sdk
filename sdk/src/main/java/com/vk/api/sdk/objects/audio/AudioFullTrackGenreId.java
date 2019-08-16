package com.vk.api.sdk.objects.audio;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Audio gener ID */
public enum AudioFullTrackGenreId implements EnumParam {
    @SerializedName("1")
    ROCK(1),

    @SerializedName("2")
    POP(2),

    @SerializedName("3")
    RAP___HIPMINUS_HOP(3),

    @SerializedName("5")
    HOUSE___DANCE(5),

    @SerializedName("6")
    INSTRUMENTAL(6),

    @SerializedName("4")
    EASY_LISTENING(4),

    @SerializedName("7")
    METAL(7),

    @SerializedName("8")
    DUBSTEP___TRAP(8),

    @SerializedName("10")
    DRUM___BASS(10),

    @SerializedName("11")
    TRANCE(11),

    @SerializedName("13")
    ETHNIC(13),

    @SerializedName("14")
    ACOUSTIC___VOCAL(14),

    @SerializedName("15")
    REGGAE(15),

    @SerializedName("16")
    CLASSICAL(16),

    @SerializedName("17")
    INDIE_POP(17),

    @SerializedName("21")
    ALTERNATIVE(21),

    @SerializedName("22")
    ELECTROPOP___DISCO(22),

    @SerializedName("1001")
    JAZZ___BLUES(1001);

    private final Integer value;

    AudioFullTrackGenreId(Integer value) {
        this.value = value;
    }

    public String getValue() {
        return value.toString();
    }

    @Override
    public String toString() {
        return value.toString().toLowerCase();
    }
}

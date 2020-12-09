package com.vk.api.sdk.objects.stories;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum UploadLinkText implements EnumParam {
    @SerializedName("to_store")
    TO_STORE("to_store"),

    @SerializedName("vote")
    VOTE("vote"),

    @SerializedName("more")
    MORE("more"),

    @SerializedName("book")
    BOOK("book"),

    @SerializedName("order")
    ORDER("order"),

    @SerializedName("enroll")
    ENROLL("enroll"),

    @SerializedName("fill")
    FILL("fill"),

    @SerializedName("signup")
    SIGNUP("signup"),

    @SerializedName("buy")
    BUY("buy"),

    @SerializedName("ticket")
    TICKET("ticket"),

    @SerializedName("write")
    WRITE("write"),

    @SerializedName("open")
    OPEN("open"),

    @SerializedName("learn_more")
    LEARN_MORE("learn_more"),

    @SerializedName("view")
    VIEW("view"),

    @SerializedName("go_to")
    GO_TO("go_to"),

    @SerializedName("contact")
    CONTACT("contact"),

    @SerializedName("watch")
    WATCH("watch"),

    @SerializedName("play")
    PLAY("play"),

    @SerializedName("install")
    INSTALL("install"),

    @SerializedName("read")
    READ("read"),

    @SerializedName("calendar")
    CALENDAR("calendar");

    private final String value;

    UploadLinkText(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toLowerCase();
    }
}

package com.vk.api.sdk.objects.stories;

import com.vk.api.sdk.queries.EnumParam;

public enum LinkText implements EnumParam {

    TO_STORE("to_store"),
    VOTE("vote"),
    MORE("more"),
    BOOK("book"),
    ORDER("order"),
    ENROLL("enroll"),
    FILL("fill"),
    SIGN_UP("signup"),
    BUY("buy"),
    TICKET("ticket"),
    WRITE("write"),
    OPEN("open"),
    LEARN_MORE("learn_more"),
    VIEW("view"),
    GO_TO("go_to"),
    CONTACT("contact"),
    WATCH("watch"),
    PLAY("play"),
    INSTALL("install"),
    READ("read");

    private final String value;

    LinkText(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}

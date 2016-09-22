package com.vk.api.sdk.queries.orders;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum OrdersChangeStateAction implements EnumParam {

    CANCEK("cancel"),
    CHARGE("charge"),
    REFUND("refund");

    private final String value;

    OrdersChangeStateAction(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}

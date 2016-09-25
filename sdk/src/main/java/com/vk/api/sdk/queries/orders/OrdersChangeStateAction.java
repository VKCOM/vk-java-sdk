package com.vk.api.sdk.queries.orders;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum OrdersChangeStateAction implements EnumParam {

    /**
     * cancel unconfirmed order
     */
    CANCEL("cancel"),

    /**
     * confirm unconfirmed order. Applies only if processing of order_change_state notification failed.
     */
    CHARGE("charge"),

    /**
     * cancel confirmed order
     */
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

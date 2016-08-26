package com.vk.api.sdk.exceptions;

public class ApiNeedConfirmationException extends ApiException {

    private String confirmationText;

    public ApiNeedConfirmationException(String message, String confirmationText) {
        super(24, "Confirmation required", message);
        this.confirmationText = confirmationText;
    }

    public String getConfirmationText() {
        return confirmationText;
    }
}

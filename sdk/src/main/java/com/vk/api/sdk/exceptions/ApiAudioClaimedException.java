package com.vk.api.sdk.exceptions;

public class ApiAudioClaimedException extends ApiException {
    public ApiAudioClaimedException(String message) {
        super(270, "The audio file was removed by the copyright holder and cannot be reuploaded.", message);
    }
}

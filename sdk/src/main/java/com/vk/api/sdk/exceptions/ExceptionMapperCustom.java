package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.ErrorWithCaptcha;

public class ExceptionMapperCustom extends ExceptionMapper {
    public static ApiException parseException(ErrorWithCaptcha error) {
        switch(error.getErrorCode()) {
            case 14:
                return new ApiCaptchaExceptionCustom(14, error.getErrorMsg(), error.getCaptchaSid(), error.getCaptchaImg());
            case 3300:
                return new ApiCaptchaExceptionCustom(3300, error.getErrorMsg(), error.getCaptchaSid(), error.getCaptchaImg());
            default:
                return ExceptionMapper.parseException(error);
        }
    }
}

package com.vk.api.sdk.captcha;


import java.util.Objects;
import java.util.Scanner;

public class CaptchaHandlerFactory {
    public static CaptchaHandlerConsole getConsoleHandler() {
        return new CaptchaHandlerConsole();
    }
}


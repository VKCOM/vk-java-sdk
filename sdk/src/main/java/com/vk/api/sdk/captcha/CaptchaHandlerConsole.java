package com.vk.api.sdk.captcha;


import java.util.Objects;
import java.util.Scanner;

public class CaptchaHandlerConsole extends CaptchaHandlerAbstract {

    @Override
    public String getCaptchaCode(String sid, String img) throws CaptchaResolveException {
        System.out.println("----------------------------------------------");
        System.out.println("NEED TO ENTER CAPTCHA");
        System.out.println("SID: "+sid);
        System.out.println("Link: "+img);
        System.out.println("Enter 'q' or 'quit' to decline! ");
        System.out.println("---");
        Scanner consoleInputScanner = new Scanner(System.in);
        String userEnteredCaptcha;
        while(true) {
            System.out.print("PLEASE ENTER CAPTCHA: ");
            userEnteredCaptcha = consoleInputScanner.next();
            if (Objects.equals(userEnteredCaptcha, "q") || Objects.equals(userEnteredCaptcha, "quit"))
                throw new CaptchaResolveException("User declined to enter the captcha");
            if(checkCode(userEnteredCaptcha)) break;
            else {
                System.out.println("Wrong captcha format, please re-enter captcha.");
                continue;
            }
        }
        System.out.println("Captcha entered: "+userEnteredCaptcha);
        System.out.println("----------------------------------------------");
        return userEnteredCaptcha;
    }

}


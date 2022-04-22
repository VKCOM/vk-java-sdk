package com.vk.api.sdk.captcha.anticaptcha.test;

import com.vk.api.sdk.captcha.CaptchaHandlerAnticaptcha;
import com.vk.api.sdk.captcha.CaptchaResolveException;

import java.util.Objects;

public class resolveTestCaptcha {
    public static void main(String[] args) {
        String filenameOrUrl = "https://api.vk.com//captcha.php?sid=723412182770";
        String apiKey = "YOUR_API_KEY_HERE";
        //String expectedResult = "ab54qc"; //cant check result if it is some dynamic link

        try {
            String somesid = new CaptchaHandlerAnticaptcha(apiKey, null, null).getCaptchaCode("723412182770", filenameOrUrl);
            System.out.println("Anticaptcha result: "+somesid);
            //assert Objects.equals(somesid, expectedResult); //cant check result if it is some dynamic link
        } catch (CaptchaResolveException e) {
            e.printStackTrace();
        }
    }
}

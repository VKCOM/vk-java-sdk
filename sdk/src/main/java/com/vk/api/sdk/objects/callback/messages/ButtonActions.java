package com.vk.api.sdk.objects.callback.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.callback.MessageType;

import java.util.*;
import java.util.stream.Collectors;

public class ButtonActions extends HashSet<String>{

    public boolean isTextSupport(){
        return this.contains("text");
    }

    public boolean isVkPaySupport(){
        return this.contains("vkpay");
    }

    public boolean isOpenAppSupport(){
        return this.contains("open_app");
    }

    public boolean isLocationSupport(){
        return this.contains("location");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ButtonActions[");
        sb.append(String.join(", ", this));
        sb.append(']');
        return sb.toString();
    }
}

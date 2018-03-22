package com.vk.api.sdk.objects.stories;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum StoryType {
    @SerializedName("photo")
    PHOTO,
    @SerializedName("video")
    VIDEO
}

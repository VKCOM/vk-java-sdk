package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Data grouping by dates: *day — statistics by days,, *month — statistics by months,, *overall — overall statistics. 'date_from' and 'date_to' parameters set temporary limits.
 */
public enum AdsPeriod implements EnumParam {
    @SerializedName("day")
    DAY("day"),

    @SerializedName("month")
    MONTH("month"),

    @SerializedName("overall")
    OVERALL("overall");

    private final String value;

    AdsPeriod(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toLowerCase();
    }
}

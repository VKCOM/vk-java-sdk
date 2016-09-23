package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum GroupsEditSubject implements EnumParam {

    AUTO_MOTO("1"),

    ACTIVITY_HOLIDAYS("2"),

    BUSINESS("3"),

    PETS("4"),

    HEALTH("5"),

    DATING_AND_COMMUNICATION("6"),

    GAMES("7"),

    IT("8"),

    CINEMA("9"),

    BEAUTY_AND_FASHION("10"),

    COOKING("11"),

    ART_AND_CULTURE("12"),

    LITERATURE("13"),

    MOBILE_SERVICES_AND_INTERNET("14"),

    MUSIC("15"),

    SCIENCE_AND_TECHNOLOGY("16"),

    REAL_ESTATE("17"),

    NEWS_AND_MEDIA("18"),

    SECURITY("19"),

    EDUCATION("20"),

    HOME_AND_RENOVATIONS("21"),

    POLITICS("22"),

    FOOD("23"),

    INDUSTRY("24"),

    TRAVEL("25"),

    WORK("26"),

    ENTERTAINMENT("27"),

    RELIGION("28"),

    FAMILY("29"),

    SPORTS("30"),

    INSURANCE("31"),

    TELEVISION("32"),

    GOODS_AND_SERVICES("33"),

    HOBBIES("34"),

    FINANCE("35"),

    PHOTO("36"),

    ESOTERICS("37"),

    ELECTRONICS_AND_APPLIANCES("38"),

    EROTIC("39"),

    HUMOR("40"),

    SOCIETY_OR_HUMANITIES("41"),

    DESIGN_AND_GRAPHICS("42");

    private final String value;

    GroupsEditSubject(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}

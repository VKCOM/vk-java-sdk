package com.vk.api.sdk.queries.audio;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum AudioGenre implements EnumParam {

    /**
     * Rock
     */
    ROCK("1"),
    /**
     * Pop
     */
    POP("2"),
    /**
     * Rap and Hip-Hop
     */
    RAP_AND_HIP_HOP("3"),
    /**
     * Easy Listening
     */
    EASY_LISTENING("4"),
    /**
     * House and Dance
     */
    HOUSE_AND_DANCE("5"),
    /**
     * Instrumental
     */
    INSTRUMENTAL("6"),
    /**
     * Metal
     */
    METAL("7"),
    /**
     * Alternative
     */
    ALTERNATIVE("21"),
    /**
     * Dubstep
     */
    DUBSTEP("8"),
    /**
     * Jazz and Blues
     */
    JAZZ_AND_BLUES("1001"),
    /**
     * Drum and Bass
     */
    DRUM_AND_BASS("10"),
    /**
     * Trance
     */
    TRANCE("11"),
    /**
     * Chanson
     */
    CHANSON("12"),
    /**
     * Ethnic
     */
    ETHNIC("13"),
    /**
     * Acoustic and Vocal
     */
    ACOUSTIC_AND_VOCAL("14"),
    /**
     * Reggae
     */
    REGGAE("15"),
    /**
     * Classical
     */
    CLASSICAL("16"),
    /**
     * Indie Pop
     */
    INDIE_POP("17"),
    /**
     * Speech
     */
    SPEECH("19"),
    /**
     * Electropop and Disco
     */
    ELECTROPOP_AND_DISCO("22"),
    /**
     * Other
     */
    OTHER("18");

    private final String value;

    AudioGenre(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}

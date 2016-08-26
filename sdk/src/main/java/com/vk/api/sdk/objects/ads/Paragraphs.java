package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Paragraphs object
 */
public class Paragraphs {
    /**
     * Rules paragraph
     */
    @SerializedName("paragraph")
    private String paragraph;

    public String getParagraph() {
        return paragraph;
    }

    @Override
    public int hashCode() {
        return Objects.hash(paragraph);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paragraphs paragraphs = (Paragraphs) o;
        return Objects.equals(paragraph, paragraphs.paragraph);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Paragraphs{");
        sb.append("paragraph='").append(paragraph).append("'");
        sb.append('}');
        return sb.toString();
    }
}

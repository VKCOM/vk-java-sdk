package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * Rules object
 */
public class Rules {
    /**
     * Comment
     */
    @SerializedName("title")
    private String title;

    @SerializedName("paragraphs")
    private List<Paragraphs> paragraphs;

    public String getTitle() {
        return title;
    }

    public List<Paragraphs> getParagraphs() {
        return paragraphs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, paragraphs);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rules rules = (Rules) o;
        return Objects.equals(title, rules.title) &&
                Objects.equals(paragraphs, rules.paragraphs);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rules{");
        sb.append("title='").append(title).append("'");
        sb.append(", paragraphs=").append(paragraphs);
        sb.append('}');
        return sb.toString();
    }
}

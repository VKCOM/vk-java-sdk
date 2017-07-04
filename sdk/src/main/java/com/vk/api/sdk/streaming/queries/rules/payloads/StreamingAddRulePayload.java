package com.vk.api.sdk.streaming.queries.rules.payloads;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Payload for add rule query
 */
public class StreamingAddRulePayload {

    @SerializedName("rule")
    private Rule rule;

    public StreamingAddRulePayload(String tag, String value) {
        this.rule = new Rule(tag, value);
    }

    public Rule getRule() {
        return rule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StreamingAddRulePayload that = (StreamingAddRulePayload) o;
        return Objects.equals(rule, that.rule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rule);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StreamingAddRulePayload{");
        sb.append("rule=").append(rule);
        sb.append('}');
        return sb.toString();
    }

    class Rule {
        @SerializedName("tag")
        private String tag;

        @SerializedName("value")
        private String value;

        public Rule(String tag, String value) {
            this.tag = tag;
            this.value = value;
        }

        public String getTag() {
            return tag;
        }

        public String getValue() {
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Rule that = (Rule) o;
            return Objects.equals(tag, that.tag) &&
                    Objects.equals(value, that.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(tag, value);
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Rule{");
            sb.append("tag='").append(tag).append('\'');
            sb.append(", value='").append(value).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }
}

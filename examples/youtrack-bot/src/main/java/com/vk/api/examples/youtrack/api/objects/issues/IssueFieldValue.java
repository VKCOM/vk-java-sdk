package com.vk.api.examples.youtrack.api.objects.issues;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import javax.xml.bind.annotation.XmlAttribute;

public class IssueFieldValue {

    @JacksonXmlText
    private String text;

    @XmlAttribute
    private String url;

    public IssueFieldValue(String text) {
        this.text = text;
    }

    public IssueFieldValue() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
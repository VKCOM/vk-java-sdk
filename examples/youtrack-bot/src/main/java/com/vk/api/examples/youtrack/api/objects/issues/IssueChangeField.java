package com.vk.api.examples.youtrack.api.objects.issues;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by Anton Tsivarev on 29.04.16.
 */
public class IssueChangeField {

    @XmlAttribute
    private String name;

    @JacksonXmlProperty(localName = "oldValue")
    private String oldValue;

    @JacksonXmlProperty(localName = "value")
    private String value;

    @JacksonXmlProperty(localName = "newValue")
    private String newValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
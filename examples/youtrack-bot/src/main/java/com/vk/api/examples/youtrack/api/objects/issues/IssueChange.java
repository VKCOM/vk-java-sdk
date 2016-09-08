package com.vk.api.examples.youtrack.api.objects.issues;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anton Tsivarev on 29.04.16.
 */
public class IssueChange {

    @JacksonXmlProperty(localName = "field")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<IssueChangeField> fields = new ArrayList<>();

    public List<IssueChangeField> getFields() {
        return fields;
    }

    public void setFields(List<IssueChangeField> fields) {
        this.fields = fields;
    }
}
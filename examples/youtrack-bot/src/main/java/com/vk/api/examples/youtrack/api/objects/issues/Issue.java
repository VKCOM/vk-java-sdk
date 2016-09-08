package com.vk.api.examples.youtrack.api.objects.issues;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

/**
 * Created by Anton Tsivarev on 29.04.16.
 */
public class Issue {
    @XmlAttribute
    private String id;

    @JacksonXmlProperty(localName = "field")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<IssueField> fields;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<IssueField> getFields() {
        return fields;
    }

    public void setFields(List<IssueField> fields) {
        this.fields = fields;
    }

    public String getFieldValue(final String fieldName) {
        IssueField field = findIssueField(fieldName);
        if (field != null) {
            return field.getValue();
        }
        return null;
    }

    public IssueField findIssueField(final String field) {
        return Iterables.tryFind(fields, new Predicate<IssueField>() {
            @Override
            public boolean apply(IssueField issueField) {
                return issueField.getName().equals(field);
            }
        }).orNull();
    }
}
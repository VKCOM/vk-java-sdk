package com.vk.api.examples.youtrack.api.objects.issues;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement(localName = "issues")
@XmlSeeAlso({IssueChange.class, IssueChangeField.class})
public class IssueChangeList {

    @JacksonXmlProperty(localName = "change")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<IssueChange> changes = new ArrayList<>();

    public List<IssueChange> getChanges() {
        return changes;
    }

    public void setChanges(List<IssueChange> changes) {
        this.changes = changes;
    }
}
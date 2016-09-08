package com.vk.api.examples.youtrack.api.objects.issues;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement(localName = "issues")
@XmlSeeAlso({Issue.class, IssueField.class, IssueFieldValue.class})
public class IssueList {

    @JacksonXmlProperty(localName = "issue")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Issue> issues = new ArrayList<>();

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }
}
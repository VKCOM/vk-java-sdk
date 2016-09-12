package com.vk.api.examples.youtrack.api.objects.projects;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.vk.api.examples.youtrack.api.objects.issues.Issue;
import com.vk.api.examples.youtrack.api.objects.issues.IssueField;
import com.vk.api.examples.youtrack.api.objects.issues.IssueFieldValue;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement(localName = "projects")
@XmlSeeAlso({Issue.class, IssueField.class, IssueFieldValue.class})
public class AdminProjectList {

    @JacksonXmlProperty(localName = "project")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<AdminProject> projects = new ArrayList<>();


    public List<AdminProject> getProjects() {
        return projects;
    }

    public void setProjects(List<AdminProject> projects) {
        this.projects = projects;
    }

    public static class AdminProject {
        @XmlAttribute
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}


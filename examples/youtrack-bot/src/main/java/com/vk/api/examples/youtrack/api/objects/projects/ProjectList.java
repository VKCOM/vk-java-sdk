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
public class ProjectList {

    @JacksonXmlProperty(localName = "project")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Project> projects = new ArrayList<>();


    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public static class Project {
        @XmlAttribute
        private String name;

        @XmlAttribute
        private String shortName;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getShortName() {
            return shortName;
        }

        public void setShortName(String shortName) {
            this.shortName = shortName;
        }
    }
}


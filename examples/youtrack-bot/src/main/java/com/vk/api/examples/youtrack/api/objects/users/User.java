package com.vk.api.examples.youtrack.api.objects.users;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class User {

    @JacksonXmlProperty
    private String fullName;

    @JacksonXmlProperty
    private String email;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("fullName='").append(fullName).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
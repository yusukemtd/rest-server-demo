package com.example.restserver.api.client;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Scope implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String description;

    public Scope() {
        super();
    }

    public Scope(String name, String description) {
        this();
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}

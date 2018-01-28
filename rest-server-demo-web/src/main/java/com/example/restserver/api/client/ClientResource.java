package com.example.restserver.api.client;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ClientResource implements Serializable {

    private static final long serialVersionUID = 1L;

    private String clientId;

    List<Scope> scopes;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public List<Scope> getScopes() {
        return scopes;
    }

    public void setScopes(List<Scope> scopes) {
        this.scopes = scopes;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}

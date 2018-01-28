package com.example.restserver.api.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clients")
public class ClientRestController {

    @RequestMapping(value = "{clientId}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public ClientResource getTodo(@PathVariable("clientId") String clientId) {

        // TODO test data
        List<Scope> scopes = new ArrayList<>();
        scopes.add(new Scope("name1", "description1"));
        scopes.add(new Scope("name2", "description2"));

        ClientResource resource = new ClientResource();
        resource.setClientId(clientId);
        resource.setScopes(scopes);

        return resource;
    }
}

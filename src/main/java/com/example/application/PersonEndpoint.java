package com.example.application;

import com.example.Person;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;

@BrowserCallable
@AnonymousAllowed
public class PersonEndpoint {

    public Person savePerson(com.example.Person person) {
        return person;
    }
}

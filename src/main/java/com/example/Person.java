package com.example;

import jakarta.validation.constraints.NotNull;

public class Person {

    @NotNull
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}

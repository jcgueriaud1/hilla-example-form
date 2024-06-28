package com.example;

import java.util.List;

import jakarta.validation.constraints.NotNull;

public class Person {

    @NotNull
    private String fullName = "fullName";

    @NotNull
    private String descriptionPublic = "descriptionPublic";
    @NotNull
    private String descriptionProtected = "descriptionProtected";

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    protected String getDescriptionProtected() {
        return descriptionPublic;
    }

    protected void setDescriptionProtected(String descriptionProtected) {
        this.descriptionProtected = descriptionProtected;
    }

    public String getDescriptionPublic() {
        return descriptionPublic;
    }
}

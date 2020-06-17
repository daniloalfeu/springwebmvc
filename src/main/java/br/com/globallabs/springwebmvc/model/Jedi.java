package br.com.globallabs.springwebmvc.model;

import org.springframework.lang.NonNull;

public class Jedi {
    @NotBlank
    private String name;
    @NotBlank
    private String lastname;

    public Jedi(final String name, final String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public Jedi() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }
}

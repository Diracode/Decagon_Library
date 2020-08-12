package com.decagon;

import utility.Role;

public class Person {
    private final String name;
    private final String gender;
    private final Role role;

    public Person(String name, String gender, Role role) {
        this.name = name;
        this.gender = gender;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Role getRole() {
        return role;
    }
}

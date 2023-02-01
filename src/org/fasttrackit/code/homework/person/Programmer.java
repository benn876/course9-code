package org.fasttrackit.code.homework.person;

import java.time.LocalDateTime;

public class Programmer extends Employee {
    private final String language;

    public Programmer(String language, String firstName, LocalDateTime dateOfEmployment, LocalDateTime birthDay) {
        super(firstName, dateOfEmployment, birthDay);
        this.language = language;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

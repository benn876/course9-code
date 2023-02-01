package org.fasttrackit.code.homework.person;

import java.time.LocalDateTime;

public class Employee implements Person {
    private String firstName;
    private LocalDateTime dateOfEmployment;
    private LocalDateTime birthDay;

    public Employee(String firstName, LocalDateTime dateOfEmployment, LocalDateTime birthDay) {
        this.firstName = firstName;
        this.dateOfEmployment = dateOfEmployment;
        this.birthDay = birthDay;
    }

    public void setFirstName(String firstName) {
        if(firstName.equals("Hitler")){
            System.out.println("You are a nazi and you cannot cahnge it to hitler");
            throw new RuntimeException();
        }
        this.firstName = firstName;
    }

    @Override
    public final String getFirstName() {
        return firstName;
    }

    @Override
    public LocalDateTime getBirthday() {
        return birthDay;
    }

    @Override
    public String toString() {
        return "Employee was employed at %s".formatted(dateOfEmployment);
    }

    private String sayEmployee(){
        return "Employee";
    }
}

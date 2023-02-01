package org.fasttrackit.code.homework.person;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Java","Ion", LocalDateTime.now(), LocalDateTime.of(1990,4,2,1,22));
        System.out.println(programmer);

        Programmer programmer2 = new Programmer("Javascript","Mircea", LocalDateTime.now(),LocalDateTime.of(1989,7,22,1,22));
        System.out.println(programmer);

        int age = LocalDateTime.now().getYear() - programmer.getBirthday().getYear();
        System.out.println(age);

        Object anotherProgramer = new Programmer("C#","Yac", LocalDateTime.now(), LocalDateTime.of(1990,4,2,1,22));
        if(anotherProgramer instanceof  Employee){
            System.out.println("This is a employee");
        }

        if(anotherProgramer instanceof Programmer){
            System.out.println("this is a programmer");
        }

    }
}

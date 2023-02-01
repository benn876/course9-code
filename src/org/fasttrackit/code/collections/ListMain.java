package org.fasttrackit.code.collections;

import org.fasttrackit.code.homework.person.Programmer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Object> listOfObjects = new ArrayList<>();
        listOfObjects.add("hei");
        listOfObjects.add(4);
        listOfObjects.add(new Programmer(null,null,null,null));

        for (Object object : listOfObjects){
            if(object instanceof String){
                System.out.println(object);
            }
        }

        List<String> names = new ArrayList<>();
        names.add("Mircea");
        names.add("George");
        names.add("Ion");

        for(String name: names){
            System.out.println(name);
        }

        System.out.println(names.get(1));

        List<String> linkedName = new LinkedList<>();
        linkedName.add("Horhe");
        linkedName.add("Mihai");
        linkedName.add("George");


        linkedName.get(1);

        List<Programmer> programmers = new LinkedList<>();

    }
}

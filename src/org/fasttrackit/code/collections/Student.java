package org.fasttrackit.code.collections;

public class Student {
    private Integer age;

    public Student(Integer age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return age % 5;
    }
}

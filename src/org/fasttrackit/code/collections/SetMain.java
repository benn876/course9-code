package org.fasttrackit.code.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
        List<Integer> someNumbers = List.of(1, 4, 5, 5);
//        System.out.println(sumOfNumbers(1, 4, 67, 2, 4, 3,5));

        System.out.println(someNumbers);

        HashSet<Integer> hashSetIntegers = new HashSet<>();
        hashSetIntegers.add(1);
        hashSetIntegers.add(2);
        hashSetIntegers.add(1);
        hashSetIntegers.add(6);
        hashSetIntegers.add(3);
        hashSetIntegers.add(10);
        System.out.println(hashSetIntegers);
        hashSetIntegers.contains(6);

        Student student = new Student(33);
        System.out.println(student.hashCode());

        System.out.println("Tree set-------------------");
        TreeSet<Integer> treeSetIntegers = new TreeSet<>();
        treeSetIntegers.add(22);
        treeSetIntegers.add(31);
        treeSetIntegers.add(66);
        treeSetIntegers.add(2);
        System.out.println(treeSetIntegers);
        System.out.println(treeSetIntegers.descendingSet());
        treeSetIntegers.contains(77);

    }


    public class Node<E> {
        E value;
        List<Node<E>> left;
        List<Node<E>> right;
    }
//    private static int sumOfNumbers(Integer... numbers) {
//        Integer sum = 0;
//        for(Integer number: numbers){
//            sum += number;
//        }
//        return sum;
//    }
}

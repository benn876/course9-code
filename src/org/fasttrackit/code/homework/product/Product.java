package org.fasttrackit.code.homework.product;

public interface Product {
    String PRODUCT = "PRODUCT";

    int getPrice();

    String getName();

    String getDescription();

    int getQuantity();

   default void saySomething() {
        System.out.println("Say somehting");
    }

}

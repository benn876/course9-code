package org.fasttrackit.code.homework.product;

public class Electronics implements Product{
    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public int getQuantity() {
        return 0;
    }

    @Override
    public void saySomething() {
        Product.super.saySomething();
    }
}

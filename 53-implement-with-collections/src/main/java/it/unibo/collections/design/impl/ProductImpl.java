package it.unibo.collections.design.impl;

import it.unibo.collections.design.api.Product;

public class ProductImpl implements Product{

    String name;
    int quantity;
    public ProductImpl(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public double getQuantity() {
        return this.quantity;
    }

}
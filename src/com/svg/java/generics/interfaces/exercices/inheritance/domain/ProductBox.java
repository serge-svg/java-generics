package com.svg.java.generics.interfaces.exercices.inheritance.domain;

import com.svg.java.generics.interfaces.genericdomain.Product;

public class ProductBox<T extends Product> extends Box<T>{

    public ProductBox(int maxNumberOfItems) {
        super(maxNumberOfItems);
        this.maxNumberOfItems = maxNumberOfItems;
    }

    public double totalPrice() {
        return super.getList().stream()
                .mapToDouble(product -> product.getPrice())
                .reduce(0, (price1, price2) -> price1 + price2);

    }

}

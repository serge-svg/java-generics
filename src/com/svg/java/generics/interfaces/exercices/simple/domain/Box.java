package com.svg.java.generics.interfaces.exercices.simple.domain;

import com.svg.java.generics.interfaces.genericdomain.Product;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Product> {

    private List<T> list = new ArrayList<>();
    private final int maxNumberOfItems;

    public Box(int maxNumberOfItems) {
        this.maxNumberOfItems = maxNumberOfItems;
    }

    public void add(T t) {
        if (list.size() < maxNumberOfItems) {
            list.add(t);
        }
    }

    public void remove(T t) {
        list.remove(t);
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) throws Exception {
        if (list.size() < maxNumberOfItems) {
            this.list = list;
        } else {
            throw new Exception("The number of items is biggeer than the allowed");
        }
    }

    public double totalPrice() {
        /*
        double totalPrice = 0;
        for (Product product : list) {
            totalPrice = totalPrice + product.getPrice();
        }
        return totalPrice;
        */
        return list.stream()
                .mapToDouble(product -> product.getPrice())
                .reduce(0, (price1, price2) -> price1 + price2);

    }

}

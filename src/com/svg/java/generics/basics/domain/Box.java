package com.svg.java.generics.basics.domain;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

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

}

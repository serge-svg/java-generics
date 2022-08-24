package com.svg.java.generics.interfaces.exercices.inheritance.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box<T> implements Iterable<T>{

    protected List<T> list = new ArrayList<>();

    public Box(int maxNumberOfItems) {
        this.maxNumberOfItems = maxNumberOfItems;
    }

    protected int maxNumberOfItems;

    public void setList(List<T> list) throws Exception {
        if (list.size() < maxNumberOfItems) {
            this.list = list;
        } else {
            throw new Exception("The number of items is biggeer than the allowed");
        }
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

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}

package com.svg.java.generics.basics.domain;

public record DoublePack<T> (T item1, T item2) {

    public boolean equals() {
        return item1.equals(item2);
    }

}

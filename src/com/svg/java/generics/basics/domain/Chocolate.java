package com.svg.java.generics.basics.domain;

public class Chocolate {

    private ChocolateType chocolateType;

    public Chocolate(ChocolateType chocolateType) {
        this.chocolateType = chocolateType;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "kind='" + chocolateType + '\'' +
                '}';
    }
}

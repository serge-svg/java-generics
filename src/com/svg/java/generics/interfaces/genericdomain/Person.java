package com.svg.java.generics.interfaces.genericdomain;

public class Person{

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void walk() {
        System.out.println("The person walks");
    }

}

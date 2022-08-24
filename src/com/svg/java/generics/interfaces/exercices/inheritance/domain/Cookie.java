package com.svg.java.generics.interfaces.exercices.inheritance.domain;

import com.svg.java.generics.interfaces.genericdomain.Flavour;
import com.svg.java.generics.interfaces.genericdomain.Product;

import java.util.Objects;

public class Cookie implements Product {

    private final Flavour flavour;
    private double price;

    public Cookie(Flavour flavour, double price) {
        this.flavour = flavour;
        this.price = price;
    }

    public Flavour getFlavour() {
        return flavour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cookie cookie = (Cookie) o;
        return flavour == cookie.flavour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavour);
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(Double price) {
        this.price =  price;
    }
}

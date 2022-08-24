package com.svg.java.generics.basics.domain;

import java.util.Objects;

public class Cookie {

    private final Flavour flavour;

    public Cookie(Flavour flavour) {
        this.flavour = flavour;
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

}

package com.svg.java.generics.interfaces.repository;

import com.svg.java.generics.interfaces.exercices.simple.domain.Cookie;
import com.svg.java.generics.interfaces.genericdomain.Flavour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CookieRepository {

    static List<Cookie> cookieList = new ArrayList<>();

    static {
        Cookie chocolateCookie = new Cookie(Flavour.Chocolate, 5);
        Cookie strawberryCookie = new Cookie(Flavour.Strawberry, 4);
        Cookie vanillaCookie = new Cookie(Flavour.Vanilla, 3);
        cookieList = Arrays.asList(chocolateCookie, vanillaCookie, strawberryCookie);
    }

    public List<Cookie> getAll() {
        return cookieList;
    }

    public Optional<Cookie> getByFlavour(Flavour flavour) {
        return cookieList.stream().filter((cookie -> cookie.getFlavour().equals(flavour))).findFirst();
    }

}

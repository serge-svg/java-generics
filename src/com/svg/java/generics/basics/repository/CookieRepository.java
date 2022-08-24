package com.svg.java.generics.basics.repository;

import com.svg.java.generics.basics.domain.Cookie;
import com.svg.java.generics.basics.domain.Flavour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CookieRepository {
    static List<Cookie> cookieList = new ArrayList<>();

    static {
        Cookie chocolateCookie = new Cookie(Flavour.Chocolate);
        Cookie vanillaCookie = new Cookie(Flavour.Vanilla);
        Cookie strawberryCookie = new Cookie(Flavour.Strawberry);
        cookieList = Arrays.asList(chocolateCookie, vanillaCookie, strawberryCookie);
    }

    public List<Cookie> getAll() {
        return cookieList;
    }

    public Optional<Cookie> getByFlavour(Flavour flavour) {
        return cookieList.stream().filter((cookie -> cookie.getFlavour().equals(flavour))).findFirst();
    }

}

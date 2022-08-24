package com.svg.java.generics.basics.service;

import com.svg.java.generics.basics.domain.Cookie;
import com.svg.java.generics.basics.domain.Flavour;
import com.svg.java.generics.basics.repository.CookieRepository;

import java.util.List;
import java.util.Optional;

public class CookieService {

    CookieRepository cookieRepository = new CookieRepository();

    public List<Cookie> getAll() {
        return cookieRepository.getAll();
    }

    public Optional<Cookie> getByFlavour(Flavour flavour) {
        return cookieRepository.getByFlavour(flavour);
    }
}

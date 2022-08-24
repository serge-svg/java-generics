package com.svg.java.generics.interfaces.service;

import com.svg.java.generics.interfaces.exercices.simple.domain.Cookie;
import com.svg.java.generics.interfaces.genericdomain.Flavour;
import com.svg.java.generics.interfaces.repository.CookieRepository;

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

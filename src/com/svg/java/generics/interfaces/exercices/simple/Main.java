package com.svg.java.generics.interfaces.exercices.simple;

import com.svg.java.generics.interfaces.exercices.simple.domain.Box;
import com.svg.java.generics.interfaces.exercices.simple.domain.Cookie;
import com.svg.java.generics.interfaces.genericdomain.Flavour;

/*
    For this exercise,
        - Using an interface Product to set/get the products price, calculate a cookie box price
 */
public class Main {

    public static void main(String[] args) {
        Box<Cookie> cookieBox = new Box<>(2);
        cookieBox.add(new Cookie(Flavour.Vanilla, 3));
        cookieBox.add(new Cookie(Flavour.Vanilla, 3));

        System.out.printf("The price of this cookie box is: %s \n", cookieBox.totalPrice());


    }

}

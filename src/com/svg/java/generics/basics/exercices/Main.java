package com.svg.java.generics.basics.exercices;

import com.svg.java.generics.basics.domain.*;
import com.svg.java.generics.basics.service.CookieService;

/*
    For this exercise,
        - first, try set in a cookie generic box a list of cookies bigger than allowed
        - second, create a cookies generic box for 2 cookies, fill it and print the content of box
        - third, create a chocolates generic box for 2 chocolates,  fill it and print the content of box
        - fourth, using a generic class DoublePack that accepts two 2 generic items of the same type, create a pack of different cookies and print their flavours
        - fifth, using a generic class DoublePack that accepts two 2 generic items of the same type, create a pack of different chocolates and print whether they are of the same type
 */
public class Main {

    public static void main(String[] args) {
        CookieService cookieService = new CookieService();
        Box<Cookie> cookieBox = new Box<>(2);

        // First
        try {
            cookieBox.setList(cookieService.getAll());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Second
        cookieBox.add(new Cookie(Flavour.Chocolate));
        cookieBox.add(new Cookie(Flavour.Vanilla));
        cookieBox.getList().stream().map((i) -> i.getFlavour()).forEach(Main::printCookies);

        // Third
        Box<Chocolate> chocolateBox = new Box<>(4);
        chocolateBox.add(new Chocolate(ChocolateType.Simple));
        chocolateBox.add(new Chocolate(ChocolateType.Simple));
        chocolateBox.add(new Chocolate(ChocolateType.WithAlmond));
        chocolateBox.add(new Chocolate(ChocolateType.WithAlmond));
        chocolateBox.getList().stream().forEach(System.out::println);

        // Fourth
        DoublePack<Cookie> cookieDoublePack = new DoublePack<>(new Cookie(Flavour.Chocolate), new Cookie(Flavour.Vanilla));
        System.out.printf("The cookie's flavour of the pack are: %s %s \n", cookieDoublePack.item1().getFlavour(), cookieDoublePack.item2().getFlavour());

        // Fifth
        Chocolate hazelChocolate = new Chocolate(ChocolateType.WithHazelnut);
        Chocolate walnutChocolate = new Chocolate(ChocolateType.WithWelnut);
        // To verify the override equals is working
        System.out.println("Is a hazelChocolate equals to walnutChocolate: " + hazelChocolate.equals(walnutChocolate));

        DoublePack<Chocolate> chocolateDoublePack = new DoublePack<>(hazelChocolate, hazelChocolate);
        System.out.println("Has the pack the same type of chocolates: " + chocolateDoublePack.equals());


    }

    private static void printCookies(Flavour value) {
        System.out.printf("The cookie flavour is: %s %n", value);
    }
}

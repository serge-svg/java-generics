package com.svg.java.generics.interfaces.exercices.inheritance;


import com.svg.java.generics.interfaces.exercices.inheritance.domain.Book;
import com.svg.java.generics.interfaces.exercices.inheritance.domain.Box;
import com.svg.java.generics.interfaces.exercices.inheritance.domain.Cookie;
import com.svg.java.generics.interfaces.exercices.inheritance.domain.ProductBox;
import com.svg.java.generics.interfaces.genericdomain.Flavour;

/*
    For this exercise,
        - First, calculate a cookie box price using ProductBox inheritance to keep a Box as much flexible as possible
        - Second, create a box with 2 books and print their titles
 */
public class Main {

    public static void main(String[] args) {
        ProductBox<Cookie> cookieBox = new ProductBox<Cookie>(2);
        cookieBox.add(new Cookie(Flavour.Vanilla, 3));
        cookieBox.add(new Cookie(Flavour.Vanilla, 3));
        cookieBox.getList().stream()
                .map(item -> "Flavour: " + item.getFlavour() + ", Price: " + item.getPrice())
                .forEach(System.out::println);
        System.out.printf("The price of this cookie box is: %s \n", cookieBox.totalPrice());

        // Using iterable for Box
        for (Cookie cookie : cookieBox) {
            System.out.println(cookie.getPrice());
            System.out.println(cookie.getFlavour());
        }

        System.out.println("The books in the box are: ");
        Box<Book> bookBox = new Box<Book>(2);
        bookBox.add(new Book("Java 8"));
        bookBox.add(new Book("Java 9"));
        bookBox.getList().stream()
                .map((book) -> book.title())
                .forEach(System.out::println);


    }

}

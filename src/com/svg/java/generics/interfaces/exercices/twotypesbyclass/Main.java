package com.svg.java.generics.interfaces.exercices.twotypesbyclass;

public class Main {

    public static void main(String[] args) {
        OrderedPair<String, String> b1 = new OrderedPair<>("One", "0001");
        OrderedPair<Integer, String> b2 = new OrderedPair<>(2, "0010");

        System.out.printf("One in binary is: %s %s %n", b1.getKey(), b1.getValue());
        System.out.printf("Two in binary is: %d %s %n", b2.getKey(), b2.getValue());

    }
}

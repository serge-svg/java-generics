package com.svg.java.generics.interfaces.exercices.wildcard;

import com.svg.java.generics.interfaces.genericdomain.Engineer;
import com.svg.java.generics.interfaces.genericdomain.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    For this exercise,
        - First, using classes Person and Engineer (type of Person), create their own method walk and show the output
        - Second, create a method that uses wildcard as a parameter to print lists of Persons or Engineers walking
        - Third, create a generic method to clone a list and check the results
 */
public class Main {

    public static void main(String[] args) {
        // First
        Person person = new Person("Person1");
        person.walk();
        Engineer engineer = new Engineer("Engineer1");
        engineer.walk();

        // Second
        List<Person> personList = Arrays.asList(person, engineer);
        everyoneToWalk(personList);

        //Third
        personList.stream().forEach(System.out::println);
        cloneList(personList).stream().forEach(System.out::println);

        personList.stream().map((p) -> p.getName()).forEach(System.out::println);
        cloneList(personList).stream().map((p) -> p.getName()).forEach(System.out::println);
    }

    // Second
    private static void everyoneToWalk(List<? extends Person> list) {
        for(Person person : list){
            person.walk();
        }
    }

    // Third
    private static <T> List<T> cloneList(List<T> list) {
        List<T> newList = new ArrayList<>();
        newList.addAll(list);
        return newList;
    }
}

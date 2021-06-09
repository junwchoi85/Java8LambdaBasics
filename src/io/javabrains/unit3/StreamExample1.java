/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.javabrains.unit3;

import io.javabrains.Person;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author junwh
 */
public class StreamExample1 {
    public static void main(String[] args) {
        
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );
        
        people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(p -> System.out.println(p.getFirstName()));
        
        Stream<Person> stream = people.stream();    //nothing happens.
        long count = people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .count();
        System.out.println(count);
    }
}








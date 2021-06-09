/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.javabrains.unit3;

import io.javabrains.Person;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author junwh
 */
public class CollectionIterationExample {
    
    
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );
        //1.external iterator. you are controlling the iteration
        System.out.println("Using for loop");
        for(int i=0; i<people.size(); i++) {
            System.out.println(people.get(i));
        }
        System.out.println("Using for in loop");
        for(Person p: people) {
            System.out.println(p);
        }
        
        //2. Internal iteration. Iteration is up to the runtime.
        System.out.println("Using lambda for each loop");
        people.forEach(p -> System.out.println(p));
        people.forEach(System.out::println);
    }
    
}

















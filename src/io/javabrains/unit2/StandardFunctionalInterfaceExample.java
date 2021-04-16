/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.javabrains.unit2;

import io.javabrains.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author Home
 */
public class StandardFunctionalInterfaceExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );
        
        //Step 1 : Sort a list by last name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
        
        //Step 2 : print all elements in the list.
        System.out.println("***Print All***");
        performConditionally(people, p -> true, p->System.out.println(p));
        
        //Step 3 : Create a method that prints all people that have a last name beginning with 'C'
        System.out.println("***Print Last name starting with C***");
        performConditionally(people, (Person p) -> p.getLastName().startsWith("C"), p->System.out.println(p));
        System.out.println("***Print Firstn name starting with C***");
        performConditionally(people,
                (Person p) -> p.getFirstName().startsWith("C"), 
                p->System.out.println(p.getFirstName())
        );
    }
    
    /*private static void printConditionally(List<Person> people, Condition c) {
        for(Person p : people) {
            if(c.test(p))
                System.out.println(p);
        }
    }*/
    
    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person p : people) {
            if(predicate.test(p))
                consumer.accept(p);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Home
 */
public class Unit1ExcerciseSolutionJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );
        
        //Step 1 : Sort a list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getLastName().compareTo(p2.getLastName());
            }            
        });
        
        //Step 2 : print all elements in the list.
        System.out.println("***Print All***");
        printAll(people);
        
        //Step 3 : Create a method that prints all people that have a last name beginning with 'C'
        System.out.println("***Print names starting with C***");
        printLastNameBeginningWithC(people);
        System.out.println("***Print Using Anonymous class 1***");
        printConditionally(people, new Condition() {            
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }            
        });
        System.out.println("***Print Using Anonymous class 2***");
        printConditionally(people, new Condition() {            
            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("C");
            }            
        });
    }

    private static void printAll(List<Person> people) {
        for(Person p : people) {
            System.out.println(p);
        }
    }

    private static void printLastNameBeginningWithC(List<Person> people) {
        for(Person p : people) {
            if(p.getLastName().startsWith("C"))
                System.out.println(p);
        }
    }
    
    private static void printConditionally(List<Person> people, Condition c) {
        for(Person p : people) {
            if(c.test(p))
                System.out.println(p);
        }
    }
}

interface Condition {
    public boolean test(Person p);
}
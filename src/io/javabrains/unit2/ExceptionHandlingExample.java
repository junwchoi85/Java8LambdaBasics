/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.javabrains.unit2;

import java.util.function.BiConsumer;

/**
 *
 * @author Home
 */
public class ExceptionHandlingExample {
    
    public static void main(String[] args) {
        int[] listOfNumbers = {1, 2, 3, 4};
        int key = 0;
        
        //But this is not neat... One way is to make a wrapper
        process(listOfNumbers, key, (v, k) -> {
            try {
                System.out.println(v/k);
            } catch(ArithmeticException e) {
                System.out.println("An Exception happened.");
            }
        });
        
        //This is just a one way to do it...
        process(listOfNumbers, key, wrapperLambda((v, k)->System.out.println(v/k)));
        
    }

    private static void process(int[] listOfNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for(int i=0; i<listOfNumbers.length; i++) {
            consumer.accept(i, key);
        }
    }
    
    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (v, k) -> {
            try {
                consumer.accept(v, k);
            } catch(ArithmeticException e) {
                System.out.println("An Exception happened in the wrapper");
            }
        };
    }
}

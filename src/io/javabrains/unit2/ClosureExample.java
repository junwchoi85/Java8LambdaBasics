/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.javabrains.unit2;

/**
 *
 * @author Home
 */
public class ClosureExample {
    
    public static void main(String[] args) {
        int a = 10;
        
        // This is effectively final. The compiler assumes that this will not change.
        // But if the programmer changes the value, it will give an compiler error.
        // You can write final int b = 20;
        int b = 20;
        
        doProcess(a, new Process() {
            @Override
            public void process(int i) {
                System.out.println(a+b);
            }
            
        });
        
        //This is the concept of closure. The variable b is passed to doProcess method along with the lambda.
        //
        doProcess(a, i -> System.out.println(i+b));
    }

    private static void doProcess(int a, Process process) {
        process.process(a);
    }
}

interface Process {
    void process(int i);
}
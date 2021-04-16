/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.javabrains;

/**
 *
 * @author Home
 */
public class RunnableExample {
    
    public static void main(String args[]) {
        Thread myThread = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("Printed inside runnable");
            }
        });
        myThread.run();
        Thread myLambdaThread = new Thread( () -> System.out.println("Printed inside lambda runnable") );
        myLambdaThread.run();
    }
}

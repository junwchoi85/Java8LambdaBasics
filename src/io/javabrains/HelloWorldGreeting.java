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
public class HelloWorldGreeting implements Greeting{

    @Override
    public void perform() {
        System.out.println("Hello");
    }
    
}

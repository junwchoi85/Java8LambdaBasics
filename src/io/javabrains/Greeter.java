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
public class Greeter {
    public void greet(Greeting greeting) {
        //System.out.println("Hello");
        greeting.perform();
    }
    
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
//        Greeting helloWorldGreeting = new HelloWorldGreeting();
        Greeting lambdaGreeting = () -> System.out.println("Hello");
//        MyAdd addFunction = (int a, int b) -> a + b;
        
//        helloWorldGreeting.perform();
//        lambdaGreeting.perform();
        
        Greeting innerClassGreeting = new Greeting() {
            public void perform() {
                System.out.println("Hello");
            }
        };
        
        greeter.greet(lambdaGreeting);
        greeter.greet(innerClassGreeting);
    }
    
    
}
//interface MyLambda {
//    void foo();
//}
//interface MyAdd {
//    int add(int x, int y);
//}
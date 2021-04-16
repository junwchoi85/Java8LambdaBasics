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
public class TypeInferenceExample {
    public static void main(String args[]) {
        StringLength lambdaExpr1 = (String s) -> s.length();
        StringLength lambdaExpr2 = (s) -> s.length();
        StringLength lambdaExpr3 = s -> s.length();
        
        System.out.println(lambdaExpr1.length("test"));
        System.out.println(lambdaExpr2.length("test2"));
        System.out.println(lambdaExpr3.length("test23"));
        
        printLambda(s -> s.length());
    }
    
    public static void printLambda(StringLength lambda) {
        System.out.println(lambda.length("HelloWorld"));
    }
    
    @FunctionalInterface
    interface StringLength {
        public int length(String s);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.javabrains.unit3;

/**
 *
 * @author junwh
 */
public class MethosReferenceExample1 {
    public static void main(String[] args) {
        //Thread t = new Thread(()->printMessage());//Lambda is executing a method
        Thread t = new Thread(MethosReferenceExample1::printMessage);
        t.start();
    }
    
    public static void printMessage() {
        System.out.println("Hello");
    }
}









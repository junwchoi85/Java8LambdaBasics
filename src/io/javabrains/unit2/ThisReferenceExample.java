/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.javabrains.unit2;

/**
 *
 * @author junwh
 */
public class ThisReferenceExample {
    private void doProcess(int a, Process p) {
        p.process(a);
    }
    
    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        //System.out.println(this); //Error: cannot use this in a static context.
        
        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("Value of i is : " + i);
                System.out.println(this); //instance of io.javabrains.unit2.ThisReferenceExample$1@15db9742 Anonymous inner object.
            }
            
            @Override
            public String toString() {
                return "This is an anonymous inner class";
            }
        });
        
        thisReferenceExample.doProcess(10, i -> {
            System.out.println("Value of i is : " + i);
            //System.out.println(this);   //Error. why?
        });
        
        thisReferenceExample.execute();
    }
    
    public void execute() {
        doProcess(10,i -> {
            System.out.println("Value of i is : " + i);
            System.out.println(this);
        });
    }
    
    public String toString() {
        return "This is a ThisReferenceExample class";
    }
}
























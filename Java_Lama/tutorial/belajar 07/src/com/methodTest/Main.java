/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.methodTest;

/**
 *
 * @author Feri Winarta
 */
public class Main {
    public static void main(String[] args) {
        method1();
        System.out.println(method2());
        
    }
//    Method Biasa
    public static void method1() {
        int a = 10;
        int b = 5;
        int c = a + b;
    }
    
    public static int method2() {
        int a = 10;
        int b = 5;
        int c = a + b;
        System.out.println("Hallol");
        return c;
    }
}
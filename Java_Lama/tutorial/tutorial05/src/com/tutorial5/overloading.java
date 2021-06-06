/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial5;

/**
 *
 * @author Feri Winarta
 */
public class overloading {
    public static void main (String[] args) {
        
        overloading(10);
        overloading(10.5f);
        float total;
        total = overloading(10, 5.4f);
        System.out.println(total);
        
        overloading(15.7f);
        
        
    }
    public static void overloading(int x) {
        System.out.println("ini adalah overloading dari nilai int" + x);
    }
    public static void overloading(float b) {
        System.out.println("Ini adalah overloading dari nilai float" + b);
    }
    
    public static float overloading(int a, float c) {
        System.out.println("menghitung overloading dari pertambahan "
                + "a + c ");
        return a + c;
    }
}

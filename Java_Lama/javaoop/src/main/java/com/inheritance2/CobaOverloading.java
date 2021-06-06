/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance2;

/**
 *
 * @author Feri Winarta
 */
public class CobaOverloading {
    
    CobaOverloading(String nama,int age) {
        System.out.println("Halo " + nama);
    }
    
    CobaOverloading() {
        System.out.println("This");
    }
    public static void main(String[] args) {
        
        
        
    }
    
    static void sayHi(String nama) {
        System.out.println("Halo " + nama );
    }
    
    static void sayHi(int umur) {
        System.out.println("Halo " + umur);
    }
}

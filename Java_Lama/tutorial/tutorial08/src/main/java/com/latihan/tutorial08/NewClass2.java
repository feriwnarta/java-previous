/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan.tutorial08;

/**
 *
 * @author Feri Winarta
 */
public class NewClass2 {
    public static void main(String[] args) {
        int x = 6;
        int y = 10;
        int z = 5;
        System.out.println("total " + oke(x,y));
        System.out.println("Habung " + gabung(x,y,z));
    }
    public static int oke(int x, int y) {
        int total = x * y;
        return total;
    }
    
    public static int gabung(int x, int y, int z) {
        int total = oke(x,y) + z;
        return total;
    }
    
}


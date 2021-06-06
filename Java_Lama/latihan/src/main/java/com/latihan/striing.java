/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan;

/**
 *
 * @author Feri Winarta
 */
import java.util.*;
public class striing {
    public static void main(String[] args) {
        String anjing1 = "bulldog";
        String anjing2 = "mini pom";
        String anjing3 = "Bulldog";
        
//        equals digunakan membandingkan String diluar String pool, dan
//                yang digunakan equals sensitive case

//        if(anjing1.equals(anjing3)) {
//            System.out.println("Hasil sama");
//        } else {
//            System.out.println("Hasil ga sama");
//        }
//        
//        if(anjing1.equals("Bulldog")) {
//            System.out.println("Kode benar");
//        } else {
//            System.out.println("kode salah");
//        }
        
        String anjing4 = "doggyStyle";
        String kata = anjing4.substring(0, 5);
        String anjing5 = anjing4.substring(0,5);
        System.out.println(kata);
        String input4 = "ini addres 4 ";
        String input5 = "ini addres 5 ";
        String input6 = "ini cek adres";
        addres(input4, anjing4);
        addres(input6, anjing5);
        addres(input6, kata);



//        addres(anjing1);
//        addres(anjing2);
//        addres(anjing3);
        
        
    }
    
    public static void addres(String inputt, String input) {
        int alamat = System.identityHashCode(input);
        System.out.println(inputt + alamat + Integer.toHexString(alamat));
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konstruktor;
import java.io.*;
import com.konstruktor.Konstruktor;
import java.util.Arrays;
/**
 *
 * @author Feri Winarta
 */

class Hewan {
    String nama;
    byte berat;
    String warna;
    int umur;
    
   void display() {
        System.out.println("Hallo display dari class Hewan");
    }
   
   static void sapa3() {
        System.out.println("Hallo ini static 3");
    }
}

public class NewClass {
//    contoh static void dan non static
    static void sapa() {
        System.out.println("Halo ini adalah static");
    } 
    
    void sapa2() {
        System.out.println("ini adalah non static");
    }
    
    
    
    public static void main(String[] args)throws IOException {
//    java oop dengan konstruktor
//    static
        sapa();
//    non static
        NewClass hewan1 = new NewClass();
        hewan1.sapa2();
        Hewan hewan2 = new Hewan();
        hewan2.display();
        
//        char[] nama = {'F','E','R','I'};
//        String cetak = Arrays.toString(nama);
//    Ketika mengakses method dari class lain dan menggunakan awalan
//    nama Kelas langsung tanpa membuat objek terlebih dahulu berarti itu adalah
//    static, jika membuat objek terlebih dahulu berarti itu Non-static
    }
    
    
}

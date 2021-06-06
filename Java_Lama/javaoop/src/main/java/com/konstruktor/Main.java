/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konstruktor;

/**
 *
 * @author Feri Winarta
 */

class Konstruktor {
    String namaDepan;
    String namaBelakang;
    
//    Konstruktor(String namaDepan, String namaBelakang) {
////        namaDepan = this.namaDepan = "Feri";
////        namaBelakang = this.namaBelakang = "Winarta";
////        System.out.println(namaDepan + namaBelakang);
//        this.namaDepan = namaDepan;
//        this.namaBelakang = namaBelakang;
//    }
    
     void cetakNama(String firstName, String lastName) {
         this.namaDepan = firstName;
         this.namaBelakang = lastName;
         System.out.println("Hallo " + firstName + lastName);
     }
    
}

public class Main {
    public static void main(String[] args) {
       Konstruktor objekNama = new Konstruktor();
//       new Konstruktor("Fero", "Winarta");
        
        
        
        
    }
}

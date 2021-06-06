/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan.javaoop;

/**
 *
 * @author Feri Winarta
 */
public class Konstruktor {
    String nama;
    String umur;
    String jenisKelamin;
    int nim;
    
    Konstruktor (String nama, String umur, String jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }
    
    void show() {
       
        System.out.println(this.nama);
        System.out.println(this.umur);
        System.out.println(this.jenisKelamin);
    }
    
    void cetakNim(int nim) {
        this.nim = nim;
        System.out.println(this.nim);
    }
    
    
    
    public static void main(String[] args) {
//       different with konstruktor dan not konstruktor
//          no konstruktor
//    
        Konstruktor objekKonstruktor = new Konstruktor("Feri Winarta", "18 Tahun", "Laki-laki");
        objekKonstruktor.show();
        Konstruktor objekKonstruktor2 = new Konstruktor("Laura", "16 tahun", "perempuan");
        objekKonstruktor2.show();
        objekKonstruktor2.cetakNim(2020100041);
        
//            objekKonstruktor.nama = "Feri Winarta";
//            objekKonstruktor.umur = "17 Thn";
//            objekKonstruktor.jenisKelamin = "Laki - Laki";
//            System.out.println(objekKonstruktor.nama);
//            objekKonstruktor.nama = "laura";
//            System.out.println(objekKonstruktor.nama);

            
            
           
    }
}

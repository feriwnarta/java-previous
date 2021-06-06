/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.awal;

/**
 *
 * @author Feri Winarta
 */
class Mahasiswa {
    String nama;
    int umur;
    
    
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
//        System.out.println(mahasiswa1.nama); - > null karena objek
//        System.out.println(mahasiswa1.umur); - > 0 karena bukan objek (primitive)
    }
}

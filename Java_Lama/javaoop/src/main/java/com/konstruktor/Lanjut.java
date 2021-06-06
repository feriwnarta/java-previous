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

class Mahasiswa {
    String nama;
    String jurusan;
    float ipk;
    
//    Mahasiswa() {
//        System.out.println("Ini adalah Konstruktor pertama kali dipanggil karena"
//                + "sesuai demgam definisi dari konstruktor tersebut");
//        int a = 5;
//        int b = 10;
//        int c = a + b;
//        System.out.println("hasil = " + c);
//    }
    
    Mahasiswa(String nama) {
        this.nama = nama;
    }
    
    void setNama(String nama) {
        this.nama = nama;
        System.out.println(this.nama);
    }
    
    String cetakNama() {
        return this.nama;
    }
//    void cek() {
//        System.out.println(nama);
//    }
//    
//    static void halo() {
//        System.out.println("Hallo");
//    }
    
}

//class Tipe {
//    
//    static void cek() {
//        System.out.println("Ini static");
//    } 
//    void cek2() {
//        System.out.println("Ini non static");
//    }
//}

public class Lanjut {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Feri");
        Mahasiswa mhs2 = new Mahasiswa("winarta");
        
//        String data = mhs1.cetakNama();
//        System.out.println(data);
//        passing value = ;
//        System.out.println(mhs1.nama);
//        mhs1.setNama("Ganteng");
//        System.out.println(mhs1.nama);
//        System.out.println(mhs1.nama);
//        mhs1.cek();
//       mhs2.halo(); - > static void
//        
//        mhs1.cek();
//        
//        Tipe satu = new Tipe();
//        satu.cek2();

//            System.out.println(halo());
        
//            System.out.println(helow());
    }
    
    static int halo() {
//        System.out.println("Halo Semua");
//        System.out.println("Halo tai anjing");
        int a = 5;
        int b = 10;
        int c = a * b;
        return c;
    }
    
    static void helow() {
        int a = 10;
    }
}

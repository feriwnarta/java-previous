/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accesModifier;

/**
 *
 * @author Feri Winarta
 */
import com.accesModifier.pile;
class Buku {
//    acces modifier untuk attribute;
//    default
    String namaBuku;
//    public
    public String penulis;
//    private
    private String penerbit;
    
    Buku(String namaBuku,String penulis,String penerbit) {
        this.namaBuku = namaBuku;
        this.penulis = penulis;
        this.penerbit = penerbit;
    }
    
//    default acces private
    void ubahPenerbit(String input) {
        System.out.println(this.penerbit);
//    menampilkan private attribute
        this.penerbit = input;
//    menampilkan private Atribut
        System.out.println(this.penerbit);
    }
    
    void display() {
        System.out.println(penerbit);
    }
    
//    acces modifier private akses untuk methods
    private void tampil() {
        System.out.println(this.namaBuku);
    }
    
    void changeTampil() {
        tampil();
    }
    
    void changeReference() {
        this.namaBuku = "awewe";
        System.out.println(this.namaBuku);
    }
    
}

public class Main {
    public static void main(String[] args) {
        Buku jungleBook = new Buku("Awewe","muhadzirs","gramedia");
//        acces modifier untuk atribut

//        membaca Attribut dari default modifier
        System.out.println(jungleBook.namaBuku);
//        merubah Attribut dari default Modifier
//        merubah reference
        jungleBook.namaBuku = "Kontoru";
        System.out.println(jungleBook.namaBuku);
        
//        membaca public attribut
        System.out.println(jungleBook.penulis);
        
//        merubah public attribut
        jungleBook.penulis = "Affendi";
        System.out.println(jungleBook.penulis);
        
//        acces private
//        jungleBook.penerbit = "Hellow";
//        Tidak bisa akses karena private itu hanya bisa diakses didalam kelas yang sama
        
//        Mengakses Atribut private dengan Method Public static atau protected
        jungleBook.ubahPenerbit("Tokepedia");
//        cek reference setelah dirubah
        jungleBook.display();
        
//        acces modifier private methods tidak bisa
//        jungleBook.tampil();

//        aces modifier private method dengan method public atau default
        
        jungleBook.changeTampil();
        jungleBook.changeReference();
        jungleBook.changeTampil();
        
//        objek selalu berhubungan dengan reference

    }
}

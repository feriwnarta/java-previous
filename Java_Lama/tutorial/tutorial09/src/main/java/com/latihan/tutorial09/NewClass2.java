/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan.tutorial09;

/**
 *
 * @author Feri Winarta
 */


public class NewClass2 {
    public static void main(String[] args) {

//        perulangan(5,5);

//        luasdankeliling(5,2);
//        System.out.println("contoh satu fungsi dengan luas " + luas(5,2));
//        System.out.println("contoh satu fungsi dengan keliling " + keliling(5,2));
//            cetak2nilai("feri", 10, 2);
//        gabung(10,2,"feri");
      
        
    }
   
    public static float hitung(int masukan) {
        
        int hasil;
        hasil = (masukan + 2) * masukan;
        return hasil;
      
    }
    
    public static double simpel() {
        return 5*2/5;
    }
    
    
    public static int luas(int pjg, int lbr) {
        int hasil;
        hasil = pjg * lbr;
        return hasil;
    }
    
    public static int keliling(int pjng, int lebar) {
        int hasil;
        hasil = (pjng * lebar) * 2;
        return hasil;  
        }
    public static void luasdankeliling(int x, int y) {
        System.out.println("hasil luas dengan fungsi diganbung " + luas(x, y));
        System.out.println("hasil keliling dengn fungsi digabung " + keliling(x,y));
        
    }
    
    public static void perulangan(int i, int x) {
        for(int o = 1; o <= i; o++) {
            for(int z = 1; z <= x; z++) {
                System.out.print("* ");
                
            }
            System.out.println("");
        }
    }
    
    public static int nilaiSatu (int x, int y) {
        int hasil;
        hasil = x * y;
        return hasil;
    }
    
    public static void cetak2nilai (String nama, int x, int y) {
        System.out.println("ini adalah nama " + nama);
        System.out.println("ini adalah hasil nilai satu " + nilaiSatu(x,y));
    }
    
    public static int nama(int x, int y) {
        System.out.println("total dari x * y adalah ");
        int total;
        total = x * y;
        

        return total;
        
    }
    
    public static void gabung(int x, int y, String nama) {
        System.out.println("Nama adalah " + nama);
        System.out.println(nama(x,y));
    }
    
//   fungsi void mencetak nilai tidak mengembalikan return 
//    fungsi biasa dapat mengembalika retrun jika didalammnya ada sout 2nilai akan tercetak
//    void tidak bisa direturn
    
    
    
}

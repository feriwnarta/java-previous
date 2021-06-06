/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas.string;

import java.util.Arrays;

public class StringApp {
    public static void main(String[] args) {
        // literal String, akan masuk ke String pool
        String nama  = "Feri Winarta";
        String nama2 = "Feri Winarta";
        String nama3 = nama.substring(0, 4) + nama2.substring(4, 12);

        cekAddres("nama1 : ",nama);
        cekAddres("nama2 : ",nama2);
        cekAddres("nama3 : ",nama3);
        
        String nama4 = "Feri";
        
        String nama5 = nama2.substring(0,4);
        cekAddres("nama4 : ",nama4);
        cekAddres("nama5 : ",nama5);
    
        // stars with dan end with
        System.out.println(nama.startsWith("Feri"));
        System.out.println(nama.endsWith("Winarta"));
        
        // split => memotong kata menjadi array string
        // split => memotong berdasarkan tanpa spasi
        String[] arrNama = nama.split("");
        System.out.println(Arrays.toString(arrNama));
        
        // is blank
        // spasi putih dianggap sudah kosong
        // is blank membaca apakah distring ada kata - kata atau tidak,
        // spasi putih tidak dianggap dan sudah kosong
        String kata = " ";
        System.out.println(kata.isBlank());
        
        // is empty akan mengecek keseluruhan kata - kata 
        // termasuk spasi, jika ada 1 spasi akan tidak kosong
        String kata2 = "";
        System.out.println(kata2.isEmpty());
        
        // toCharArray()
        // merubah string menjadi array char
        String kata3 = "Feri Winarta Keren";
        char[]arr3 = kata3.toCharArray();
        System.out.println(kata3.toString());
        System.out.println(Arrays.toString(arr3));
        
        String[] kata4 = {"F","e","r","i"}; 
        System.out.println(kata4.toString());
    }
    
    static void cekAddres(String nama, String addres) {
        String alamat = Integer.toHexString(addres.hashCode());
        System.out.println(nama + "" + alamat);
    }
    
    
}

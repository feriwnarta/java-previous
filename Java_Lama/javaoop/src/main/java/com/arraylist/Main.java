/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arraylist;

/**
 *
 * @author Feri Winarta
 */
import  java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        
        list1.add("Halo");
        list1.add("Semua");
        list1.add("Nama");
        list1.add("Saya");
        list1.add("feri");
        
//       menampilkan seluruh isi arrayList
        System.out.println(list1);

//        mengambil perkomponen dengan get ditambah(index)
        System.out.println(list1.get(0));
        
//        menampilkan jumlah array list
        System.out.println(list1.size());
    }
}

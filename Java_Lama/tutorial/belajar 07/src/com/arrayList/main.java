/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arrayList;

/**
 *
 * @author Feri Winarta
 */

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
//        array list menggunakan tipe data berbentuk non primitive (objek)
        ArrayList<String> cars = new ArrayList<>();
        ArrayList<Integer> umur = new ArrayList<>();
        ArrayList<Float>gaji = new ArrayList<>();
        ArrayList<Double>instentif = new ArrayList<>();
        
//        method arraylist
//        add()
        cars.add("Bmw");
        cars.add("Mustang");
        cars.add("avanza");
                
//        menampilkan
        System.out.println("Array list dari Cars " + cars);
//        akses element pakai get();
        System.out.println(cars.get(1));
//        merubah
        cars.set(2, "Civic");
        System.out.println(cars.get(2));
        System.out.println(cars);
        
//    hapus item
        cars.remove(0);
        System.out.println(cars);
//        hapus semua element
        cars.clear();
        System.out.println(cars);
        
        
    }
}

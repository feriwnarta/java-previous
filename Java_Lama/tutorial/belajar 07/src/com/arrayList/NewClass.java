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
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class NewClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nama anda = ");
        String nama = input.next();
        System.out.println("Masukan Mau Berapa jumlah isi Nama");
        int pilihan = input.nextInt();
        
        ArrayList<String> dataNama = new ArrayList<>();
        String inputNama;
        
        for(int i = 0; i < pilihan; i++) {
            System.out.println("Masukan nama ke " + (i+1) + "= ");
            inputNama = input.next();
            dataNama.add(inputNama);
        }
        
        dataNama.forEach(System.out::println);
        
        String[] data = {"Feri","Winarta"};
        for(String fata : data) {
            System.out.println(Arrays.toString(data));
        }
    }
}

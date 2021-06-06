/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan.tutorial09;
import java.util.Scanner;

/**
 *
 * @author Feri Winarta
 */
public class Fungsivoid {
    public static void main(String[] args) {
       
        int nama;
        Scanner input;
        input = new Scanner(System.in);
            System.out.println("Masukan sandi anda");
            nama = input.nextInt();
            
                fungsiVoid(nama);
               System.out.println(fungsiBaru(4));
               fungsiKedua("Hai");
      
    }
   
    public static void fungsiVoid(int input) {
       if (input == 123) {
           System.out.println("Halo selamat pagi nama anda adalah " + input);
       } else {
           System.out.println("Kata sandi salah");
       }
    }
    
    public static float fungsiBaru(int data){
       int total;
       total = 15 * data;
        return total;
    }
    
    public static void fungsiKedua(String apa) {
        System.out.println("apaan sih " + apa);
    }
    
    
//    
//    public static float iniPloat(int input) {
//      int hasil;
//      hasil = (input*5) + 10;
//      return hasil;
//}
   
   
   
}

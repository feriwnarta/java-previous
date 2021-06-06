/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan.tutorial10;

/**
 *
 * @author Feri Winarta
 */
import java.util.Scanner;
public class NewClass2 {
    public static void main(String[] args) {
        
//        Scanner inputUser;
//        float a,b,hasil;
//        char c;
//        inputUser = new Scanner(System.in);
// 
//            System.out.println("Masukan angka 1");
//            a = inputUser.nextFloat();
//            System.out.println("Masukan Operator");
//            c = inputUser.next().charAt(0);
//            System.out.println("mauskan angka 2");
//            b = inputUser.nextFloat();
//            
//            if(c == '+') {
//                hasil = a + b;
//                System.out.println("hasil " + hasil);
//            } else if(c == '-') {
//                hasil = a - b;
//                System.out.println("hasil " + hasil);
//            } else if(c == '-') {
//                hasil = a*b;
//                System.out.println("hasil " + hasil);
//                
//            } else if(c == '/') {
//                if (b == 0) {
//                    System.out.println("anda memasukan nilai infinity");
//                } else {
//                    hasil = a / b;
//                System.out.println("hasil " + hasil);
//                }
//                
//            } else {
//                System.out.println("anda salah");
//            }
//        boolean stop = true;
//        int a = 1;
//        while(stop) {
//            System.out.println("nilai " + a);
//            if(a == 10) {
//               stop = false; 
//            }
//            a++;
//        } 

//            do {
//                System.out.println("nilai " + a);
//                
//                if(a == 10) {
//                    stop = false;
//                } 
//                a++;
//            } while(stop);
//        

            int a = 1;
            int b = 10;
            int total = 1;
            int hasil;
            for(; a <= b; a++) {
                total = total + 1;
                hasil = a + total;
                 System.out.println(a + "+" + total + " = " + hasil);
            }
        
    }
}

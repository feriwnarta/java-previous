package com.latihan.tutorial08;
import  java.util.Scanner;
    public class tutor8_Unary {
        public static void main(String[] args) {
//            // unary
//            
//            int a = 7;
//            System.out.printf("Unary dari menggunakan '-' %d \n", -a);
//            System.out.printf("Unary menggunakan '+' %d\n", +a);
//            
//            // unary increment dan deecremet
//            
//            int x = 10;
//            x++;
//            ++x;
//            
//            // decrement
//            int y = 12;
//            y--;
//            --y;
//            
//           
//            System.out.println("Hasil dari incremenr " + x);
//            System.out.println("Hasil dari Decrement " + y);
//            
//            
//            //prefix dan postfix
//            int z = 15;
//            int u = 15;
//            
//            System.out.printf("Hasil dari prefix %d\n", ++z);
//            System.out.printf("Hasil dari postfix %d\n", u++);
//            System.out.println("jadinya " + u);
                 Scanner input = new Scanner(System.in);
                String a;
                System.out.println("masukan a");
                a = input.next();
                String b = "Y";
                if(a.equalsIgnoreCase("y")) {
                    System.out.println("Benar");
                } else {
                    System.out.println("slah");
                }
        }
    }
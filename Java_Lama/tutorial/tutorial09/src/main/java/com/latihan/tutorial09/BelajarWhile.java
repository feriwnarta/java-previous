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
public class BelajarWhile {
    public static void main(String[] args) {

//        while(kondisi) {
//            aksi;
//            
//        }
        int a = 1;
        int c = 5;
        while(true) {
            System.out.print("nilai while " + a);
            System.out.print("c");
            a++;
            System.out.println("");
            System.out.println("cc");
             
                for(int b = a; b <= 5; b++) {
                    System.out.print("b");
                }
                 a++;
                System.out.println("");
           
                if( a == 10) {
                break;
                }
                if(a == 6) {
                    continue;
                       
                }
         
           
        }
    
    } 
}

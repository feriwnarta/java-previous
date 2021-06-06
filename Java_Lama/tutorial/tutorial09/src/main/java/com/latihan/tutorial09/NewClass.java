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
public class NewClass {
    public static void main(String[] args) {
      int jum;   
      int jum1 = 0;
     for(int a = 1; a <= 5; a++) {
         for(int b = 1; b <= 5; b++) {
//             jum = a + b; 
//             jum1 = jum1 + jum

             if(a == b) {
                 break;
             }
             System.out.print(b);
         }
         System.out.println("");
     }
   
    }
}

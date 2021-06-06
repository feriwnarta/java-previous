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
public class NewClass3 {
    public static void main(String[] args ) {
        for(int a = 1; a <= 5; a++) {
           for(int b = 1; b <= a; b++) {
               System.out.print("*");
           }
            System.out.print("\n");
        }
        System.out.println("");
        for(int a = 5; a >= 1; a--) {
            for(int b = a; b >= 1; b--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        int x = 5;
       for (int i = 1; i <= 5; i++){
           for (int j = x - 1; j >= 1; j--){
               System.out.print(" ");
           }
           for(int d = i; d > 0; d--){
               System.out.print("*");
           }
           System.out.println();
           x -= 1;
       }
}
}

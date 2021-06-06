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
public class NewClass1 {
    public static void main(String[] args) {
    
        int c = 1;
        for(int a = 1; a <= 5; a++) {
           for(int b = c; b <= 5; b++) {
               System.out.print("*");
           }
            c += 1;
            System.out.println("");
          
       }
        System.out.println("");
        int g = 1;
        
        for(int z = 5; z >= 1; z--) {
            for(int y = 1; y <= g; y++) {
                System.out.print("*");
            }
            g += 1;
            System.out.println("");
            
            
            
        }
       
       
    }
    
}

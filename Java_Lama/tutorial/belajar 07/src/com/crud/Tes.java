/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud;

/**
 *
 * @author Feri Winarta
 */
public class Tes {
    public static void main(String[] args) {
        String[] array1 = {"a","b","c"};
        String a = "a";
        
        System.out.println(a.contains(array1[0]));
        
        int b = 1;
        int c = 5;
        while(b < c) {
            System.out.println("hallo");
            for(String data : array1) {
                System.out.println(data);
            }
            
            b++;
        }
        
       
    }
    
}

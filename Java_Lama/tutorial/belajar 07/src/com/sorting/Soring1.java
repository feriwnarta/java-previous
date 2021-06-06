/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sorting;

/**
 *
 * @author Feri Winarta
 */
import java.util.Arrays;

public class Soring1 {
    public static void main(String[] args) {
        
      int[] bilangan = {5, 12, 3, 19, 1, 47};
      System.out.println(Arrays.toString(bilangan));
      int temp;
      for(int i = 1; i < bilangan.length; i++) {
          for(int j = bilangan.length - 1; j >= 1; j--) {
              if(bilangan[j] < bilangan[j-1]) {
                  temp = bilangan[j];
                  bilangan[j] = bilangan[j-1];
                  bilangan[j-1] = temp;
              }
          }
      }
      
        System.out.println(Arrays.toString(bilangan));
    
    }
}

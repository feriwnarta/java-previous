/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pkg07;

/**
 *
 * @author Feri Winarta
 */
import java.util.Arrays;
public class LatihanArray1 {
    public static void main(String[] args) {
        
        int data1[] = {1,2,3,4,5};

        int data2[] = {1,2,3,4,5};
        reverse(data2);
        display(data1);
        display(data2);
        
        
        
        
        
        int tambah1[] = {1,2,3,4,5,6,7,10};
        int tambah2[] = {1,2,3,4,5,10};
        
        display(tambah1);
        display(tambah2);
        
        int total = tambah(tambah1,tambah2);
        System.out.println("data tambah " + total);
   

        
    }
    private static void display(int dataArray[]) {
        System.out.println("Array -> " + Arrays.toString(dataArray));
    }
    
    private static int tambah(int tambah1[], int tambah2[]) {
        
     int jumlahArray = 0;
     for(int i = 0; i < tambah1.length; i++) {
         jumlahArray += tambah1[i];
     }
     
     for(int a = 0; a < tambah2.length; a++) {
         jumlahArray += tambah2[a];
     }

    return jumlahArray;
    }
    
    private static int reverse(int data2[]) {
        int c = 5; 
        int total = 0;
        for(int i = 0; i < 5; i++) {
            for(int a = c; a >= c; a--) {
                
                total = data2[i] = a;
            }
            c -= 1;
        }
        return total;
        
    }
    
    
    





}

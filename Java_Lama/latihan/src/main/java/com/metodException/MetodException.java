/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metodException;

/**
 *
 * @author Feri Winarta
 */
import java.util.Scanner;
import java.io.IOException;
public class MetodException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dataArray = {1,2,3,4,5};
        int index = 0;
        
        System.out.println("Masukan pilihan index = ");
        index = input.nextInt();
//        Program dengan exception biasa
        System.out.println("Program dengan Exception biasa");
        try{
        System.out.printf("Array index ke %d, array yang keluar %d",index,dataArray[index]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        } 
        
//        Program dengan exception didalam Method
        System.out.println("\nProgram dengan exception didalam method");
        int methodArray = arraySelection(dataArray,index);
        System.out.printf("Array index ke %d, array yang keluar %d",index,methodArray);
        
//        Selanjutnya membuat exception method menggunakan throws method
        System.out.println("\nException method menggunakan Throws");
        int methodThrow = 0;
        try {
        methodThrow = fungsiThrows(dataArray,index);
        System.out.printf("\nArray index ke %d, array yang keluar %d",index,methodThrow);
        } catch(Exception e) {
            System.out.println("Index berlebihan silahkan pilih dibawa " + index);
        } 
        
        

//       Akhir Program 
        System.out.println("\nLanjut program \n");
        System.out.println("Akhir program");
    }
    
    public static int fungsiThrows(int[] array, int index)throws Exception{
        int total = 0;
        total = array[index];
        return total;
    }
    
    
    public static int arraySelection(int[] array, int index) {
        int total = 0;
        try{
            total = array[index];
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Input Array anda berlebihan, silah masukan dibawah " + index);
        }
        return total;
    }
    
    
    
}

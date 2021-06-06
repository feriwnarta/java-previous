/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exeption;

/**
 *
 * @author Feri Winarta
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class Main {
   
    public static void main(String[] args) throws IOException {
//      menggunakan exeption teridir dari try,catch,finally
//        FileInputStream inputFile = null;
        int[] dataArray = {1,2,3,4,5};
        System.out.println("Masukan pilihan index Array");
        Scanner inputUser = new Scanner(System.in);
        int input = inputUser.nextInt();
        FileInputStream inputFile = new FileInputStream("input.txt");
        
//     Exception Handling (Try, catch, finally)
        try {
            System.out.printf("Array index yang dipilih %2$d, hasilnya adalah %1$d\n",dataArray[input],input);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        }
        
//    Execption dengan File input

//        try {
//            inputFile = new FileInputStream("input.txt");
//        } catch (IOException e) {
//            System.err.println(e);
//        }
        
//    Menggabungkan 2 buah exception
//        try  {
//           System.out.printf("Array index yang dipilih %2$d, hasilnya adalah %1$d\n",dataArray[input],input);
//           inputFile = new FileInputStream("input.txt");
//        } catch(ArrayIndexOutOfBoundsException e) {
//            System.err.println("Array melebihi index");
//        } catch(IOException e) {
//            System.err.println("File tidak ditemukan");
//        } finally {
//            System.out.println("hajar terus boss");
//        }
//        

//    Finally berjalan ketika kedua keyword dijalankan, walaupun exception benar atau salah
        
        
        
        
        
        
        
        
        
        System.out.println("\nLanjut progrm");
        
        System.out.println("Akhir Program");
    }
    
    
    
    
}

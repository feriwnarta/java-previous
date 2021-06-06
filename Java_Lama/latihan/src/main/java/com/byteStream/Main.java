/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.byteStream;

/**
 *
 * @author Feri Winarta
 */

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
   
    public static void main(String[] args)throws IOException {
//        FileInputStream inputFile = new FileInputStream("input22.txt");
//        System.out.println(inputFile);
//        System.out.println((char)inputFile.read());
//////     close
//        inputFile.close();
//        System.out.println(inputFile);
      
////        Bikin lagi
//        inputFile = new FileInputStream("input2.txt");
//        System.out.println(inputFile);
//        System.out.println((char)inputFile.read());
//        inputFile.close();

        System.out.println("File input tanpa try menggunakan throws");
//      Membuat File
        FileInputStream inputFile = null;
        
        
//        Menggunakan input output stream tanpa try catch dan finally
        
//         Membuka File
            inputFile = new FileInputStream("input.txt");
     ////    Membaca File
             int bit = inputFile.read();
             while(bit != -1) {
     ////   Mencetak File ke Console
             System.out.print((char)bit);
             bit = inputFile.read();
             }
     ////        Menutup File
             inputFile.close();

             System.out.println("Ini adalah exception dengan try");
             
//          Menggunakan try catch dan finaly dengan syntax yang sama
             
             try {
//                 buka file
                 inputFile = new FileInputStream("input22.txt");
//                 baca file
                 int data = inputFile.read();
                 while(data != -1) {
                     System.out.print((char)data);
                     data = inputFile.read();
                 }
             } catch(IOException e) {
                 System.out.println("Salah nih boss");
             } finally {
                 if(inputFile != null) {
                     inputFile.close();
                 }
             } 
             
             
             System.out.println("Menggunakan Input dan output");
//          membuat File input baru
             FileInputStream in = null;
             FileOutputStream out = null;
             
//          Membuka File baru, berupa Input dan output
             try {
                 in = new FileInputStream("input22.txt");
                 out = new FileOutputStream("output22.txt");
//          Membaca File dan menulis/mengirim ke file output
//          Membaca file lalu diinstansi dan selanjutnya menggunakan Looping untuk Membaca semua dan ditulis
                int data2 = in.read();
                while(data2 != -1) {
                    out.write(data2);
                    data2 = in.read();
                }
                 
                 
             } catch(IOException e) {
                 System.out.println("File tidak ditemukan");
             } finally {
                 in.close();
                 out.close();
             }
             
             System.out.println("Menggunakan try with resources");
             try(
                     FileInputStream inn = new FileInputStream("input22.txt");
                     FileOutputStream outt = new FileOutputStream("output3.txt");
                ) {
                     int data3 = inn.read();
                     while(data3 != -1) {
                      outt.write(data3);
                      data3 = inn.read();
                     }  
             }
             
             
             
             
             
             
             
            
             
             
            
             
            
        
             
    }
    
    
}

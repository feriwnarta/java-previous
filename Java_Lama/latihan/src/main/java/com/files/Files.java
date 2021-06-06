/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.files;

/**
 *
 * @author Feri Winarta
 */
import java.io.*;
//import java.io.File;
//import java.io.FileWriter;
public class Files {
    public static void main(String[] args)throws IOException {
//        Membuat File Menggunakan Syntax tanpa tools
        try {
            File fileBaru = new File("buatinput2.txt");
//            fileBaru.createNewFile();
            if(fileBaru.createNewFile()) {
                System.out.println("File " + fileBaru.getName() + " berhasil dibuat");
            } else {
                System.out.println("File Gagal dibuat / atau sudah ada");
            }
        } catch(IOException e) {
            System.out.println("Maaf File error");
            e.printStackTrace();
        }
        
//        menulis ke dalam file
        try{
            FileWriter tulisFile = new FileWriter("buatinput.txt");
            tulisFile.write("Hallo Anjing java dan tolol dan juga goblok");
            tulisFile.close();
            System.out.println("File Berhasil ditulis");
        } catch(IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        
        System.out.println("\ncetak kekonsol");
//        membuka file
        FileInputStream inputFile = null;
        FileOutputStream outFile = null;
        try {
            inputFile = new FileInputStream("buatinput.txt");
//            
            int data = inputFile.read();
            while(data != -1) {
//                mencetak kekonsol
                System.out.print((char)data);
                data = inputFile.read();
            }
            inputFile.close();
        } catch(IOException e) {
            System.out.println(e);
        } 
        
        
//        Cetak kefile ouput
        try{
            inputFile = new FileInputStream("buatinput.txt");
            outFile = new FileOutputStream("buatoutput.txt");
            
//            baca 
            int data = inputFile.read();
            while(data != -1) {
                outFile.write(data);
                data = inputFile.read();
            }
            System.out.println("\nFile berhasil dicetak kefile lain");
            inputFile.close();
            outFile.close();
        } catch(IOException e) {
            System.out.println(e);
        }



    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ScannerTokenizer;

/**
 *
 * @author Feri Winarta
 */
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args)throws IOException {
        FileReader readFile = new FileReader("filebaru.txt");
        BufferedReader readBuffer = new BufferedReader(readFile);        
//        menngunakan scanner dan mengambil 1 kata
        Scanner input = new Scanner(readBuffer);
//        System.out.println(input.hasNext());
//        System.out.println(input.next());
//        System.out.println(input.next());
//        System.out.println(input.next());
//        System.out.println(input.next());
//        System.out.println(input.hasNext());
        
        while(input.hasNext()) {
            System.out.println(input.next());
        }
        
        String data = readBuffer.readLine();
        StringTokenizer token = new StringTokenizer(data,",");
       
        
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        String read = readBuffer.readLine();
////        while(read != null) {
////            System.out.println(read);
////            read = readBuffer.readLine();
////        }
//        
//        
//        FileWriter writeFile = new FileWriter("outp.txt");
//        BufferedWriter writeBuffer = new BufferedWriter(writeFile);
//        String read2 = readBuffer.readLine();
//        
//        writeBuffer.write(read,0,read.length());
//        writeBuffer.flush();
        
        
        
    }
}

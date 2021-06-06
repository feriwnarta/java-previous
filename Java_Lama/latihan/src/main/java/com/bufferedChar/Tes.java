/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bufferedChar;

/**
 *
 * @author Feri Winarta
 */
import java.io.*;
public class Tes {
    public static void main(String[] args) throws IOException {
        File newFile = new File("filebaru.txt");
        if(newFile.createNewFile()) {
            System.out.println("File Berhasil dibuat");
        } else {
            System.out.println("File sudah dibuat");
        }
        
        FileWriter fileWrite = new FileWriter("filebaru.txt");
        fileWrite.write("Buat full bufferedChar");
        fileWrite.close();
        
//        Buffered Char
        FileReader readFile = new FileReader("filebaru.txt");
        BufferedReader bufferReader = new BufferedReader(readFile);
        
        System.out.println(bufferReader.readLine());
        
    }
}

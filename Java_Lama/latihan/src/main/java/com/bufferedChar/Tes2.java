/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bufferedChar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Feri Winarta
 */
public class Tes2 {
    public static void main(String[] args)throws IOException {
        FileReader fileInput = new FileReader("input.txt");
        FileWriter fileOutput = new FileWriter("output.txt");
        
        fileInput = new FileReader("input.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileOutput);
        BufferedReader buffRead = new BufferedReader(fileInput);
         
        String nama = buffRead.readLine();
        while(nama != null) {
            bufferedWriter.write(nama);
            bufferedWriter.newLine();
            nama = buffRead.readLine();
        }
        
        bufferedWriter.flush();
        
        
         
    }
}

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
import java.io.*;
public class Tes {
    public static void main(String[] args) {
        
        try{
            File newFile = new File("input33.txt");
            newFile.createNewFile();
        } catch (Exception e) {
            System.out.println(e);
        }
        printOut();
            
        
    }
     
    
    public static void printOut() {
       FileWriter fileTulis = null;
        try{
            fileTulis = new FileWriter("input33.txt");
            fileTulis.write("Halo semua\n");
            fileTulis.write("Nama saya Feri Winarta\n");
            fileTulis.write("Saya seorang presiden");
            System.out.println("File berhasil ditulis");
           
        } catch(IOException e ) {
            System.out.println(e);
        }
    
    }
    
   
}

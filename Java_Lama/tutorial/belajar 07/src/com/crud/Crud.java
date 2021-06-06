/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud;

/**
 *
 * @author Feri Winarta
 */
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Crud {
    public static void main(String[] args)throws IOException {
        Scanner inputUser = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;
        while(isLanjutkan) {
            clearScreen();
            System.out.println("\t\tDatabase Perpustakaan\n");
            System.out.println("1.\tLihat Seluruh buku");
            System.out.println("2.\tCari seluruh buku");
            System.out.println("3.\tTambah data");
            System.out.println("4.\tUbah data");
            System.out.println("5.\tHapus data\n");
            System.out.println("Pilihan anda = ");
            pilihanUser = inputUser.next();

            switch(pilihanUser) {
                case "1" : 
                    System.out.println("");
                    System.out.println("===================");
                    System.out.println("Daftar seluruh buku");
                    System.out.println("===================");
                    tampilkanData();
                    break;
                case "2" :
                    System.out.println("==========");
                    System.out.println("Cari Buku");
                    System.out.println("==========");
                    cariData();
                    break;
                case "3" : 
                    System.out.println("================");
                    System.out.println("Tambah data Buku");
                    System.out.println("================");
                    break;
                case "4" :
                    System.out.println("==============");
                    System.out.println("Ubah Data Buku");
                    System.out.println("==============");
                    break;
                case "5" : 
                    System.out.println("===============");
                    System.out.println("Hapus Data Buku");
                    System.out.println("===============");
                    break;
                default : 
                    System.out.println("=============================");
                    System.out.println("input yang anda masukan salah");
                    System.out.println("=============================");
                    break;
            }
            isLanjutkan = getYesOrNo("Apakah anda ingin melanjutkan (Y / N)");
        }
    }
    
    private static void cariData()throws IOException{
        File file = new File("database.txt");
        
//        Mengambil input keyword pencarian
        System.out.println("Masukan Kata kunci pencarian Buku = ");
        Scanner input = new Scanner(System.in);
        String cariString = input.nextLine();
        String[] keywords = cariString.split("\\s+");
      
//        cek keyword
        cekBukuDatabase(keywords);
        
    }
    
    private static void cekBukuDatabase(String[] keywords)throws IOException {
       try {
        File file = new File("database.txt");
       } catch(IOException er) {
           System.err.println("File Tidak ditemukan");
           return;
       }
       FileReader readFile = new FileReader("database.txt");
        BufferedReader bufferRead = new BufferedReader(readFile);    
//     

    }
    
    private static boolean getYesOrNo(String message) {
         Scanner inputUser = new Scanner(System.in);
         System.out.println(message);
         String pilihanUser = inputUser.next();
         while(!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
             System.err.println("Inputan anda salah, silahkan masukan y atau n");
             pilihanUser = inputUser.next();
         }
         return pilihanUser.equalsIgnoreCase("Y");
    }
//    method clearScreen
    private static void clearScreen() {
        try {
            if(System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch(Exception ex) {
            System.err.println("Tidak Bisa clearScreen");
        }
    }
    
}

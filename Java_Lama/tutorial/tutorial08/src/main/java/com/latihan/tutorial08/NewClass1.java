/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan.tutorial08;

/**
 *
 * @author Feri Winarta
 */
import java.util.Scanner;

public class NewClass1 {
    public static void main(String[] args) {

//       deklarasi variabel

        Scanner input = new Scanner(System.in);
        String nama;
        int pilihan;
        String ulang = "y";
        int berat;
        String voucher;
        String asuransi;
        int porsi;
        String ulangAwal = "y";
        String pilihanUlang;
        
        System.out.println("=================");
        System.out.println("Aplikasi OKE -JEK");
        System.out.println("Hanya Melalui Tangerang");
        System.out.println("Masukan nama Anda :");
        nama = input.next();
        
        while(ulangAwal.equalsIgnoreCase("y")) {
            
        
            while(ulang.equalsIgnoreCase("y")) {
                System.out.println("masukan pilihan (1 / 2");
                pilihan = input.nextInt();
                     if(pilihan == 1) {

                        System.out.println("Layanan OKE - GO");
                        System.out.println("Masukan berat kiriman : (0 - 50 KG) ");
                        berat = input.nextInt();
                        System.out.println("Masukan voucher : (y / t) ");
                        voucher = input.next();
                        System.out.println("Masukan Asuransi : (y / t)");
                        asuransi = input.next(); 
                        
                        output(nama,berat,voucher,asuransi);
                         System.out.println("Apakah anda inging mengulang lagi ? (Y/N)");
                         pilihanUlang = input.next();
                            if(pilihanUlang.equalsIgnoreCase("y")) {
                                ulangAwal = "y";
                            } else {
                                ulangAwal = "n";
                                return;
                            }
                            
                       


                        
            }
                     

    }
        }
    
    
    
    
    
    
    }
//fungsi
    
    //    fungsi berat
    
    public static int beratKiriman(int berat) {
        int total = berat;
        return total;
    }
    
    //    fungsi total Ongkos
    public static int totalOngkos(int berat, String asuransi) {
        int total = 0;
        total = berat * 10000;
            if(asuransi.equalsIgnoreCase("y")) {
                total += 15000;
            } else {
                total = total;
            }
            return total;
    }
 
    
//    ongkos perlu dibayar
    public static int ongkosDiBayar(int berat, String voucher, String asuransi) {
                        int total = 0;
        //                 menghitung berat
                       total = berat * 10000;
                            
//                 menghitung total voucer
                        if(voucher.equalsIgnoreCase("y")) {
                            total -= 7000;
                        } else {
                            total = total;
                        }
//                 menghitung asuransi 
                        if(asuransi.equalsIgnoreCase("y")) {
                            total += 15000;
                        } else {
                            total = total;
                        }
                        return total;
    }
    
//    diskon 
    public static int diskon(int berat, String voucher, String asuransi) {
        int total = 0;
        total = (ongkosDiBayar(berat,voucher,asuransi) / totalOngkos(berat,asuransi)) * 100;
        return total;
        
    }
    
//    potongan
    public static int potongan(String voucher) {
        int total = 0;
        if(voucher.equalsIgnoreCase("y")) {
            total = 7000;
        } else {
            total = total;
        }
        return total;
    }
    
//    mencetak output
    public static void output(String nama, int berat, String voucher, String asuransi) {
        System.out.println("=============Informasi Layanan");
        System.out.println("Terima kasih "  + nama.toUpperCase() + " Telah Menggunakan Layanan Kami");
        System.out.println("berat kiriman anda " + beratKiriman(berat) + " Kg");
        System.out.println("Total ongkos anda " + totalOngkos(berat, asuransi));
        System.out.println("ongkos yang perlu dibayar " + ongkosDiBayar(berat,voucher,asuransi));
        System.out.println("anda mendapat potongan " + potongan(voucher));
    }

    

    
    










}

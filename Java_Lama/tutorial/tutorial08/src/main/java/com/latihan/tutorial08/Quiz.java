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
public class Quiz {
    public static void main (String[] args) {
       Scanner input = new Scanner(System.in);
       String nama;
       int pilihan;
       String ulang = "y";
       int berat;
       String voucher;
       String asuransi;
       int porsi;
       
       
        System.out.println("=================");
        System.out.println("Aplikasi OKE -JEK");
        System.out.println("Hanya Melalui Tangerang");
        System.out.println("Masukan nama Anda :");
        nama = input.next();
         
       do {
           System.out.println("masukan pilihan (1 / 2");
           pilihan = input.nextInt();
            if(pilihan == 1) {
                int total = 0;a
                System.out.println("Layanan OKE - GO");
                System.out.println("Masukan berat kiriman : (0 - 50 KG) ");
                berat = input.nextInt();
                System.out.println("Masukan voucher : (y / t) ");
                voucher = input.next();
                System.out.println("Masukan Asuransi : (y / t)");
                asuransi = input.next();
                    total = berat * 10000;
                        
                        if (voucher.equalsIgnoreCase("y")) {
                            total = total -= 7000;
                        } else {
                            total = total;
                        } 
                        if(asuransi.equalsIgnoreCase("y")) {
                            total = total += 15000;
                        } else {
                            total = total;
                        }

//               keluar looping
                    if(pilihan == 1) {
                        break;
                    }
                       
           } else if(pilihan == 2) {
               int total = 0;
               System.out.println("Masukan berat satuan makanan : (0 - 20 Kg) ");
               berat = input.nextInt();
               System.out.println("Masukan porsi : ");
               porsi = input.nextInt();
               System.out.println("Dapat voucher (y/t");
               voucher = input.next();
                 

               //                keluar  looping
                if(pilihan == 2) {
                    break;
                }
//              mengulang jika pilihan bukan 1 dan 2  
           } else {
               System.out.println("kode salah dan akan terulang sendiri");
               ulang = "y"; 
           }
           
       } while(ulang.equalsIgnoreCase("y"));
       


          
    }

////membuat fungsi output
//    public static void output(String nama, int berat, String asuransi, String voucher) { 
//            
//        System.out.println("===========INFORMASI LAYANAN============");
//        System.out.println("Terima kasih " + nama.toUpperCase() + " Telah menggunakan layanakan kami");
//        System.out.println("Berat kiriman anda " + berat + " Kg");
//        System.out.println("Total ongkos Anda " + totalOngkos(berat, asuransi));
//        System.out.println("Ongkos yang perlu dibayar " + ongkosPerluDibayar(berat, voucher, asuransi));
//        System.out.println("anda mendapatkan diskon " + diskon(berat, voucher, asuransi + " %") );
 
    }
    













}
           

     
   
    
    
    
    
    
    
    

        

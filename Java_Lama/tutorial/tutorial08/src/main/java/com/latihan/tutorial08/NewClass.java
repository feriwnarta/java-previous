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

public class NewClass {
    public static void main(String[] args) {
      int berat;
      String asuransi;
      String voucher;
      String nama;
      String ulang = "y";
      int porsi;
      Scanner input = new Scanner(System.in);
      int pilihan;
      
        System.out.println("=================");
        System.out.println("Aplikasi OKE -JEK");
        System.out.println("Hanya Melalui Tangerang");
        System.out.println("Masukan nama Anda :");
        nama = input.next();

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
                        
                    } else if(pilihan == 2) {
                        
                        int total = 0;
                        System.out.println("Masukan berat satuan makanan : (0 - 20 Kg) ");
                        berat = input.nextInt();
                        System.out.println("Masukan porsi : ");
                        porsi = input.nextInt();
                        System.out.println("Dapat voucher (y/t");
                        voucher = input.next();

        }
        
     }
    }
}
               
                    
                    


                       
               
                 

           
       
        
        
        
        
        


    
    
   


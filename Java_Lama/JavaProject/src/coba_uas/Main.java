/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba_uas;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    Scanner input = new Scanner(System.in);
    private int jmlh;
    private ArrayList<String> nama = new ArrayList<>();
    private ArrayList<String>layanan =  new ArrayList<>();
    private ArrayList<Character>Diskon  = new ArrayList<>();
    private ArrayList<Integer>jarak  = new ArrayList<>();
    String display;
    
    String display() {
        String dataNama;
        System.out.println("===Ujian Akhir Semster===\n"
                + "Algoritma Pemrograman\n"
                + "Aplikasi Pendapatan Sipjek\n"
                + "Masukan nama Anda : ");
       return dataNama = this.input.nextLine();
    }
    
    void menu(String dataNama) {
        boolean repeat = false;
        while(!repeat) { 
            System.out.println("\nSelamat datang , " + dataNama +  "\n"
                    + "Program Pendataan pendapatan SIPJEK\n"
                    + "Menu Utama : \n"
                    + "1. Input data\n"
                    + "2. Tampil data\n"
                    + "3. Sort Data\n"
                    + "4. Cetak\n"
                    + "5. Exit\n"
                    + "Masuka pilihan Menu [1-5] : \n");
            int menuInput = this.input.nextInt();
            while(menuInput > 5) {
                System.out.println("Kode yang anda masukan lebih dari 5\nsilahkan masukan kembali : ");
                menuInput = this.input.nextInt();
                    if(menuInput < 6) {
                        break;
                    }
            }
            switches(menuInput);
            System.out.println("Apakah anda ingin memilih lagi ? [y/n]");
            String pick = this.input.next();
            if(pick.equalsIgnoreCase("y")) {
                repeat = false;
            } else {
                return;
            }
        }
    }
    
    private void switches(int input) {
               switch(input) {
                case 1 : 
                    inputData();
                    break;
                case 2 :
                    System.out.println("case 2");
                    tampilData();
                    break;
                case 3 :
                    System.out.println("case 3");
                    break;
                case 4 :
                    System.out.println("case 4");
                    break;
                default :
                    break;
            }
    }
    
    private void setLayanan(int data) {
        if(data == 1) {
            this.layanan.add("SipRide");
        } else {
            this.layanan.add("SipFood");
        }
    }
    
    void inputData() {
//        data arrayList
        String data;
        int dataList;
        char dataChar;
//        pengisian arrayList
        System.out.println("Masukan jumlah Penumpang : ");
        this.jmlh = this.input.nextInt();
        
        for(int i = 0 ; i < this.jmlh; i++) {
            System.out.println("Nama penumpang ke " + (i + 1) + " : ");
            data = this.input.next();
            this.nama.add(data);
            System.out.println("pilih layanan [1/2] : ");
            dataList = this.input.nextInt();
            while(dataList > 2) {
                System.out.println("Input data lebih silahkan masukan 1 atau 2");
                dataList = this.input.nextInt();
                    if(dataList < 3) {
                        break;
                    }
            }
            setLayanan(dataList);
            System.out.println("Diskon [Y/N] : ");
            dataChar = this.input.next().charAt(0);
            while(dataChar != 'y'&& dataChar != 'n') {
                System.out.println("Input data lebih silahkan masukan y atau n");
                dataChar = this.input.next().charAt(0);
                    if(dataChar == 'y' || dataChar == 'n') {
                       break;
                    }
            }
            this.Diskon.add(dataChar);
            System.out.println("Masukan Jarak Tempuh : ");
            dataList = this.input.nextInt();
            while(dataList == 0) {
                System.out.println("masa jaraknya 0 ???");
                System.out.println("Masukan Jarak Tempuh : ");
                dataList = this.input.nextInt();
                if(dataList > 0) {
                    break;
                }
            }
            this.jarak.add(dataList);
            System.out.println("");
        }
    }
    
    void tampilData() {
        float[] data = biaya();
        float total = 0;
        for(float data2 : data) {
            total += data2 * 1000;
        }
        System.out.println("\t\t\t\t\tDaftar tranksaksi Layanan\n"
                + "\t\t\t\t\tSIPRIDE dan SIPFOOD");
        System.out.println("===========================================================================================================================");
        System.out.println("NO\t\tNAMA\t\t\tLAYANAN\t\t\tDISKON\t\t\tJARAK\t\t\tBIAYA\t\t\t");
        for(int i = 0; i < this.jmlh; i++) {
            System.out.printf((i+1)+"\t\t"+"%s\t\t\t%s\t\t\t%3c\t\t\t%3d\t\t\t%,.3f\n",this.nama.get(i),this.layanan.get(i),
                    this.Diskon.get(i),this.jarak.get(i),data[i]);
        }
         System.out.println("===========================================================================================================================");
         System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\tTotal  : %,.3f\n",total);
        
    }
    
    private float[] biaya() {
        float[] harga = new float[this.jmlh];
            for(int i = 0; i < this.jmlh; i++) {
                if(this.layanan.get(i).equalsIgnoreCase("SipFood")) {
                    harga[i] = this.jarak.get(i) * 15f;
                } else {
                    harga[i] = this.jarak.get(i) * 10f;
                }
            }
        return harga;
    }
    
    
    
    public static void main(String[] args) {
        Main obj = new Main();
        obj.display  = obj.display();
        obj.menu(obj.display);
        
        
    }
}

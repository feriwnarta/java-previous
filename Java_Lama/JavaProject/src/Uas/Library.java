/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uas;

/**
 *
 * @author Feri Winarta
 */
import java.util.Arrays;
import java.util.Scanner;
public class Library {
    private static String name;
    private final Scanner input;
    private String[] listBuku;
    
    public Library(String name) {
        Library.name = name;
        input = new Scanner(System.in);
        listBuku = new String[10];
    }
    
    private void databaseBuku() {
        String[]buku = {"java","c++","sherlock Holmes","belajar colay"
                            ,"smartTrader","investor blueprint","bolang","python"
                            ,"otak pintar","rahasisa sukses"
                          };   
        this.listBuku = Arrays.copyOf(buku, buku.length);
    }
    
    public void menu() {
        System.out.println("\nHalo " + Library.name
        + "\nSelamat datang diperpustakaan jogrok\n"
                + "Dafta Menu\n"
                + "1. List Buku\n"
                + "2. jumlah buku\n"
                + "3. Nama penerbit\n"
                + "Masukan Pilihan = ");
        databaseBuku();
        int pilihan = input.nextInt();
        optionMenu(pilihan);
    }
    
    public void optionMenu(int pilihan) {
        switch(pilihan) {
            case 1 :
                displayListBuku();
                break;
            case 2 :
                jumlahBuku();
                break;
            case 3 :
                namaPenerbit();
                break;
            default :
                break;
        }
    }
      
    private void displayListBuku() {
        System.out.println("\n====================");
        for(String data : this.listBuku) {
            System.out.println(data);
            
        }
    }
    
    private void jumlahBuku() {
        System.out.println(this.listBuku.length);
    }
    
    private void namaPenerbit() {
        System.out.println("SAMA SEMUA LAH MALES NGISINYA");
    }
    
    
}

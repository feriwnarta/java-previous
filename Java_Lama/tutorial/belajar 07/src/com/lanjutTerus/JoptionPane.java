/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lanjutTerus;

/**
 *
 * @author Feri Winarta
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class JoptionPane {
    public static void main(String[] args) {
//       BOX GUI UNTUK MENAMPILKAN INPUT
//        String nama;
//        nama = JOptionPane.showInputDialog(null, "Silahkan masukan nama","input Nama",
//                JOptionPane.QUESTION_MESSAGE);
//        
        

//       BOX GUI untuk menampilkan dialog output
//        String pesan = "hallo Pesan";
//        for(int i = 0; i < 11; i++) {
//        JOptionPane.showMessageDialog(null,pesan,"Message",JOptionPane.INFORMATION_MESSAGE);
////        mengeluarkan joption -> System.exit(0);
//        }
        String nama = "1";
        switch(nama) {
            case "1" : 
                for(int i = 1; i <= 5; i++) {
                    System.out.println("Hallo");
                }
                JOptionPane.showMessageDialog(null,"hallo","Message",JOptionPane.INFORMATION_MESSAGE);
                break;
            default : 
                break;
        }
    }
}

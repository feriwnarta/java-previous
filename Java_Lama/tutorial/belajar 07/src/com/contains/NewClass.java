/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contains;

/**
 *
 * @author Feri Winarta
 */
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = "Feri";
        System.out.println("Masukan kata kunci = ");
        String keywords = input.nextLine();
        String[] keyword = keywords.split("\\s+");

        boolean isExist = false;
        
        for(String data:keyword) {
            isExist = data.contains(nama);
        }
        System.out.println(isExist);
    
    
    }
}

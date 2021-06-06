/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setring;

/**
 *
 * @author Feri Winarta
 */


public class Setring {
    public static void main(String[] args) {
        String kalimat = "saya suka pisang";
        addres(kalimat);
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat);
        
        kalimat = kalimat.replace("pisang", "combro");
        System.out.println(kalimat);
        addres(kalimat);
//        System.out.println(kalimat.toUpperCase());
//        System.out.println(kalimat);
//        addres(kalimat);
//        
//        String sub = kalimat.substring(10,16);
//        System.out.println(sub);
        
        
//        addres(sub);
        
//        String banding = "saya suka combro";
//        addres(banding);
        
        
        System.out.println("");
        
    }
    
    private static void addres(String addres) {
        int alamat = System.identityHashCode(addres);
        System.out.println("Alamatnya " + Integer.toHexString(alamat));
    }
}

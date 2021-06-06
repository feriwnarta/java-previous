/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polimorphism;

/**
 *
 * @author Feri Winarta
 */
class Handphone {
    int baterai = 50;
    String merek;
    int volume = 50;
    
    void infoBaterai() {
        System.out.println(this.baterai);
    }
    
    void tampilVolume() {
        System.out.println(this.baterai);
    }    
}

class Xiaomi extends Handphone {
    void infoBaterai(){
         System.out.println("Baterai xiaomi = " + this.baterai);
    }
    
    void sayWelcom() {
        System.out.println("Halo pengguna xiaomi");
    }
}

class Samsung extends Handphone {
    void infoBaterai() {
        this.baterai = 70;
        System.out.println("Baterai Samsung = " + this.baterai);
    }
}


public class Lanjut {          
    public static void main(String[] args) {
//        tanpa konstruktor
//        Handphone obj = new Handphone();
//        Xiaomi obj2 = new Xiaomi();
    
//    dengan konstruktor
    Handphone obj1 = new Xiaomi();
    obj1.infoBaterai();
    
    obj1 = new Samsung();
    obj1.infoBaterai();
    
//    Handphone obj2 = new Samsung();
//    obj2.infoBaterai();
    
    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.staticNonStatic;

/**
 *
 * @author Feri Winarta
 */
class Player {
//    static String lastName = "winarta";
//    static int a;
//    
//    public static void setName(String name) {
//        Player.name = name;
//    }
    private static String name;
    private static String last;
   
    
    public Player(String name, String las,int b) {
        this.name = name;
        this.last = las;
    }
    
   

    
    public static String getFullName() {
        return "nama Feri Winarta";
    }
    
    public static String getName() {
        return Player.name + Player.last;
    }
    
    public static void setName(String name) {
       Player.name = name;
    }
    
    public void displayNon() {
        System.out.println(this.name);
    }
    
    public static void display() {
        System.out.println(Player.name);
    }
    
    
}

public class NewClass {
//    static int b = 10;
    public static void main(String[] args) {
//        Player.setName("Feri Winarta");
//        System.out.println(Player.a);   
//        System.out.println(Player.lastName);
//        Player.lastName = "Feri";
//        System.out.println(Player.lastName);
 
//        int a = 1;
//       
//        NewClass obj1 = new NewClass();
////        obj1.method2();
//    }
    
    
//    void method2() {
//        System.out.println("Halow 2");
//    }

        Player obj2 = new Player("tai","kotok");
//        System.out.println(Player.getFullName());
//        System.out.println(Player.getName());

//      static diakses dengan object
        obj2.setName("aloha");
        obj2.displayNon();
//      non static kelas lain langsung pakai
        Player.setName("aloha loha");
        Player.display();
    }
}

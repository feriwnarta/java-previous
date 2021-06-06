/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konstruktorOverloading;

/**
 *
 * @author Feri Winarta
 */
class Player {
    private String name;
    private int age;
    
    Player() {
    }
    
    Player(String name) {
        this.name = name;
        System.out.println("ISI konstruktor dari nama " + this.name);
    }
    
    Player(String name, int age) {
        this.name = name;
        this.age = age;
        
        System.out.println("Konstruktor dari name dan age " + this.name + this.age);
    }
    
    
}

class Weapon extends Player {
    String data;
    
    Weapon(String name,int age) {
        super(name,age);
    }
    
    
    Weapon(String data) {
        this.data = data;
    }
   
    
    
}

public class Main {
    public static void main(String[] args) {
        Player obj1 = new Player("Feri Winrata",19);
        Weapon obj2 = new Weapon("INI DATA KELAS WEAPON");
        
//        System.out.println(obj2.data);
        
    }
    
//    public static void display(int data) {
//        System.out.println(data);
//    }
//    
//    public static void display(String data) {
//        System.out.println(data);
//    }
}

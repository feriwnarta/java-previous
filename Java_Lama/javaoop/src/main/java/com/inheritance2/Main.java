/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance2;

/**
 *
 * @author Feri Winarta
 */
class Parent {
    String name;
    
    Parent(String name) {
        this.name = name;
    }
//    void setName(String name) {
//        this.name = name;
//    }
//    
//    String getName() {
//        return this.name;
//    }
//    
//    void display() {
//        System.out.println("Name "  + this.name);
//    }
}

class Children extends Parent {
//    String name = "gondrong";
       Children(String name) {
           super(name);
       }
//    @Override
//    void display() {
//        System.out.println("Name mengoveride kelas parent dan ganti nama" + this.name);
//    }
//    
//    void displayParent() {
//        System.out.println("Name dari kelas parent " + super.getName());
//    }
}

public class Main {
    public static void main(String[] args) {
//        Children obj = new Children();
//        obj.setName("Feri Winarta");
//        System.out.println(obj.getName());
//        obj.display();
//        obj.displayParent();
    }
}

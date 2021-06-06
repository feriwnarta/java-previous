/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance;

/**
 *
 * @author Feri Winarta
 */
class Vehicle {
    String name = "ortu";
    
    void knalpot() {
        System.out.println("Brem brem brem from " + this.name);
    }
    
    void sayHi() {
        System.out.println("Brem bream from supperClass");
    }
}
class Car extends Vehicle {
//    void display() {
//        this.name = "BMW";
//        System.out.println(this.name);
//    }
    
    @Override
    void knalpot() {
        System.out.println("Brem brem brem from " + this.name );
    }
    
    @Override
    void sayHi() {
        System.out.println("bream bream from child");
    }
    
    void cancelSayHi() {
        super.sayHi();
    }
}

public class Main {
    public static void main(String[] args) {
//        contoh inherit
       Vehicle obj1 = new Vehicle();
       obj1.knalpot();
       obj1.sayHi();
       
       Car obj2 = new Car();
       obj2.knalpot();
       obj2.sayHi();
       obj2.cancelSayHi();
//       obj2.show();
       
//       method didalam subclas tidak dapat diakses oleh parent class
//       dalam inherit kita dapat membuat atribut tambahan atau method tambahan
//       akan tetapi method disubclass tidak dapat diakses oleh superClass
//       obj2.display();
       
       
    }
}

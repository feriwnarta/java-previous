/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Feri Winarta
 */

class Vehicle {
    private String name;
    
    public void carSound() {
        System.out.println("Brem brem brem from vehicle");
    }
}

class Car extends Vehicle {
//   method overiding
    
   @Override
//   overide dapat digunakan dengan head method sama, tetapi hanya body nya
//   saja yang dapat berbeda
   public void carSound() {
       System.out.println("Brem brem from car");
   }
   
   
}




public class Main {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        obj.carSound();
        
        Car obj2 = new Car();
        obj2.carSound();
        
//        method overloading dapat digunakan dengan paramater yang berbeda
//        atau hanya return yang berbda    
//        methodOverloading(10);
    }
    
//    public static void methodOverloading(String nama) {
//        System.out.println(nama);
//    }
//    
//    public static int methodOverloading(int angka) {
//        return angka;
//    }
}

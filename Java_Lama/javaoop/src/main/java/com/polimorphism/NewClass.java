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
class Employee {
        String name;
        
        Employee(String name) {
            this.name = name;
        }
        
        void sayHi() {
            System.out.println("Halo " + this.name);
        }
        
        void sayName(Employee e) {
            System.out.println(e.name);
        }
        
    }
    
    class Manager extends Employee {
        
        Manager(String name) {
            super(name);
        }
        
        @Override
        void sayHi() {
            System.out.println("Method overide dari Manager");
        }
        
        void display() {
            System.out.println("Method tambahan dari kelas Manager");
        }
    }
    
    class VicePresident extends Employee {
        
        VicePresident(String name) {
            super(name);
        }
        
        @Override
        void sayHi() {
            System.out.println("Method overide dari Vice President");
        }
        
        void display() {
            System.out.println("Method tambahan dari kelas VicePresident");
        }
    }
    
public class NewClass {
    public static void main(String[] args) {
       Employee o = new Employee("Feri");
//       o.sayHi();
       o.sayName(o);

//       Manager b = new Manager("Anya");
       o.sayName(new Manager("geraldine"));
       o.sayName(new VicePresident("Konde"));
       
//       o = new Manager("Sidharta");
//       o.sayHi();

//       saat instansia polimorphisme dengan objek superclass tapi dengan kelas subclass
//       objek yang dibuat hanya dapat memakai kelas super sendiri, tidak bisa akses kelas subclas
//       Kecuali method / atribute di override
//       o.display();
       
//       o = new VicePresident("Konde");
//       o.sayHi();
       
       
       
       
       
//       o.display();
//       Manager b = new Manager("Winarta");
//       b.sayHI();
        
    }
}

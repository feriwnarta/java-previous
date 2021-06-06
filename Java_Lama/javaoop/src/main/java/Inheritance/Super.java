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
class Person {
    private String name = "feri";
    
    void display() {
        System.out.println("Halo semua ini person class");
    }
    
    public String getName() {
        return this.name;
    }
}

class Child extends Person {
    
    void displayName(String name) {
        String data = super.getName();
        data = name;
        System.out.println(data);
    }
    
    @Override        
    void display() {
        System.out.println("Halo semua ini Child class");
    }
    
    void getPersonDisplay() {
        super.display();
    }
    
  
    
//    private Person person;
    
//    void setPerson(Person person) {
//        this.person = person;
//    }
}

public class Super {
    public static void main(String[] args) {
        Person pers = new Person();
        pers.display();
        
        Child chil = new Child();
        chil.display();
//        mengakses kelas person menggunakan inheritance
        chil.getPersonDisplay();
//        chil.setPerson(pers);
//        mengakses kelas person dengan object member
//        chil.person.display();

        chil.displayName("winarta");
        
        
    }
}

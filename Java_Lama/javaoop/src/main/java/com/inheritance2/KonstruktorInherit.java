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
class Ortu {
    String name;
    int age;
    
    Ortu(String name) {
        this.name = name;
    }
    
    Ortu(int age) {
        this.age = age;
    }
    
//    Dengan adanya konstruktor overloading default yang kosong
//    konsturkor di subclass bisa tidak memanggil konstruktor superclass
//    dengan itu dapat menambah konstruktor di kelas subclass
    Ortu() {
        
    }
    
    void display() {
        System.out.println(this.name);
    }
    
    void sayHi() 
    {
        System.out.println("Halo Semua");
    }
    
}

class Anak extends Ortu{
    String data;
    double height;
    float weight;
    
// jika tidak ada kelas default konstruktor kelas subclass tidak dapat menambah konstruktor baru
    Anak(double height, float weight) {
        this.height = height;
        this.weight = weight;
    }
    
    Anak(String data) {
        this.data = data;
    }
    
    void displayData() {
        System.out.println(this.data);
        super.name = "feri";
        System.out.println(super.name);
    }
}

public class KonstruktorInherit {
    public static void main(String[] args) {
        Ortu obj = new Ortu("fero");
        obj.display();
        obj.sayHi();
        Anak obj1 = new Anak("wouy");
        obj1.display();
        obj1.sayHi();
        obj1.displayData();
        
    }
}

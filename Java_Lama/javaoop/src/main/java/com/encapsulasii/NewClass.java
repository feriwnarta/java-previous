/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.encapsulasii;

/**
 *
 * @author Feri Winarta
 */
class Member {
    private final String name;
    public Animal hewan;
    
    public Member(String name,Animal animal) {
        this.name = name;
         setAnimal(animal);
    }
    
    public void display() {
        System.out.println("Member Name \t:" + this.name + "\t");
        System.out.println("Animal type \t:" + this.hewan.getType() + "\t");
        System.out.println("Animal name \t:" + this.hewan.getName() + "\t");
        System.out.println("Animal variant \t:" + this.hewan.getVariant() + "\t");
       
    }
    
    public void setAnimal(Animal obj) {
        this.hewan = obj;
    }
    
  
}


class Animal {
    private final String name;
    private final String variant;
    private final String type;
    
    public Animal(String name, String variant, String type) {
        this.name = name;
        this.variant = variant;
        this.type = type;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getVariant() {
        return this.variant;
    }
    
    public String getType() {
        return this.type;
    }
    
    
    
}

public class NewClass {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Doggy","buldog","dog");
        Member member1 = new Member("Udin",animal1);
        
        
        member1.display();
        
       
    }
}
